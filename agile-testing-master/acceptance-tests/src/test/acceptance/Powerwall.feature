Feature: Fonctionnalités de la page Powerwall
  Scenario Outline: Vérification de l'intégrité des données du module Powerwall'
    Given je suis sur la page Powerwall
    When je sélectionne mes critères de "<Surface foyer>" et "<Appareils>"
    Then je dois avoir un retour de données cohérent pour "<énergie solaire>", <% autoalimenté>, <conso énergie estimée>
    Examples:
      | Surface foyer | Appareils                                        | énergie solaire | % autoalimenté | conso énergie estimée |
      | 40            | climatiseur                                      | 3kw             | 91             | 9kwh/jour             |
      | 150           | pompe de piscine                                 | 8kw             | 96             | 22kwh/jour            |
      | 300           | équipements de recharge de véhicules électriques | 13kw            | 100            | 32kwh/jour            |
