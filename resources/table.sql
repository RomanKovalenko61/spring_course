
CREATE TABLE employees (
    id SERIAL,
    name VARCHAR(15),
    surname VARCHAR(25),
    department VARCHAR(20),
    salary INT,
    PRIMARY KEY (id)
);

-- for hibernate relations lessons

DROP TABLE employees;

CREATE TABLE details (
    id SERIAL,
    city VARCHAR(15),
    phone_number VARCHAR(25),
    email VARCHAR(30),
    PRIMARY KEY (id)
);

CREATE TABLE employees (
    id SERIAL,
    name VARCHAR(15),
    surname VARCHAR(25),
    department VARCHAR(20),
    salary INT,
    details_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (details_id) REFERENCES details(id)
);