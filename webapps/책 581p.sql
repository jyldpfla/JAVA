create database board default character set utf8;

create USER 'jspexam'@'localhost'IDENTIFIED BY 'jsppw';
create USER 'jspexam'@'%' IDENTIFIED BY 'jsppw';

GRANT ALL PRIVILEGES ON board.* TO 'jspexam'@'localhost';
GRANT ALL PRIVILEGES ON board.* TO 'jspexam'@'%';