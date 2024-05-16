
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
('tomate', 'Fruit', 'Il doit faire le double de la taille du pot en largeur et le triple en profondeur, "Attacher ses plants', 'Mai', 'Aout', 'occitanie'),
            ('fenouil', 'Légume', 'apprécient aussi des arrosages fréquents, surtout si elles sont cultivées en pot', 'Mai', 'Juin','bretagne'),
            ('citron', 'Fruit', 'omblez les espaces vides avec la terre de jardin, Ajoutez au fond du trou de plantation un engrais spécial agrumes', 'Mars', 'Juin','ile-de-france'),
            ('jabuticaba', 'Fruit', 'Placer dans un vase mesurant 50 cm de diamètre et 50 cm de hauteur, Égoutter leau pour éviter la pourriture des racines', 'Avril', 'Septembre','ile-de-france');


