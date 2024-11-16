Feature: Login
  como
  quero
  para

  @CT-1001
  Scenario: Validar cadastro de usuario no Ebac Store
    Given que estou na tela inicial do app 'Ebac Store'
    And clico no botao profile na tela 'Home'
    And clico no botao 'Sign up' na tela 'Login'
    And preencho o campo 'First Name' na tela 'Login'
    And preencho o campo 'Last Name' na tela 'Login'
    And preencho o campo 'Phone Number' na tela 'Login'
    And preencho o campo 'Email Address' na tela 'Login'
    And preencho o campo 'Password' na tela 'Login'
    And preencho o campo 'Confirmar Password' na tela 'Login'
    And clico no botao 'Create' na tela 'Login'
    And clico no botao 'Carrinho' na tela 'Home'
    And clico no botao 'continue Shopping' na tela 'carrinho'
    And clico no botao 'profile' na tela 'Home'
    And clico no botao 'Logout' na tela 'Profile'
    And Clico no botao 'yes' e fechar o app