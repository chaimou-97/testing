@testPanier
Feature: je veux tester l authentification de l applicaation orange

  Scenario: je veux tester l authentification de l applicarion orange
    Given j accede a l application orange
    When je saisis le username
    And je saisis le password
    And je clique sur le boutton login1
    Then je me redirecte vers l interface dashboard
