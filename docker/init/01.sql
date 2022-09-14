USE mpdb;

CREATE TABLE country(
    id int primary key AUTO_INCREMENT,
    name varchar(225) not null,
    status boolean not null default true,
    created_by varchar(125) not null,
    created_at timestamp default CURRENT_TIMESTAMP
);

INSERT INTO country(name, status, created_by, created_at) VALUES("Guatemala", true, "demo@demo.com", now());

CREATE TABLE state(
    id int primary key AUTO_INCREMENT,
    country_id int references country(id),
    name varchar(225) not null,
    status boolean not null default true,
    created_by varchar(125) not null,
    created_at timestamp default CURRENT_TIMESTAMP
);

CREATE TABLE city(
    id int primary key AUTO_INCREMENT,
    state_id int references state(id),
    name varchar(225) not null,
    status boolean not null default true,
    created_by varchar(125) not null,
    created_at timestamp default CURRENT_TIMESTAMP
);

INSERT INTO state(country_id, name, status, created_by, created_at) VALUES (1, "Guatemala", true, "demo@demo.com", now());
INSERT INTO state(country_id, name, status, created_by, created_at) VALUES (1, "Santa Rosa", true, "demo@demo.com", now());
INSERT INTO state(country_id, name, status, created_by, created_at) VALUES (1, "Escuintla", true, "demo@demo.com", now());


INSERT INTO city(state_id, name, status, created_by, created_at) VALUES (1, "Guatemala", true, "demo@demo.com", now());
INSERT INTO city(state_id, name, status, created_by, created_at) VALUES (1, "Mixco", true, "demo@demo.com", now());
INSERT INTO city(state_id, name, status, created_by, created_at) VALUES (1, "Villa Nueva", true, "demo@demo.com", now());

CREATE TABLE office(
    id int primary key AUTO_INCREMENT,
    city_id int references city(id),
    name varchar(255) null,
    address varchar(225) not null,
    extra_address varchar(255) null,
    phone varchar(10) not null,
    extra_phone varchar(10) null,
    status boolean not null default true,
    created_by varchar(125) not null,
    created_at timestamp default CURRENT_TIMESTAMP
);
