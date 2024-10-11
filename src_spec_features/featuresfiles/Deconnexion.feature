@Deconnexion
Feature: En tant qu utilisateur je souhaite se deconnecer de l application swag labs

@deconnecion-cas-passant
Scenario: je souhaite se deconnecter de l application 

Given je me connecte sur l application swag labs
 When je saisie le username "standard_user"
  And je saisie le password  "secret_sauce"
  And je clique sur le boutton login
  And je clique sur le menu à gauche
  And je clique sur le boutton se deconnecter
Then  je me redirigie vers la page d authentification


