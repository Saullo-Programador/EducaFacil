package com.example.educafacil.data.datasource

fun uploadQuizzesToFirestore() {
    /*
    val firestore = FirebaseFirestore.getInstance()

    val inteligenciaArtificialQuiz = mapOf(
        "title" to "Inteligência Artificial",
        "questions" to listOf(
            mapOf("text" to "O que é Inteligência Artificial?", "answers" to listOf("Simulação da inteligência humana", "Montagem de hardware", "Desenho técnico", "Cálculo avançado"), "correctAnswerIndex" to 0),
            mapOf("text" to "Qual é uma aplicação de IA?", "answers" to listOf("Assistente virtual", "Calculadora", "Servidor web", "WordPress"), "correctAnswerIndex" to 0),
            mapOf("text" to "Machine Learning é?", "answers" to listOf("Aprendizado de máquina", "Montagem de máquinas", "Reparo de computadores", "Escrita de textos"), "correctAnswerIndex" to 0),
            mapOf("text" to "Deep Learning é baseado em?", "answers" to listOf("Redes neurais artificiais", "Protocolos de internet", "Firewall", "Sistemas operacionais"), "correctAnswerIndex" to 0),
            mapOf("text" to "Qual linguagem é popular para IA?", "answers" to listOf("Python", "HTML", "PHP", "Swift"), "correctAnswerIndex" to 0),
            mapOf("text" to "IA pode ser aplicada em?", "answers" to listOf("Medicina", "Apenas robótica", "Somente matemática", "Somente física"), "correctAnswerIndex" to 0),
            mapOf("text" to "O que é Visão Computacional?", "answers" to listOf("Análise de imagens", "Conexão de redes", "Configuração de servidores", "Digitação de textos"), "correctAnswerIndex" to 0),
            mapOf("text" to "NLP significa?", "answers" to listOf("Processamento de Linguagem Natural", "Programação Linear", "Núcleo de Linguagem", "Portal Linguístico"), "correctAnswerIndex" to 0),
            mapOf("text" to "Exemplo de IA fraca?", "answers" to listOf("Siri", "Android", "Linux", "Windows"), "correctAnswerIndex" to 0),
            mapOf("text" to "O que é um dataset?", "answers" to listOf("Conjunto de dados", "Servidor de armazenamento", "Fonte de energia", "Aplicativo de design"), "correctAnswerIndex" to 0),
            mapOf("text" to "Algoritmos de IA são usados para?", "answers" to listOf("Tomar decisões automáticas", "Fazer backup de arquivos", "Compactar imagens", "Formatar computadores"), "correctAnswerIndex" to 0),
            mapOf("text" to "Qual ferramenta é usada em IA?", "answers" to listOf("TensorFlow", "Photoshop", "Word", "Excel"), "correctAnswerIndex" to 0)
        )
    )
    val computacaoNuvemQuiz = mapOf(
        "title" to "Computação em Nuvem",
        "questions" to listOf(
            mapOf("text" to "O que é computação em nuvem?", "answers" to listOf("Acesso remoto a recursos", "Manutenção de hardware", "Programação de aplicativos", "Desenvolvimento de sites"), "correctAnswerIndex" to 0),
            mapOf("text" to "AWS é exemplo de quê?", "answers" to listOf("Serviço de nuvem", "Servidor físico", "Computador pessoal", "Impressora"), "correctAnswerIndex" to 0),
            mapOf("text" to "Vantagem da nuvem?", "answers" to listOf("Escalabilidade", "Instalação local", "Alto custo", "Dependência de hardware"), "correctAnswerIndex" to 0),
            mapOf("text" to "IaaS significa?", "answers" to listOf("Infraestrutura como Serviço", "Internet como Serviço", "Interface como Serviço", "Informação como Serviço"), "correctAnswerIndex" to 0),
            mapOf("text" to "Exemplo de SaaS?", "answers" to listOf("Google Docs", "HD externo", "Placa de vídeo", "Sistema operacional"), "correctAnswerIndex" to 0),
            mapOf("text" to "Microsoft Azure é?", "answers" to listOf("Plataforma de nuvem", "Sistema de segurança", "Editor de texto", "Placa de rede"), "correctAnswerIndex" to 0),
            mapOf("text" to "Backup na nuvem é?", "answers" to listOf("Armazenamento remoto", "Formatação de disco", "Compressão de arquivos", "Edição de fotos"), "correctAnswerIndex" to 0),
            mapOf("text" to "Nuvem pública é?", "answers" to listOf("Serviço aberto ao público", "Rede privada local", "Servidor doméstico", "Firewall"), "correctAnswerIndex" to 0),
            mapOf("text" to "PaaS significa?", "answers" to listOf("Plataforma como Serviço", "Programação como Serviço", "Produto como Serviço", "Projeto como Serviço"), "correctAnswerIndex" to 0),
            mapOf("text" to "Serviço de armazenamento?", "answers" to listOf("Google Drive", "Outlook", "VLC Player", "LibreOffice"), "correctAnswerIndex" to 0),
            mapOf("text" to "AWS oferece?", "answers" to listOf("Serviços de computação", "Programas offline", "Hardware de PC", "Drivers de impressora"), "correctAnswerIndex" to 0),
            mapOf("text" to "Cloud computing é usado em?", "answers" to listOf("Empresas", "Apenas escolas", "Apenas casas", "Somente hospitais"), "correctAnswerIndex" to 0)
        )
    )
    val logicaProgramacaoQuiz = mapOf(
        "title" to "Lógica de Programação",
        "questions" to listOf(
            mapOf("text" to "O que é lógica de programação?", "answers" to listOf("Sequência de instruções", "Hardware de computador", "Design gráfico", "Composição musical"), "correctAnswerIndex" to 0),
            mapOf("text" to "Qual estrutura representa decisões?", "answers" to listOf("Condicional", "Laço de repetição", "Variável", "Função"), "correctAnswerIndex" to 0),
            mapOf("text" to "Qual é um exemplo de laço?", "answers" to listOf("for", "if", "print", "int"), "correctAnswerIndex" to 0),
            mapOf("text" to "Variáveis servem para?", "answers" to listOf("Guardar valores", "Repetir códigos", "Formatar texto", "Desenhar gráficos"), "correctAnswerIndex" to 0),
            mapOf("text" to "Funções são usadas para?", "answers" to listOf("Organizar códigos", "Desenhar interfaces", "Controlar acesso", "Formatar documentos"), "correctAnswerIndex" to 0),
            mapOf("text" to "O que é algoritmo?", "answers" to listOf("Sequência de passos", "Sistema operacional", "Placa de vídeo", "Antivírus"), "correctAnswerIndex" to 0),
            mapOf("text" to "Qual é um tipo de dado?", "answers" to listOf("String", "Loop", "Function", "If"), "correctAnswerIndex" to 0),
            mapOf("text" to "Para repetir uma ação, usamos?", "answers" to listOf("Loop", "If", "Else", "Function"), "correctAnswerIndex" to 0),
            mapOf("text" to "Condicional 'if' serve para?", "answers" to listOf("Tomar decisões", "Repetir comandos", "Armazenar dados", "Formatar textos"), "correctAnswerIndex" to 0),
            mapOf("text" to "Operadores lógicos incluem?", "answers" to listOf("AND, OR, NOT", "PLUS, MINUS, DIV", "FOR, WHILE, DO", "CREATE, DELETE, UPDATE"), "correctAnswerIndex" to 0),
            mapOf("text" to "Uma variável pode ser?", "answers" to listOf("Texto", "Imagem", "Teclado", "Monitor"), "correctAnswerIndex" to 0),
            mapOf("text" to "Laço 'while' repete enquanto?", "answers" to listOf("Condição for verdadeira", "Sempre", "Nunca", "Quando for falso"), "correctAnswerIndex" to 0)
        )
    )
    val frontendQuiz = mapOf(
        "title" to "Frontend",
        "questions" to listOf(
            mapOf("text" to "O que é Frontend?", "answers" to listOf("Parte visual de um site", "Servidor de banco de dados", "Firewall de segurança", "Rede interna"), "correctAnswerIndex" to 0),
            mapOf("text" to "HTML é usado para?", "answers" to listOf("Estruturar páginas", "Criar bancos de dados", "Proteger sistemas", "Montar redes"), "correctAnswerIndex" to 0),
            mapOf("text" to "CSS é utilizado para?", "answers" to listOf("Estilizar páginas", "Programar servidores", "Gerenciar sistemas", "Proteger dados"), "correctAnswerIndex" to 0),
            mapOf("text" to "JavaScript serve para?", "answers" to listOf("Adicionar interatividade", "Criar bancos de dados", "Gerenciar redes", "Proteger acessos"), "correctAnswerIndex" to 0),
            mapOf("text" to "React é uma biblioteca de?", "answers" to listOf("JavaScript", "Python", "PHP", "Ruby"), "correctAnswerIndex" to 0),
            mapOf("text" to "Qual função do Frontend?", "answers" to listOf("Experiência do usuário", "Controle de servidores", "Gerenciamento de redes", "Criptografia de dados"), "correctAnswerIndex" to 0),
            mapOf("text" to "Framework de CSS?", "answers" to listOf("Bootstrap", "Laravel", "Flask", "Spring"), "correctAnswerIndex" to 0),
            mapOf("text" to "Single Page Application (SPA) é?", "answers" to listOf("Aplicação de página única", "Sistema operacional", "Banco de dados relacional", "Rede de segurança"), "correctAnswerIndex" to 0),
            mapOf("text" to "Qual linguagem não é Frontend?", "answers" to listOf("SQL", "HTML", "CSS", "JavaScript"), "correctAnswerIndex" to 0),
            mapOf("text" to "O que é responsividade?", "answers" to listOf("Adaptação a vários dispositivos", "Velocidade de download", "Configuração de servidor", "Criação de APIs"), "correctAnswerIndex" to 0),
            mapOf("text" to "Exemplo de responsividade?", "answers" to listOf("Site que funciona no celular e no PC", "Servidor em nuvem", "Sistema de firewall", "Banco de dados relacional"), "correctAnswerIndex" to 0),
            mapOf("text" to "CSS Grid é usado para?", "answers" to listOf("Organizar layout", "Programar backend", "Gerenciar APIs", "Instalar pacotes"), "correctAnswerIndex" to 0)
        )
    )
    val backendQuiz = mapOf(
        "title" to "Backend",
        "questions" to listOf(
            mapOf("text" to "O que é Backend?", "answers" to listOf("Lógica por trás dos sistemas", "Parte visual do site", "Criação de designs", "Montagem de computadores"), "correctAnswerIndex" to 0),
            mapOf("text" to "Banco de dados é usado em?", "answers" to listOf("Backend", "Frontend", "Design gráfico", "Segurança de rede"), "correctAnswerIndex" to 0),
            mapOf("text" to "Qual linguagem é popular no Backend?", "answers" to listOf("Node.js", "CSS", "HTML", "Photoshop"), "correctAnswerIndex" to 0),
            mapOf("text" to "PHP é usado para?", "answers" to listOf("Programar servidores", "Montar computadores", "Criar imagens", "Editar vídeos"), "correctAnswerIndex" to 0),
            mapOf("text" to "Framework de backend em Java?", "answers" to listOf("Spring Boot", "React", "Angular", "Vue"), "correctAnswerIndex" to 0),
            mapOf("text" to "API significa?", "answers" to listOf("Interface de Programação de Aplicações", "Servidor Padrão", "Banco de Dados Externo", "Sistema de Arquivos"), "correctAnswerIndex" to 0),
            mapOf("text" to "Qual protocolo é usado em APIs?", "answers" to listOf("HTTP", "FTP", "SMTP", "SSH"), "correctAnswerIndex" to 0),
            mapOf("text" to "Servidor é responsável por?", "answers" to listOf("Responder requisições", "Mostrar imagens", "Gerenciar redes sociais", "Controlar energia elétrica"), "correctAnswerIndex" to 0),
            mapOf("text" to "Exemplo de banco de dados?", "answers" to listOf("MySQL", "Photoshop", "Visual Studio", "CorelDraw"), "correctAnswerIndex" to 0),
            mapOf("text" to "ORM significa?", "answers" to listOf("Mapeamento objeto-relacional", "Organização de recursos de mídia", "Opções rápidas de mídia", "Operação de recursos múltiplos"), "correctAnswerIndex" to 0),
            mapOf("text" to "Node.js usa qual linguagem?", "answers" to listOf("JavaScript", "PHP", "Ruby", "Python"), "correctAnswerIndex" to 0),
            mapOf("text" to "O que é um endpoint?", "answers" to listOf("Ponto de acesso a uma API", "Servidor de arquivos", "Design de interface", "Recurso de segurança"), "correctAnswerIndex" to 0)
        )
    )
    val kotlinQuiz = mapOf(
        "title" to "Kotlin",
        "questions" to listOf(
            mapOf("text" to "O que é Kotlin?", "answers" to listOf("Linguagem de programação", "Framework de Frontend", "Sistema operacional", "Banco de dados"), "correctAnswerIndex" to 0),
            mapOf("text" to "Kotlin é usado principalmente para?", "answers" to listOf("Desenvolver apps Android", "Programar impressoras", "Criar redes Wi-Fi", "Montar hardware"), "correctAnswerIndex" to 0),
            mapOf("text" to "Kotlin é compatível com?", "answers" to listOf("Java", "C#", "Python", "Ruby"), "correctAnswerIndex" to 0),
            mapOf("text" to "Uma função em Kotlin começa com?", "answers" to listOf("fun", "func", "def", "function"), "correctAnswerIndex" to 0),
            mapOf("text" to "O que é uma variável 'val'?", "answers" to listOf("Valor imutável", "Valor mutável", "Laço de repetição", "Função anônima"), "correctAnswerIndex" to 0),
            mapOf("text" to "O que significa 'var'?", "answers" to listOf("Valor mutável", "Valor fixo", "Função", "Classe"), "correctAnswerIndex" to 0),
            mapOf("text" to "Classe em Kotlin começa com?", "answers" to listOf("class", "classe", "ClassName", "defClass"), "correctAnswerIndex" to 0),
            mapOf("text" to "Como declarar uma lista?", "answers" to listOf("listOf()", "createList()", "new List()", "arrayList()"), "correctAnswerIndex" to 0),
            mapOf("text" to "Nullable em Kotlin usa?", "answers" to listOf("?", "!", ":", "&"), "correctAnswerIndex" to 0),
            mapOf("text" to "Para criar um objeto usamos?", "answers" to listOf("val nome = Classe()", "class nome()", "new Classe()", "object nome()"), "correctAnswerIndex" to 0),
            mapOf("text" to "Coroutines são usadas para?", "answers" to listOf("Programação assíncrona", "Criação de designs", "Montagem de servidores", "Design de redes"), "correctAnswerIndex" to 0),
            mapOf("text" to "Jetpack Compose é usado para?", "answers" to listOf("Interface Android", "Servidor web", "Banco de dados", "Gerenciar segurança"), "correctAnswerIndex" to 0)
        )
    )
    val engenhariaSoftwareQuiz = mapOf(
        "title" to "Engenharia de Software",
        "questions" to listOf(
            mapOf("text" to "O que é Engenharia de Software?", "answers" to listOf("Disciplina que estuda o desenvolvimento de sistemas", "Criação de hardware", "Gerenciamento de redes", "Análise de imagens"), "correctAnswerIndex" to 0),
            mapOf("text" to "O que é ciclo de vida do software?", "answers" to listOf("Etapas do desenvolvimento de um sistema", "Crescimento de uma empresa", "Manutenção de hardware", "Compra de licenças"), "correctAnswerIndex" to 0),
            mapOf("text" to "Metodologias ágeis incluem?", "answers" to listOf("Scrum", "Waterfall", "ERP", "CMMI"), "correctAnswerIndex" to 0),
            mapOf("text" to "Scrum é uma?", "answers" to listOf("Metodologia ágil", "Banco de dados", "Sistema operacional", "Linguagem de programação"), "correctAnswerIndex" to 0),
            mapOf("text" to "Product Owner é?", "answers" to listOf("Responsável pelo produto", "Gerente de marketing", "Desenvolvedor backend", "Administrador de banco de dados"), "correctAnswerIndex" to 0),
            mapOf("text" to "Sprint é?", "answers" to listOf("Período de trabalho no Scrum", "Framework de Frontend", "Linguagem de script", "Modelo de dados"), "correctAnswerIndex" to 0),
            mapOf("text" to "Kanban é?", "answers" to listOf("Sistema visual de controle de tarefas", "Banco de dados", "Servidor web", "Framework de frontend"), "correctAnswerIndex" to 0),
            mapOf("text" to "O que é um backlog?", "answers" to listOf("Lista de tarefas pendentes", "Servidor de banco de dados", "Conjunto de APIs", "Rede de computadores"), "correctAnswerIndex" to 0),
            mapOf("text" to "O que é uma daily meeting?", "answers" to listOf("Reunião diária de acompanhamento", "Atualização de software", "Criação de rede Wi-Fi", "Manutenção de servidor"), "correctAnswerIndex" to 0),
            mapOf("text" to "Waterfall é um modelo?", "answers" to listOf("Sequencial", "Ágil", "Iterativo", "Incremental"), "correctAnswerIndex" to 0),
            mapOf("text" to "Teste de software é importante para?", "answers" to listOf("Garantir qualidade", "Gerar códigos", "Reduzir velocidade", "Aumentar tamanho do software"), "correctAnswerIndex" to 0),
            mapOf("text" to "O que é versionamento de código?", "answers" to listOf("Controle de versões de software", "Backup de imagens", "Criação de bancos de dados", "Gerenciamento de redes"), "correctAnswerIndex" to 0)
        )
    )
    val matematicaQuiz = mapOf(
        "title" to "Matemática",
        "questions" to listOf(
            mapOf("text" to "Quanto é 5 + 3?", "answers" to listOf("8", "7", "6", "9"), "correctAnswerIndex" to 0),
            mapOf("text" to "Quanto é 10 - 4?", "answers" to listOf("6", "7", "5", "4"), "correctAnswerIndex" to 0),
            mapOf("text" to "Quanto é 6 × 7?", "answers" to listOf("42", "36", "48", "52"), "correctAnswerIndex" to 0),
            mapOf("text" to "Quanto é 24 ÷ 6?", "answers" to listOf("4", "5", "3", "6"), "correctAnswerIndex" to 0),
            mapOf("text" to "Qual o valor de π?", "answers" to listOf("3,14", "2,14", "4,13", "3,41"), "correctAnswerIndex" to 0),
            mapOf("text" to "Raiz quadrada de 64?", "answers" to listOf("8", "7", "6", "9"), "correctAnswerIndex" to 0),
            mapOf("text" to "Quanto é 9²?", "answers" to listOf("81", "72", "64", "91"), "correctAnswerIndex" to 0),
            mapOf("text" to "Quanto é 100 ÷ 4?", "answers" to listOf("25", "20", "24", "26"), "correctAnswerIndex" to 0),
            mapOf("text" to "Qual é a metade de 50?", "answers" to listOf("25", "30", "20", "15"), "correctAnswerIndex" to 0),
            mapOf("text" to "Quanto é 15 + 15?", "answers" to listOf("30", "25", "35", "40"), "correctAnswerIndex" to 0),
            mapOf("text" to "Multiplicação de 12 × 3?", "answers" to listOf("36", "32", "40", "38"), "correctAnswerIndex" to 0),
            mapOf("text" to "Quanto é 81 ÷ 9?", "answers" to listOf("9", "8", "7", "6"), "correctAnswerIndex" to 0)
        )
    )
    val excelQuiz = mapOf(
        "title" to "Excel",
        "questions" to listOf(
            mapOf("text" to "O que é o Excel?", "answers" to listOf("Software de planilhas", "Editor de textos", "Navegador web", "Programa de email"), "correctAnswerIndex" to 0),
            mapOf("text" to "Função para somar no Excel?", "answers" to listOf("SOMA", "MEDIA", "SE", "PROCV"), "correctAnswerIndex" to 0),
            mapOf("text" to "Função para calcular média?", "answers" to listOf("MÉDIA", "SOMA", "SE", "PROCV"), "correctAnswerIndex" to 0),
            mapOf("text" to "Qual função busca dados?", "answers" to listOf("PROCV", "SOMA", "MÉDIA", "SE"), "correctAnswerIndex" to 0),
            mapOf("text" to "Para condicional usamos?", "answers" to listOf("SE", "SOMA", "MÉDIA", "PROCV"), "correctAnswerIndex" to 0),
            mapOf("text" to "Extensão padrão do Excel?", "answers" to listOf(".xlsx", ".docx", ".pptx", ".pdf"), "correctAnswerIndex" to 0),
            mapOf("text" to "Atalho para salvar?", "answers" to listOf("Ctrl + S", "Ctrl + P", "Ctrl + V", "Ctrl + Z"), "correctAnswerIndex" to 0),
            mapOf("text" to "Para criar gráfico usamos?", "answers" to listOf("Inserir gráfico", "Criar tabela", "Formatar célula", "Configurar página"), "correctAnswerIndex" to 0),
            mapOf("text" to "Congelar painéis serve para?", "answers" to listOf("Fixar linhas ou colunas", "Colorir células", "Criar bordas", "Excluir linhas"), "correctAnswerIndex" to 0),
            mapOf("text" to "Filtrar dados permite?", "answers" to listOf("Exibir dados específicos", "Apagar células", "Alterar fonte", "Redefinir zoom"), "correctAnswerIndex" to 0),
            mapOf("text" to "Formatação condicional serve para?", "answers" to listOf("Alterar aparência com base em regras", "Imprimir documento", "Criar fórmulas", "Apagar linhas duplicadas"), "correctAnswerIndex" to 0),
            mapOf("text" to "Tabela dinâmica é usada para?", "answers" to listOf("Analisar grandes volumes de dados", "Formatar células", "Criar gráficos 3D", "Compartilhar arquivos"), "correctAnswerIndex" to 0)
        )
    )
    val hardwareQuiz = mapOf(
        "title" to "Hardware",
        "questions" to listOf(
            mapOf("text" to "O que é hardware?", "answers" to listOf("Parte física do computador", "Programas de computador", "Sites da internet", "Serviços de nuvem"), "correctAnswerIndex" to 0),
            mapOf("text" to "Qual é a função da CPU?", "answers" to listOf("Processar dados", "Armazenar fotos", "Exibir vídeos", "Gerar conexão de internet"), "correctAnswerIndex" to 0),
            mapOf("text" to "O que é um HD?", "answers" to listOf("Disco rígido de armazenamento", "Placa de vídeo", "Fonte de alimentação", "Memória RAM"), "correctAnswerIndex" to 0),
            mapOf("text" to "O que é RAM?", "answers" to listOf("Memória de acesso rápido", "Armazenamento permanente", "Placa de rede", "Fonte de energia"), "correctAnswerIndex" to 0),
            mapOf("text" to "A placa-mãe conecta?", "answers" to listOf("Todos os componentes do computador", "Somente CPU e HD", "Apenas monitor e teclado", "Somente internet"), "correctAnswerIndex" to 0),
            mapOf("text" to "Fonte de alimentação faz o quê?", "answers" to listOf("Distribui energia elétrica", "Resfria o computador", "Processa dados", "Executa programas"), "correctAnswerIndex" to 0),
            mapOf("text" to "Placa de vídeo é usada para?", "answers" to listOf("Processamento gráfico", "Salvar documentos", "Aumentar memória RAM", "Melhorar rede Wi-Fi"), "correctAnswerIndex" to 0),
            mapOf("text" to "SSD é?", "answers" to listOf("Unidade de armazenamento mais rápida", "Placa de som", "Memória RAM", "Processador secundário"), "correctAnswerIndex" to 0),
            mapOf("text" to "O que é um periférico?", "answers" to listOf("Dispositivo de entrada ou saída", "Placa de rede", "Processador", "Memória de vídeo"), "correctAnswerIndex" to 0),
            mapOf("text" to "Exemplos de periféricos são?", "answers" to listOf("Mouse e teclado", "Processador e memória", "HD e SSD", "Fonte e placa-mãe"), "correctAnswerIndex" to 0),
            mapOf("text" to "BIOS serve para?", "answers" to listOf("Iniciar o sistema", "Aumentar velocidade da internet", "Editar imagens", "Jogar online"), "correctAnswerIndex" to 0),
            mapOf("text" to "O que é um monitor?", "answers" to listOf("Dispositivo de saída de vídeo", "Dispositivo de entrada", "Unidade de processamento", "Sistema de resfriamento"), "correctAnswerIndex" to 0)
        )
    )
    val redesQuiz = mapOf(
        "title" to "Redes",
        "questions" to listOf(
            mapOf("text" to "O que é uma rede de computadores?", "answers" to listOf("Conexão entre dois ou mais dispositivos", "Sistema de som", "Banco de dados", "Sistema operacional"), "correctAnswerIndex" to 0),
            mapOf("text" to "O que significa IP?", "answers" to listOf("Internet Protocol", "Internet Page", "Internal Protocol", "Input Protocol"), "correctAnswerIndex" to 0),
            mapOf("text" to "Qual equipamento conecta redes diferentes?", "answers" to listOf("Roteador", "Switch", "Hub", "Repetidor"), "correctAnswerIndex" to 0),
            mapOf("text" to "O que faz o Switch?", "answers" to listOf("Interliga dispositivos em uma mesma rede", "Conecta redes diferentes", "Amplifica sinal", "Traduz endereços IP"), "correctAnswerIndex" to 0),
            mapOf("text" to "Wi-Fi é?", "answers" to listOf("Rede sem fio", "Protocolo de segurança", "Servidor de arquivos", "Placa de rede"), "correctAnswerIndex" to 0),
            mapOf("text" to "O que é DNS?", "answers" to listOf("Sistema de nomes de domínio", "Sistema de segurança", "Rede cabeada", "Servidor de backup"), "correctAnswerIndex" to 0),
            mapOf("text" to "Qual é a função do firewall?", "answers" to listOf("Proteger a rede", "Acelerar a internet", "Aumentar espaço em disco", "Melhorar som do computador"), "correctAnswerIndex" to 0),
            mapOf("text" to "Qual é o meio físico mais usado em redes cabeadas?", "answers" to listOf("Cabo de par trançado", "Fibra ótica", "Cabo coaxial", "Cabo HDMI"), "correctAnswerIndex" to 0),
            mapOf("text" to "Qual protocolo é usado para sites seguros?", "answers" to listOf("HTTPS", "FTP", "HTTP", "SMTP"), "correctAnswerIndex" to 0),
            mapOf("text" to "O que é uma LAN?", "answers" to listOf("Rede local", "Rede mundial", "Rede virtual", "Rede wireless"), "correctAnswerIndex" to 0),
            mapOf("text" to "O que é uma WAN?", "answers" to listOf("Rede de longa distância", "Rede de área pessoal", "Rede cabeada", "Rede local"), "correctAnswerIndex" to 0),
            mapOf("text" to "O que é uma VPN?", "answers" to listOf("Rede privada virtual", "Rede pública de navegação", "Protocolo de email", "Sistema operacional para redes"), "correctAnswerIndex" to 0)
        )
    )
    val segurancaQuiz = mapOf(
        "title" to "Segurança da Informação",
        "questions" to listOf(
            mapOf("text" to "O que é segurança da informação?", "answers" to listOf("Proteção de dados e informações", "Criação de sistemas", "Desenvolvimento de hardware", "Compartilhamento de imagens"), "correctAnswerIndex" to 0),
            mapOf("text" to "Confidencialidade significa?", "answers" to listOf("Acesso apenas a pessoas autorizadas", "Acesso público", "Criptografia de voz", "Exclusão de dados antigos"), "correctAnswerIndex" to 0),
            mapOf("text" to "Integridade garante?", "answers" to listOf("Que os dados não sejam alterados indevidamente", "Que todos possam acessar", "Que os dados sejam públicos", "Que o sistema fique offline"), "correctAnswerIndex" to 0),
            mapOf("text" to "Disponibilidade refere-se a?", "answers" to listOf("Acesso contínuo às informações", "Bloqueio de acesso", "Privacidade de documentos", "Armazenamento físico"), "correctAnswerIndex" to 0),
            mapOf("text" to "O que é phishing?", "answers" to listOf("Tentativa de enganar usuários para obter dados", "Vírus de computador", "Firewall", "Backup de dados"), "correctAnswerIndex" to 0),
            mapOf("text" to "O que é um vírus de computador?", "answers" to listOf("Programa malicioso que se espalha", "Atualização de software", "Ferramenta de segurança", "Sistema de backup"), "correctAnswerIndex" to 0),
            mapOf("text" to "Qual a função do antivírus?", "answers" to listOf("Detectar e remover ameaças", "Aumentar velocidade do computador", "Criar senhas fortes", "Gerar relatórios financeiros"), "correctAnswerIndex" to 0),
            mapOf("text" to "O que é ransomware?", "answers" to listOf("Sequestro de dados mediante pagamento", "Sistema de compartilhamento", "Ferramenta de backup", "Servidor de email"), "correctAnswerIndex" to 0),
            mapOf("text" to "Firewall protege contra?", "answers" to listOf("Acessos não autorizados", "Falta de energia", "Atualizações de sistema", "Problemas de hardware"), "correctAnswerIndex" to 0),
            mapOf("text" to "Backup é importante para?", "answers" to listOf("Recuperar dados em caso de perda", "Aumentar espaço de disco", "Proteger redes Wi-Fi", "Atualizar programas"), "correctAnswerIndex" to 0),
            mapOf("text" to "Autenticação de dois fatores é?", "answers" to listOf("Verificação em duas etapas para login", "Sistema de armazenamento", "Programa antivírus", "Protocolo de redes"), "correctAnswerIndex" to 0),
            mapOf("text" to "Senhas fortes devem ter?", "answers" to listOf("Letras, números e símbolos", "Somente números", "Somente letras", "Somente palavras comuns"), "correctAnswerIndex" to 0)
        )
    )
    val cidadanniaDigitalQuiz = mapOf(
        "title" to "Cidadania Digital",
        "questions" to listOf(
            mapOf("text" to "O que é cidadania digital?", "answers" to listOf("A capacidade de usar tecnologias digitais de forma ética, segura e responsável.", "O ato de votar online.","A criação de aplicativos móveis.", "A denúncia de crimes virtuais."),"correctAnswerIndex" to 0),
            mapOf("text" to "Qual é uma prática importante da cidadania digital?", "answers" to listOf("Compartilhar fake news.", "Proteger seus dados pessoais online.", "Ignorar políticas de privacidade.", "Hackear redes sociais."), "correctAnswerIndex" to 1),
            mapOf("text" to "O que é cyberbullying?", "answers" to listOf("Venda de produtos ilegais pela internet.", "Atividades bancárias online.", "Uso da internet para intimidar ou assediar alguém.", "Roubo de identidade."), "correctAnswerIndex" to 2),
            mapOf("text" to "Qual é a atitude correta ao se deparar com informações duvidosas na internet?", "answers" to listOf("Compartilhar rapidamente.", "Ignorar totalmente.", "Verificar a veracidade antes de compartilhar.","Editar a informação antes de compartilhar."), "correctAnswerIndex" to 2),
            mapOf("text" to "O que são direitos digitais?", "answers" to listOf("Direitos de uso de software gratuito.", "Direitos humanos aplicados ao ambiente online.", "Direitos de exportar dados para outros países.", "Direitos de vender informações pessoais."), "correctAnswerIndex" to 1),
            mapOf("text" to "O que significa ter uma identidade digital?", "answers" to listOf("Ter apenas um perfil no Instagram.", "Ser reconhecido oficialmente na internet.", "Ter mais de um e-mail ativo.", "Possuir criptomoedas."), "correctAnswerIndex" to 1),
            mapOf("text" to "Quais ações são exemplos de comportamento ético online?", "answers" to listOf("Respeitar a privacidade dos outros e não plagiar conteúdos.", "Copiar e colar trabalhos acadêmicos.", "Publicar fotos sem permissão.", "Ignorar mensagens de conscientização."), "correctAnswerIndex" to 0),
            mapOf("text" to "O que é um antivírus?", "answers" to listOf("Um programa que ajuda a proteger dispositivos contra malware.", "Um aplicativo de redes sociais.", "Uma ferramenta de edição de vídeo.", "Uma senha forte para redes Wi-Fi."), "correctAnswerIndex" to 0),
            mapOf("text" to "O que fazer para criar uma senha segura?", "answers" to listOf("Usar seu nome e data de nascimento.", "Criar senhas longas, com letras, números e símbolos.", "Repetir a mesma senha em todos os sites.", "Colocar apenas quatro números."), "correctAnswerIndex" to 1),
            mapOf("text" to "O que é um phishing?", "answers" to listOf("Um tipo de malware que rouba fotos.", "Um ataque que tenta enganar pessoas para roubar informações confidenciais.", "Um programa de edição de fotos.", "Uma rede social exclusiva para negócios."), "correctAnswerIndex" to 1),
            mapOf("text" to "Qual a importância de atualizar o sistema operacional?", "answers" to listOf("Deixar o aparelho mais lento.", "Gastar mais memória.", "Corrigir falhas de segurança e melhorar o desempenho.", "Apagar seus arquivos antigos."), "correctAnswerIndex" to 2),
            mapOf("text" to "Quais são exemplos de crimes digitais?", "answers" to listOf("Hacking, roubo de identidade e cyberbullying.", "Compra de e-books.", "Postagem de fotos de viagens.", "Instalação de aplicativos."), "correctAnswerIndex" to 0)
        )
    )




    val quizzes = listOf(
        inteligenciaArtificialQuiz,
        computacaoNuvemQuiz,
        logicaProgramacaoQuiz,
        frontendQuiz,
        backendQuiz,
        kotlinQuiz,
        engenhariaSoftwareQuiz,
        matematicaQuiz,
        excelQuiz,
        hardwareQuiz,
        redesQuiz,
        segurancaQuiz,
        cidadanniaDigitalQuiz
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
