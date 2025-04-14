CREATE TABLE hopital (
    id_hopital SERIAL PRIMARY KEY,
    nom_hopital VARCHAR(255),
    adr_hopital VARCHAR(255)
);

INSERT INTO hopital(nom_hopital, adr_hopital) VALUES
('CHUM', '1000 Rue Saint-Denis, Montréal, QC'),
('Hôpital Général Juif', '3755 Chem. de la Côte-Sainte-Catherine'),
('Hôpital Maisonneuve-Rosemont', '5415 Blvd de l’Assomption');
