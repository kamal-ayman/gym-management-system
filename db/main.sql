CREATE TABLE admin (
    id BIGINT PRIMARY KEY,
    name TEXT NULL,
    phone TEXT NULL,
    address TEXT NULL,
    password TEXT NULL
);
  
  CREATE TABLE trainers (
    id BIGINT PRIMARY KEY,
    fname TEXT NOT NULL,
    lname TEXT NOT NULL,
    phone TEXT NOT NULL,
    gender INT NOT NULL,
    experience INT NOT NULL,
    age INT NOT NULL,
    work_time INT NOT NULL,
    email TEXT NOT NULL
);
  
  CREATE TABLE member (
    id BIGINT PRIMARY KEY,
    name TEXT NULL,
    gender INT NULL,
    age INT NULL,
    phone TEXT NULL,
    email TEXT NULL,
    sub_type INT NULL,
    sub_price DOUBLE PRECISION NULL,
    reg_st TEXT NULL,
    reg_ed TEXT NULL
);

CREATE TABLE machines (
    sn BIGINT PRIMARY KEY,
    name INT NOT NULL,
    training_musicale INT NOT NULL,
    trade_mark TEXT NOT NULL,
    power INT NOT NULL
);
