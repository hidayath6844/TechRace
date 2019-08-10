DROP TABLE IF EXISTS employee;
 
CREATE TABLE employee (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  role VARCHAR(250) DEFAULT NULL
);
 


INSERT INTO employee (first_name, last_name, role) VALUES
  ('MS', 'Dhoni', 'Wicket Keeper'),
  ('Virat', 'Kohli', 'Captain'),
  ('Rohit', 'Sharma', 'Batsman');