#Author: Cristian Giraldo, Lina Daniela Salazar Luna
#Keywords Summary :
@issue:ADP-890 @OneAppLoans @OneApp @UAT
Feature: Adelantasaldo

  YO como usuario de Tigo
  Quiero realizar adelanta saldo
  Para mantener mi línea con saldo en dinero


  Background: Login
    Given estoy en la pagina principal

  @OneAppAdelantasaldo
  Scenario: Inicio sesion con mi cuenta
    When validacion de inicio de sesion


  Scenario: Eliminar Producto del carrito
    Given hace click en añadir al carrito
    Then eliminar producto del carrito


  Scenario: Realizar pago de un Producto
    Given hace click en añadir al carrito
    Then realizo el pago de un producto
    Then el usuario puede ver la confirmacion de la transaccion Thank you for your order!'