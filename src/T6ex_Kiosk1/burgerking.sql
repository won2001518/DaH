show tables;

create table kiosk (
	idx int not null auto_increment primary key,
	part varchar(20) not null,
	product varchar(30) not null,
	detail  varchar(50) not null,
	content text, 		
	calorie int default 0,
	image 	varchar(50) not null,
	price		int not null	
	);
drop table kiosk;
desc kiosk;

select * from kiosk;