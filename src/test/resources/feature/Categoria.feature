#language: pt
#encoding: utf-8

@categoria
Funcionalidade: Categoria

  Esquema do Cenário: Aplicar filtros individuais em produtos de uma coleção
    Dado   que acesso uma coleção de sapatos
    Quando aplico o filtro <filtro>
    Então  o filtro <filtro> é inserido na URL
    E      seleciono um item disponível
    E      visualizo a característica do filtro <filtro> aplicado nos detalhes deste produto
    Exemplos:
      | filtro          |
      | cor             |
      | salto           |
      | material        |
      | categoria       |
      | tamanho         |
      | tendencia       |
      | preco           |

  Esquema do Cenário: Realizar ordenação de produtos na categoria
    Dado   que acesso uma coleção de sapatos
    Quando ordeno os produtos por <ordenacao>
    Então  verifico se os produto estão ordenados por <ordenacao>
    Exemplos:
      | ordenacao     |
      | maior_preco   |
      | menor_preco   |
      | mais_vendidos |
      | mais_recentes |
