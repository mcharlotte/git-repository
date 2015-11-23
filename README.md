Projet de Développement d'applications Web

Sujet: réalisation d'un site d'organisations de tournois.

Membres du groupe: KÖNEKE Jan, KRETZ Gaël, MESSMER Charlotte

Description: 

Le site réalisé permet à un utilisateur de s'inscrire, une fois inscrit et connecté il a accès à la liste des tournois organisés et peut s'y inscrire ou retirer son inscription. 
Si un administrateur se connecte il à en plus accès a la partie gestion qui lui permettent de créer, modifier et supprimer les tournois à l'affiche, modifier ou supprimer les utilisateurs inscrits sur le site et de supprimer des réservations.



Installation :

- Depuis Eclipse, importer le projet Git grâce à l'URI suivant:  https://github.com/mcharlotte/git-repository.git
  Les autorisations vous ont normalement été données, en cas de problème veuillez la responsable du repository à     l'adresse suivante: charlotte.messmer2@gmail.com
- Une fois le projet importé, lancer "ProjetApplication.java" en tant qu'application java
- Ouvrir un navigateur internet et acceder à la page localhost:8080/Home 
- Pour se connecter en mode administrateur, l'identifient est "Admin" et le mot de passe est "admin"



Base de données :

Base de données H2. Elle contient 3 tables :
- Une table "Utilisateur" avec des champs "nom" "pseudo", "motDePasse", "droit", "email".
- Une table "Tournoi" avec des champs "lieu", "prix, "type", "nbJoueurMax", "jour", "mois", "annee", "minute", "heure"
- Une table "Reservation" qui fait le lien entre un "Utilisateur" et un "Tournoi".  



Fonctionnalités :

En tant qu'utilisateur:
- s'inscrire
- se connecter
- réserver une place pour un tournois existant
- annuler une réservation existante
- se deconnecter

En tant qu'administrateur, une fois connecté:
- ajouter un tournoi
- modifier un tournoi existant
- supprimer un tournoi existant
- modifier un utilisateur existant
- supprimer un utilisateur existant
- supprimer une reservation existante

