-- SELECT
--     'ALTER TABLE [' +  OBJECT_SCHEMA_NAME(parent_object_id) +
--     '].[' + OBJECT_NAME(parent_object_id) +
--     '] DROP CONSTRAINT [' + name + ']'
-- FROM sys.foreign_keys
-- WHERE referenced_object_id = object_id('Student');
DROP TABLE IF EXISTS ANSWERS;
DROP TABLE IF EXISTS QUESTIONS;


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
   questionId BIGINT,
   PRIMARY KEY ( id ),
   FOREIGN KEY (questionId) REFERENCES QUESTIONS(id) ON DELETE CASCADE
);

INSERT INTO QUESTIONS (id, question, description, likes, dislikes)
VALUES ('1', 'First question on quelp', 'More useless talk', '100', '150');

INSERT INTO ANSWERS (id, answer, likes, dislikes, questionId)
VALUES ('1', 'First answer on quelp', '1030', '1250','1');