Feature: Configurateur Tesla Modèle S
    Scenario: Vérifier le lien de commande de la Tesla Modèle S
        Given Je suis sur la page d'accueil
        When Cliquer sur le petit cercle de gauche situé en bas
        And Cliquer sur le bouton Commander
        Then L'url du configurateur doit être "https://www.tesla.com/fr_FR/models/design"


    #critère 2
    Scenario: Vérifier l'affichage par défaut du prix affiché (crédit ballon à 857€/mois)
        Given Je suis sur la page du configurateur
        Then Le prix affiché est un "credit ballon" de "857 € / mois"

    #critère 3
    Scenario Outline: 
        Given Je suis sur la page du configurateur
        When  je sélectionne le "modèle"
        And Je sélectionne le "mode de payement"
        Then Les mensualités sont de "mensualités"
        And Les économies de carburant estimées sont de "éco carbu estim"
        And Le montant total au terme dj contrat est de "montant final"
        Examples:
        | modèle           | mode de payement | mensualités | éco carbu estim | montant final |
        | Grande Autonomie | LOA Business     | 913         | 108             | 102982        |
        | Performance      | LOA Business     | 1115        | 108             | 122068        |
    Scenario: Ajouter le pilotage automatique engendre une augmentation du crédit à 76E/Mois
        Given Je suis à l'étape "Pilotage automatique"
        When Cliquer sur "Option ajoutée"
        Then Le "crédit ballon" passe de "857 € / mois" à "933 € / mois" soit une augmentation de 76E/mois
    Scenario: Je souhaite connaître les boutiques Tesla
        Given Je suis à l'étape "Règlement"
        When Je clique sur le logo TESLA
        And Je vais en bas de page et je clique sur "Localisations"
        Then Cela me redirige sur "https://www.tesla.com/fr_FR/findus/list"