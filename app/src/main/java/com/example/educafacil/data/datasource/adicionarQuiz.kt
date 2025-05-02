package com.example.educafacil.data.datasource

fun uploadQuizzesToFirestore() {
    /*
    val firestore = FirebaseFirestore.getInstance()

    val inteligenciaArtificialQuiz = mapOf(
        "title" to "Inteligência Artificial",
        "questions" to listOf(
            mapOf(
                "text" to "O que é Inteligência Artificial?",
                "answers" to listOf(
                    "Montagem de hardware",
                    "Simulação da inteligência humana",
                    "Cálculo avançado",
                    "Desenho técnico"
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "Qual destes é um exemplo de IA?",
                "answers" to listOf(
                    "Assistente virtual (como Siri ou Alexa)",
                    "Mouse óptico",
                    "Monitor 4K",
                    "Teclado mecânico"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Machine Learning é um ramo da IA que...",
                "answers" to listOf(
                    "Cria novas linguagens de programação",
                    "Permite que máquinas aprendam com dados",
                    "Fabrica chips de computador",
                    "Constrói robôs físicos"
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "Qual linguagem é frequentemente usada em IA?",
                "answers" to listOf(
                    "Python",
                    "HTML",
                    "CSS",
                    "PHP"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Redes neurais artificiais são inspiradas em...",
                "answers" to listOf(
                    "Células do sangue",
                    "Circuitos elétricos",
                    "Neurônios do cérebro humano",
                    "Sistema respiratório"
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "Qual dessas áreas NÃO está diretamente ligada à IA?",
                "answers" to listOf(
                    "Reconhecimento de fala",
                    "Visão computacional",
                    "Processamento de linguagem natural",
                    "Impressão de documentos"
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "O que é Deep Learning?",
                "answers" to listOf(
                    "Uma técnica de aprendizado baseada em redes neurais profundas",
                    "Uma linguagem de programação",
                    "Um sistema operacional",
                    "Um tipo de banco de dados"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Qual desses algoritmos é usado em IA?",
                "answers" to listOf(
                    "Bubble Sort",
                    "Árvore de Decisão",
                    "Loop Infinito",
                    "Echo Print"
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "O que é um chatbot?",
                "answers" to listOf(
                    "Um aplicativo de planilhas",
                    "Um sistema de envio de e-mails",
                    "Um programa que conversa com usuários automaticamente",
                    "Um antivírus"
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "Qual é o papel dos dados em IA?",
                "answers" to listOf(
                    "Dados não são importantes",
                    "Servem para alimentar algoritmos de aprendizado",
                    "São descartados após o treinamento",
                    "São usados apenas para visualização"
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "A IA pode ser usada para...",
                "answers" to listOf(
                    "Diagnóstico médico",
                    "Cálculo de impostos",
                    "Apenas jogos",
                    "Apenas redes sociais"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "O que é overfitting em IA?",
                "answers" to listOf(
                    "Quando o modelo aprende pouco",
                    "Quando o modelo é rápido demais",
                    "Quando não há dados suficientes",
                    "Quando o modelo funciona bem só nos dados de treinamento"
                ),
                "correctAnswerIndex" to 3
            )
        )
    )
    val computacaoNuvemQuiz = mapOf(
        "title" to "Computação em Nuvem",
        "questions" to listOf(
            mapOf(
                "text" to "O que é computação em nuvem?",
                "answers" to listOf(
                    "Um novo tipo de computador pessoal",
                    "Tecnologia para guardar e acessar dados pela internet",
                    "Um sistema operacional",
                    "Um antivírus online"
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "Qual é um benefício da computação em nuvem?",
                "answers" to listOf(
                    "Acesso limitado aos dados",
                    "Custo elevado",
                    "Acesso remoto a dados e aplicações",
                    "Uso apenas offline"
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "Qual desses é um serviço de nuvem?",
                "answers" to listOf(
                    "Google Drive",
                    "HD externo",
                    "Bluetooth",
                    "CD-ROM"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Na nuvem, os dados são armazenados...",
                "answers" to listOf(
                    "Na internet, em servidores de empresas especializadas",
                    "Apenas no computador local",
                    "Em pendrives",
                    "Somente em CDs"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Qual é uma preocupação com a computação em nuvem?",
                "answers" to listOf(
                    "Conectividade de impressoras",
                    "Segurança e privacidade dos dados",
                    "Consumo de papel",
                    "Manutenção de cabos"
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "Exemplo de uso da nuvem no dia a dia:",
                "answers" to listOf(
                    "Enviar cartas pelo correio",
                    "Gravar vídeos em DVD",
                    "Instalar programas via CD",
                    "Armazenar fotos no Google Fotos"
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Qual empresa é conhecida por oferecer serviços em nuvem?",
                "answers" to listOf(
                    "HP",
                    "Nikon",
                    "Dropbox",
                    "Xerox"
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "O que é armazenamento em nuvem?",
                "answers" to listOf(
                    "Guardar arquivos em papel",
                    "Arquivar documentos físicos",
                    "Copiar dados para disquetes",
                    "Guardar dados na internet com acesso remoto"
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Para acessar arquivos na nuvem é necessário...",
                "answers" to listOf(
                    "Usar um mouse óptico",
                    "Ter internet",
                    "Instalar impressora",
                    "Apenas um pendrive"
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "Qual é uma plataforma de computação em nuvem da Microsoft?",
                "answers" to listOf(
                    "Azure",
                    "Gmail",
                    "Safari",
                    "WordPress"
                ),
                "correctAnswerIndex" to 0
            )
        )
    )
    val logicaProgramacaoQuiz = mapOf(
        "title" to "Lógica de Programação",
        "questions" to listOf(
            mapOf(
                "text" to "O que é lógica de programação?",
                "answers" to listOf(
                    "Um conjunto de passos para resolver um problema",
                    "Um código de barras",
                    "Uma linguagem falada",
                    "Um tipo de arte"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Qual é o objetivo da lógica de programação?",
                "answers" to listOf(
                    "Embelezar o código",
                    "Resolver problemas de forma estruturada",
                    "Criar imagens coloridas",
                    "Melhorar a digitação"
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "O que é um algoritmo?",
                "answers" to listOf(
                    "Uma sequência de passos para atingir um objetivo",
                    "Um tipo de robô",
                    "Uma equação matemática",
                    "Um vírus de computador"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Qual símbolo é usado em fluxogramas para decisões?",
                "answers" to listOf(
                    "Círculo",
                    "Quadrado",
                    "Retângulo",
                    "Losango"
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "O que é um loop em programação?",
                "answers" to listOf(
                    "Uma forma de música",
                    "Um erro no sistema",
                    "Uma repetição de instruções",
                    "Um tipo de variável"
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "O que significa 'variável' na programação?",
                "answers" to listOf(
                    "Um valor que pode mudar",
                    "Um botão do teclado",
                    "Uma parte fixa do programa",
                    "Um arquivo de imagem"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Qual linguagem é usada para ensinar lógica de programação?",
                "answers" to listOf(
                    "Português",
                    "Linguagem de blocos",
                    "Latim",
                    "HTML apenas"
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "Qual destes é um exemplo de estrutura condicional?",
                "answers" to listOf(
                    "Para cada...",
                    "Se... então",
                    "Imprimir na tela",
                    "Contar até 10"
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "O que faz um comando de entrada?",
                "answers" to listOf(
                    "Apaga o programa",
                    "Salva automaticamente",
                    "Desenha gráficos",
                    "Recebe dados do usuário"
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "O que é depuração (debug)?",
                "answers" to listOf(
                    "Instalar novos programas",
                    "Reiniciar o computador",
                    "Procurar e corrigir erros no código",
                    "Traduzir o código para outra língua"
                ),
                "correctAnswerIndex" to 2
            )
        )
    )
    val frontendQuiz = mapOf(
        "title" to "Frontend",
        "questions" to listOf(
            mapOf(
                "text" to "O que é Frontend?",
                "answers" to listOf(
                    "Servidor de banco de dados",
                    "Firewall de segurança",
                    "Rede interna",
                    "Parte visual de um site"
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "HTML é usado para?",
                "answers" to listOf(
                    "Criar bancos de dados",
                    "Proteger sistemas",
                    "Estruturar páginas",
                    "Montar redes"
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "CSS é utilizado para?",
                "answers" to listOf(
                    "Programar servidores",
                    "Gerenciar sistemas",
                    "Proteger dados",
                    "Estilizar páginas"
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "JavaScript serve para?",
                "answers" to listOf(
                    "Adicionar interatividade",
                    "Criar bancos de dados",
                    "Gerenciar redes",
                    "Proteger acessos"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "React é uma biblioteca de?",
                "answers" to listOf(
                    "Python",
                    "JavaScript",
                    "PHP",
                    "Ruby"
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "Qual função do Frontend?",
                "answers" to listOf(
                    "Controle de servidores",
                    "Experiência do usuário",
                    "Gerenciamento de redes",
                    "Criptografia de dados"
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "Framework de CSS?",
                "answers" to listOf(
                    "Laravel",
                    "Flask",
                    "Spring",
                    "Bootstrap"
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Single Page Application (SPA) é?",
                "answers" to listOf(
                    "Aplicação de página única",
                    "Sistema operacional",
                    "Banco de dados relacional",
                    "Rede de segurança"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Qual linguagem não é Frontend?",
                "answers" to listOf("HTML", "CSS","SQL", "JavaScript"),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "O que é responsividade?",
                "answers" to listOf(
                    "Velocidade de download",
                    "Configuração de servidor",
                    "Criação de APIs",
                    "Adaptação a vários dispositivos"
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Exemplo de responsividade?",
                "answers" to listOf(
                    "Servidor em nuvem",
                    "Site que funciona no celular e no PC",
                    "Sistema de firewall",
                    "Banco de dados relacional"
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "CSS Grid é usado para?",
                "answers" to listOf(
                    "Programar backend",
                    "Gerenciar APIs",
                    "Instalar pacotes",
                    "Organizar layout"
                ),
                "correctAnswerIndex" to 3
            )
        )
    )
    val backendQuiz = mapOf(
        "title" to "Backend",
        "questions" to listOf(
            mapOf(
                "text" to "O que é Backend?",
                "answers" to listOf(
                    "Lógica por trás dos sistemas",
                    "Parte visual do site",
                    "Criação de designs",
                    "Montagem de computadores"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Banco de dados é usado em?",
                "answers" to listOf("Frontend", "Design gráfico","Backend", "Segurança de rede"),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "Qual linguagem é popular no Backend?",
                "answers" to listOf("CSS", "Node.js", "HTML", "Photoshop"),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "PHP é usado para?",
                "answers" to listOf(
                    "Programar servidores",
                    "Montar computadores",
                    "Criar imagens",
                    "Editar vídeos"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Framework de backend em Java?",
                "answers" to listOf("React", "Angular", "Vue", "Spring Boot"),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "API significa?",
                "answers" to listOf(
                    "Servidor Padrão",
                    "Interface de Programação de Aplicações",
                    "Banco de Dados Externo",
                    "Sistema de Arquivos"
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "Qual protocolo é usado em APIs?",
                "answers" to listOf("FTP", "SMTP","HTTP", "SSH"),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "Servidor é responsável por?",
                "answers" to listOf(
                    "Mostrar imagens",
                    "Gerenciar redes sociais",
                    "Controlar energia elétrica",
                    "Responder requisições"
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Exemplo de banco de dados?",
                "answers" to listOf( "Photoshop", "Visual Studio","MySQL", "CorelDraw"),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "ORM significa?",
                "answers" to listOf(
                    "Mapeamento objeto-relacional",
                    "Organização de recursos de mídia",
                    "Opções rápidas de mídia",
                    "Operação de recursos múltiplos"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Node.js usa qual linguagem?",
                "answers" to listOf( "PHP", "Ruby", "Python", "JavaScript"),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "O que é um endpoint?",
                "answers" to listOf(
                    "Servidor de arquivos",
                    "Ponto de acesso a uma API",
                    "Design de interface",
                    "Recurso de segurança"
                ),
                "correctAnswerIndex" to 1
            )
        )
    )
    val kotlinQuiz = mapOf(
        "title" to "Kotlin",
        "questions" to listOf(
            mapOf(
                "text" to "O que é Kotlin?",
                "answers" to listOf(
                    "Framework de Frontend",
                    "Sistema operacional",
                    "Banco de dados",
                    "Linguagem de programação"
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Kotlin é usado principalmente para?",
                "answers" to listOf(
                    "Programar impressoras",
                    "Criar redes Wi-Fi",
                    "Desenvolver apps Android",
                    "Montar hardware"
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "Kotlin é compatível com?",
                "answers" to listOf("C#", "Python", "Ruby", "Java"),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Uma função em Kotlin começa com?",
                "answers" to listOf( "func","fun", "def", "function"),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "O que é uma variável 'val'?",
                "answers" to listOf(
                    "Valor mutável",
                    "Laço de repetição",
                    "Valor imutável",
                    "Função anônima"
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "O que significa 'var'?",
                "answers" to listOf("Valor mutável", "Valor fixo", "Função", "Classe"),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Classe em Kotlin começa com?",
                "answers" to listOf( "classe", "ClassName", "defClass", "class"),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Como declarar uma lista?",
                "answers" to listOf( "createList()", "arrayList()", "listOf()", "new List()"),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "Nullable em Kotlin usa?",
                "answers" to listOf( "!", ":", "&", "?"),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Para criar um objeto usamos?",
                "answers" to listOf(
                    "val nome = Classe()",
                    "class nome()",
                    "new Classe()",
                    "object nome()"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Coroutines são usadas para?",
                "answers" to listOf(
                    "Criação de designs",
                    "Montagem de servidores",
                    "Programação assíncrona",
                    "Design de redes"
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "Jetpack Compose é usado para?",
                "answers" to listOf(
                    "Servidor web",
                    "Banco de dados",
                    "Interface Android",
                    "Gerenciar segurança"
                ),
                "correctAnswerIndex" to 2
            )
        )
    )
    val engenhariaSoftwareQuiz = mapOf(
        "title" to "Engenharia de Software",
        "questions" to listOf(
            mapOf(
                "text" to "O que é Engenharia de Software?",
                "answers" to listOf(
                    "Criação de hardware",
                    "Gerenciamento de redes",
                    "Disciplina que estuda o desenvolvimento de sistemas",
                    "Análise de imagens"
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "O que é ciclo de vida do software?",
                "answers" to listOf(
                    "Etapas do desenvolvimento de um sistema",
                    "Crescimento de uma empresa",
                    "Manutenção de hardware",
                    "Compra de licenças"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Metodologias ágeis incluem?",
                "answers" to listOf("Waterfall", "ERP", "CMMI", "Scrum"),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Scrum é uma?",
                "answers" to listOf(
                    "Metodologia ágil",
                    "Banco de dados",
                    "Sistema operacional",
                    "Linguagem de programação"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Product Owner é?",
                "answers" to listOf(
                    "Gerente de marketing",
                    "Responsável pelo produto",
                    "Desenvolvedor backend",
                    "Administrador de banco de dados"
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "Sprint é?",
                "answers" to listOf(
                    "Framework de Frontend",
                    "Linguagem de script",
                    "Período de trabalho no Scrum",
                    "Modelo de dados"
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "Kanban é?",
                "answers" to listOf(
                    "Banco de dados",
                    "Servidor web",
                    "Sistema visual de controle de tarefas",
                    "Framework de frontend"
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "O que é um backlog?",
                "answers" to listOf(
                    "Lista de tarefas pendentes",
                    "Servidor de banco de dados",
                    "Conjunto de APIs",
                    "Rede de computadores"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "O que é uma daily meeting?",
                "answers" to listOf(
                    "Atualização de software",
                    "Criação de rede Wi-Fi",
                    "Manutenção de servidor",
                    "Reunião diária de acompanhamento"
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Waterfall é um modelo?",
                "answers" to listOf("Ágil","Sequencial", "Iterativo", "Incremental"),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "Teste de software é importante para?",
                "answers" to listOf(
                    "Garantir qualidade",
                    "Gerar códigos",
                    "Reduzir velocidade",
                    "Aumentar tamanho do software"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "O que é versionamento de código?",
                "answers" to listOf(
                    "Backup de imagens",
                    "Criação de bancos de dados",
                    "Gerenciamento de redes",
                    "Controle de versões de software"
                ),
                "correctAnswerIndex" to 3
            )
        )
    )
    val matematicaQuiz = mapOf(
        "title" to "Matemática",
        "questions" to listOf(
            mapOf(
                "text" to "Quanto é 5 + 3?",
                "answers" to listOf("8", "7", "6", "9"),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Quanto é 10 - 4?",
                "answers" to listOf("7", "5", "6", "4"),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "Quanto é 6 × 7?",
                "answers" to listOf( "36","42", "48", "52"),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "Quanto é 24 ÷ 6?",
                "answers" to listOf("4", "5", "3", "6"),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Qual o valor de π?",
                "answers" to listOf( "2,14", "4,13", "3,41", "3,14"),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Raiz quadrada de 64?",
                "answers" to listOf("7","8", "6", "9"),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "Quanto é 9²?",
                "answers" to listOf("72", "64","81", "91"),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "Quanto é 100 ÷ 4?",
                "answers" to listOf("25", "20", "24", "26"),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Qual é a metade de 50?",
                "answers" to listOf("30","25", "20", "15"),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "Quanto é 15 + 15?",
                "answers" to listOf( "25", "35", "40", "30"),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Multiplicação de 12 × 3?",
                "answers" to listOf("36", "32", "40", "38"),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Quanto é 81 ÷ 9?",
                "answers" to listOf("8", "7", "9", "6"),
                "correctAnswerIndex" to 2
            )
        )
    )
    val excelQuiz = mapOf(
        "title" to "Excel",
        "questions" to listOf(
            mapOf(
                "text" to "O que é o Excel?",
                "answers" to listOf(
                    "Editor de textos",
                    "Software de planilhas",
                    "Navegador web",
                    "Programa de email"
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "Função para somar no Excel?",
                "answers" to listOf("MEDIA", "SE", "PROCV", "SOMA"),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Função para calcular média?",
                "answers" to listOf( "SOMA","MÉDIA", "SE", "PROCV"),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "Qual função busca dados?",
                "answers" to listOf("SOMA", "MÉDIA","PROCV", "SE"),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "Para condicional usamos?",
                "answers" to listOf("SOMA", "MÉDIA","SE", "PROCV"),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "Extensão padrão do Excel?",
                "answers" to listOf(".xlsx", ".docx", ".pptx", ".pdf"),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Atalho para salvar?",
                "answers" to listOf("Ctrl + P", "Ctrl + V", "Ctrl + Z", "Ctrl + S"),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Para criar gráfico usamos?",
                "answers" to listOf(
                    "Criar tabela",
                    "Inserir gráfico",
                    "Formatar célula",
                    "Configurar página"
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "Congelar painéis serve para?",
                "answers" to listOf(
                    "Colorir células",
                    "Criar bordas",
                    "Fixar linhas ou colunas",
                    "Excluir linhas"
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "Filtrar dados permite?",
                "answers" to listOf(
                    "Exibir dados específicos",
                    "Apagar células",
                    "Alterar fonte",
                    "Redefinir zoom"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Formatação condicional serve para?",
                "answers" to listOf(
                    "Imprimir documento",
                    "Criar fórmulas",
                    "Apagar linhas duplicadas",
                    "Alterar aparência com base em regras"
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Tabela dinâmica é usada para?",
                "answers" to listOf(
                    "Analisar grandes volumes de dados",
                    "Formatar células",
                    "Criar gráficos 3D",
                    "Compartilhar arquivos"
                ),
                "correctAnswerIndex" to 0
            )
        )
    )
    val hardwareQuiz = mapOf(
        "title" to "Hardware",
        "questions" to listOf(
            mapOf(
                "text" to "O que é hardware?",
                "answers" to listOf(
                    "Programas de computador",
                    "Sites da internet",
                    "Serviços de nuvem",
                    "Parte física do computador"
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Qual é a função da CPU?",
                "answers" to listOf(
                    "Processar dados",
                    "Armazenar fotos",
                    "Exibir vídeos",
                    "Gerar conexão de internet"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "O que é um HD?",
                "answers" to listOf(
                    "Placa de vídeo",
                    "Fonte de alimentação",
                    "Memória RAM",
                    "Disco rígido de armazenamento"
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "O que é RAM?",
                "answers" to listOf(
                    "Armazenamento permanente",
                    "Memória de acesso rápido",
                    "Placa de rede",
                    "Fonte de energia"
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "A placa-mãe conecta?",
                "answers" to listOf(
                    "Somente CPU e HD",
                    "Apenas monitor e teclado",
                    "Todos os componentes do computador",
                    "Somente internet"
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "Fonte de alimentação faz o quê?",
                "answers" to listOf(
                    "Resfria o computador",
                    "Processa dados",
                    "Distribui energia elétrica",
                    "Executa programas"
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "Placa de vídeo é usada para?",
                "answers" to listOf(
                    "Processamento gráfico",
                    "Salvar documentos",
                    "Aumentar memória RAM",
                    "Melhorar rede Wi-Fi"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "SSD é?",
                "answers" to listOf(
                    "Placa de som",
                    "Unidade de armazenamento mais rápida",
                    "Memória RAM",
                    "Processador secundário"
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "O que é um periférico?",
                "answers" to listOf(
                    "Placa de rede",
                    "Processador",
                    "Memória de vídeo",
                    "Dispositivo de entrada ou saída"
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Exemplos de periféricos são?",
                "answers" to listOf(
                    "Processador e memória",
                    "HD e SSD",
                    "Mouse e teclado",
                    "Fonte e placa-mãe"
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "BIOS serve para?",
                "answers" to listOf(
                    "Aumentar velocidade da internet",
                    "Editar imagens",
                    "Jogar online",
                    "Iniciar o sistema"
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "O que é um monitor?",
                "answers" to listOf(
                    "Dispositivo de entrada",
                    "Dispositivo de saída de vídeo",
                    "Unidade de processamento",
                    "Sistema de resfriamento"
                ),
                "correctAnswerIndex" to 1
            )
        )
    )
    val redesQuiz = mapOf(
        "title" to "Redes",
        "questions" to listOf(
            mapOf(
                "text" to "O que é uma rede de computadores?",
                "answers" to listOf(
                    "Sistema de som",
                    "Banco de dados",
                    "Conexão entre dois ou mais dispositivos",
                    "Sistema operacional"
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "O que significa IP?",
                "answers" to listOf(
                    "Internet Page",
                    "Internal Protocol",
                    "Input Protocol",
                    "Internet Protocol"
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Qual equipamento conecta redes diferentes?",
                "answers" to listOf("Switch", "Hub", "Roteador", "Repetidor"),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "O que faz o Switch?",
                "answers" to listOf(
                    "Interliga dispositivos em uma mesma rede",
                    "Conecta redes diferentes",
                    "Amplifica sinal",
                    "Traduz endereços IP"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Wi-Fi é?",
                "answers" to listOf(
                    "Protocolo de segurança",
                    "Rede sem fio",
                    "Servidor de arquivos",
                    "Placa de rede"
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "O que é DNS?",
                "answers" to listOf(
                    "Sistema de segurança",
                    "Rede cabeada",
                    "Sistema de nomes de domínio",
                    "Servidor de backup"
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "Qual é a função do firewall?",
                "answers" to listOf(
                    "Acelerar a internet",
                    "Aumentar espaço em disco",
                    "Melhorar som do computador",
                    "Proteger a rede"
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Qual é o meio físico mais usado em redes cabeadas?",
                "answers" to listOf(
                    "Fibra ótica",
                    "Cabo coaxial",
                    "Cabo HDMI",
                    "Cabo de par trançado"
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Qual protocolo é usado para sites seguros?",
                "answers" to listOf("FTP","HTTPS", "HTTP", "SMTP"),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "O que é uma LAN?",
                "answers" to listOf("Rede mundial", "Rede virtual", "Rede wireless", "Rede local"),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "O que é uma WAN?",
                "answers" to listOf(
                    "Rede de área pessoal",
                    "Rede cabeada",
                    "Rede de longa distância",
                    "Rede local"
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "O que é uma VPN?",
                "answers" to listOf(
                    "Rede privada virtual",
                    "Rede pública de navegação",
                    "Protocolo de email",
                    "Sistema operacional para redes"
                ),
                "correctAnswerIndex" to 0
            )
        )
    )
    val segurancaDigitalQuiz = mapOf(
        "title" to "Segurança Digital",
        "questions" to listOf(
            mapOf(
                "text" to "O que é segurança digital?",
                "answers" to listOf(
                    "Proteção de dados e dispositivos na internet",
                    "Manutenção de computadores",
                    "Instalação de programas",
                    "Vendas online"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "O que é um vírus de computador?",
                "answers" to listOf(
                    "Aplicativo para redes sociais",
                    "Um tipo de arquivo de texto",
                    "Extensão de navegador",
                    "Programa malicioso que causa danos"
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Como criar uma senha segura?",
                "answers" to listOf(
                    "Usar o nome do cachorro",
                    "Colocar apenas 123456",
                    "Misturar letras, números e símbolos",
                    "Data de nascimento"
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "O que é phishing?",
                "answers" to listOf(
                    "Proteção de contas bancárias",
                    "Atualização do sistema",
                    "Um antivírus gratuito",
                    "Golpe para roubar dados pessoais"
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Como evitar golpes online?",
                "answers" to listOf(
                    "Não clicar em links suspeitos",
                    "Aceitar todas as promoções",
                    "Compartilhar todas as senhas",
                    "Usar Wi-Fi público sempre"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "O que é autenticação de dois fatores?",
                "answers" to listOf(
                    "Digitar duas vezes a senha",
                    "Verificação em duas etapas para mais segurança",
                    "Fazer login duas vezes",
                    "Abrir duas contas ao mesmo tempo"
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "Qual dessas atitudes é segura?",
                "answers" to listOf(
                    "Evitar senhas fáceis",
                    "Compartilhar dados bancários",
                    "Clicar em qualquer link",
                    "Desativar o antivírus"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "O que é um software antivírus?",
                "answers" to listOf(
                    "Aplicativo de edição de texto",
                    "Programa para jogos",
                    "Software de música",
                    "Programa que protege contra ameaças digitais",
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Por que é importante atualizar os programas?",
                "answers" to listOf(
                    "Deixa mais lento",
                    "Corrige falhas de segurança",
                    "Remove arquivos",
                    "Enche o espaço do celular"
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "O que é um backup?",
                "answers" to listOf(
                    "Cópia de segurança dos dados",
                    "Aceleração de internet",
                    "Antivírus portátil",
                    "Conta falsa"
                ),
                "correctAnswerIndex" to 0
            )
        )
    )
    val cidadanniaDigitalQuiz = mapOf(
        "title" to "Cidadania Digital",
        "questions" to listOf(
            mapOf(
                "text" to "O que é cidadania digital?",
                "answers" to listOf(
                    "A capacidade de usar tecnologias digitais de forma ética, segura e responsável.",
                    "O ato de votar online.",
                    "A criação de aplicativos móveis.",
                    "A denúncia de crimes virtuais."
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Qual é uma prática importante da cidadania digital?",
                "answers" to listOf(
                    "Compartilhar fake news.",
                    "Proteger seus dados pessoais online.",
                    "Ignorar políticas de privacidade.",
                    "Hackear redes sociais."
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "O que é cyberbullying?",
                "answers" to listOf(
                    "Venda de produtos ilegais pela internet.",
                    "Atividades bancárias online.",
                    "Uso da internet para intimidar ou assediar alguém.",
                    "Roubo de identidade."
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "Qual é a atitude correta ao se deparar com informações duvidosas na internet?",
                "answers" to listOf(
                    "Compartilhar rapidamente.",
                    "Ignorar totalmente.",
                    "Verificar a veracidade antes de compartilhar.",
                    "Editar a informação antes de compartilhar."
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "O que são direitos digitais?",
                "answers" to listOf(
                    "Direitos de uso de software gratuito.",
                    "Direitos humanos aplicados ao ambiente online.",
                    "Direitos de exportar dados para outros países.",
                    "Direitos de vender informações pessoais."
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "O que significa ter uma identidade digital?",
                "answers" to listOf(
                    "Ter apenas um perfil no Instagram.",
                    "Ter mais de um e-mail ativo.",
                    "Possuir criptomoedas.",
                    "Ser reconhecido oficialmente na internet."
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Quais ações são exemplos de comportamento ético online?",
                "answers" to listOf(
                    "Copiar e colar trabalhos acadêmicos.",
                    "Respeitar a privacidade dos outros e não plagiar conteúdos.",
                    "Publicar fotos sem permissão.",
                    "Ignorar mensagens de conscientização."
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "O que é um antivírus?",
                "answers" to listOf(
                    "Um programa que ajuda a proteger dispositivos contra malware.",
                    "Um aplicativo de redes sociais.",
                    "Uma ferramenta de edição de vídeo.",
                    "Uma senha forte para redes Wi-Fi."
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "O que fazer para criar uma senha segura?",
                "answers" to listOf(
                    "Usar seu nome e data de nascimento.",
                    "Criar senhas longas, com letras, números e símbolos.",
                    "Repetir a mesma senha em todos os sites.",
                    "Colocar apenas quatro números."
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "O que é um phishing?",
                "answers" to listOf(
                    "Um tipo de malware que rouba fotos.",
                    "Um programa de edição de fotos.",
                    "Um ataque que tenta enganar pessoas para roubar informações confidenciais.",
                    "Uma rede social exclusiva para negócios."
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "Qual a importância de atualizar o sistema operacional?",
                "answers" to listOf(
                    "Deixar o aparelho mais lento.",
                    "Gastar mais memória.",
                    "Corrigir falhas de segurança e melhorar o desempenho.",
                    "Apagar seus arquivos antigos."
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "Quais são exemplos de crimes digitais?",
                "answers" to listOf(
                    "Hacking, roubo de identidade e cyberbullying.",
                    "Compra de e-books.",
                    "Postagem de fotos de viagens.",
                    "Instalação de aplicativos."
                ),
                "correctAnswerIndex" to 0
            )
        )
    )
    val segurancaQuiz = mapOf(
        "title" to "Segurança da Informação",
        "questions" to listOf(
            mapOf(
                "text" to "O que é segurança da informação?",
                "answers" to listOf(
                    "Proteção de dados e informações",
                    "Criação de sistemas",
                    "Desenvolvimento de hardware",
                    "Compartilhamento de imagens"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Confidencialidade significa?",
                "answers" to listOf(
                    "Acesso público",
                    "Criptografia de voz",
                    "Acesso apenas a pessoas autorizadas",
                    "Exclusão de dados antigos"
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "Integridade garante?",
                "answers" to listOf(
                    "Que todos possam acessar",
                    "Que os dados sejam públicos",
                    "Que o sistema fique offline",
                    "Que os dados não sejam alterados indevidamente"
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Disponibilidade refere-se a?",
                "answers" to listOf(
                    "Acesso contínuo às informações",
                    "Bloqueio de acesso",
                    "Privacidade de documentos",
                    "Armazenamento físico"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "O que é phishing?",
                "answers" to listOf(
                    "Vírus de computador",
                    "Firewall",
                    "Tentativa de enganar usuários para obter dados",
                    "Backup de dados"
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "O que é um vírus de computador?",
                "answers" to listOf(
                    "Atualização de software",
                    "Ferramenta de segurança",
                    "Sistema de backup",
                    "Programa malicioso que se espalha",
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Qual a função do antivírus?",
                "answers" to listOf(
                    "Aumentar velocidade do computador",
                    "Detectar e remover ameaças",
                    "Criar senhas fortes",
                    "Gerar relatórios financeiros"
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "O que é ransomware?",
                "answers" to listOf(
                    "Sistema de compartilhamento",
                    "Ferramenta de backup",
                    "Sequestro de dados mediante pagamento",
                    "Servidor de email"
                ),
                "correctAnswerIndex" to 2
            ),
            mapOf(
                "text" to "Firewall protege contra?",
                "answers" to listOf(
                    "Acessos não autorizados",
                    "Falta de energia",
                    "Atualizações de sistema",
                    "Problemas de hardware"
                ),
                "correctAnswerIndex" to 0
            ),
            mapOf(
                "text" to "Backup é importante para?",
                "answers" to listOf(
                    "Aumentar espaço de disco",
                    "Recuperar dados em caso de perda",
                    "Proteger redes Wi-Fi",
                    "Atualizar programas"
                ),
                "correctAnswerIndex" to 1
            ),
            mapOf(
                "text" to "Autenticação de dois fatores é?",
                "answers" to listOf(
                    "Sistema de armazenamento",
                    "Programa antivírus",
                    "Protocolo de redes",
                    "Verificação em duas etapas para login"
                ),
                "correctAnswerIndex" to 3
            ),
            mapOf(
                "text" to "Senhas fortes devem ter?",
                "answers" to listOf(
                    "Letras, números e símbolos",
                    "Somente números",
                    "Somente letras",
                    "Somente palavras comuns"
                ),
                "correctAnswerIndex" to 0
            )
        )
    )



    val quizzes = listOf(
        inteligenciaArtificialQuiz,
        computacaoNuvemQuiz,
        logicaProgramacaoQuiz,
        backendQuiz,
        kotlinQuiz,
        engenhariaSoftwareQuiz,
        segurancaDigitalQuiz,
        frontendQuiz,
        segurancaQuiz,
        hardwareQuiz,
        redesQuiz,
        cidadanniaDigitalQuiz,
        excelQuiz,
        matematicaQuiz,
    )

    quizzes.forEach { quiz ->
        firestore.collection("quizzes")
            .add(quiz)
            .addOnSuccessListener {
                println("Quiz adicionado com sucesso: ${it.id}")
            }
            .addOnFailureListener { e ->
                println("Erro ao adicionar quiz: ${e.message}")
            }
    }
    */

}
