#language: pt
#encoding: utf-8

@smoke @login
Funcionalidade: Login e Cadastro
    
  @editaruser
  Esquema do Cenário: Cadastrar novo usuário com dados incorretos
    Dado   que acesso o App
    Quando clico em Minha Conta
    Dado   que clico em Criar com Conta Arezzo
    Quando eu preencho os dados <email>, <nome>, <sobrenome> e <senha> incorretamente
    E      clico em Cadastrar
    Então  devo ser informado que <mensagem>
    Exemplos:
      |     email     | nome  | sobrenome |   senha   |        mensagem            |
      | teste@com     | Maria |   Silva   | abc123456 |       EMAILINVALIDO        |
      | teste@cwi.com | 12345 |   Silva   | abc123456 |        NOMEINVALIDO        |
      | teste@cwi.com | Maria |   12345   | abc123456 |     SOBRENOMEINVALIDO      |
      | teste@cwi.com | Maria |   Silva   |    123    |       SENHAINVALIDA        |

  @loginuser
  Esquema do Cenário: Logar com usuário cadastrado
    Dado   que acesso o App
    Quando clico em Minha Conta
    E      clico em Entrar com Conta Arezzo
    E      preencho o email <email>
    E      clico em Seguinte
    E      preencho a senha <senha>
    Quando clico em Entrar
    E      clico em Minha Conta
    Então  deve apresentar Minha Conta
    Exemplos:
      |     email           |    senha    |
      | rrsetcwi@gmail.com  |   zero123@  |

 # Cenário: Logar com Facebook
  #  Dado   que acesso o App
    #Quando clico em Minha Conta
    #E      clico em Entrar com Facebook
    #E      preencho o email <email>
    #E      preencho a senha <senha>
    #Quando clico em Login
   # E      clico em Continuar
  #  Então  deve apresentar Minha Conta
 #   Exemplos:
#      |     email           |    senha    |
#      | rrsetcwi@gmail.com  |   zero123@  |

  @cadastro
  Cenário: Cadastrar usuário no login
    Dado   que acesso o App
    Quando clico em Minha Conta
    E      clico em Criar Nova Conta
    Quando preencho o cadastro
    E      clico em Cadastrar
    E      clico em Minha Conta
    Então  deve apresentar Minha Conta