package com.example.educafacil.data.auth

import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.tasks.await
import javax.inject.Inject
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class FirebaseAuthManager @Inject constructor() {
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()

    val authFire = auth.currentUser

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

    suspend fun signup(email: String, password: String): Boolean = suspendCoroutine { cont ->
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                cont.resume(task.isSuccessful)
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
