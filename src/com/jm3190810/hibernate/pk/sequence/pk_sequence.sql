--Run queries one by one

CREATE TABLE JM3190810_STUDENT_SEQUENCE(
ID BIGINT PRIMARY KEY,
NAME VARCHAR(50),
AGE NUMBER
)

CREATE SEQUENCE JM3190810_STUDENT_MY_SEQUENCE;
ALTER SEQUENCE JM3190810_STUDENT_MY_SEQUENCE RESTART WITH 1001;