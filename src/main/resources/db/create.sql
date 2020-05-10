CREATE DATABASE news_posts;
\c news_posts;

CREATE TABLE users(
id serial PRIMARY KEY,
name VARCHAR,
email VARCHAR,
role VARCHAR,
sectionId int
);

CREATE TABLE common_news(
id serial PRIMARY KEY,
news VARCHAR,
writer VARCHAR
);

CREATE TABLE departments(
id serial PRIMARY KEY,
name VARCHAR,
details VARCHAR,
totalemployees VARCHAR
);

CREATE TABLE department_news(
id serial PRIMARY KEY,
news VARCHAR,
writer VARCHAR
);

CREATE DATABASE news_posts_test WITH TEMPLATE news_posts;
