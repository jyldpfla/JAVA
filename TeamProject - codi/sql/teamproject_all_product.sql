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
  `id` int NOT NULL AUTO_INCREMENT,
  `product_Name` varchar(45) DEFAULT NULL,
  `product_Size` varchar(45) DEFAULT NULL,
  `product_Color` varchar(45) DEFAULT NULL,
  `product_Category` int DEFAULT NULL,
  `product_Sub_Category` varchar(45) DEFAULT NULL,
  `product_Image` varchar(100) DEFAULT NULL,
  `product_Season` varchar(45) DEFAULT NULL,
  `record_Data` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `top_Name_UNIQUE` (`product_Name`),
  KEY `category_fk_idx` (`product_Category`),
  CONSTRAINT `category_fk` FOREIGN KEY (`product_Category`) REFERENCES `category` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `all_product`
--

LOCK TABLES `all_product` WRITE;
/*!40000 ALTER TABLE `all_product` DISABLE KEYS */;
INSERT INTO `all_product` VALUES (1,'상의_1',NULL,'white',NULL,'반팔셔츠','\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\상의\\상의1.jpg','22s/s','2022-07-26 02:40:56'),(2,'상의_2',NULL,'white',NULL,'반팔','\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\상의\\상의2.jpg','22s/s','2022-07-26 02:40:56'),(3,'하의_1',NULL,'black',NULL,'데님스커트','\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\하의\\하의1.jpg','22s/s','2022-07-26 02:40:25'),(4,'하의_2',NULL,'black',NULL,'데님스커트','\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\하의\\하의2.jpg','22s/s','2022-07-26 02:40:25'),(5,'가방_1',NULL,'purple',NULL,NULL,'\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\가방\\가방1.jpg','22s/s','2022-07-26 02:43:27'),(6,'가방_2',NULL,'brown',NULL,NULL,'\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\가방\\가방2.jpg','22f/w','2022-07-26 02:43:27'),(7,'신발_1',NULL,'ivory',NULL,NULL,'\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\신발\\신발1.jpg','22s/s','2022-07-26 05:18:22'),(8,'신발_2',NULL,'brown',NULL,NULL,'\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\신발\\신발2.jpg','22s/s','2022-07-26 05:18:22'),(9,'악세_1',NULL,'green',NULL,'목걸이','\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\악세사리\\목걸이1.jpg','22s/s','2022-07-26 02:40:25'),(10,'악세_2',NULL,'sliver',NULL,'목걸이','\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\악세사리\\목걸이2.jpg','22s/s','2022-07-26 02:40:25');
/*!40000 ALTER TABLE `all_product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-26 16:11:27
