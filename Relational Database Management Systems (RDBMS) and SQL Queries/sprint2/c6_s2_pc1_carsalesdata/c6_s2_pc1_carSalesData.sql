USE carsales;
SELECT * FROM salesperson;
INSERT INTO SalesPerson VALUES(1008,'Charles','Florida',0);
SELECT * FROM salesperson WHERE First_Name='Robin' AND City ='Barcelona';
SELECT City,Commission_Rate FROM salesperson WHERE First_Name='John';
SELECT * FROM salesperson WHERE Commission_Rate >15;
SELECT * FROM salesperson WHERE Commission_Rate BETWEEN 10 AND 20;
SELECT First_Name,City FROM salesperson WHERE Commission_Rate >25;
SELECT First_Name,City FROM salesperson WHERE Commission_Rate =0;
SELECT * FROM salesperson WHERE First_Name like 'J%';
SELECT * FROM salesperson WHERE City IN ('London','New York','San Jose');
SELECT AVG(Commission_Rate) FROM salesperson;
SELECT * FROM salesperson WHERE Commission_Rate IN (10,11,12,13);
SELECT  MAX(Commission_Rate),First_Name,City from salesperson;
SELECT First_Name,City from salesperson WHERE Commission_Rate=(SELECT MAX(Commission_Rate) FROM salesperson);

