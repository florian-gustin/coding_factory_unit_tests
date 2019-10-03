Feature: Fonctionnalités de ma page d'accueil
	Scenario: Vérification du titre et de la description
		Given je suis sur la homepage
		Then le titre doit être "Voitures électriques, panneaux solaires et stockage d'énergie propre | Tesla"
		And la description contient "Tesla accélère la transition mondiale vers un schéma énergétique durable en proposant des véhicules électriques, des panneaux solaires et des solutions intégrées d'énergie renouvelable pour les particuliers et les entreprises."

	Scenario Outline: Vérification de la présence des 5 titres dans la navBar verticale
		Given je suis sur homepage_navbar
		Then le titre doit être "<li>"
		Examples:
			| li 									|
			| Model 3 								|
			| Découvrir Tesla 						|
			| Une alimentation pour tous vos objets |
			| Accessoires Tesla 					|
			| Tesla Model Y 						|

	Scenario Outline: Vérification de la présence des 6 liens dans la top_navbar
		Given je suis sur homepage_top_navbar
		Then le titre du lien doit être "<li>"
		When je clique cela me redirige vers "<a>"
		Examples:
			| li 	   | a									  |
			| Model S  | https://www.tesla.com/fr_FR/models   |
			| Model 3  | https://www.tesla.com/fr_FR/model3   |
			| Model X  | https://www.tesla.com/fr_FR/modelx   |
			| Model Y  | https://www.tesla.com/fr_FR/modely   |
			| Roadster | https://www.tesla.com/fr_FR/roadster |
			| Energies | https://www.tesla.com/fr_FR/energy   |

	Scenario Outline: Vérification de la présence des liens dans le burger_menu
		Given je suis sur homepage_burger_menu
		Then le titre du lien doit être "<li>"
		When je clique cela me redirige vers "<a>"
		Examples:
			| li 	                 | a								          	 |
			| Actualités             | https://www.tesla.com/fr_FR/blog 			 |
			| Véhicules disponibles  | https://www.tesla.com/fr_FR/inventory/new/ms  |
			| Véhicules d'occasion   | https://www.tesla.com/fr_FR/inventory/used/ms |
			| Entreprise             | https://www.tesla.com/fr_FR/Enterprise        |
			| Recharger              | https://www.tesla.com/fr_FR/charging 		 |
			| Nous trouver           | https://www.tesla.com/fr_FR/findus   		 |
			| Evénements             | https://www.tesla.com/fr_FR/events  			 |
			| Empreinte carbone      | https://www.tesla.com/fr_FR/carbonimpact      |
			| Assistance             | https://www.tesla.com/fr_FR/support   		 |


