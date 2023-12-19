create table member(
	id int not null primary key unique,
	first_name char,
	mid_name char,
	last_name char,
	gender int,
	age int,
	phone char,
	email char,
	subscription_type int,
	subscription_price double,
    start_date date,
    end_date date
);
