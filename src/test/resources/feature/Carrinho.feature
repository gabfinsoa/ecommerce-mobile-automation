#language: pt
#encoding: utf-8

@carrinho
Funcionalidade: Carrinho

# Visualizar produto no carrinho/sacola de compras -----------------------------------------------------/

  Cenário: Verificar informações do sapato adicionado ao carrinho
    Dado   que acesso uma coleção de sapatos
    Quando seleciono um item disponível
    E      seleciono um tamanho disponível
    E      salvo os dados do sapato para conferência
    E      adiciono ao carrinho
    Então  visualizo no carrinho o nome do produto
    E      visualizo no carrinho o sku do produto
    E      visualizo no carrinho a imagem do produto
    E      visualizo no carrinho o preço unitário do produto
    E      visualizo no carrinho o tamanho selecionado

  Cenário: Verificar informações da bolsa adicionada ao carrinho
    Dado   que pesquiso por uma bolsa disponível
    Quando acesso a página de detalhes deste produto
    E      salvo os dados da bolsa para conferência
    E      adiciono ao carrinho
    Então  visualizo no carrinho o nome do produto
    E      visualizo no carrinho o sku do produto
    E      visualizo no carrinho a imagem do produto
    E      visualizo no carrinho o preço unitário do produto

  Cenário: Verificar o botão de concluir compra no carrinho
    Dado   que acesso uma coleção de sapatos
    E      seleciono um item disponível
    E      seleciono um tamanho disponível
    Quando adiciono ao carrinho
    Então  visualizo no carrinho o botão de concluir compra

  Cenário: Verificar a opção de excluir produto do carrinho
    Dado   que acesso uma coleção de sapatos
    E      seleciono um item disponível
    E      seleciono um tamanho disponível
    Quando adiciono ao carrinho
    Então  visualizo o botão de excluir produto do carrinho

  Cenário: Verificar a opção de utilizar voucher
    Dado   que acesso uma coleção de sapatos
    E      seleciono um item disponível
    E      seleciono um tamanho disponível
    Quando adiciono ao carrinho
    Então  visualizo o botão de utilizar voucher

  Cenário: Verificar a opção de continuar comprando
    Dado   que acesso uma coleção de sapatos
    E      seleciono um item disponível
    E      seleciono um tamanho disponível
    Quando adiciono ao carrinho
    Então  visualizo o botão de continuar comprando

  Cenário: Verificar o desconto no valor unitário do produto
    Dado   que pesquiso por um produto com desconto
    E      acesso a página de detalhes deste produto
    E      seleciono um tamanho disponível
    E      salvo os preços promocionais para conferência
    Quando adiciono ao carrinho
    Então  visualizo no carrinho o preço antigo
    E      visualizo no carrinho o preço novo

  Cenário: Verificar a opção de embalagem para presente
    Dado   acesso uma coleção de sapatos
    E      seleciono um item disponível
    E      seleciono um tamanho disponível
    Quando adiciono ao carrinho
    Então  está presente a opção de embalar para presente
#----------------------------------/----------------------------------/----------------------------------/

# Aumentar/Diminuir quantidade de itens no carrinho/sacola de compras ----------------------------------/

  @verificarqtd
  Cenário: Aumenta e diminui itens no carrinho
    Quando clico em Buscar
    E      clico em Sapatos
    E      clico em Ver Todos
    E      clico no Sapato
    E      clico na numeração 33
    E      clico em Comprar
    E      clico em Finalizar
    Quando clico em aumentar a quantidade de itens
    Então  verifico se apresenta a quantidade 2
    Quando clico em diminuir a quantidade de itens
    Então  verifico se apresenta a quantidade 1

#----------------------------------/----------------------------------/----------------------------------/

# Adicionar produto no carrinho/sacola ------------------------------------------------------------------/

  Cenário: Adicionar um sapato ao carrinho
    Dado   que acesso uma coleção de sapatos
    E      seleciono um item disponível
    E      seleciono um tamanho disponível
    Quando adiciono ao carrinho
    Então  verifico o direcionamento para a pagina do carrinho

  Cenário: Incluir sapato na sacola
    Dado   que pesquiso por um produto não personalizável
    E      acesso a página de detalhes deste produto
    E      seleciono um tamanho disponível
    Quando incluo o produto na sacola
    Então  verifico se continuo na pagina de detalhe do produto
    E      o icone da sacola mostra que foi adicionado o produto

  Cenário: Adicionar um bolsa ao carrinho
    Dado   que pesquiso por uma bolsa disponível
    E      acesso a página de detalhes deste produto
    Quando adiciono ao carrinho
    Então  verifico o direcionamento para a pagina do carrinho

  Cenário: Incluir bolsa na sacola
    Dado   que pesquiso por uma bolsa disponível
    E      acesso a página de detalhes deste produto
    Quando incluo o produto na sacola
    Então  verifico se continuo na pagina de detalhe do produto
    E      o icone da sacola mostra que foi adicionado o produto

#----------------------------------/----------------------------------/----------------------------------/

# Continuar comprando após chegar ao carrinho/sacola -----------------------------------------------------/

  Cenário: Retornar para pagina de categoria apos acessar continuar comprando
    Dado   que acesso uma coleção de sapatos
    E      seleciono um item disponível
    E      seleciono um tamanho disponível
    Quando adiciono ao carrinho
    E      acesso continuar comprando

#----------------------------------/----------------------------------/----------------------------------/

# [SCHUTZ] Adicionar no carrinho embalagem/sacola para presente ----------------------------------------/

  Cenário: Adicionar embalagem para presente no carrinho
    Dado   que acesso uma coleção de sapatos
    E      seleciono um item disponível
    E      seleciono um tamanho disponível
    E      adiciono ao carrinho
    E      salvo os valores total e subtotal para conferência
    Quando seleciono a opção é para presente
    E      a modal para escolha da embalagem é apresentada
    E      seleciono uma opção de embalagem
    E      confirmo para adicionar a embalagem ao carrinho
    Então  visualizo no carrinho a descrição da embalagem conforme selecionado
    E      visualizo no carrinho o preço da embalagem conforme selecionado
    E      o subtotal do carrinho é atualizado com o valor da embalagem
    E      o total do carrinho é atualizado com o valor da embalagem

#--------------------------------------------------------------------------------------------------------/

# Adicionar no carrinho voucher ------------------------------------------------------------------------/

  Esquema do Cenário: Adicionar voucher ao carrinho e receber o desconto
    Dado   que acesso uma coleção de sapatos
    E      seleciono um item disponível
    E      seleciono um tamanho disponível
    E      adiciono ao carrinho
    E      salvo os valores total e subtotal para conferência
    Quando adiciono um voucher <voucher>
    Então  o desconto <desconto> é aplicado no carrinho
    E      o total do carrinho é atualizado com o valor do voucher
    Exemplos:
      |       voucher      | desconto             |
      | AVF-HFD8-TM9M-X75P | DEZREAIS             |
      | AVD-W5LM-8B38-45C1 | DEZPORCENTO          |
      | AVG-6L9R-KX6L-A3SS | FRETEGRATIS          |
      | AVH-CDHB-SM9B-9SBL | DEZREAISEFRETEGRATIS |

  Esquema do Cenário: Remover voucher do carrinho
    Dado   que acesso uma coleção de sapatos
    E      seleciono um item disponível
    E      seleciono um tamanho disponível
    E      adiciono ao carrinho
    E      adiciono um voucher <voucher>
    E      o desconto <desconto> é aplicado no carrinho
    Quando removo o voucher
    Então  o desconto é removido do carrinho
    E      o total do carrinho é atualizado sem o valor do voucher
    Exemplos:
      |       voucher      | desconto             |
      | AVF-HFD8-TM9M-X75P | DEZREAIS             |
      | AVD-W5LM-8B38-45C1 | DEZPORCENTO          |
      | AVG-6L9R-KX6L-A3SS | FRETEGRATIS          |
      | AVH-CDHB-SM9B-9SBL | DEZREAISEFRETEGRATIS |

#--------------------------------------------------------------------------------------------------------/

# Excluir produtos do carrinho--------------------------------------------------------------------------/

  Cenário: Adicionar um produto no carrinho e excluir
    Dado   que acesso uma coleção de sapatos
    E      seleciono um item disponível
    E      seleciono um tamanho disponível
    Quando adiciono ao carrinho
    E      excluo o produto do carrinho
    Entao  visualizo a página do carrinho vazio

  Cenário: Adicionar mais de um produto e excluir apenas um do carrinho
    Dado   que acesso uma coleção de sapatos
    E      seleciono um item disponível
    E      seleciono um tamanho disponível
    E      adiciono ao carrinho
    E      acesso continuar comprando
    E      seleciono o segundo item disponível
    E      seleciono um tamanho disponível
    E      adiciono ao carrinho
    Quando excluo o produto do carrinho
    Entao  o produto foi excluido do carrinho
    E      restou um produto no carrinho

#--------------------------------------------------------------------------------------------------------/

# Incluir mais produtos no carrinho --------------------------------------------------------------------/

  Cenário: Incluir mais de um produto no carrinho
    Dado   que acesso uma coleção de sapatos
    E      seleciono um item disponível
    E      seleciono um tamanho disponível
    E      salvo o nome do produto
    E      adiciono ao carrinho
    E      acesso continuar comprando
    E      seleciono o segundo item disponível
    E      seleciono um tamanho disponível
    E      salvo o nome do produto
    E      adiciono ao carrinho
    E      acesso continuar comprando
    Quando seleciono o terceiro item disponível
    E      seleciono um tamanho disponível
    E      salvo o nome do produto
    E      adiciono ao carrinho
    Entao  visualizo os produtos adicionados no carrinho
    E      verifico se foi adicionada uma unidade de cada produto


#--------------------------------------------------------------------------------------------------------/

# Calcular frete ---------------------------------------------------------------------------------------/

  Esquema do Cenário: Consultar cep válido
    Dado   que acesso uma coleção de sapatos
    E      seleciono um item disponível
    E      seleciono um tamanho disponível
    E      adiciono ao carrinho
    Quando consulto um cep <cep> válido
    Então  visualizo no resumo do carrinho as opções de entrega
    Exemplos:
      |   cep    |
      | 90110010 |
      | 93052470 |
      | 90030130 |
      | 14883420 |

  Esquema do Cenário: Consultar cep inválido
    Dado   que acesso uma coleção de sapatos
    E      seleciono um item disponível
    E      seleciono um tamanho disponível
    E      adiciono ao carrinho
    Quando consulto um cep <cep> inválido
    Então  sou informado que o cep é inválido
    Exemplos:
      |   cep    |
      |          |

  Esquema do Cenário: Consultar cep válido com voucher de frete grátis
    Dado   que acesso uma coleção de sapatos
    E      seleciono um item disponível
    E      seleciono um tamanho disponível
    E      adiciono ao carrinho
    E      verifico o frete de menor valor para o cep <cep>
    E      adiciono um voucher <voucher>
    Quando consulto um cep <cep> válido
    Então  o frete de menor valor deve ser gratuito
    Exemplos:
      |       voucher      |   cep    |
      | AVG-6L9R-KX6L-A3SS | 90110010 |

  Esquema do Cenário: Consultar cep válido e acessar link para informar outro cep
    Dado   que acesso uma coleção de sapatos
    E      seleciono um item disponível
    E      seleciono um tamanho disponível
    E      adiciono ao carrinho
    E      consulto um cep <cep> válido
    Quando acesso o link para informar outro cep
    Então  os dados do frete calculado anteriormente permanecem no carrinho
    Exemplos:
      |    cep   |
      | 90110010 |

  Esquema do Cenário: Consultar frete entrega pela loja no carrinho
    Dado   que pesquiso por um produto de StoreSale
    E      acesso a página de detalhes deste produto
    E      seleciono o tamanho <tamanho>
    E      adiciono ao carrinho
    Quando consulto um cep <cep> válido
    Então  a opção de frete entrega pela loja deve estar disponível
    Exemplos:
      |   cep    | tamanho |
      | 90030130 |    40   |

#--------------------------------------------------------------------------------------------------------/

# Visualizar valores subtotal e total-------------------------------------------------------------------/

  Cenário: Adicionar produtos ao carrinho e verificar alterações de subtotal e total
    Dado   que pesquiso por um produto padrão
    E      acesso a página de detalhes deste produto
    E      seleciono um tamanho disponível
    E      adiciono ao carrinho
    E      aumento em 1 a quantidade do produto
    E      acesso continuar comprando
    E      pesquiso o segundo produto padrão
    E      acesso a página de detalhes deste produto
    E      seleciono um tamanho disponível
    Quando adiciono ao carrinho
    Então  o valor subtotal deve ser a soma dos preços dos itens no carrinho
    E      o valor total deve ser a soma dos preços dos itens no carrinho


#----------------------------------------------------------------------------------------------------------------------/

# Incluir no carrinho produto de pré-venda ---------------------------------------------------------------------------/

  Cenário: Adicionar produto de pré-venda no carrinho e conferir tag
    Dado   que pesquiso por um produto em pré-venda
    E      acesso a página de detalhes deste produto
    E      seleciono um tamanho disponível
    Quando adiciono ao carrinho
    Então  visualizo no carrinho a tag Pré-Venda

  Esquema do Cenário: Adicionar produto de pré-venda no carrinho e consultar frete
    Dado   que pesquiso por um produto em pré-venda
    E      acesso a página de detalhes deste produto
    E      seleciono um tamanho disponível
    E      adiciono ao carrinho
    Quando consulto um cep <cep> válido
    Então  sou informado que o prazo de entrega será estendido
    Exemplos:
      |   cep    |
      | 90110010 |

#--------------------------------------------------------------------------------------------------------/

# Aumentar e diminuir quantidade de Produto com desconto progressivo no carrinho -----------------------/

  Cenário: Incluir de uma a três unidades de um produto no carrinho
    Dado   que pesquiso por um produto com desconto progressivo
    E      acesso a página de detalhes deste produto
    E      seleciono um tamanho disponível
    Quando adiciono ao carrinho
    Então  verifico que o desconto de 30% foi aplicado ao preço unitário do produto
    E      visualizo a informação de desconto progressivo
    E      aumento em 1 a quantidade do produto
    E      verifico que o desconto de 40% foi aplicado ao preço unitário do produto
    E      aumento em 1 a quantidade do produto
    E      verifico que o desconto de 50% foi aplicado ao preço unitário do produto

  Cenário: Incluir três unidades de um produto no carrinho e reduzir até 1
    Dado   que pesquiso por um produto com desconto progressivo
    E      acesso a página de detalhes deste produto
    E      seleciono um tamanho disponível
    Quando adiciono ao carrinho
    E      aumento em 1 a quantidade do produto
    E      aumento em 1 a quantidade do produto
    Então  verifico que o desconto de 50% foi aplicado ao preço unitário do produto
    E      diminuo a quantidade do produto em 1
    E      verifico que o desconto de 40% foi aplicado ao preço unitário do produto
    E      diminuo a quantidade do produto em 1
    E      verifico que o desconto de 30% foi aplicado ao preço unitário do produto

  Cenário: Incluir duas unidades de um produto e uma unidade de outro produto no carrinho
    Dado   que pesquiso por um produto com desconto progressivo
    E      acesso a página de detalhes deste produto
    E      seleciono um tamanho disponível
    Quando adiciono ao carrinho
    E      aumento em 1 a quantidade do produto
    E      acesso continuar comprando
    E      pesquiso pelo segundo produto com desconto progressivo
    E      acesso a página de detalhes deste produto
    E      seleciono um tamanho disponível
    E      adiciono ao carrinho
    Então  verifico que o desconto de 50% foi aplicado ao preço unitário dos 2 produtos
    E      verifico que o total do carrinho apresenta o desconto aplicado

  Cenário: Incluir um produto com desconto e um sem desconto no carrinho
    Dado   que pesquiso por um produto com desconto progressivo
    E      acesso a página de detalhes deste produto
    E      seleciono um tamanho disponível
    Quando adiciono ao carrinho
    E      acesso continuar comprando
    E      pesquiso por um produto sem desconto
    E      acesso a página de detalhes deste produto
    E      seleciono um tamanho disponível
    E      adiciono ao carrinho
    Então  verifico que o desconto de 30% foi aplicado ao preço unitário do produto
    E      o produto sem promoção deve apresentar o preço normal

  Cenário: Incluir um produto com desconto progressivo e um com outro tipo de desconto no carrinho
    Dado   que pesquiso por um produto com desconto progressivo
    E      acesso a página de detalhes deste produto
    E      seleciono um tamanho disponível
    Quando adiciono ao carrinho
    E      acesso continuar comprando
    E      pesquiso por um produto com desconto
    E      acesso a página de detalhes deste produto
    E      seleciono um tamanho disponível
    E      salvo os preços promocionais para conferência
    E      adiciono ao carrinho
    Então  o desconto de 30% deve ser aplicado ao produto do desconto progressivo
    E      o produto com desconto deve apresentar o preço com desconto pré-fixado


#--------------------------------------------------------------------------------------------------------/

# Validar promoções no carrinho ------------------------------------------------------------------------/

  Cenário: Verificar se mensagem de descontos Desconto Percentual com valores esta visível
    Dado   que pesquiso um item com Desconto Percentual
    E      seleciono um item disponível
    E      seleciono um tamanho disponível
    E      adiciono ao carrinho
    Quando aumento a quantidade ao máximo permitido
    Então  visualizo a mensagem com o valor do desconto
    E      confirmo o Desconto Percentual dos produtos no carrinho

  Cenário: Verificar a funcionalidade da Promoção de presentes grátis
    Dado   que acesso uma coleção de sapatos
    E      seleciono um item disponível
    E      seleciono um tamanho disponível
    E      adiciono ao carrinho
    Quando aumento a quantidade ao máximo permitido
    E      seleciono o brinde grátis na modal
    Então  verifico o brinde escolhido na seleção

#--------------------------------------------------------------------------------------------------------/