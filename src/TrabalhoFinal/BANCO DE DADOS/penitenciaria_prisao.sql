CREATE DATABASE  IF NOT EXISTS `penitenciaria` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `penitenciaria`;
-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: penitenciaria
-- ------------------------------------------------------
-- Server version	9.2.0

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
-- Table structure for table `prisao`
--

DROP TABLE IF EXISTS `prisao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prisao` (
  `id_preso` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `cpf` varchar(45) NOT NULL,
  `data_nascimento` varchar(45) NOT NULL,
  `filiacao` varchar(45) NOT NULL,
  `naturalidade` varchar(45) NOT NULL,
  `cor` varchar(45) NOT NULL,
  `data_prisao` varchar(45) NOT NULL,
  `pena_anos` varchar(45) NOT NULL,
  `cela_id` varchar(45) NOT NULL,
  PRIMARY KEY (`id_preso`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prisao`
--

LOCK TABLES `prisao` WRITE;
/*!40000 ALTER TABLE `prisao` DISABLE KEYS */;
INSERT INTO `prisao` VALUES (1,'andre viado','333333333','1999','bino','dsadas','dsad','asdsa','das','2'),(7,'dioguera','132132131','2004','sirlei do grau','pimentense','europeu','hoje tbm','muito tempo','7'),(8,'diogo`','123123123','04/03/2004','joao','pimenta','branco','05/06/2025','10 anos','2'),(9,'diogo','13213213','04/03/2005','joao','pimenta','branco','04/09/2008','12 anos','6'),(10,'diogo','14182721731','04/03/2004','joao','pimenta','branco','04/02/2015','15 anos','5'),(11,'fhgdhygfh','trgfdsxv','trgfc','trgf','rfghcnv','rtegfhjk','trgfhjk','retsfgdhjk','4');
/*!40000 ALTER TABLE `prisao` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-06-15 16:45:56
