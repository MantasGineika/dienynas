

INSERT INTO studentai VALUES('0','Kazys','Kazauskas','kazys@gmail.com');
INSERT INTO studentai VALUES('0','Petras','Petrauskas','petras@gmail.com');
INSERT INTO studentai VALUES('0','Jonas','Jonauskas','jonas@gmail.com');
INSERT INTO studentai VALUES('0','Arunas','Arunauskas','arunas@gmail.com');
INSERT INTO studentai VALUES('0','Ona','Onauskaite','ona@gmail.com');

INSERT INTO authorities VALUES('jonas','ROLE_STUDENTAS');
INSERT INTO authorities VALUES('marija','ROLE_STUDENTAS');
INSERT INTO authorities VALUES('marija','ROLE_DESTYTOJAS');
INSERT INTO authorities VALUES('petras','ROLE_STUDENTAS');
INSERT INTO authorities VALUES('petras','ROLE_ADMIN');

INSERT INTO pazymiai VALUES('0','1',now(),'8');
INSERT INTO pazymiai VALUES('0','1',now(),'9');
INSERT INTO pazymiai VALUES('0','1',now(),'7');
INSERT INTO pazymiai VALUES('0','2',now(),'6');
INSERT INTO pazymiai VALUES('0','2',now(),'5');
INSERT INTO pazymiai VALUES('0','3',now(),'8');
INSERT INTO pazymiai VALUES('0','3',now(),'10');
INSERT INTO pazymiai VALUES('0','3',now(),'7');
INSERT INTO pazymiai VALUES('0','3',now(),'7');
INSERT INTO pazymiai VALUES('0','4',now(),'6');
INSERT INTO pazymiai VALUES('0','4',now(),'8');
INSERT INTO pazymiai VALUES('0','5',now(),'9');
INSERT INTO pazymiai VALUES('0','5',now(),'9');
INSERT INTO pazymiai VALUES('0','5',now(),'8');
INSERT INTO pazymiai VALUES('0','5',now(),'10');


INSERT INTO users VALUES('jonas','{noop}test','1');
INSERT INTO users VALUES('marija','{noop}test','1');
INSERT INTO users VALUES('petras','{noop}test','1');

