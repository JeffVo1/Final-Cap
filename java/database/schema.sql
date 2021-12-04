BEGIN TRANSACTION;

DROP TABLE IF EXISTS users;
DROP SEQUENCE IF EXISTS seq_user_id;

CREATE SEQUENCE seq_user_id
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;


CREATE TABLE users (
	user_id int DEFAULT nextval('seq_user_id'::regclass) NOT NULL,
	username varchar(50) NOT NULL,
	password_hash varchar(200) NOT NULL,
	role varchar(50) NOT NULL,
	CONSTRAINT PK_user PRIMARY KEY (user_id)
);

INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');

-- ALTER table item 
-- DROP CONSTRAINT fk_auction_id,
-- DROP CONSTRAINT fk_user_id;

-- ALTER table auction
-- DROP CONSTRAINT fk_charity_id;

-- ALTER table bids 
-- DROP CONSTRAINT fk_auction_id_bids,
-- DROP CONSTRAINT fk_user_id_bids;

-- ALTER table users
-- DROP column phone_number,
-- Drop column time_available,
-- drop column adress;

DROP TABLE IF EXISTS item;
DROP TABLE IF EXISTS auction; 
DROP TABLE IF EXISTS bids;
DROP TABLE IF EXISTS charity;


CREATE TABLE item (
        item_id serial,
        auction_id int NOT NULL,
        item_name VARCHAR (80),
        description VARCHAR (300),
        user_id int NOT NULL,
        price int NOT NULL,
        
        constraint pk_item_id primary key (item_id)
);

CREATE TABLE auction (
        auction_id serial, 
        charity_id int NOT NULL, 
        start_bid int NOT NULL, 
        start_time timestamp, 
        status VARCHAR (15),
        
        constraint pk_auction_id primary key (auction_id)

);
CREATE TABLE bids (
        bid_id serial,
        auction_id int NOT NULL,
        user_id int NOT NULL,
        amount int NOT NULL,
        
        constraint pk_bid_id primary key (bid_id)
);
CREATE TABLE charity (
        charity_id serial,
        charity_name varchar (40) NOT NULL,
        
        constraint pk_charity_id primary key (charity_id)
);


ALTER table item 
ADD CONSTRAINT fk_auction_id FOREIGN KEY (auction_id) REFERENCES auction (auction_id),
ADD CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES users (user_id);

ALTER table auction
ADD CONSTRAINT fk_charity_id FOREIGN KEY (charity_id) REFERENCES charity (charity_id);

ALTER table bids 
ADD CONSTRAINT fk_auction_id_bids FOREIGN KEY (auction_id) REFERENCES auction (auction_id),
ADD CONSTRAINT fk_user_id_bids FOREIGN KEY (user_id) REFERENCES users (user_id);

Alter table users
add column phone_number VARCHAR (12), 
--TODO check contraint on phone number
add column time_available VARCHAR (25),
add column address VARCHAR (75);


COMMIT TRANSACTION;
