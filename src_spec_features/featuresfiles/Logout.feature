@Logout
Feature: je souhaite tester la logout de l application orangeHRM

Scenario: je souhaite tester la logout de l application orangeHRM

  Given j accede a l application orange
    When je saisis le username
    And je saisis le password
    And je clique sur le boutton login1
    And je clique sur le menu a droite
    And je clique sur le boutton logout
    Then je me redirecte vers la page d'acceuil
