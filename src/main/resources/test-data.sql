--USERS
INSERT INTO USER (USERNAME, PASSWORD, ENABLED) VALUES ('admin@gmail.com','12345',TRUE);
INSERT INTO USER (USERNAME, PASSWORD, ENABLED) VALUES ('javastudy@outlook.com','12345',TRUE);
INSERT INTO USER (USERNAME, PASSWORD, ENABLED) VALUES ('test1@outlook.com','12345',TRUE);
INSERT INTO USER (USERNAME, PASSWORD, ENABLED) VALUES ('test2@outlook.com','12345',TRUE);
INSERT INTO USER (USERNAME, PASSWORD, ENABLED) VALUES ('test3@outlook.com','12345',TRUE);
INSERT INTO USER (USERNAME, PASSWORD, ENABLED) VALUES ('test4@outlook.com','12345',TRUE);
INSERT INTO USER (USERNAME, PASSWORD, ENABLED) VALUES ('test5@outlook.com','12345',TRUE);
INSERT INTO USER (USERNAME, PASSWORD, ENABLED) VALUES ('test6@outlook.com','12345',TRUE);
INSERT INTO USER (USERNAME, PASSWORD, ENABLED) VALUES ('test7@outlook.com','12345',TRUE);
INSERT INTO USER (USERNAME, PASSWORD, ENABLED) VALUES ('test8@outlook.com','12345',TRUE);
INSERT INTO USER (USERNAME, PASSWORD, ENABLED) VALUES ('roleuser@outlook.com','12345',TRUE);
INSERT INTO USER (USERNAME, PASSWORD, ENABLED) VALUES ('superuser@outlook.com','12345',TRUE);

--AUTHORITIES
INSERT INTO AUTHORITIES (USERNAME,AUTHORITY) VALUES ('admin@gmail.com','ROLE_ADMIN');
INSERT INTO AUTHORITIES (USERNAME,AUTHORITY) VALUES ('roleuser@outlook.com','ROLE_USER');
INSERT INTO AUTHORITIES (USERNAME,AUTHORITY) VALUES ('superuser@outlook.com','ROLE_SUPER_USER');

--LOG
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 1');
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 2');
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 3');
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 4');
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 5');
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 6');
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 7');
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 8');
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 9');
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 10');
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 11');
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 12');
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 13');
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 14');
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 15');
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 16');
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 17');
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 18');
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 19');
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 20');
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 21');
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 22');
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 23');
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 24');
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 25');
INSERT INTO LOG(LOGSTRING) VALUES('TEST LOG 26');

--TEST
INSERT INTO TEST(TESTCOLUMN) VALUES('TEST COLUMN 1');
INSERT INTO TEST(TESTCOLUMN) VALUES('TEST COLUMN 2');
INSERT INTO TEST(TESTCOLUMN) VALUES('TEST COLUMN 3');
INSERT INTO TEST(TESTCOLUMN) VALUES('TEST COLUMN 4');