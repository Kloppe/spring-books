# ************************************************************
# Sequel Pro SQL dump
# Version 5224
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 192.168.1.105 (MySQL 5.5.5-10.1.37-MariaDB-0+deb9u1)
# Database: skin
# Generation Time: 2019-11-08 08:15:15 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
SET NAMES utf8mb4;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table alembic_version
# ------------------------------------------------------------

DROP TABLE IF EXISTS `alembic_version`;

CREATE TABLE `alembic_version` (
  `version_num` varchar(32) NOT NULL,
  PRIMARY KEY (`version_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

LOCK TABLES `alembic_version` WRITE;
/*!40000 ALTER TABLE `alembic_version` DISABLE KEYS */;

INSERT INTO `alembic_version` (`version_num`)
VALUES
	('dd17107fa529');

/*!40000 ALTER TABLE `alembic_version` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table sk_skin_image
# ------------------------------------------------------------

DROP TABLE IF EXISTS `sk_skin_image`;

CREATE TABLE `sk_skin_image` (
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  `url` varchar(256) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `sk_skin_image_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `sk_user_profile` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



# Dump of table sk_user_profile
# ------------------------------------------------------------

DROP TABLE IF EXISTS `sk_user_profile`;

CREATE TABLE `sk_user_profile` (
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `password` varchar(128) NOT NULL,
  `age` varchar(3) DEFAULT NULL,
  `email` varchar(128) DEFAULT NULL,
  `avatar_url` varchar(256) DEFAULT NULL,
  `address` varchar(128) DEFAULT NULL,
  `name` varchar(32) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

LOCK TABLES `sk_user_profile` WRITE;
/*!40000 ALTER TABLE `sk_user_profile` DISABLE KEYS */;

INSERT INTO `sk_user_profile` (`create_time`, `update_time`, `id`, `password`, `age`, `email`, `avatar_url`, `address`, `name`, `phone`)
VALUES
	('2019-11-06 23:26:04','2019-11-06 23:26:21',1,'pbkdf2:sha256:150000$OPfQ9MPj$51268621394871a4bf2f17f8062f959e641807ba3f43b0f4eaf35d122d04aeb5',NULL,'470957137@qq.com',NULL,NULL,'470957137@qq.com',NULL);

/*!40000 ALTER TABLE `sk_user_profile` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
