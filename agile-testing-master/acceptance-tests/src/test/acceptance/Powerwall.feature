Feature: Fonctionnalités de la page Powerwall
  Scenario Outline: Vérification de l'intégrité des données du module Powerwall'
    Given je suis sur la page Powerwall
    When je sélectionne mes critères "Surface foyer"
    Then je dois avoir le bon retour de données "<Appareils>"
    When je sélectionne mes critères "Appareils"
    Then je dois avoir le bon retour de données "<énergie solaire>"
    When je sélectionne mes critères "énergie solaire"
    Then je dois avoir le bon retour de données "<Surface foyer>"
    When je sélectionne mes critères "% autoalimenté"
    Then je dois avoir le bon retour de données "<% autoalimenté>"
    When je sélectionne mes critères "conso énergie estimée"
    Then je dois avoir le bon retour de données "<conso énergie estimée>"
#    And je sélectionne mes critères "<Appareils>"
#    And je sélectionne mes critères "<énergie solaire>"
#    And je sélectionne mes critères "<% autoalimenté>"
#    And je sélectionne mes critères "<conso énergie estimée>"
#    Then je dois avoir les bons retours de données
    Examples:
      | Surface foyer | Appareils                                        | énergie solaire | % autoalimenté | conso énergie estimée |
      | 40            | climatiseur                                      | 3kw             | 91             | 9kwh/jour             |
      | 150           | pompe de piscine                                 | 8kw             | 96             | 22kwh/jour            |
      | 300           | équipements de recharge de véhicules électriques | 13kw            | 100            | 32kwh/jour            |
