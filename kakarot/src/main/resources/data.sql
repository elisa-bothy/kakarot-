
DROP TABLE IF EXISTS plantes;
CREATE TABLE plantes (
 id INT AUTO_INCREMENT PRIMARY KEY,
 nom VARCHAR(250) NOT NULL,
 categorie VARCHAR(250) DEFAULT NULL,
 astuce VARCHAR(250) DEFAULT NULL,
 planter VARCHAR(250) DEFAULT NULL,
 recolter VARCHAR(250) DEFAULT NULL,
 region VARCHAR(250) DEFAULT NULL);
 INSERT INTO plantes (nom, categorie, astuce, planter, recolter, region)
VALUES ('courgette', 'Légume', 'Limiter l’oïdium, Favoriser la fécondation des fleurs,espacement d’1 mètre à 2 mètres', 'Avril', 'Juin','provence-alpes-ôte dazur'),
('tomate', 'Fruit', 'Il doit faire le double de la taille du pot en largeur et le triple en profondeur, "Attacher ses plants', 'Janvier', 'Aout', 'occitanie'),
('fenouil', 'Légume', 'apprécient aussi des arrosages fréquents, surtout si elles sont cultivées en pot', 'Mai', 'Juin','bretagne'),
('citron', 'Fruit', 'comblez les espaces vides avec la terre de jardin, Ajoutez au fond du trou de plantation un engrais spécial agrumes', 'Mars', 'Juin','ile-de-france'),
('laitue', 'Légume', 'pousse facilement', 'Février', 'Juin','toulouse'),
('carottes', 'Légume', 'pousse mieux dans une terre sableuse', 'Juillet', 'Juin','ile-de-france'),
('chou-fleur', 'Légume', 'pousse tranquillement', 'Aout', 'Juin','paca'),
('haricots', 'Légume', 'Peut montrer très haut', 'Septembre', 'Juin','bretagne'),
('panais', 'Légume', 'gout amer', 'Octobre', 'Juin','Nord'),
('pomme', 'Fruit', 'juteuse', 'Novembre', 'Juin','Nord'),
('prune', 'Fruit', 'juteuse', 'Décembre', 'Juin','Normandie'),
('raisin', 'Fruit', 'A de profonde racine, attention', 'Mars', 'Juin','ile-de-france');


