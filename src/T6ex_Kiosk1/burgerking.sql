show tables;

create table burgerking (
	ids int not null auto_increment primary key,
	part varchar(20) not null,
	product varchar(30) not null,
	detail  varchar(50) not null,
	content text,		
	calorie int default 0,
	image 	varchar(50) not null,
	price		int not null	
	);

desc burgerking;

select * from burgerking;