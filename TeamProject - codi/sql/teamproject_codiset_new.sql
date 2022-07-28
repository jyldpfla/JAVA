-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: 192.168.0.98    Database: teamproject
-- ------------------------------------------------------
-- Server version	8.0.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `codiset_new`
--

DROP TABLE IF EXISTS `codiset_new`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `codiset_new` (
  `id` int NOT NULL AUTO_INCREMENT,
  `product1` int DEFAULT NULL,
  `product2` int DEFAULT NULL,
  `product3` int DEFAULT NULL,
  `product4` int DEFAULT NULL,
  `product5` int DEFAULT NULL,
  `product6` int DEFAULT NULL,
  `product7` int DEFAULT NULL,
  `product8` int DEFAULT NULL,
  `product9` int DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  `tag_theme` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `product1_fk_idx` (`product1`),
  KEY `product2_fk_idx` (`product2`),
  KEY `product3_fk_idx` (`product3`),
  KEY `product4_fk_idx` (`product4`),
  KEY `product5_fk_idx` (`product5`),
  KEY `product6_fk_idx` (`product6`),
  KEY `product7_fk_idx` (`product7`),
  KEY `product8_fk_idx` (`product8`),
  KEY `product9_fk_idx` (`product9`),
  KEY `user_id_fk_idx` (`user_id`),
  KEY `tag_theme_fk_idx` (`tag_theme`),
  CONSTRAINT `product1_fk` FOREIGN KEY (`product1`) REFERENCES `all_product` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `product2_fk` FOREIGN KEY (`product2`) REFERENCES `all_product` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `product3_fk` FOREIGN KEY (`product3`) REFERENCES `all_product` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `product4_fk` FOREIGN KEY (`product4`) REFERENCES `all_product` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `product5_fk` FOREIGN KEY (`product5`) REFERENCES `all_product` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `product6_fk` FOREIGN KEY (`product6`) REFERENCES `all_product` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `product7_fk` FOREIGN KEY (`product7`) REFERENCES `all_product` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `product8_fk` FOREIGN KEY (`product8`) REFERENCES `all_product` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `product9_fk` FOREIGN KEY (`product9`) REFERENCES `all_product` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `tag_theme_fk` FOREIGN KEY (`tag_theme`) REFERENCES `tag_theme` (`id`),
  CONSTRAINT `user_id_fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `codiset_new`
--

LOCK TABLES `codiset_new` WRITE;
/*!40000 ALTER TABLE `codiset_new` DISABLE KEYS */;
INSERT INTO `codiset_new` VALUES (1,1,NULL,4,6,8,10,NULL,NULL,NULL,1,2),(2,2,NULL,3,5,7,9,NULL,NULL,NULL,3,2);
/*!40000 ALTER TABLE `codiset_new` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-26 16:11:28
