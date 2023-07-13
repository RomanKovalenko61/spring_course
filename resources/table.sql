
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

-- one-to-many

DROP TABLE employees;
DROP TABLE details;

CREATE TABLE departments (
    id SERIAL,
    name VARCHAR(15),
    max_salary INT,
    min_salary INT,
    PRIMARY KEY (id)
);

CREATE TABLE employees (
    id SERIAL,
    name VARCHAR(15),
    surname VARCHAR(25),
    salary INT,
    department_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (department_id) REFERENCES departments(id)
);

-- many-to-many

DROP TABLE employees;
DROP TABLE departments;

CREATE TABLE children (
    id SERIAL,
    name VARCHAR(15),
    age INT,
    PRIMARY KEY (id)
);

CREATE TABLE section (
    id SERIAL,
    name VARCHAR(15),
    PRIMARY KEY (id)
);

CREATE TABLE child_section (
    child_id INT NOT NULL,
    section_id INT NOT NULL,
    PRIMARY KEY (child_id, section_id),
    FOREIGN KEY (child_id) REFERENCES children(id),
    FOREIGN KEY (section_id) REFERENCES section(id)
);

DROP TABLE child_section;
DROP TABLE children;
DROP TABLE section;