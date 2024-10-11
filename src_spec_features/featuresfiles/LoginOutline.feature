@LoginOutline
Feature: je souhaite me connecter a l application avec plusieurs comptes

  Scenario Outline: je souhaite me connecter a l application avec plusieurs comptes
    Given je me connecte sur l application swag labs
    When je saisie le username "<username>"
    And je saisie le password  "<password>"
    And je clique sur le boutton login

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |
