--Category Table
CREATE TABLE Category	( 
	id IDENTITY,
	name VARCHAR(50),
	description VARCHAR(255),
	isActive BOOLEAN,
	CONSTRAINT pk_category_id PRIMARY KEY (id)
);

INSERT into CATEGORY(name,description)
VALUES('Fruit','fruit only'),
('Vegetable','veg only'),
('Junk Food','junk only');


--Product Table

CREATE TABLE product (
	id IDENTITY,
	code VARCHAR(20),
	name VARCHAR(50),
	brand VARCHAR(50),
	description VARCHAR(255),
	unit_price DECIMAL(10,2),
	quantity INT,
	category_id INT,
	supplier_id INT,
	purchases INT DEFAULT 0,
	CONSTRAINT pk_product_id PRIMARY KEY (id),
 	CONSTRAINT fk_product_category_id FOREIGN KEY (category_id) REFERENCES category (id),
	CONSTRAINT fk_product_supplier_id FOREIGN KEY (supplier_id) REFERENCES user_detail(id),	
);	


INSERT INTO product (code, name, description, unit_price, quantity, category_id, supplier_id, purchases)
VALUES ('PRDABC123','apple','Fresh Apples from Mustang',120.00,15,1,1,0);
INSERT INTO product (code, name, description, unit_price, quantity, category_id, supplier_id, purchases)
VALUES ('PRDABC124','banana','Fresh Banana',100.00,20,1,1,0);
 INSERT INTO product (code, name, description, unit_price, quantity, category_id, supplier_id, purchases)
VALUES ('PRDABC125','watermelon','Fresh & Juicy WaterMelon',300.00,10,1,2,0);
 INSERT INTO product (code, name, description, unit_price, quantity, category_id, supplier_id, purchases)
VALUES ('PRDABC226','spinach','Fresh Spinach',15.00,30,2,2,0);
 INSERT INTO product (code, name, description, unit_price, quantity, category_id, supplier_id, purchases)
VALUES ('PRDABC223','potato','Fresh Potato',125.00,10,2,3,0);
 INSERT INTO product (code, name, description, unit_price, quantity, category_id, supplier_id, purchases)
VALUES ('PRDABC323','biscuit','Tasty Biscuit',50.00,30,3,4,0);
 INSERT INTO product (code, name, description, unit_price, quantity, category_id, supplier_id, purchases)
VALUES ('PRDABC324','Noodles','yummy Noodles',30.00,25,3,4,0);




--user-Detail Table

CREATE TABLE user_detail (
	id IDENTITY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	role VARCHAR(50),
	password VARCHAR(60),
	email VARCHAR(100),
	contact_number VARCHAR(15),	
	CONSTRAINT pk_user_id PRIMARY KEY(id)
);

INSERT INTO user_detail 
(first_name, last_name, role, password, email, contact_number) 
VALUES ('Virat', 'Kohli', 'ADMIN', '$2a$06$ORtBskA2g5Wg0HDgRE5ZsOQNDHUZSdpJqJ2.PGXv0mKyEvLnKP7SW', 'vk@gmail.com', '8888888888');
INSERT INTO user_detail 
(first_name, last_name, role, password, email, contact_number) 
VALUES ('Ravindra', 'Jadeja', 'SUPPLIER', '$2a$06$bzYMivkRjSxTK2LPD8W4te6jjJa795OwJR1Of5n95myFsu3hgUnm6', 'rj@gmail.com', '9999999999');
INSERT INTO user_detail 
(first_name, last_name, role, password, email, contact_number) 
VALUES ('Ravichandra', 'Ashwin', 'SUPPLIER', '$2a$06$i1dLNlXj2uY.UBIb9kUcAOxCigGHUZRKBtpRlmNtL5xtgD6bcVNOK', 'ra@gmail.com', '7777777777');
INSERT INTO user_detail 
(first_name, last_name, role, password, email, contact_number) 
VALUES ('Khozema', 'Nullwala', 'USER', '$2a$06$4mvvyO0h7vnUiKV57IW3oudNEaKPpH1xVSdbie1k6Ni2jfjwwminq', 'kn@gmail.com', '7777777777');




--Debtor List
INSERT into DEBTOR ( Name,Address,Contact,Rem_Amount)
VALUES('Ram','Bhaktapur','9874456311',120.00)

