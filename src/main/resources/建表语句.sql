CREATE TABLE `teacher`
(
  `ID`     bigint(5) NOT NULL AUTO_INCREMENT,
  `NAME`   varchar(45)            DEFAULT NULL,
  `GENDER` enum ('MALE','FEMALE') DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 6
  DEFAULT CHARSET = utf8mb4;

CREATE TABLE `teacher_user_relation`
(
  `ID`         bigint(5) NOT NULL AUTO_INCREMENT,
  `USER_ID`    bigint(5) DEFAULT NULL,
  `TEACHER_ID` bigint(5) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 13
  DEFAULT CHARSET = utf8mb4;

CREATE TABLE `user`
(
  `ID`       bigint(5) unsigned NOT NULL AUTO_INCREMENT,
  `NAME`     varchar(45)            DEFAULT NULL COMMENT '性别',
  `EMAIL`    varchar(45)            DEFAULT NULL COMMENT 'email',
  `ADDRESS`  varchar(45)            DEFAULT NULL COMMENT '住址',
  `GENDER`   enum ('MALE','FEMALE') DEFAULT NULL COMMENT '性别',
  `SCORE`    smallint(6)            DEFAULT NULL COMMENT '成绩',
  `VERSION`  bigint(5)              DEFAULT '1',
  `BIRTHDAY` datetime               DEFAULT '1970-01-01 00:00:00' COMMENT '生日',
  PRIMARY KEY (`ID`),
  KEY `USER_INDEX` (`ID`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 103
  DEFAULT CHARSET = utf8mb4 COMMENT ='本表仅供Spring Data Jpa学习使用';

CREATE TABLE `user_detail`
(
  `ID`              bigint(5) NOT NULL AUTO_INCREMENT,
  `CREDIT`          float     NOT NULL,
  `ENROLLMENT_DATE` date      NOT NULL,
  `USER_ID`         bigint(5) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 6
  DEFAULT CHARSET = utf8mb4;

CREATE TABLE `user_friend`
(
  `ID`        bigint(5) NOT NULL AUTO_INCREMENT,
  `USER_ID`   bigint(5) DEFAULT NULL,
  `FRIEND_ID` bigint(5) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 11
  DEFAULT CHARSET = utf8mb4;
