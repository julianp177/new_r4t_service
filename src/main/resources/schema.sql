CREATE TABLE USERS (
                      user_ID LONG AUTO_INCREMENT,
                      USER_NAME varchar(256),
                      passwort varchar(256),
                      vorname varchar(256),
                      nachname varchar(256),
                      email varchar(256),
                      role varchar(256),
                      PRIMARY KEY (user_ID)
);
CREATE TABLE REQUIREMENT (
                             requirement_ID BIGINT AUTO_INCREMENT,
                             bezeichnung varchar(256),
                             beschreibung varchar(MAX),
                             PRIMARY KEY (requirement_ID)
);
CREATE TABLE TESTRUN (
                         testrun_ID BIGINT AUTO_INCREMENT,
                         bezeichnung varchar(256),
                         requirement_ID BIGINT,
                         user_ID LONG,
                         PRIMARY KEY (testrun_ID),
                         FOREIGN KEY (requirement_ID) REFERENCES REQUIREMENT(requirement_ID),
                         FOREIGN KEY (user_ID) REFERENCES USERS(user_ID)
);
CREATE TABLE TESTCASE (
                          testcase_ID BIGINT AUTO_INCREMENT,
                          bezeichnung varchar(256),
                          testrun_ID BIGINT,
                          requirement_ID BIGINT,
                          ergebnis varchar(256),
                          PRIMARY KEY (testcase_ID),
                          FOREIGN KEY (testrun_ID) REFERENCES TESTRUN(testrun_ID),
                          FOREIGN KEY (requirement_ID) REFERENCES REQUIREMENT(requirement_ID)
);