create table QUESTIONS(
   id BIGINT not null AUTO_INCREMENT,
   question varchar(150) not null,
   description varchar(500),
   likes int,
   dislikes int,
   PRIMARY KEY ( id )
);

create table ANSWERS(
   id BIGINT not null AUTO_INCREMENT,
   answer text,
   likes int,
   dislikes int,
   questionId uniqueidentifier,
   PRIMARY KEY ( id ),
   FOREIGN KEY (questionId) REFERENCES QUESTIONS(questionId)
);