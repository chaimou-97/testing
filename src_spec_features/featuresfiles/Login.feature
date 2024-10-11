@Login
Feature: En tant qu utilisateur je souhaite tester la page d authentification de l application OrangeHRM


@connexion-cas-Passant
Scenario: je souhaite tester la page d authentification avec un compte valide
 Given je me connecte sur l application OrangeHRM
  When je saisie le username 
  And je saisie le password
  And je clique sur le boutton connexion
  Then je me redirecte vers la page home

