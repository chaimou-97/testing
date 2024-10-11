@authentification
Feature: En tant qu utilisateur je souhaite tester la page d authentification de l application swaglabs 

Background:
  Given je me connecte sur l application swag labs
  When je saisie le username "standard_user"


@connexion-cas-Passant
Scenario: je souhaite tester la page d authentification avec un compte valide
  And je saisie le password  "secret_sauce"
  And je clique sur le boutton login
  Then je me redirecte vers la page d acceuil home

@connexion-cas-non-Passant
Scenario: je souhaite tester la page d authentification avec un compte invalide
  And je saisie le password  "secret_sauce1"
  And je clique sur le boutton login
  Then le message d erreur saffiche "Epic sadface: Username and password do not match any user in this service"
