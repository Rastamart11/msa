CREATE DATABASE shoppingCart;
use shoppingCart;
drop table if exists shoppingCart;
drop table if exists customer;
drop table if exists productOffering;

CREATE TABLE productOffering(
  id VARCHAR(25) NOT NULL,
  name VARCHAR(25),
  description VARCHAR(50),
  priceType VARCHAR(25),
  unitOfMeasure VARCHAR(25),
  value DECIMAL(10,2),
  urlImage VARCHAR(150),
  PRIMARY KEY (id)
);
INSERT INTO productOffering (id, name, description, priceType, unitOfMeasure, value, urlImage) VALUE ('dsfds477d', 'MacBook Pro', 'Apple - MacBook Pro de 13', 'unico', 'mxm', 48999.90, './assets/images/reemplazo/c2.jpg');
INSERT INTO productOffering (id, name, description, priceType, unitOfMeasure, value, urlImage) VALUE ('dsfds477e', 'MacMini ', 'Apple - MacMini gris espacial', 'unico', 'mxm', 15999.90, './assets/images/reemplazo/c3.jpg');
INSERT INTO productOffering (id, name, description, priceType, unitOfMeasure, value, urlImage) VALUE ('dsfds477f', 'Laptop ACER', 'Acer - Laptop ASPIRE 5 A515-55-58F0 de 15.6', 'unico', 'mxm', 17299.90, './assets/images/reemplazo/c1.jpg');
INSERT INTO productOffering (id, name, description, priceType, unitOfMeasure, value, urlImage) VALUE ('dsfds477g', 'Laptop ALPHA MSI', 'Laptop ALPHA MSI', 'unico', 'mxm', 8000.90, './assets/images/reemplazo/c4.jpg');
INSERT INTO productOffering (id, name, description, priceType, unitOfMeasure, value, urlImage) VALUE ('dsfds477h', 'Galaxy Tab S6', 'Samsung - Galaxy Tab S6 Lite 10.4', 'unico', 'mxm', 8990.90, './assets/images/reemplazo/c5.jpg');
INSERT INTO productOffering (id, name, description, priceType, unitOfMeasure, value, urlImage) VALUE ('dsfds477i', 'Galaxy Tab S7', 'Samsung - Galaxy Tab S7 de 11', 'unico', 'mxm', 16990.90, './assets/images/reemplazo/c6.jpg');
INSERT INTO productOffering (id, name, description, priceType, unitOfMeasure, value, urlImage) VALUE ('dsfds477j', 'Samsung - Galaxy Tab A8', 'Samsung - Galaxy Tab A8', 'unico', 'mxm', 8990.90, './assets/images/reemplazo/c7.jpg');
INSERT INTO productOffering (id, name, description, priceType, unitOfMeasure, value, urlImage) VALUE ('dsfds477k', 'Lenovo - Tab Slate', 'Lenovo - Tab Slate', 'unico', 'mxm', 3250.90, './assets/images/reemplazo/c8.jpg');
INSERT INTO productOffering (id, name, description, priceType, unitOfMeasure, value, urlImage) VALUE ('dsfds477l', 'Samsung - Galaxy', 'Samsung - Galaxy S20', 'unico', 'mxm', 3250.90, './assets/images/reemplazo/c9.jpg');
INSERT INTO productOffering (id, name, description, priceType, unitOfMeasure, value, urlImage) VALUE ('dsfds477m', 'Moto G9 Play', 'Motorola - Moto G9 Play - Azul - ATT', 'unico', 'mxm', 4999.90, './assets/images/reemplazo/c10.jpg');
INSERT INTO productOffering (id, name, description, priceType, unitOfMeasure, value, urlImage) VALUE ('dsfds477n', 'Samsung Note', 'Samsung - Celular Note 20 Mystic 4G - Gris - ATT', 'unico', 'mxm', 25999.90, './assets/images/reemplazo/c11.jpg');
INSERT INTO productOffering (id, name, description, priceType, unitOfMeasure, value, urlImage) VALUE ('dsfds477o', 'Samsung ', 'Samsung - Celular Note 20 Ultra 4G - Bronce - Telcel', 'unico', 'mxm', 33999.90, './assets/images/reemplazo/c12.jpg');

CREATE TABLE customer(
  id VARCHAR(25) NOT NULL,
  identifierType VARCHAR(25),
  name VARCHAR(25),
  PRIMARY KEY (id)
);
INSERT INTO customer (id, identifierType, name) VALUE ('551234560', 'msisdn', 'carlos Gernandez');
INSERT INTO customer (id, identifierType, name) VALUE ('551234561', 'msisdn', 'Jose Sanchez');
INSERT INTO customer (id, identifierType, name) VALUE ('551234562', 'msisdn', 'Marcos Gimenez');
INSERT INTO customer (id, identifierType, name) VALUE ('551234563', 'msisdn', 'Maria  Gomez');
INSERT INTO customer (id, identifierType, name) VALUE ('551234564', 'msisdn', 'Guadalupe Fernandez');
INSERT INTO customer (id, identifierType, name) VALUE ('551234565', 'msisdn', 'carlos Herrera');
INSERT INTO customer (id, identifierType, name) VALUE ('551234566', 'msisdn', 'Jose Santiago');
INSERT INTO customer (id, identifierType, name) VALUE ('551234567', 'msisdn', 'Marcos Gomez');
INSERT INTO customer (id, identifierType, name) VALUE ('551234568', 'msisdn', 'Maria  Mora');
INSERT INTO customer (id, identifierType, name) VALUE ('551234569', 'msisdn', 'Guadalupe Federico');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345610', 'msisdn', 'carlos Gernandez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345611', 'msisdn', 'Jose Sanchez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345612', 'msisdn', 'Marcos Gimenez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345613', 'msisdn', 'Maria  Gomez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345614', 'msisdn', 'Guadalupe Fernandez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345615', 'msisdn', 'carlos Herrera');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345616', 'msisdn', 'Jose Santiago');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345617', 'msisdn', 'Marcos Gomez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345618', 'msisdn', 'Maria  Mora');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345619', 'msisdn', 'Guadalupe Federico');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345620', 'msisdn', 'carlos Gernandez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345621', 'msisdn', 'Jose Sanchez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345622', 'msisdn', 'Marcos Gimenez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345623', 'msisdn', 'Maria  Gomez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345624', 'msisdn', 'Guadalupe Fernandez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345625', 'msisdn', 'carlos Herrera');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345626', 'msisdn', 'Jose Santiago');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345627', 'msisdn', 'Marcos Gomez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345628', 'msisdn', 'Maria  Mora');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345629', 'msisdn', 'Guadalupe Federico');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345630', 'msisdn', 'carlos Gernandez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345631', 'msisdn', 'Jose Sanchez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345632', 'msisdn', 'Marcos Gimenez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345633', 'msisdn', 'Maria  Gomez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345634', 'msisdn', 'Guadalupe Fernandez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345635', 'msisdn', 'carlos Herrera');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345636', 'msisdn', 'Jose Santiago');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345637', 'msisdn', 'Marcos Gomez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345638', 'msisdn', 'Maria  Mora');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345639', 'msisdn', 'Guadalupe Federico');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345640', 'msisdn', 'carlos Gernandez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345641', 'msisdn', 'Jose Sanchez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345642', 'msisdn', 'Marcos Gimenez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345643', 'msisdn', 'Maria  Gomez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345644', 'msisdn', 'Guadalupe Fernandez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345645', 'msisdn', 'carlos Herrera');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345646', 'msisdn', 'Jose Santiago');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345647', 'msisdn', 'Marcos Gomez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345648', 'msisdn', 'Maria  Mora');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345649', 'msisdn', 'Guadalupe Federico');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345650', 'msisdn', 'carlos Gernandez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345651', 'msisdn', 'Jose Sanchez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345652', 'msisdn', 'Marcos Gimenez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345653', 'msisdn', 'Maria  Gomez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345654', 'msisdn', 'Guadalupe Fernandez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345655', 'msisdn', 'carlos Herrera');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345656', 'msisdn', 'Jose Santiago');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345657', 'msisdn', 'Marcos Gomez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345658', 'msisdn', 'Maria  Mora');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345659', 'msisdn', 'Guadalupe Federico');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345660', 'msisdn', 'carlos Gernandez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345661', 'msisdn', 'Jose Sanchez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345662', 'msisdn', 'Marcos Gimenez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345663', 'msisdn', 'Maria  Gomez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345664', 'msisdn', 'Guadalupe Fernandez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345665', 'msisdn', 'carlos Herrera');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345666', 'msisdn', 'Jose Santiago');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345667', 'msisdn', 'Marcos Gomez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345668', 'msisdn', 'Maria  Mora');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345669', 'msisdn', 'Guadalupe Federico');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345670', 'msisdn', 'carlos Gernandez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345671', 'msisdn', 'Jose Sanchez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345672', 'msisdn', 'Marcos Gimenez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345673', 'msisdn', 'Maria  Gomez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345674', 'msisdn', 'Guadalupe Fernandez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345675', 'msisdn', 'carlos Herrera');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345676', 'msisdn', 'Jose Santiago');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345677', 'msisdn', 'Marcos Gomez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345678', 'msisdn', 'Maria  Mora');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345679', 'msisdn', 'Guadalupe Federico');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345680', 'msisdn', 'carlos Gernandez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345681', 'msisdn', 'Jose Sanchez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345682', 'msisdn', 'Marcos Gimenez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345683', 'msisdn', 'Maria  Gomez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345684', 'msisdn', 'Guadalupe Fernandez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345685', 'msisdn', 'carlos Herrera');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345686', 'msisdn', 'Jose Santiago');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345687', 'msisdn', 'Marcos Gomez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345688', 'msisdn', 'Maria  Mora');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345689', 'msisdn', 'Guadalupe Federico');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345690', 'msisdn', 'carlos Gernandez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345691', 'msisdn', 'Jose Sanchez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345692', 'msisdn', 'Marcos Gimenez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345693', 'msisdn', 'Maria  Gomez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345694', 'msisdn', 'Guadalupe Fernandez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345695', 'msisdn', 'carlos Herrera');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345696', 'msisdn', 'Jose Santiago');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345697', 'msisdn', 'Marcos Gomez');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345698', 'msisdn', 'Maria  Mora');
INSERT INTO customer (id, identifierType, name) VALUE ('5512345699', 'msisdn', 'Guadalupe Federico');


CREATE TABLE shoppingCart(
  id VARCHAR(25) NOT NULL,
  ItemId VARCHAR(25) NOT NULL,
  quantity INTEGER,
  proOffId VARCHAR(25),
  customerId VARCHAR(25),
  PRIMARY KEY (id, ItemId),
  FOREIGN KEY (proOffId) REFERENCES productOffering(id),
  FOREIGN KEY (customerId) REFERENCES customer(id)
);
