@Panier
Feature: En tant qu utilisateur je souhaite ajouter un produit au panier

@panier-cas-passant
Scenario: je souhaite ajouter un produit au panier 

Given je me connecte sur l application swag labs
 When je saisie le username "standard_user"
  And je saisie le password  "secret_sauce"
  And je clique sur le boutton login
  And je clique sur le boutton add to cart
  
Then  le produit est ajouté au panier