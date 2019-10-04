Feature: Configurateur Tesla Modèle S
    Scenario: Vérifier le lien de commande de la Tesla Modèle S
        Given Je suis sur la page d'accueil
        When Cliquer sur le bouton de navigation ammenant au modèle S situé en bas
        And Cliquer sur le bouton Commander
        Then L'url du configurateur doit être "https://www.tesla.com/fr_FR/models/design"


    #critère 2
    Scenario: Vérifier l'affichage par défaut du prix affiché
        Given Je suis sur la page du configurateur
        Then Le prix affiché est un "CRÉDIT BALLON" de "A partir de 857 € /mois*"

    #critère 3
    Scenario Outline: Vérifier les estimations
        Given Je suis sur la page du configurateur
        When  je sélectionne le "<modèle>"
        And Je sélectionne le mode paiement "<mode de paiement>"
        Then Les mensualités sont de "<mensualités>"
        And Les économies de carburant estimées sont de "<éco carbu estim>"
        And Le montant total au terme du contrat est de "<montant final>"
        Examples:
        | modèle           | mode de paiement | mensualités                  | éco carbu estim | montant final  |
        | Grande Autonomie | LOA Business     | A partir de 913 € /mois*     | - 108 € /mois   | 102 982 €      |
        | Performance      | LOA Business     | A partir de 1 115 € /mois*   | - 108 € /mois   | 122 068 €      |

    Scenario: Ajouter le pilotage automatique engendre une augmentation du crédit de 76E/Mois
        Given Je suis sur la page du configurateur
        When Je clique sur "Pilotage automatique"
        And Cliquer sur "Ajouter cette option"
        Then Le "crédit ballon" passe de "857 € / mois" à "933 € / mois" soit une augmentation de 76E/mois

    Scenario: Je souhaite connaître les boutiques Tesla lorsque j'ai fini l'étape du configurateur
        Given Je suis à l'étape "Règlement"
        When Je clique sur le logo TESLA
        And Je vais en bas de page et je clique sur "Localisations"
        Then Cela me redirige sur "https://www.tesla.com/fr_FR/findus/list"