Feature: Login
  como
  quero
  para

  @CT-1001
  Scenario: Validar acesso ao App SwagLabs
    Given que estou na tela inicial do app 'SwagLabs'
    And preencho o campo 'Username' na tela login
    And preencho o campo 'Password' na tela login
    And clico no botao 'Login' na tela login
    Then valido a exibicao dos produtos na tela 'Products'