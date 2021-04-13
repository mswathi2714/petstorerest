DROP TABLE IF EXISTS pet;


CREATE TABLE pet (
  pet_id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  type VARCHAR(250) NOT NULL,
  price INT DEFAULT NULL
);


INSERT INTO pet (name, type, price) VALUES
  ('Max', 'dog', 50),
  ('Rooster', 'dog', 45),
  ('Daisy', 'dog', 55),
  ('Gidget', 'cat', 35),
  ('Maxi', 'dog', 50),
  ('Roosteri', 'dog', 45),
  ('Daisyi', 'dog', 55),
  ('Gidgeti', 'cat', 35),
  ('Maxy', 'dog', 50),
  ('Roostery', 'dog', 45),
  ('Daisyy', 'dog', 55),
  ('Gidgety', 'cat', 35),
  ('Max', 'dog', 50),
  ('Rooster', 'dog', 45),
  ('Daisy', 'dog', 55),
  ('Gidget', 'cat', 35),
  ('Max', 'dog', 50),
  ('Rooster', 'dog', 45),
  ('Daisy', 'dog', 55),
  ('Gidget', 'cat', 35),
  ('Max', 'dog', 50),
  ('Rooster', 'dog', 45),
  ('Daisy', 'dog', 55),
  ('Gidget', 'cat', 35),
  ('Max', 'dog', 50),
  ('Rooster', 'dog', 45),
  ('Daisy', 'dog', 55),
  ('Gidget', 'cat', 35),
  ('Max', 'dog', 50),
  ('Rooster', 'dog', 45),
  ('Daisy', 'dog', 55),
  ('Gidget', 'cat', 35);
