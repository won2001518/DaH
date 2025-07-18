show tables;

create table burgerking11(
  idx  int not null auto_increment primary key,	/* 고유번호 */
  part varchar(50) not null,		/* 상품분류 */
  product varchar(100) not null,	/* 상품명 */
  detail  varchar(255) not null,	/* 상품 간단설명 */
  content text,									/* 상품 상세설명 */
  calorie int default 0;				/* 칼로리 */
  image 	varchar(255) not null,	/* 상품이미지(2개, 큰이미지, 작은이미지(_s) */
  price		int nost null					/* 상품 가격 */
);
