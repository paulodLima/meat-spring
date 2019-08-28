create table restaurants(
	id varchar(50) not null,
	name varchar(50) not null,
	category varchar(50) not null,
	delivery_estimate varchar(20),
	rating double,
	image_path varchar (200),
	about varchar (500),
	hours varchar (200)
) engine=InnoDB default charset=utf8;

insert into restaurants(id,name,category,delivery_estimate,rating,image_path,about,hours)
 values ("bread-bakery","Bread & Bakery","Bakery","25m",4.9,"assets/img/restaurants/breadbakery.png","A Bread & Brakery tem 40 anos de mercado. Fazemos os melhores doces e pães. Compre e confira.",
 "Funciona de segunda à sexta, de 8h às 23h");
 
 insert into restaurants(id,name,category,delivery_estimate,rating,image_path,about,hours)
 values ("burger-house","Burger House","Hamburgers","100m",3.5,"assets/img/restaurants/burgerhouse.png",
 "40 anos se especializando em trash food.","Funciona todos os dias, de 10h às 22h");
 
  insert into restaurants(id,name,category,delivery_estimate,rating,image_path,about,hours)
 values ("tasty-treats", "Tasty Treats", "Doces", "20m", 4.4, "assets/img/restaurants/tasty.png",  "A doceria com mais tradição da cidade", "Funciona de segunda à sábado, de 8h às 23h");

 insert into restaurants(id,name,category,delivery_estimate,rating,image_path,about,hours)
 values ("ice-cream","Ice Cream","Ice Creams","40-65m",4.5,"assets/img/restaurants/icy.png","A Ice Cream é uma sorveteria inovadora.",
"Funciona todos os dias, de 10h às 1h");

 insert into restaurants(id,name,category,delivery_estimate,rating,image_path,about,hours)
 values ("green-food","Green Food","Saudável","75m",4.1,"assets/img/restaurants/greenfood.png",
 "Comida saudável é no Green Food. Compramos barato, vendemos caro.","Somente em horário de almoço, das 11h às 15h");
 

 insert into restaurants(id,name,category,delivery_estimate,rating,image_path,about,hours)
 values ("coffee-corner",
    "Coffee Corner",
      "Coffee Shop",
      "30-40m",
      4.8,
    "assets/img/restaurants/coffeecorner.png",
 "A Coffe Corner foi eleita a melhor cafeteria da cidade.",
  "Funciona de segunda à sábado, de 6h às 22h"); 
