Feature: Configurateur Tesla Modèle S
    Scenario: Vérifier le lien de commande de la Tesla Modèle S
        Given Je suis sur la page d'accueil
        When Cliquer sur le petit cercle de gauche situé en bas
        And Cliquer sur le bouton Commander
        Then L'url du configurateur doit être "https://www.tesla.com/fr_FR/models/design"