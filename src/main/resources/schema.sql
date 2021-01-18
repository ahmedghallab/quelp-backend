DROP TABLE IF EXISTS ANSWER;
DROP TABLE IF EXISTS QUESTION;


create table QUESTION(
   id BIGINT not null AUTO_INCREMENT,
   question varchar(150) not null,
   description varchar(500),
   likes int default 0,
   dislikes int default 0,
   PRIMARY KEY ( id )
);

create table ANSWER(
   id BIGINT not null AUTO_INCREMENT,
   answer text,
   likes int default 0,
   dislikes int default 0,
   questionId BIGINT not null,
   PRIMARY KEY ( id ),
   FOREIGN KEY (questionId) REFERENCES QUESTION(id) ON DELETE CASCADE
);

INSERT INTO QUESTION (id, question, description, likes, dislikes)
VALUES ('1', 'First question on quelp', 'More useless talk', '100', '150');

INSERT INTO ANSWER (id, answer, likes, dislikes, questionId)
VALUES ('1', 'First answer on quelp', '1030', '1250','1');