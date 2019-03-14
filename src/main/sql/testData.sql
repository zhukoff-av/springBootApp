CREATE TABLE
    car
    (
        id BIGINT NOT NULL,
        contact BOOLEAN NOT NULL,
        email VARCHAR,
        model VARCHAR,
        name VARCHAR,
        phone VARCHAR,
        purchase_date DATETIME,
        purchase_price NUMERIC,
        serial_number VARCHAR,
        PRIMARY KEY (id)
    );

CREATE TABLE
    hibernate_sequence
    (
        next_val BIGINT
    );

INSERT INTO car (id, contact, email, model, name, phone, purchase_date, purchase_price)
  VALUES (001, 1, 'info@bmw.de', 'BMW 750i', 'Herr Miller', '123-443-225', 1219619200000, '97000');
INSERT INTO car (id, contact, email, model, name, phone, purchase_date, purchase_price)
  VALUES (002, 2, 'info@bmw.de', 'BMW 540d', 'Herr Miller', '123-443-225', 1219619200000, '62000');
INSERT INTO car (id, contact, email, model, name, phone, purchase_date, purchase_price)
  VALUES (003, 3, 'info@bmw.de', 'BMW 330i', 'Herr Miller', '123-443-225', 1219619200000, '51000');
INSERT INTO hibernate_sequence (next_val) VALUES (4);