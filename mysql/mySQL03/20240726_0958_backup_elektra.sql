-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: elecktra
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `adresses`
--

DROP TABLE IF EXISTS `adresses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `adresses` (
  `address_id` bigint NOT NULL,
  `street` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `zip_code` varchar(45) NOT NULL,
  `fk_user_id` bigint NOT NULL,
  PRIMARY KEY (`address_id`,`fk_user_id`),
  KEY `address_has_user_idx` (`fk_user_id`),
  CONSTRAINT `address_has_user` FOREIGN KEY (`fk_user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adresses`
--

LOCK TABLES `adresses` WRITE;
/*!40000 ALTER TABLE `adresses` DISABLE KEYS */;
/*!40000 ALTER TABLE `adresses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categories`
--

DROP TABLE IF EXISTS `categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categories` (
  `category_id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `description` longtext,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categories`
--

LOCK TABLES `categories` WRITE;
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` VALUES (1,'Deportes','Deportes al aire libre'),(2,'Linea Blanca','Cocina'),(3,'Hogar','Decoracion'),(4,'Moda y accesorios','Joyería'),(5,'Cómputo','Portátiles'),(6,'Herramientas','Plomería');
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `product_id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `price` decimal(8,2) DEFAULT NULL,
  `fk_category_id` bigint NOT NULL,
  PRIMARY KEY (`product_id`),
  KEY `product_has_category_idx` (`fk_category_id`),
  CONSTRAINT `product_has_category` FOREIGN KEY (`fk_category_id`) REFERENCES `categories` (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'Raqueta de tenis',280.00,1),(2,'Microondas',2079.35,2),(3,'Cascada de grifo',359.00,6),(4,'Laptop Gamer HP Victus 15',18999.00,5),(5,'Collar corazones',2295.00,4),(6,'Raqueta',500.00,1),(7,'Tacones GUCCI',1500.00,4),(8,'Lampara de escritorio',900.00,3),(9,'Chamarra Nike',1200.00,4),(10,'Pechera para correr',1000.00,1),(11,'Balón de fútbol',20.99,1),(12,'Juego de sábanas',39.99,3),(13,'Collar de plata',49.99,4),(14,'Balón de Futbol',150.00,1),(15,'Estufa',4500.00,2),(16,'Espejo',1050.00,3),(17,'Laptop',15000.00,5),(18,'Taladro',3000.00,6),(19,'Anillo',500.00,4),(20,'Raqueta de Squash',NULL,1),(21,'Tenis para correr',NULL,1),(22,'Bicicleta rodad 26 pulgadas',NULL,1),(23,'Bicilceta rodada 22 pulgadas',NULL,1);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchase_has_products`
--

DROP TABLE IF EXISTS `purchase_has_products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `purchase_has_products` (
  `purchase_id` bigint NOT NULL,
  `product_id` bigint NOT NULL,
  `quantity` int DEFAULT NULL,
  `purchase_sold` decimal(8,2) DEFAULT NULL,
  PRIMARY KEY (`purchase_id`,`product_id`),
  KEY `fk_purchases_has_products_products1_idx` (`product_id`),
  KEY `fk_purchases_has_products_purchases1_idx` (`purchase_id`),
  CONSTRAINT `fk_purchases_has_products_products1` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`),
  CONSTRAINT `fk_purchases_has_products_purchases1` FOREIGN KEY (`purchase_id`) REFERENCES `purchases` (`purchase_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase_has_products`
--

LOCK TABLES `purchase_has_products` WRITE;
/*!40000 ALTER TABLE `purchase_has_products` DISABLE KEYS */;
INSERT INTO `purchase_has_products` VALUES (1,1,2,560.00),(1,4,1,18999.00),(1,17,1,15000.00),(2,1,3,840.00),(2,2,1,2079.35),(2,5,1,2295.00),(3,3,1,359.00),(3,4,1,18999.00),(3,6,1,500.00),(4,7,2,3000.00),(4,8,1,900.00),(5,9,1,1200.00),(5,10,1,1000.00),(6,11,5,104.95),(6,12,1,39.99),(7,13,2,99.98),(7,14,3,450.00),(8,15,1,4500.00),(8,16,1,1050.00);
/*!40000 ALTER TABLE `purchase_has_products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchases`
--

DROP TABLE IF EXISTS `purchases`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `purchases` (
  `purchase_id` bigint NOT NULL AUTO_INCREMENT,
  `fk_user_id` bigint NOT NULL,
  `purchase_date` timestamp NOT NULL,
  PRIMARY KEY (`purchase_id`),
  KEY `pruchase_has_user_idx` (`fk_user_id`),
  CONSTRAINT `pruchase_has_user` FOREIGN KEY (`fk_user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchases`
--

LOCK TABLES `purchases` WRITE;
/*!40000 ALTER TABLE `purchases` DISABLE KEYS */;
INSERT INTO `purchases` VALUES (1,1,'2024-01-15 16:23:45'),(2,2,'2024-02-20 20:35:12'),(3,3,'2024-03-10 15:12:30'),(4,4,'2024-04-25 22:48:59'),(5,5,'2024-05-17 17:20:05'),(6,6,'2024-06-30 19:15:45'),(7,7,'2024-07-05 23:27:32'),(8,8,'2024-08-22 14:55:11'),(9,9,'2024-09-20 01:42:28'),(10,10,'2024-10-01 13:36:50'),(11,1,'2024-10-15 16:23:45'),(12,2,'2024-11-20 20:35:12'),(13,3,'2024-11-10 15:12:30'),(14,4,'2024-12-25 22:48:59'),(15,5,'2024-12-17 17:20:05');
/*!40000 ALTER TABLE `purchases` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `user_id` bigint NOT NULL AUTO_INCREMENT,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(100) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `telephone` varchar(45) DEFAULT NULL,
  `birthdate` date DEFAULT NULL,
  `password` varchar(100) NOT NULL,
  `avatar` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'María','González','maria.gonzalez@example.com','1234567890','1990-01-15','password123','avatar1.jpg'),(2,'José','Rodríguez','jose.rodriguez@example.com','0987654321','1985-05-20','password456','avatar2.jpg'),(3,'Ana','Martínez','ana.martinez@example.com','1122334455','1992-08-10','password789','avatar3.jpg'),(4,'Carlos','Hernández','carlos.hernandez@example.com','2233445566','1988-11-25','password101','avatar4.jpg'),(5,'Laura','López','laura.lopez@example.com','3344556677','1995-02-17','password202','avatar5.jpg'),(6,'Miguel','Pérez','miguel.perez@example.com','4455667788','1983-06-30','password303','avatar6.jpg'),(7,'Lucía','García','lucia.garcia@example.com','5566778899','1991-12-05','password404','avatar7.jpg'),(8,'Pedro','Sánchez','pedro.sanchez@example.com','6677889900','1989-03-22','password505','avatar8.jpg'),(9,'Carmen','Ramírez','carmen.ramirez@example.com','7788990011','1993-07-14','password606','avatar9.jpg'),(10,'Juan','Flores','juan.flores@example.com','8899001122','1987-10-19','password707','avatar10.jpg'),(11,'Sofía','Torres','sofia.torres@example.com','9900112233','1996-01-28','password808','avatar11.jpg'),(12,'David','Vázquez','david.vazquez@example.com','1234567800','1984-04-05','password909','avatar12.jpg'),(13,'Elena','Castro','elena.castro@example.com','0987654322','1992-09-13','password111','avatar13.jpg'),(14,'Fernando','Ortiz','fernando.ortiz@example.com','1122334466','1986-12-24','password222','avatar14.jpg'),(15,'Isabel','Ruiz','isabel.ruiz@example.com','2233445577','1994-03-01','password333','avatar15.jpg'),(16,'Alberto','Morales','alberto.morales@example.com','3344556688','1989-08-08','password444','avatar16.jpg'),(17,'Patricia','Herrera','patricia.herrera@example.com','4455667799','1991-11-29','password555','avatar17.jpg'),(18,'Sergio','Jiménez','sergio.jimenez@example.com','5566778800','1987-06-18','password666','avatar18.jpg'),(19,'Marta','Reyes','marta.reyes@example.com','6677889911','1990-10-23','password777','avatar19.jpg'),(20,'Luis','Aguilar','luis.aguilar@example.com','7788990022','1985-05-17','password888','avatar20.jpg');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-26  9:58:54
