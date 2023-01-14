CREATE DATABASE moviedatabase;
USE moviedatabase;
CREATE TABLE movie
(title VARCHAR(30), 
budget_in_millions INT,
release_date DATE,
revenue_in_millions INT,
rating_average DOUBLE
);
INSERT INTO movie VALUES('Avatar',237,"2009-12-10",278,7.2);
INSERT INTO movie VALUES('Titanic',200,"1997-11-18",185,7.5);
INSERT INTO movie VALUES('The Avengers',220,"2012-04-25",152,7.4);
INSERT INTO movie VALUES('Jurassic World',150,"2015-06-09",151,6.5);
INSERT INTO movie VALUES('Furious 7',190,"2015-04-01",150,7.3);
INSERT INTO movie VALUES('The Avengers: Age of Ultron',280,"2015-04-22",141,7.3);
INSERT INTO movie VALUES('Iron Man 3',200,"2013-04-18",122,6.8);
INSERT INTO movie VALUES('Minions',74,"2015-06-17",11,6.4);
INSERT INTO movie VALUES('Captain America: Civil War',250,"2016-04-27",115,7.1);
INSERT INTO movie VALUES('Transformers: Dark of the Moon',195,"2011-06-28",112,6.1);
SELECT * FROM movie;
SELECT * FROM movie WHERE title='Jurassic World' AND rating_average = 6.5;
SELECT * FROM movie WHERE rating_average>7;
SELECT * FROM movie WHERE title='The Avengers';
SELECT title,rating_average FROM movie WHERE rating_average BETWEEN 7 AND 8;
SELECT title FROM movie WHERE budget_in_millions>=250;
SELECT title,rating_average FROM movie WHERE revenue_in_millions BETWEEN 150 AND 200;
SELECT title,release_date FROM movie WHERE title LIKE 'T%';
SELECT SUM(revenue_in_millions) FROM movie;
SELECT title,revenue_in_millions FROM movie WHERE revenue_in_millions = (SELECT MIN(revenue_in_millions) FROM movie);
