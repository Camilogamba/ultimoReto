#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Creacion de unidad de negocio y de reunion
  @UnidadNegocio
  Scenario: Crear y verificar creacion de unidad de negocio
    Given Abro la pagina y me logeo con usuario "admin" y contraseña "serenity"
    When selecciono en el menu organizacion, luego unidades de negocio y creo una unidad de negocio 
    |strmetingn|
    |Estrategia|
    Then Verifico que la unidad de negocio haya sido creada
   @CreaMeet
  Scenario: Crear meet asociando unidad de negocio
    Given Abro la pagina y me logeo con usuario "admin" y contraseña "serenity"
    When selecciono en el menu meeting, luego meetings y creo una nueva meeting
    |strmetingn|strlfechai|strlname|strladdr        |strllati   |strllong   |strmnum|strfechaf |
    |Estrategia|07/09/2021|Bogota  |calle 54 n 10-10|543.000000 |454.000000 |453322 |07/09/2021|
    Then Verifico que la reunion haya sido creada