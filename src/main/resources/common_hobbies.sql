CREATE DATABASE hobbies;

drop table hobbies;
drop table hobbies_chat;

CREATE TABLE hobbies_chat(
	chat_id int auto_increment,
    chat_name varchar(255) not null,
    constraint PK_hobbies_chat primary key (chat_id)
);

CREATE TABLE hobbies (
	hobby_id int,
	hobby_name varchar(255) not null,
    hobby_image blob,
    chat_id int not null,
	constraint PK_hobbies primary key (hobby_id, hobby_name), -- id and name are both primary keys
    constraint FK_hobbies_chat foreign key (chat_id) references hobbies_chat(chat_id)
);


-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

select * from hobbies;
select * from hobbies_chat;

insert into hobbies_chat (chat_name) values("Java chat"); -- no hobby_id, as id is auto_increment
insert into hobbies_chat (chat_name) values("Biking_chat");

insert into hobbies (hobby_name, hobby_image, chat_id) values ("Java", "C:\tmp\java_logo.png", 1); 




