USE carsales;
CREATE TABLE Customer(
customer_id INT PRIMARY KEY,
first_name VARCHAR(30),
last_name VARCHAR(20),
city VARCHAR(20),
rating INT,
Sales_Id INT,
FOREIGN KEY(Sales_Id) REFERENCES carsales.salesperson(Sales_Id)
);
CREATE TABLE ORDERR
(order_id INT PRIMARY KEY,
amount INT,
order_date DATE,
customer_id INT,
FOREIGN KEY(customer_id) REFERENCES carsales.Customer(customer_id)
); 
INSERT INTO customer VALUES(2001,'Hoffman','Anny','London',100,1001);
INSERT INTO customer VALUES(2002,'Giovanni','Jenny','Rome',200,1003);
INSERT INTO customer VALUES(2003,'Liu','William','San Jose',100,1002);
INSERT INTO customer VALUES(2004,'Harry','Grass','Berlin',300,1002);
INSERT INTO customer VALUES(2005,'Clemens','John','London',200,1001);
INSERT INTO customer VALUES(2006,'fanny','John','San Jose',200,1005);
INSERT INTO customer VALUES(2007,'jonathan','Bob','Rome',300,1004);
INSERT INTO orderr VALUES(3001,123,"2020-02-01",2001);
INSERT INTO orderr VALUES(3003,187,"2020-10-02",2007);
INSERT INTO orderr VALUES(3002,100,"2020-07-30",2003);
INSERT INTO orderr VALUES(3005,201,"2011-10-9",2007);
INSERT INTO orderr VALUES(3009,145,"2012-10-10",2002);
INSERT INTO orderr VALUES(3007,167,"2021-04-02",2002);
INSERT INTO orderr VALUES(3008,189,"1999-03-02",2006);
INSERT INTO orderr VALUES(3010,100,"2000-09-18",2004);
DELETE FROM orderr WHERE order_id = 3008;
DELETE FROM salesperson WHERE Commission_Rate = 0;
UPDATE orderr SET amount = 200 WHERE amount =100;
UPDATE salesperson SET Commission_Rate = 28 WHERE Commission_Rate =26;
UPDATE customer SET rating =150 WHERE rating = 100; 

