CREATE TABLE express (
  id VARCHAR(64) NOT NULL unique ,
  name VARCHAR(32) NOT NULL,
  phone VARCHAR(32) NOT NULL,
  status VARCHAR(32) NOT NULL,
  date VARCHAR(32) NOT NULL,
);


insert into `express`
values('1','小明','123455','未取件','2019-09-05 16:20:51');

insert into `express`
values('2','小红','123455','未取件','2019-09-05 16:20:52');

insert into `express`
values('3','小牛','123455','未取件','2019-09-05 16:20:53');

insert into `express`
values('4','小张','123455','未取件','2019-09-05 16:20:54');
