-- MySQL dump 10.13  Distrib 5.7.25, for Win64 (x86_64)
--
-- Host: localhost    Database: d_blog
-- ------------------------------------------------------
-- Server version	5.7.25

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `t_article`
--

DROP TABLE IF EXISTS `t_article`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_article` (
  `article_id` int(11) NOT NULL AUTO_INCREMENT,
  `article_title` varchar(50) NOT NULL,
  `article_info` mediumtext NOT NULL,
  `article_createTime` date NOT NULL,
  `article_state` int(1) NOT NULL,
  `user_id` int(11) NOT NULL,
  `target_id` int(11) NOT NULL,
  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_article`
--

LOCK TABLES `t_article` WRITE;
/*!40000 ALTER TABLE `t_article` DISABLE KEYS */;
INSERT INTO `t_article` VALUES (1,'SSM项目整合','这是一个继承多框架的项目','2020-02-16',0,1,2),(2,'SSM项目整合','这是一个继承多框架的项目','2020-02-16',0,1,3),(3,'SSM项目整合','这是一个继承多框架的项目','2020-02-04',0,1,2),(4,'SSM项目整合','这是一个继承多框架的项目','2020-02-04',0,1,2),(8,'SSM项目整合','这是一个继承多框架的项目','2020-02-04',0,1,3),(13,'SSM项目整合','SSM项目整合','2020-02-04',0,1,2),(14,'SSM项目整合','SSM项目整合','2020-02-04',0,1,2),(17,'SSM项目整合','SSM项目整合','2020-02-04',0,1,2),(18,'asdsa','<p>dsadsa</p>\n','2020-02-21',0,1,3),(48,'sadasd','<p>sadasd</p>\n','2020-02-21',0,1,4);
/*!40000 ALTER TABLE `t_article` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_link`
--

DROP TABLE IF EXISTS `t_link`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_link` (
  `link_id` varchar(50) NOT NULL,
  `link_describe` varchar(100) NOT NULL,
  `link_address` varchar(100) NOT NULL,
  `link_createTime` date NOT NULL,
  `link_name` varchar(50) NOT NULL,
  PRIMARY KEY (`link_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_link`
--

LOCK TABLES `t_link` WRITE;
/*!40000 ALTER TABLE `t_link` DISABLE KEYS */;
INSERT INTO `t_link` VALUES ('11f8e954-ebd5-4d90-b60c-bba723139a70','http://localhost:8080/admin/index','http://localhost:8080/admin/index','2020-02-21','http://localhost:8080/admin/index'),('1c13cc14-7c38-444a-b44a-169993e2f203','min/index ttp://localhost:8080/admin/index','min/index ttp://localhost:8080/admin/index','2020-02-21','min/index ttp://localhost:8080/admin/index'),('28422a18-f928-4830-be9a-e81b1e9af32a','ttp://localhost:8080/admin/index','ttp://localhost:8080/admin/index','2020-02-21','ttp://localhost:8080/admin/index'),('41da4560-0e8a-4bc8-8c5d-70d0587a8fd3','基于前后分离的shiro','https://www.baidu.com/s','2020-02-19','SSM框架整合'),('538cf89b-db7e-407a-96ca-bf1fe0a706c5','ttp://localhost:8080/admin/index','ttp://localhost:8080/admin/index','2020-02-21','ttp://localhost:8080/admin/index'),('570ae07b-b831-4bb4-81e3-9ee3d09bb5cd','ttp://localhost:8080/admin/index','ttp://localhost:8080/admin/index','2020-02-21','ttp://localhost:8080/admin/index'),('5b74f2a5-0b28-4e54-ac69-1205a08e8539',':current-page=\"page.currentPage\"',':current-page=\"page.currentPage\"','2020-02-21',':current-page=\"page.currentPage\"'),('7e5779de-91d3-4017-888a-9e75471f4b4a','https://www.baidu.com/s','https://www.baidu.com/s','2020-02-21','https://www.baidu.com/s'),('82ef2a4a-80fe-406c-ac06-8b7d0256a6b3','http://localhost:8080/4-1','http://localhost:8080/4-1','2020-02-21','http://localhost:8080/4-1'),('88b10cfa-5747-40ef-8781-eda19b92c5ef',':current-page=\"page.currentPage\"',':current-page=\"page.currentPage\"','2020-02-21',':current-page=\"page.currentPage\"');
/*!40000 ALTER TABLE `t_link` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_photo`
--

DROP TABLE IF EXISTS `t_photo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_photo` (
  `photo_id` varchar(100) NOT NULL,
  `photo_Name` varchar(100) NOT NULL,
  `photo_createTime` date NOT NULL,
  PRIMARY KEY (`photo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_photo`
--

LOCK TABLES `t_photo` WRITE;
/*!40000 ALTER TABLE `t_photo` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_photo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_photo_user`
--

DROP TABLE IF EXISTS `t_photo_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_photo_user` (
  `photo_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`photo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_photo_user`
--

LOCK TABLES `t_photo_user` WRITE;
/*!40000 ALTER TABLE `t_photo_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_photo_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_prim`
--

DROP TABLE IF EXISTS `t_prim`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_prim` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `primission` varchar(50) NOT NULL,
  `create_time` date NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `primission` (`primission`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_prim`
--

LOCK TABLES `t_prim` WRITE;
/*!40000 ALTER TABLE `t_prim` DISABLE KEYS */;
INSERT INTO `t_prim` VALUES (1,'boss:*','2020-02-10'),(2,'manager:query,manager:select','2020-02-15');
/*!40000 ALTER TABLE `t_prim` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_role`
--

DROP TABLE IF EXISTS `t_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(50) NOT NULL,
  `create_time` date NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `role_name` (`role_name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_role`
--

LOCK TABLES `t_role` WRITE;
/*!40000 ALTER TABLE `t_role` DISABLE KEYS */;
INSERT INTO `t_role` VALUES (1,'boss','2020-02-10'),(2,'manager','2020-02-15');
/*!40000 ALTER TABLE `t_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_role_prim`
--

DROP TABLE IF EXISTS `t_role_prim`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_role_prim` (
  `role_id` int(11) NOT NULL,
  `prim_id` int(11) NOT NULL,
  PRIMARY KEY (`prim_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_role_prim`
--

LOCK TABLES `t_role_prim` WRITE;
/*!40000 ALTER TABLE `t_role_prim` DISABLE KEYS */;
INSERT INTO `t_role_prim` VALUES (1,1),(1,2),(2,2);
/*!40000 ALTER TABLE `t_role_prim` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_target`
--

DROP TABLE IF EXISTS `t_target`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_target` (
  `target_id` int(11) NOT NULL AUTO_INCREMENT,
  `target_name` varchar(30) NOT NULL,
  `target_createTime` date NOT NULL,
  PRIMARY KEY (`target_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_target`
--

LOCK TABLES `t_target` WRITE;
/*!40000 ALTER TABLE `t_target` DISABLE KEYS */;
INSERT INTO `t_target` VALUES (2,'SSM整合','2020-02-20'),(3,'多线程基础','2020-02-20'),(4,'多线程进阶','2020-02-20'),(5,'Map基础','2020-02-21'),(6,'刁刁','2020-02-21'),(7,'别人','2020-02-21'),(8,'测试','2020-02-22');
/*!40000 ALTER TABLE `t_target` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_user`
--

DROP TABLE IF EXISTS `t_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_user`
--

LOCK TABLES `t_user` WRITE;
/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;
INSERT INTO `t_user` VALUES (1,'diao','v9UrN4r0mE+hJrBCzI2qeQ=='),(2,'admin','123456'),(3,'hanxue','789'),(4,'diaohongguang','Cl/oDq772tba1l5XYiOOgw=='),(5,'刁宏广','eSth9C52kbrHiUMFJQFovQ==');
/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_user_link`
--

DROP TABLE IF EXISTS `t_user_link`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_user_link` (
  `link_id` varchar(50) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`link_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_user_link`
--

LOCK TABLES `t_user_link` WRITE;
/*!40000 ALTER TABLE `t_user_link` DISABLE KEYS */;
INSERT INTO `t_user_link` VALUES ('11f8e954-ebd5-4d90-b60c-bba723139a70',1),('1c13cc14-7c38-444a-b44a-169993e2f203',1),('28422a18-f928-4830-be9a-e81b1e9af32a',1),('41da4560-0e8a-4bc8-8c5d-70d0587a8fd3',1),('538cf89b-db7e-407a-96ca-bf1fe0a706c5',1),('570ae07b-b831-4bb4-81e3-9ee3d09bb5cd',1),('5b74f2a5-0b28-4e54-ac69-1205a08e8539',1),('7e5779de-91d3-4017-888a-9e75471f4b4a',1),('82ef2a4a-80fe-406c-ac06-8b7d0256a6b3',1),('88b10cfa-5747-40ef-8781-eda19b92c5ef',1),('8fd794fb-8e90-48e2-8f95-3cf237004266',1);
/*!40000 ALTER TABLE `t_user_link` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_user_role`
--

DROP TABLE IF EXISTS `t_user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_user_role` (
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_user_role`
--

LOCK TABLES `t_user_role` WRITE;
/*!40000 ALTER TABLE `t_user_role` DISABLE KEYS */;
INSERT INTO `t_user_role` VALUES (1,1),(1,2),(2,2),(5,1);
/*!40000 ALTER TABLE `t_user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_user_target`
--

DROP TABLE IF EXISTS `t_user_target`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_user_target` (
  `user_id` int(11) NOT NULL,
  `target_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`target_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_user_target`
--

LOCK TABLES `t_user_target` WRITE;
/*!40000 ALTER TABLE `t_user_target` DISABLE KEYS */;
INSERT INTO `t_user_target` VALUES (1,2),(1,3),(1,4),(1,5),(1,6),(1,7),(1,8);
/*!40000 ALTER TABLE `t_user_target` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-24 21:40:33
