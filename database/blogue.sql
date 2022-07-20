CREATE DATABASE blogue;
USE blogue;

CREATE TABLE User(
idUser int primary key auto_increment,
username varchar(45),
email varchar(60),
password varchar(45),
age smallint,
cep char(8),
numberAdress smallint
); 

CREATE TABLE Post(
idPost int primary key auto_increment,
descriptionPost varchar(45),
imagePost varchar(45),
category varchar(45),
data datetime,
fkUser int,
foreign key (fkUser) references User(idUser)
);

CREATE TABLE LikePost(
idLike int auto_increment,
fkUser int,
fkPost int,
foreign key (fkUser) references User(idUser),
foreign key (fkPost) references Post(idPost),
primary key (idLike,fkUser,fkPost)
);