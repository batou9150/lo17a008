-- Table: datearticle

-- DROP TABLE datearticle;

CREATE TABLE datearticle
(
  jj character(2) NOT NULL,
  mois character(9) NOT NULL,
  annee character(4) NOT NULL,
  page character(50) NOT NULL,
  rubrique character(24) NOT NULL,
  article character(75) NOT NULL
)
WITH (
  OIDS=FALSE
);
ALTER TABLE datearticle
  OWNER TO lo17;
GRANT ALL ON TABLE datearticle TO lo17;
GRANT SELECT ON TABLE datearticle TO lo17xxx;

-- Index: idx_0_datearticle

-- DROP INDEX idx_0_datearticle;

CREATE INDEX idx_0_datearticle
  ON datearticle
  USING btree
  (jj);

-- Index: idx_1_datearticle

-- DROP INDEX idx_1_datearticle;

CREATE INDEX idx_1_datearticle
  ON datearticle
  USING btree
  (mois);

-- Index: idx_2_datearticle

-- DROP INDEX idx_2_datearticle;

CREATE INDEX idx_2_datearticle
  ON datearticle
  USING btree
  (annee);

-- Table: datepage

-- DROP TABLE datepage;

CREATE TABLE datepage
(
  jour character(8) NOT NULL,
  jj character(2) NOT NULL,
  mois character(9) NOT NULL,
  annee character(4) NOT NULL,
  page character(50) NOT NULL
)
WITH (
  OIDS=FALSE
);
ALTER TABLE datepage
  OWNER TO lo17;
GRANT ALL ON TABLE datepage TO lo17;
GRANT SELECT ON TABLE datepage TO lo17xxx;

-- Index: idx_0_datepage

-- DROP INDEX idx_0_datepage;

CREATE INDEX idx_0_datepage
  ON datepage
  USING btree
  (jour);

-- Index: idx_1_datepage

-- DROP INDEX idx_1_datepage;

CREATE INDEX idx_1_datepage
  ON datepage
  USING btree
  (jj);

-- Index: idx_2_datepage

-- DROP INDEX idx_2_datepage;

CREATE INDEX idx_2_datepage
  ON datepage
  USING btree
  (mois);

-- Index: idx_3_datepage

-- DROP INDEX idx_3_datepage;

CREATE INDEX idx_3_datepage
  ON datepage
  USING btree
  (annee);

-- Table: email

-- DROP TABLE email;

CREATE TABLE email
(
  email character(32) NOT NULL,
  page character(50) NOT NULL,
  rubrique character(24) NOT NULL,
  article character(75) NOT NULL
)
WITH (
  OIDS=FALSE
);
ALTER TABLE email
  OWNER TO lo17;
GRANT ALL ON TABLE email TO lo17;
GRANT SELECT ON TABLE email TO lo17xxx;

-- Index: idx_0_email

-- DROP INDEX idx_0_email;

CREATE INDEX idx_0_email
  ON email
  USING btree
  (email);

-- Table: theme

-- DROP TABLE theme;

CREATE TABLE theme
(
  mot character(24) NOT NULL,
  page character(50) NOT NULL,
  rubrique character(24) NOT NULL,
  article character(75) NOT NULL
)
WITH (
  OIDS=FALSE
);
ALTER TABLE theme
  OWNER TO lo17;
GRANT ALL ON TABLE theme TO lo17;
GRANT SELECT ON TABLE theme TO lo17xxx;

-- Index: idx_0_theme

-- DROP INDEX idx_0_theme;

CREATE INDEX idx_0_theme
  ON theme
  USING btree
  (mot);

-- Table: titre

-- DROP TABLE titre;

CREATE TABLE titre
(
  mot character(24) NOT NULL,
  page character(50) NOT NULL,
  rubrique character(24) NOT NULL,
  article character(75) NOT NULL
)
WITH (
  OIDS=FALSE
);
ALTER TABLE titre
  OWNER TO lo17;
GRANT ALL ON TABLE titre TO lo17;
GRANT SELECT ON TABLE titre TO lo17xxx;

-- Index: idx_0_titre

-- DROP INDEX idx_0_titre;

CREATE INDEX idx_0_titre
  ON titre
  USING btree
  (mot);

-- Table: titreresume

-- DROP TABLE titreresume;

CREATE TABLE titreresume
(
  mot character(24) NOT NULL,
  page character(50) NOT NULL,
  rubrique character(24) NOT NULL,
  article character(75) NOT NULL
)
WITH (
  OIDS=FALSE
);
ALTER TABLE titreresume
  OWNER TO lo17;
GRANT ALL ON TABLE titreresume TO lo17;
GRANT SELECT ON TABLE titreresume TO lo17xxx;

-- Index: idx_0_titreresume

-- DROP INDEX idx_0_titreresume;

CREATE INDEX idx_0_titreresume
  ON titreresume
  USING btree
  (mot);

