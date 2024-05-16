
DROP TABLE IF EXISTS plantes;
CREATE TABLE plantes (
 id INT AUTO_INCREMENT PRIMARY KEY,
 nom VARCHAR(250) NOT NULL,
 categorie VARCHAR(250) NOT NULL,
 astuce VARCHAR(250) NOT NULL,
 planter VARCHAR(250) NOT NULL,
 recolter VARCHAR(250) NOT NULL,
 region VARCHAR(250) NOT NULL);
 INSERT INTO plantes (nom, categorie, astuce, planter, recolter, region)
VALUES ('courgette', 'Légume', 'Limiter l’oïdium, Favoriser la fécondation des fleurs,espacement d’1 mètre à 2 mètres', 'Avril', 'Juin','Provence-Alpes-Côte dAzur');

