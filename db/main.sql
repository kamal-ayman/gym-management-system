CREATE TABLE login_cache (
    id BIGINT PRIMARY KEY,
    is_login INT NOT NULL
);
INSERT INTO login_cache (id, is_login) values (0, 0);

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
  

INSERT INTO trainers (id) values (-1);


CREATE TABLE member (
    id BIGINT PRIMARY KEY,
    name TEXT NULL,
    gender INT NULL,
    age INT NULL,
    phone TEXT NULL,
    email TEXT NULL,
    sub_type INT NULL,
    sub_price INT NULL,
    reg_st DATE NULL,
    reg_ed DATE NULL,
    trainer_id bigint references trainers (id)
);

CREATE TABLE machines (
    sn BIGINT PRIMARY KEY,
    name INT NOT NULL,
    training_musicale INT NOT NULL,
    trade_mark TEXT NOT NULL,
    power INT NOT NULL
);
