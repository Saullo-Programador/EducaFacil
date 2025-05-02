package com.example.educafacil.data.auth

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await
import javax.inject.Inject
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class FirebaseAuthManager @Inject constructor() {
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()
    fun getCurrentUser(): FirebaseUser? = auth.currentUser


    suspend fun login(email: String, password: String): Boolean = suspendCoroutine { cont ->
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                cont.resume(task.isSuccessful)
            }
    }

    fun isLoggedIn(): Boolean = auth.currentUser != null

    fun logout(): Unit{
        auth.signOut()
    }

    suspend fun signup(email: String, password: String, username: String): Boolean = suspendCoroutine { cont ->
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val uid = task.result?.user?.uid
                    if (uid != null) {
                        val userData = hashMapOf(
                            "name" to username,
                            "email" to email,
                            "createdAt" to FieldValue.serverTimestamp()
                        )
                        FirebaseFirestore.getInstance()
                            .collection("users")
                            .document(uid)
                            .set(userData   )
                            .addOnSuccessListener {
                                cont.resume(true)
                            }
                            .addOnFailureListener {
                                cont.resume(false)
                            }
                    } else {
                        cont.resume(false)
                    }
                } else {
                    cont.resume(false)
                }
            }
    }


    suspend fun sendPasswordReset(email: String): String{
        return try {
            auth.sendPasswordResetEmail(email).await()
            "Link enviado com sucesso! Verifique seu e-mail."
        } catch (e: Exception) {
            "Erro ao enviar o link de recuperação de senha: ${e.message}"
        }.toString()
    }
}
