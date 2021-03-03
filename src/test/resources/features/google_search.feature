# language: pt
Funcionalidade: Pesquisar no Google

  @slipknot
  Cenário: Quando pesquiso por Slipknot
    Dado usuário na página inicial do Google
    Quando pesquisar por "Slipknot"
    Então deverá ver resultados relacionados

  @crue
  Cenário: Quando pesquiso por Mötley Crüe
    Dado usuário na página inicial do Google
    Quando pesquisar por "Mötley Crüe"
    Então deverá ver resultados relacionados

  @stones
  Cenário: Quando pesquiso por The Rolling Stones
    Dado usuário na página inicial do Google
    Quando pesquisar por "The Rolling Stones"
    Então deverá ver resultados relacionados

  @wip @notagoodband @beatles
  Cenário: Quando pesquiso por The Beatles
    Dado usuário na página inicial do Google
    Quando pesquisar por "The Beatles"
    Então deverá ver resultados relacionados