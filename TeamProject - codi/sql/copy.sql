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
-- Table structure for table `all_product`
--

DROP TABLE IF EXISTS `all_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `all_product` (
  `number` int NOT NULL AUTO_INCREMENT,
  `product_Name` varchar(45) NOT NULL,
  `product_Size` varchar(45) DEFAULT NULL,
  `product_Color` varchar(45) DEFAULT NULL,
  `product_Category` varchar(45) DEFAULT NULL,
  `product_Sub_Category` varchar(45) DEFAULT NULL,
  `product_Image` varchar(100) DEFAULT NULL,
  `product_Season` varchar(45) DEFAULT NULL,
  `record_Data` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`product_Name`),
  UNIQUE KEY `number_UNIQUE` (`number`),
  KEY `category.fk_idx` (`product_Category`),
  CONSTRAINT `category.fk` FOREIGN KEY (`product_Category`) REFERENCES `category` (`category_Name`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `all_product`
--

LOCK TABLES `all_product` WRITE;
/*!40000 ALTER TABLE `all_product` DISABLE KEYS */;
INSERT INTO `all_product` VALUES (5,'가방_1',NULL,'purple','bag',NULL,'\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\가방\\가방1.jpg','22s/s','2022-07-27 01:57:42'),(6,'가방_2',NULL,'brown','bag',NULL,'\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\가방\\가방2.jpg','22f/w','2022-07-27 01:57:42'),(1,'상의_1',NULL,'white','top','반팔셔츠','D:\\jinho\\db\\image\\상의1.png','22s/s','2022-07-27 01:57:42'),(2,'상의_2',NULL,'white','top','반팔','\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\상의\\상의2.jpg','22s/s','2022-07-27 01:57:42'),(7,'신발_1',NULL,'ivory','shoes',NULL,'\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\신발\\신발1.jpg','22s/s','2022-07-27 01:57:42'),(8,'신발_2',NULL,'brown','shoes',NULL,'\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\신발\\신발2.jpg','22s/s','2022-07-27 01:57:42'),(9,'악세_1',NULL,'green','acc','목걸이','\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\악세사리\\목걸이1.jpg','22s/s','2022-07-27 01:57:42'),(10,'악세_2',NULL,'sliver','acc','목걸이','\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\악세사리\\목걸이2.jpg','22s/s','2022-07-27 01:57:42'),(3,'하의_1',NULL,'black','bottom','데님스커트','\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\하의\\하의1.jpg','22s/s','2022-07-27 01:57:42'),(4,'하의_2',NULL,'black','bottom','데님스커트','\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\하의\\하의2.jpg','22s/s','2022-07-27 01:57:42');
/*!40000 ALTER TABLE `all_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cart` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` varchar(45) NOT NULL,
  `product` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id.fk_idx` (`user_id`),
  KEY `product_name_fk_idx` (`product`),
  CONSTRAINT `product_name` FOREIGN KEY (`product`) REFERENCES `all_product` (`product_Name`),
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
INSERT INTO `cart` VALUES (1,'test1','상의_1');
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `number` int NOT NULL AUTO_INCREMENT,
  `category_Name` varchar(45) NOT NULL,
  PRIMARY KEY (`category_Name`),
  UNIQUE KEY `id_UNIQUE` (`number`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'top'),(2,'bottom'),(3,'bag'),(4,'shoes'),(5,'acc');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `codiset_new`
--

DROP TABLE IF EXISTS `codiset_new`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `codiset_new` (
  `id` int NOT NULL AUTO_INCREMENT,
  `product1` varchar(45) DEFAULT NULL,
  `product2` varchar(45) DEFAULT NULL,
  `product3` varchar(45) DEFAULT NULL,
  `product4` varchar(45) DEFAULT NULL,
  `product5` varchar(45) DEFAULT NULL,
  `product6` varchar(45) DEFAULT NULL,
  `product7` varchar(45) DEFAULT NULL,
  `product8` varchar(45) DEFAULT NULL,
  `codiset_image` varchar(100) DEFAULT NULL,
  `user_id` varchar(45) DEFAULT NULL,
  `tag_theme` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `product1.fk_idx` (`product1`),
  KEY `product.fk2_idx` (`product2`),
  KEY `product.fk3_idx` (`product3`),
  KEY `product.fk4_idx` (`product4`),
  KEY `product.fk5_idx` (`product5`),
  KEY `product.fk6_idx` (`product6`),
  KEY `product.fk7_idx` (`product7`),
  KEY `product.fk8_idx` (`product8`),
  KEY `user_id_idx` (`user_id`),
  KEY `tag_theme.fk_idx` (`tag_theme`),
  CONSTRAINT `codiset_user_id.fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `product.fk1` FOREIGN KEY (`product1`) REFERENCES `all_product` (`product_Name`),
  CONSTRAINT `product.fk2` FOREIGN KEY (`product2`) REFERENCES `all_product` (`product_Name`),
  CONSTRAINT `product.fk3` FOREIGN KEY (`product3`) REFERENCES `all_product` (`product_Name`),
  CONSTRAINT `product.fk4` FOREIGN KEY (`product4`) REFERENCES `all_product` (`product_Name`),
  CONSTRAINT `product.fk5` FOREIGN KEY (`product5`) REFERENCES `all_product` (`product_Name`),
  CONSTRAINT `product.fk6` FOREIGN KEY (`product6`) REFERENCES `all_product` (`product_Name`),
  CONSTRAINT `product.fk7` FOREIGN KEY (`product7`) REFERENCES `all_product` (`product_Name`),
  CONSTRAINT `product.fk8` FOREIGN KEY (`product8`) REFERENCES `all_product` (`product_Name`),
  CONSTRAINT `tag_theme.fk` FOREIGN KEY (`tag_theme`) REFERENCES `tag_theme` (`codi`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `codiset_new`
--

LOCK TABLES `codiset_new` WRITE;
/*!40000 ALTER TABLE `codiset_new` DISABLE KEYS */;
INSERT INTO `codiset_new` VALUES (1,'상의_1','상의_2','하의_1','가방_1','신발_1','악세_1','악세_2',NULL,NULL,'test1','데이트룩');
/*!40000 ALTER TABLE `codiset_new` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `heart`
--

DROP TABLE IF EXISTS `heart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `heart` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` varchar(45) DEFAULT NULL,
  `codiSet_id` int DEFAULT NULL,
  `record_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `user_id.fk_idx` (`user_id`),
  KEY `codiset_id.fk_idx` (`codiSet_id`),
  CONSTRAINT `codiset_id.fk` FOREIGN KEY (`codiSet_id`) REFERENCES `codiset_new` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `user_id.fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `heart`
--

LOCK TABLES `heart` WRITE;
/*!40000 ALTER TABLE `heart` DISABLE KEYS */;
INSERT INTO `heart` VALUES (1,'test1',1,'2022-07-27 02:13:48');
/*!40000 ALTER TABLE `heart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tag_theme`
--

DROP TABLE IF EXISTS `tag_theme`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tag_theme` (
  `codi` varchar(45) NOT NULL,
  `number` int DEFAULT NULL,
  PRIMARY KEY (`codi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tag_theme`
--

LOCK TABLES `tag_theme` WRITE;
/*!40000 ALTER TABLE `tag_theme` DISABLE KEYS */;
INSERT INTO `tag_theme` VALUES ('데이트룩',1),('연습',2);
/*!40000 ALTER TABLE `tag_theme` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `user_ID` varchar(45) NOT NULL,
  `user_Name` varchar(45) NOT NULL,
  `user_Password` varchar(45) NOT NULL,
  `record_Data` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`user_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('binaryho','이진호','king1','2022-07-27 05:48:23'),('dancingmachine','장예림','dance','2022-07-27 05:48:00'),('hundredwinstone','백승석','white','2022-07-27 05:44:25'),('longestho','최장호','master','2022-07-27 05:48:52'),('lossryeong','손혜령','hand0','2022-07-27 05:47:26'),('test1','test1','test','2022-07-27 01:50:22'),('test2','test2','test','2022-07-27 01:50:22'),('test3','test3','test','2022-07-27 01:50:22'),('zerowinstone','영승석','00000','2022-07-27 07:00:05');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'teamproject'
--

--
-- Dumping routines for database 'teamproject'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-27 16:04:01
