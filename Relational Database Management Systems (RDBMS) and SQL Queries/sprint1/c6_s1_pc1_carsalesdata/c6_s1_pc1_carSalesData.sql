CREATE DATABASE IF NOT EXISTS CarSales;
USE CarSales;
CREATE TABLE SalesPerson
( Sales_Id INT PRIMARY KEY,
First_Name VARCHAR(30),
City VARCHAR(30),
Commission_Rate INT
);
INSERT INTO SalesPerson VALUES(1001,'John','London',12);
INSERT INTO SalesPerson VALUES(1002,'Bob','San Jose',13);
INSERT INTO SalesPerson VALUES(1004,'Judith','London',11);
INSERT INTO SalesPerson VALUES(1007,'Robin','Barcelona',15);
INSERT INTO SalesPerson VALUES(1003,'Harry','New York',10);
INSERT INTO SalesPerson VALUES(1005,'James','London',26);
INSERT INTO SalesPerson VALUES(1008,'Charles','Florida',0);
