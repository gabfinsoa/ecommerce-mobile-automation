#language: pt
#encoding: utf-8

@home
Funcionalidade: Home

  Cenário:  Verificar ícone da sacola vazia na Home
    Dado   que acesso o ícone da sacola sem produtos adicionados
    Então  visualizo mensagem de sacola vazia

  Esquema do Cenário:  Adicionar um item na sacola e verificar ícone na Home
    Dado   que pesquiso por um produto padrão
    E      acesso a página de detalhes deste produto
    E      seleciono um tamanho disponível
    E      adiciono ao carrinho
    Quando acesso o link para página inicial
    Então  visualizo <quantidade> item no contador do ícone da sacola
    Exemplos:
      |quantidade|
      |    1     |

  Esquema do Cenário:  Adicionar dois produtos diferentes na sacola e verificar ícone na Home
    Dado   que pesquiso por um produto padrão
    E      acesso a página de detalhes deste produto
    E      seleciono um tamanho disponível
    E      adiciono ao carrinho
    E      acesso o link para página inicial
    E      pesquiso o segundo produto padrão
    E      acesso a página de detalhes deste produto
    E      seleciono um tamanho disponível
    E      adiciono ao carrinho
    Quando acesso o link para página inicial
    Então  visualizo <quantidade> item no contador do ícone da sacola
    Exemplos:
      |quantidade|
      |    2     |

  Esquema do Cenário: Pesquisar um produto no campo de busca
    Dado   que pesquiso por um termo <valor> do tipo <tipo>
    Então  verifico o resultado da pesquisa por <tipo>
    Exemplos:
      | tipo      | valor   |
      | sku       |         |
      | nome      |         |
      | categoria | sapatos |
      | material  | couro   |
      | cor       | preto   |

  Esquema do Cenário: Acessar banners da home
    Dado  que acesso o banner <banner> na home
    Então deve carregar a página <pagina> apresentada no banner
    Exemplos:
      | banner    | pagina    |
      | produto   | pdp       |
      | categoria | categoria |

  Esquema do Cenário: Acessar o Localizador de Lojas do footer da Home
    Dado  que acesso o link <storefinder> no footer da home
    Então é exibido o conteúdo do link <storefinder>
    Exemplos:
      | storefinder         |
      | localizador_lojas  |

  Cenário: Acessar categorias
    Dado  que acesso os links de categoria da home
    Então as páginas de categorias são exibidas

  Cenário: Acessar subcategorias
    Dado  acesso os links de subcategoria
    Então as páginas de subcategorias são exibidas







