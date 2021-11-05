DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL
);

INSERT INTO users (first_name, last_name) VALUES
  ('Adams', 'Smith'),
  ('Baker', 'Hamilton'),
  ('Clark', 'Sinclair'),
  ('Davis', 'Johnson'),
  ('Evans', 'Fleming'),
  ('Frank', 'Williams'),
  ('Ghosh', 'Moore'),
  ('Hills', 'Brown'),
  ('Irwin', 'Kelly'),
  ('Jones', 'Jones'),
  ('Klein', 'Christie'),
  ('Lopez', 'Garcia'),
  ('Mason', 'Douglas'),
  ('Nalty', 'Miller'),
  ('Ochoa', 'Aitken'),
  ('Patel', 'Davis'),
  ('Quinn', 'Thompson'),
  ('Reily', 'Rodriguez'),
  ('Smith', 'Gordon'),
  ('Trott', 'Martinez'),
  ('Usman', 'Marin'),
  ('Valdo', 'Hernandez'),
  ('White', 'Black'),
  ('Xiang', 'Lopez');