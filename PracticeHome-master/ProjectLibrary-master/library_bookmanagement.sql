-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: library
-- ------------------------------------------------------
-- Server version	8.0.37

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
-- Table structure for table `bookmanagement`
--

DROP TABLE IF EXISTS `bookmanagement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bookmanagement` (
  `bookcode` varchar(3) NOT NULL COMMENT 'bookcode',
  `bookname` varchar(20) NOT NULL COMMENT 'bookname',
  `bookcategory` varchar(10) NOT NULL COMMENT 'bookcategory',
  `bookauthor` varchar(20) NOT NULL COMMENT 'bookauthor',
  PRIMARY KEY (`bookcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='bookmanagement';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookmanagement`
--

LOCK TABLES `bookmanagement` WRITE;
/*!40000 ALTER TABLE `bookmanagement` DISABLE KEYS */;
INSERT INTO `bookmanagement` VALUES ('B1','해병문학','소설','김해병'),('B2','할MoneyStory','경제','YeongHalMoney'),('B22','집에가자.','시집','깁병갑'),('B3','팀장님은못말려','만화','강연진'),('B4','팀프로젝트는괴로워','만화','김강현'),('B5','자바는어려워','인문','강진영'),('B6','저한테왜그러세요','인문','강연진'),('B7','재미있다놀랍다','사회','삐에로'),('B8','서성한','인문','재수생'),('B9','응계속떨어져봐','사회','개미');
/*!40000 ALTER TABLE `bookmanagement` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-27  9:22:28
