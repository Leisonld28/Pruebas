#Author: Jose David Moreno
#Keywords Summary : Datos, Adaptabilidad, Movil, Hogar, Tigo

@issue:Prueba
Feature: Plan Familia
  Yo como usuario Tigo
  Quiero utilizar el servicio Plan Familia
  Para disfrutar de los beneficios y descuentos

  Background: Autenticarse en oneApp
    Given estoy autenticado en oneApp

  @OneAppPlanFamilia_creargrupo
  Scenario Outline: Crear y llenar Grupo
    Given selecciono el servicio 3044592912 y la opcion Factura
    And el selecciona boton mas informacion
    When el agrega la linea '<numero>' al grupo
    Then ve el mensaje ¡Felicitaciones ☺! La línea ahora hace parte de tu Familia Tigo
    Examples:
   | numero |
   |3044635046|
   |3044635051|
   |3044635048|

  @OneAppPlanFamilia_lineayaagregada
  Scenario: Validar mensaje para linea ya agregada
    Given selecciono el servicio 3044592912 y la opcion Factura
    And el selecciona boton mas informacion
    When el agrega la linea '3044635046' al grupo
    #Then ve el mensaje ¡No pudimos agregar esta línea!

  @OneAppPlanFamilia_eliminarlinea
  Scenario: Eliminar linea de grupo.
    Given selecciono el servicio 3044592912 y la opcion Factura
    And el selecciona boton mas informacion
    When el elimina la linea agregada
    Then ve el mensaje ¡Esta línea ya no hace parte de tu Familia Tigo!


  @OneAppPlanFamilia_retirolineahija
  Scenario: Linea hija se retira de grupo
    Given selecciono el servicio 3044635051 y la opcion Factura
    And el selecciona boton mas informacion
    When el elimina la linea hija agregada
    Then la linea hija ve ¡Ya no haces parte de Familia Tigo!

  @OneAppPlanFamilia_borrargrupo
  Scenario: Borrar Grupo
    Given selecciono el servicio 3044592912 y la opcion Factura
    And el selecciona boton mas informacion
    When el borra el grupo
    Then ve el mensaje ¡La Familia Tigo ha sido borrada exitosamente!