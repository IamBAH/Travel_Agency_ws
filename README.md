# Travel_Agency_ws
Les codes du Projet de WebServices"Travel_Agency"
 Travel Agency:
Nous fournissons un service web pour les agences de voyages suivant le protocole SOAP et Rest Architeture. Le service a été intégré dans deux frameworks différents dans Java JAXWS et JAXRS. Outre le service, nous avons construit un client en php qui consomme les deux services en fonction de la disponibilité du service. Par défaut, il appelle le service JAXWS si le service appelé est en panne, il utilise automatiquement le service JAXRS.


II.1. Description du service :  
Le service que nous avons fourni est composé de opérations suivantes.
 

1. getCountry
2. getDestinationsByCity
3. getCities
4. getDestinations
5. getDestination_each_type_dest
6. getDestination_assemble etc...

II.2 WDSL :
Le fichier wdsl décrit comment notre service Web doit être appelé, il est généré en fonction de l'annotation que nous avons ajoutée dans l'interface où nous avons ajouté l'annotation de @WebService, @WebMethod, @WebResult et @PathParm. Nous avons également spécifié le portName de notre service, targetNameSpace, endpointInterface que le wsdl utilisera pour générer les types, le message, le portType, la liaison et le nom du service Web.

II.a Client :
Le client que nous ecrivons en php a une interface interactive construite avec html et css où le client peut trouver des villes par pays, des destinations à visiter, des informations sur les destinations et les villes. De plus, nous avons construit une interface pour l'administrateur où il est possible d'ajouter dynamiquement des destinations, de mettre à jour les informations de destination.


II.b Weather Service :
Nous avons également appelé l'API openweathermap qui donne les conditions météorologiques de chaque ville que nous desservons. Des informations telles que la température, la date et l'heure du coucher et du lever du soleil et la description du ciel.



II.c Utilisation :

Alors si une personne veut aller en vacances en Europe, l'utilisateur peut d'abord parcourir une liste de pays que notre service de voyage fournit. Pour chaque pays, il existe une liste de villes sur lesquelles nous fournissons des informations. Pour chaque ville, l'utilisateur peut obtenir toutes les destinations disponibles dans cette ville : Cathédrale, place, église, monuments, pont historique, parc, stade etc... Avant de visiter, l'utilisateur peut également vérifier les conditions météorologiques de la ville telles que la température, l'heure du lever et du coucher du soleil et la description du ciel.... Pour l'administrateur, il peut facilement ajouter des destinations ou supprimer des destinations, tout cela peut être réalisé à partir du panneau d'administration.


Membres du groupe : 

Nom : MIAN Farooq 

Email : far.apb95@gmail.com

Nom : BAH Alpha Oumar

Email : alphatimbi95@gmail.com



