#language: pt
#encoding: utf-8

@smoke @fluxo
Funcionalidade: Fluxo de Compras

  @compract
  Cenário: Realiza compra com cartão de crédito
    Dado   que acesso o App
    Quando clico em Buscar
    E      clico em Sapatos
    E      clico em Ver Todos
    E      clico no Sapato
    E      clico na numeração 36
    E      clico em Comprar
    E      clico em Finalizar
    E      clico em Concluir Compra
    Quando apresenta modal para realizar cadastro
    E      realizado o cadastro
    E      clico em Concluir Compra Arezzo
    E      preencho cpf
    E      preencho data de nascimento
    E      preencho o telefone
    E      clico em Enviar
    Quando preencho o endereço
    E      clico em ir para pagamento
    E      escolho cartão de crédito
    E      clico em Continuar em Arezzo
    E      Finalizo o pedido
    Então  Apresenta a página de pedido concluído 

  @compraboleto
  Cenário: Realiza compra com boleto
    Dado   que acesso o App
    Quando clico em Buscar
    E      clico em Sapatos
    E      clico em Ver Todos
    E      clico no Sapato
    E      clico na numeração 36
    E      clico em Comprar
    E      clico em Finalizar
    E      clico em Concluir Compra
    Então  apresenta modal para realizar cadastro
    E      realizado o cadastro
    E      clico em Concluir Compra
    E      preencho data de nascimento
    E      preencho cpf
    E      preencho o telefone
    E      clico em Enviar
    Quando preencho o endereço
    E      clico em ir para pagamento
    E      escolho boleto
    E      clico em Continuar
    E      Finalizo o pedido
    Então  Apresenta a página de pedido concluído