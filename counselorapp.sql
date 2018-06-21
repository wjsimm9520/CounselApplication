-- MySQL dump 10.13  Distrib 5.5.20, for Win32 (x86)
--
-- Host: localhost    Database: seniorproject
-- ------------------------------------------------------
-- Server version	5.5.20

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
-- Table structure for table `basic_information`
--

DROP TABLE IF EXISTS `basic_information`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `basic_information` (
  `Case_Number` int(10) unsigned NOT NULL,
  `Entry_Date` date NOT NULL,
  `Date_of_Intake` date NOT NULL,
  `Participants_Name` varchar(30) NOT NULL,
  `Date_of_Birth` date NOT NULL,
  `Age` smallint(5) unsigned NOT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `Phone_Number` varchar(20) DEFAULT NULL,
  `Legal_Charge` varchar(150) NOT NULL,
  `Employer_Name` varchar(30) DEFAULT NULL,
  `Employer_Phone` varchar(30) DEFAULT NULL,
  `Contact_Name` varchar(30) DEFAULT NULL,
  `Residential_Treatment` enum('Yes','No') NOT NULL,
  PRIMARY KEY (`Case_Number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `basic_information`
--

LOCK TABLES `basic_information` WRITE;
/*!40000 ALTER TABLE `basic_information` DISABLE KEYS */;
INSERT INTO `basic_information` VALUES (12345,'2012-01-07','2012-01-14','Joe Walter Black','1978-08-05',33,'5555 Oak Road','555-555-2349','Drug Posseession','Self Employed','555-555-2349','Joe Walter Black','No'),(78923,'2012-03-01','2012-03-06','Joe Somebody','1970-05-25',42,'1236 Main Street','555-555-6398','Drug Possession','CVS Pharmacy','555-555-7426','Mr. White','Yes');
/*!40000 ALTER TABLE `basic_information` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `counselor_login`
--

DROP TABLE IF EXISTS `counselor_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `counselor_login` (
  `UserName` varchar(30) NOT NULL,
  `UserPassword` varchar(64) NOT NULL,
  PRIMARY KEY (`UserName`,`UserPassword`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `counselor_login`
--

LOCK TABLES `counselor_login` WRITE;
/*!40000 ALTER TABLE `counselor_login` DISABLE KEYS */;
INSERT INTO `counselor_login` VALUES ('User1','e91b3dd87261de5d31a93bc4428fdb2c');
/*!40000 ALTER TABLE `counselor_login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `court_login`
--

DROP TABLE IF EXISTS `court_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `court_login` (
  `UserName` varchar(30) NOT NULL,
  `UserPassword` varchar(64) NOT NULL,
  PRIMARY KEY (`UserName`,`UserPassword`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `court_login`
--

LOCK TABLES `court_login` WRITE;
/*!40000 ALTER TABLE `court_login` DISABLE KEYS */;
INSERT INTO `court_login` VALUES ('User1','e91b3dd87261de5d31a93bc4428fdb2c');
/*!40000 ALTER TABLE `court_login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `court_reviews`
--

DROP TABLE IF EXISTS `court_reviews`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `court_reviews` (
  `Court_Appearance` date NOT NULL,
  `Review_Date` date NOT NULL,
  `Case_Number` int(11) NOT NULL,
  `Candidates_Name` varchar(50) NOT NULL,
  `Candidates_Birth_Date` date NOT NULL,
  `Acceptance` enum('Yes','No') NOT NULL,
  `Reason` text NOT NULL,
  PRIMARY KEY (`Case_Number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `court_reviews`
--

LOCK TABLES `court_reviews` WRITE;
/*!40000 ALTER TABLE `court_reviews` DISABLE KEYS */;
INSERT INTO `court_reviews` VALUES ('2011-12-01','2011-12-20',12345,'Joe Walter Black','1978-08-05','Yes','First Offence and plead guilty'),('2012-01-06','2012-02-01',45689,'Jane Doe','1965-09-05','Yes','First offence and pleaded no contest'),('2012-06-06','2012-06-13',65789,'Will Waters','1962-08-25','Yes','First time offender'),('2011-09-16','2011-10-01',75346,'Jon Doe','1975-09-25','No','Second offence and plead guilty'),('2012-02-03','2012-02-20',78923,'Joe Somebody','1970-05-25','No','Prior drug charges');
/*!40000 ALTER TABLE `court_reviews` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cultural_resources1`
--

DROP TABLE IF EXISTS `cultural_resources1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cultural_resources1` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `Discuss_hobbies` tinyint(4) NOT NULL,
  `Volunteer_Work` tinyint(4) NOT NULL,
  `Cultural_Events` tinyint(4) NOT NULL,
  `Important_Connts` tinyint(4) NOT NULL,
  `College_Educated` tinyint(4) NOT NULL,
  `Library_Use` tinyint(4) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cultural_resources1`
--

LOCK TABLES `cultural_resources1` WRITE;
/*!40000 ALTER TABLE `cultural_resources1` DISABLE KEYS */;
INSERT INTO `cultural_resources1` VALUES ('Joe Walter Black','1978-08-05','local bar',6,4,8,3,10,5);
/*!40000 ALTER TABLE `cultural_resources1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cultural_resources2`
--

DROP TABLE IF EXISTS `cultural_resources2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cultural_resources2` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `Discuss_hobbies` tinyint(4) NOT NULL,
  `Volunteer_Work` tinyint(4) NOT NULL,
  `Cultural_Events` tinyint(4) NOT NULL,
  `Important_Connts` tinyint(4) NOT NULL,
  `College_Educated` tinyint(4) NOT NULL,
  `Library_Use` tinyint(4) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cultural_resources2`
--

LOCK TABLES `cultural_resources2` WRITE;
/*!40000 ALTER TABLE `cultural_resources2` DISABLE KEYS */;
/*!40000 ALTER TABLE `cultural_resources2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cultural_resources3`
--

DROP TABLE IF EXISTS `cultural_resources3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cultural_resources3` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `Discuss_hobbies` tinyint(4) NOT NULL,
  `Volunteer_Work` tinyint(4) NOT NULL,
  `Cultural_Events` tinyint(4) NOT NULL,
  `Important_Connts` tinyint(4) NOT NULL,
  `College_Educated` tinyint(4) NOT NULL,
  `Library_Use` tinyint(4) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cultural_resources3`
--

LOCK TABLES `cultural_resources3` WRITE;
/*!40000 ALTER TABLE `cultural_resources3` DISABLE KEYS */;
/*!40000 ALTER TABLE `cultural_resources3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cultural_resources4`
--

DROP TABLE IF EXISTS `cultural_resources4`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cultural_resources4` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `Discuss_hobbies` tinyint(4) NOT NULL,
  `Volunteer_Work` tinyint(4) NOT NULL,
  `Cultural_Events` tinyint(4) NOT NULL,
  `Important_Connts` tinyint(4) NOT NULL,
  `College_Educated` tinyint(4) NOT NULL,
  `Library_Use` tinyint(4) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cultural_resources4`
--

LOCK TABLES `cultural_resources4` WRITE;
/*!40000 ALTER TABLE `cultural_resources4` DISABLE KEYS */;
/*!40000 ALTER TABLE `cultural_resources4` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cultural_resources5`
--

DROP TABLE IF EXISTS `cultural_resources5`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cultural_resources5` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `Discuss_hobbies` tinyint(4) NOT NULL,
  `Volunteer_Work` tinyint(4) NOT NULL,
  `Cultural_Events` tinyint(4) NOT NULL,
  `Important_Connts` tinyint(4) NOT NULL,
  `College_Educated` tinyint(4) NOT NULL,
  `Library_Use` tinyint(4) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cultural_resources5`
--

LOCK TABLES `cultural_resources5` WRITE;
/*!40000 ALTER TABLE `cultural_resources5` DISABLE KEYS */;
/*!40000 ALTER TABLE `cultural_resources5` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dast`
--

DROP TABLE IF EXISTS `dast`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dast` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Test_Date` date NOT NULL,
  `Test_Score` int(11) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dast`
--

LOCK TABLES `dast` WRITE;
/*!40000 ALTER TABLE `dast` DISABLE KEYS */;
/*!40000 ALTER TABLE `dast` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `demographics`
--

DROP TABLE IF EXISTS `demographics`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `demographics` (
  `Entry_Date` date DEFAULT NULL,
  `Case_Number` int(11) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Drugs_Used` text NOT NULL,
  `Other_Drug` varchar(100) DEFAULT NULL,
  `Age_Drug_First` int(11) DEFAULT NULL,
  `Age_Regular_Drug` int(11) DEFAULT NULL,
  `Age_Alcohol_First` int(11) DEFAULT NULL,
  `Age_Regular_Alcohol` int(11) DEFAULT NULL,
  `Mental_Treatment` enum('No','Yes') NOT NULL,
  `Drug_Treatment` enum('NO','Yes') NOT NULL,
  `Drug_Free_Babies` int(11) DEFAULT NULL,
  `Children` enum('Yes','No') NOT NULL,
  `Age_of_Child` text,
  `Gender` enum('Male','Female','Other') NOT NULL,
  `Ethnicity` enum('Hispanic/Latino','American Indain','Asian','Black/African American','White/Caucasian','Other') NOT NULL,
  `Parental_Rights` enum('No','Yes') NOT NULL,
  `Formal_Education` enum('None','Elementary','Middle-Junior High','Some High School no Diploma','High School Diploma or Equivalent','Some College no Degree','Associate Degree','Bachelor Degree','Graduate or Professional Degree','Certificate Program','Other') NOT NULL,
  `Other_Education` varchar(50) DEFAULT NULL,
  `Sources_Income` text NOT NULL,
  `Prior_Convictions` enum('Yes','No') NOT NULL,
  `Explain_Convictions` text,
  `Amount_Convictions` enum('0','1','2','3','4','more than 4') NOT NULL,
  `Parental_Rights_Taken` enum('No','Yes') NOT NULL,
  PRIMARY KEY (`Case_Number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `demographics`
--

LOCK TABLES `demographics` WRITE;
/*!40000 ALTER TABLE `demographics` DISABLE KEYS */;
/*!40000 ALTER TABLE `demographics` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emotional_resources1`
--

DROP TABLE IF EXISTS `emotional_resources1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `emotional_resources1` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `Discussing_Problems` tinyint(4) NOT NULL,
  `Honesty_in_Group` tinyint(4) NOT NULL,
  `Criticism_in_Group` tinyint(4) NOT NULL,
  `Emotional_GroupMmber` tinyint(4) NOT NULL,
  `Trust_GroupMmber` tinyint(4) NOT NULL,
  `Accept_Faults` tinyint(4) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emotional_resources1`
--

LOCK TABLES `emotional_resources1` WRITE;
/*!40000 ALTER TABLE `emotional_resources1` DISABLE KEYS */;
INSERT INTO `emotional_resources1` VALUES ('Joe Walter Black','1978-08-05','local bar',4,8,4,7,7,8);
/*!40000 ALTER TABLE `emotional_resources1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emotional_resources2`
--

DROP TABLE IF EXISTS `emotional_resources2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `emotional_resources2` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `Discussing_Problems` tinyint(4) NOT NULL,
  `Honesty_in_Group` tinyint(4) NOT NULL,
  `Criticism_in_Group` tinyint(4) NOT NULL,
  `Emotional_GroupMmber` tinyint(4) NOT NULL,
  `Trust_GroupMmber` tinyint(4) NOT NULL,
  `Accept_Faults` tinyint(4) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emotional_resources2`
--

LOCK TABLES `emotional_resources2` WRITE;
/*!40000 ALTER TABLE `emotional_resources2` DISABLE KEYS */;
/*!40000 ALTER TABLE `emotional_resources2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emotional_resources3`
--

DROP TABLE IF EXISTS `emotional_resources3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `emotional_resources3` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `Discussing_Problems` tinyint(4) NOT NULL,
  `Honesty_in_Group` tinyint(4) NOT NULL,
  `Criticism_in_Group` tinyint(4) NOT NULL,
  `Emotional_GroupMmber` tinyint(4) NOT NULL,
  `Trust_GroupMmber` tinyint(4) NOT NULL,
  `Accept_Faults` tinyint(4) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emotional_resources3`
--

LOCK TABLES `emotional_resources3` WRITE;
/*!40000 ALTER TABLE `emotional_resources3` DISABLE KEYS */;
/*!40000 ALTER TABLE `emotional_resources3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emotional_resources4`
--

DROP TABLE IF EXISTS `emotional_resources4`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `emotional_resources4` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `Discussing_Problems` tinyint(4) NOT NULL,
  `Honesty_in_Group` tinyint(4) NOT NULL,
  `Criticism_in_Group` tinyint(4) NOT NULL,
  `Emotional_GroupMmber` tinyint(4) NOT NULL,
  `Trust_GroupMmber` tinyint(4) NOT NULL,
  `Accept_Faults` tinyint(4) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emotional_resources4`
--

LOCK TABLES `emotional_resources4` WRITE;
/*!40000 ALTER TABLE `emotional_resources4` DISABLE KEYS */;
/*!40000 ALTER TABLE `emotional_resources4` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emotional_resources5`
--

DROP TABLE IF EXISTS `emotional_resources5`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `emotional_resources5` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `Discussing_Problems` tinyint(4) NOT NULL,
  `Honesty_in_Group` tinyint(4) NOT NULL,
  `Criticism_in_Group` tinyint(4) NOT NULL,
  `Emotional_GroupMmber` tinyint(4) NOT NULL,
  `Trust_GroupMmber` tinyint(4) NOT NULL,
  `Accept_Faults` tinyint(4) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emotional_resources5`
--

LOCK TABLES `emotional_resources5` WRITE;
/*!40000 ALTER TABLE `emotional_resources5` DISABLE KEYS */;
/*!40000 ALTER TABLE `emotional_resources5` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `financial_resources1`
--

DROP TABLE IF EXISTS `financial_resources1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `financial_resources1` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `Lend_Money` tinyint(4) NOT NULL,
  `Lend_Car` tinyint(4) NOT NULL,
  `Live_With` tinyint(4) NOT NULL,
  `Legal_Advice_LoCost` tinyint(4) NOT NULL,
  `Help_Pay_Bills` tinyint(4) NOT NULL,
  `Help_Child_Care` tinyint(4) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `financial_resources1`
--

LOCK TABLES `financial_resources1` WRITE;
/*!40000 ALTER TABLE `financial_resources1` DISABLE KEYS */;
INSERT INTO `financial_resources1` VALUES ('Joe Walter Black','1978-08-05','local bar',7,5,9,5,7,8);
/*!40000 ALTER TABLE `financial_resources1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `financial_resources2`
--

DROP TABLE IF EXISTS `financial_resources2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `financial_resources2` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `Lend_Money` tinyint(4) NOT NULL,
  `Lend_Car` tinyint(4) NOT NULL,
  `Live_With` tinyint(4) NOT NULL,
  `Legal_Advice_LoCost` tinyint(4) NOT NULL,
  `Help_Pay_Bills` tinyint(4) NOT NULL,
  `Help_Child_Care` tinyint(4) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `financial_resources2`
--

LOCK TABLES `financial_resources2` WRITE;
/*!40000 ALTER TABLE `financial_resources2` DISABLE KEYS */;
/*!40000 ALTER TABLE `financial_resources2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `financial_resources3`
--

DROP TABLE IF EXISTS `financial_resources3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `financial_resources3` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `Lend_Money` tinyint(4) NOT NULL,
  `Lend_Car` tinyint(4) NOT NULL,
  `Live_With` tinyint(4) NOT NULL,
  `Legal_Advice_LoCost` tinyint(4) NOT NULL,
  `Help_Pay_Bills` tinyint(4) NOT NULL,
  `Help_Child_Care` tinyint(4) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `financial_resources3`
--

LOCK TABLES `financial_resources3` WRITE;
/*!40000 ALTER TABLE `financial_resources3` DISABLE KEYS */;
/*!40000 ALTER TABLE `financial_resources3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `financial_resources4`
--

DROP TABLE IF EXISTS `financial_resources4`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `financial_resources4` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `Lend_Money` tinyint(4) NOT NULL,
  `Lend_Car` tinyint(4) NOT NULL,
  `Live_With` tinyint(4) NOT NULL,
  `Legal_Advice_LoCost` tinyint(4) NOT NULL,
  `Help_Pay_Bills` tinyint(4) NOT NULL,
  `Help_Child_Care` tinyint(4) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `financial_resources4`
--

LOCK TABLES `financial_resources4` WRITE;
/*!40000 ALTER TABLE `financial_resources4` DISABLE KEYS */;
/*!40000 ALTER TABLE `financial_resources4` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `financial_resources5`
--

DROP TABLE IF EXISTS `financial_resources5`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `financial_resources5` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `Lend_Money` tinyint(4) NOT NULL,
  `Lend_Car` tinyint(4) NOT NULL,
  `Live_With` tinyint(4) NOT NULL,
  `Legal_Advice_LoCost` tinyint(4) NOT NULL,
  `Help_Pay_Bills` tinyint(4) NOT NULL,
  `Help_Child_Care` tinyint(4) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `financial_resources5`
--

LOCK TABLES `financial_resources5` WRITE;
/*!40000 ALTER TABLE `financial_resources5` DISABLE KEYS */;
/*!40000 ALTER TABLE `financial_resources5` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `group_drug_habits1`
--

DROP TABLE IF EXISTS `group_drug_habits1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `group_drug_habits1` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `Arrives_Drunk_High` tinyint(4) NOT NULL,
  `Drug_Dealers_OutsideGr` tinyint(4) NOT NULL,
  `Recr_Drug_Use` tinyint(4) NOT NULL,
  `Party_Exces_Drink` tinyint(4) NOT NULL,
  `Unwind_With_Drug` tinyint(4) NOT NULL,
  `DUI_InGroup` tinyint(4) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `group_drug_habits1`
--

LOCK TABLES `group_drug_habits1` WRITE;
/*!40000 ALTER TABLE `group_drug_habits1` DISABLE KEYS */;
INSERT INTO `group_drug_habits1` VALUES ('Joe Walter Black','1978-08-05','local bar',4,10,6,5,7,6);
/*!40000 ALTER TABLE `group_drug_habits1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `group_drug_habits2`
--

DROP TABLE IF EXISTS `group_drug_habits2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `group_drug_habits2` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `Arrives_Drunk_High` tinyint(4) NOT NULL,
  `Drug_Dealers_OutsideGr` tinyint(4) NOT NULL,
  `Recr_Drug_Use` tinyint(4) NOT NULL,
  `Party_Exces_Drink` tinyint(4) NOT NULL,
  `Unwind_With_Drug` tinyint(4) NOT NULL,
  `DUI_InGroup` tinyint(4) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `group_drug_habits2`
--

LOCK TABLES `group_drug_habits2` WRITE;
/*!40000 ALTER TABLE `group_drug_habits2` DISABLE KEYS */;
/*!40000 ALTER TABLE `group_drug_habits2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `group_drug_habits3`
--

DROP TABLE IF EXISTS `group_drug_habits3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `group_drug_habits3` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `Arrives_Drunk_High` tinyint(4) NOT NULL,
  `Drug_Dealers_OutsideGr` tinyint(4) NOT NULL,
  `Recr_Drug_Use` tinyint(4) NOT NULL,
  `Party_Exces_Drink` tinyint(4) NOT NULL,
  `Unwind_With_Drug` tinyint(4) NOT NULL,
  `DUI_InGroup` tinyint(4) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `group_drug_habits3`
--

LOCK TABLES `group_drug_habits3` WRITE;
/*!40000 ALTER TABLE `group_drug_habits3` DISABLE KEYS */;
/*!40000 ALTER TABLE `group_drug_habits3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `group_drug_habits4`
--

DROP TABLE IF EXISTS `group_drug_habits4`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `group_drug_habits4` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `Arrives_Drunk_High` tinyint(4) NOT NULL,
  `Drug_Dealers_OutsideGr` tinyint(4) NOT NULL,
  `Recr_Drug_Use` tinyint(4) NOT NULL,
  `Party_Exces_Drink` tinyint(4) NOT NULL,
  `Unwind_With_Drug` tinyint(4) NOT NULL,
  `DUI_InGroup` tinyint(4) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `group_drug_habits4`
--

LOCK TABLES `group_drug_habits4` WRITE;
/*!40000 ALTER TABLE `group_drug_habits4` DISABLE KEYS */;
/*!40000 ALTER TABLE `group_drug_habits4` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `group_drug_habits5`
--

DROP TABLE IF EXISTS `group_drug_habits5`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `group_drug_habits5` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `Arrives_Drunk_High` tinyint(4) NOT NULL,
  `Drug_Dealers_OutsideGr` tinyint(4) NOT NULL,
  `Recr_Drug_Use` tinyint(4) NOT NULL,
  `Party_Exces_Drink` tinyint(4) NOT NULL,
  `Unwind_With_Drug` tinyint(4) NOT NULL,
  `DUI_InGroup` tinyint(4) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `group_drug_habits5`
--

LOCK TABLES `group_drug_habits5` WRITE;
/*!40000 ALTER TABLE `group_drug_habits5` DISABLE KEYS */;
/*!40000 ALTER TABLE `group_drug_habits5` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `groups_that_help`
--

DROP TABLE IF EXISTS `groups_that_help`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `groups_that_help` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `First_Group` text NOT NULL,
  `Second_Group` text NOT NULL,
  `Third_Group` text NOT NULL,
  `Fourth_Group` text NOT NULL,
  `Fifth_Group` text NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `groups_that_help`
--

LOCK TABLES `groups_that_help` WRITE;
/*!40000 ALTER TABLE `groups_that_help` DISABLE KEYS */;
INSERT INTO `groups_that_help` VALUES ('Joe Walter Black','1978-08-05','family','drug court treatment team','drug court participants','church','buddies to play music with');
/*!40000 ALTER TABLE `groups_that_help` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `groups_to_hangout`
--

DROP TABLE IF EXISTS `groups_to_hangout`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `groups_to_hangout` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `First_Group` text NOT NULL,
  `Second_Group` text NOT NULL,
  `Third_Group` text NOT NULL,
  `Fourth_Group` text NOT NULL,
  `Fifth_Group` text NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `groups_to_hangout`
--

LOCK TABLES `groups_to_hangout` WRITE;
/*!40000 ALTER TABLE `groups_to_hangout` DISABLE KEYS */;
INSERT INTO `groups_to_hangout` VALUES ('Joe Walter Black','1978-08-05','local bar','informal gatherings','hunting buddies','fishing buddies','salon friends');
/*!40000 ALTER TABLE `groups_to_hangout` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mast`
--

DROP TABLE IF EXISTS `mast`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mast` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Test_Date` date NOT NULL,
  `Test_Score` int(11) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mast`
--

LOCK TABLES `mast` WRITE;
/*!40000 ALTER TABLE `mast` DISABLE KEYS */;
/*!40000 ALTER TABLE `mast` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `network_activities1`
--

DROP TABLE IF EXISTS `network_activities1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `network_activities1` (
  `Counselor_Name` varchar(30) NOT NULL,
  `Participant_Name` varchar(30) NOT NULL,
  `Participants_Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `Group_Activities` text,
  `You_and_Group` text,
  `drug_use` tinyint(4) NOT NULL,
  `friend_drug_use` tinyint(4) NOT NULL,
  PRIMARY KEY (`Participant_Name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `network_activities1`
--

LOCK TABLES `network_activities1` WRITE;
/*!40000 ALTER TABLE `network_activities1` DISABLE KEYS */;
/*!40000 ALTER TABLE `network_activities1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `network_activities2`
--

DROP TABLE IF EXISTS `network_activities2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `network_activities2` (
  `Counselor_Name` varchar(30) NOT NULL,
  `Participant_Name` varchar(30) NOT NULL,
  `Participants_Birth_Date` date NOT NULL,
  `Main_Group` text,
  `Group_Activities` text,
  `You_and_Group` text,
  `drug_use` tinyint(4) NOT NULL,
  `friend_drug_use` tinyint(4) NOT NULL,
  PRIMARY KEY (`Participant_Name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `network_activities2`
--

LOCK TABLES `network_activities2` WRITE;
/*!40000 ALTER TABLE `network_activities2` DISABLE KEYS */;
/*!40000 ALTER TABLE `network_activities2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `network_activities3`
--

DROP TABLE IF EXISTS `network_activities3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `network_activities3` (
  `Counselor_Name` varchar(30) NOT NULL,
  `Participant_Name` varchar(30) NOT NULL,
  `Participants_Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `Group_Activities` text,
  `You_and_Group` text,
  `drug_use` tinyint(4) NOT NULL,
  `friend_drug_use` tinyint(4) NOT NULL,
  PRIMARY KEY (`Participant_Name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `network_activities3`
--

LOCK TABLES `network_activities3` WRITE;
/*!40000 ALTER TABLE `network_activities3` DISABLE KEYS */;
/*!40000 ALTER TABLE `network_activities3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `network_activities4`
--

DROP TABLE IF EXISTS `network_activities4`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `network_activities4` (
  `Counselor_Name` varchar(30) NOT NULL,
  `Participant_Name` varchar(30) NOT NULL,
  `Participants_Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `Group_Activities` text,
  `You_and_Group` text,
  `drug_use` tinyint(4) NOT NULL,
  `friend_drug_use` tinyint(4) NOT NULL,
  PRIMARY KEY (`Participant_Name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `network_activities4`
--

LOCK TABLES `network_activities4` WRITE;
/*!40000 ALTER TABLE `network_activities4` DISABLE KEYS */;
/*!40000 ALTER TABLE `network_activities4` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `network_activities5`
--

DROP TABLE IF EXISTS `network_activities5`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `network_activities5` (
  `Counselor_Name` varchar(30) NOT NULL,
  `Participant_Name` varchar(30) NOT NULL,
  `Participants_Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `Group_Activities` text,
  `You_and_Group` text,
  `drug_use` tinyint(4) NOT NULL,
  `friend_drug_use` tinyint(4) NOT NULL,
  PRIMARY KEY (`Participant_Name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `network_activities5`
--

LOCK TABLES `network_activities5` WRITE;
/*!40000 ALTER TABLE `network_activities5` DISABLE KEYS */;
/*!40000 ALTER TABLE `network_activities5` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `network_structure_analysis`
--

DROP TABLE IF EXISTS `network_structure_analysis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `network_structure_analysis` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Formal_Groups` text NOT NULL,
  `School` varchar(50) DEFAULT NULL,
  `Other_Formal` varchar(100) DEFAULT NULL,
  `Informal_Groups` text NOT NULL,
  `Other_Informal` text,
  `Other_Informal2` text,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `network_structure_analysis`
--

LOCK TABLES `network_structure_analysis` WRITE;
/*!40000 ALTER TABLE `network_structure_analysis` DISABLE KEYS */;
INSERT INTO `network_structure_analysis` VALUES ('Joe Walter Black','1978-08-05',' family drug court treatment team drug court participants church work place Narcotics/Alcohol Anonymous community group organized club parent-teacher association sports teams school: other:','fdgdf','fdgdf',' local bar informal gatherings neighborhood hunting buddies fishing buddies salon friends local stores buddies to play music with gym buddies play sports with online community other: other:','kjukh','jhmvg');
/*!40000 ALTER TABLE `network_structure_analysis` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `new_login`
--

DROP TABLE IF EXISTS `new_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `new_login` (
  `Id` int(11) NOT NULL,
  `UserName` varchar(30) NOT NULL,
  `UserPassword` varchar(20) NOT NULL,
  PRIMARY KEY (`Id`),
  CONSTRAINT `new_login_ibfk_1` FOREIGN KEY (`Id`) REFERENCES `store_login` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `new_login`
--

LOCK TABLES `new_login` WRITE;
/*!40000 ALTER TABLE `new_login` DISABLE KEYS */;
/*!40000 ALTER TABLE `new_login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `post_graduation`
--

DROP TABLE IF EXISTS `post_graduation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `post_graduation` (
  `Entry_Date` date NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `New_Arrest` text NOT NULL,
  `Reason` text NOT NULL,
  PRIMARY KEY (`Entry_Date`,`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `post_graduation`
--

LOCK TABLES `post_graduation` WRITE;
/*!40000 ALTER TABLE `post_graduation` DISABLE KEYS */;
INSERT INTO `post_graduation` VALUES ('2012-09-20','Joe Somebody','1970-05-25','Assault and Battery	','Domestic Violence ');
/*!40000 ALTER TABLE `post_graduation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quarterly_report`
--

DROP TABLE IF EXISTS `quarterly_report`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quarterly_report` (
  `Quarterly_Date` date NOT NULL,
  `Quarterly_Period` enum('First Quarter','Second Quarter','Third Quarter','Fourth Quarter') NOT NULL,
  `Reviewed` int(11) NOT NULL,
  `Accepted` int(11) NOT NULL,
  `Rejected` int(11) NOT NULL,
  `Declined_Participate` int(11) DEFAULT NULL,
  `Rejected_Other` int(11) DEFAULT NULL,
  `AWOL` int(11) NOT NULL,
  `Termin` int(11) NOT NULL,
  `Drug_Free_Babies` int(11) DEFAULT NULL,
  `Parental_Rights_Termin` int(11) DEFAULT NULL,
  `GEDs_Received` int(11) DEFAULT NULL,
  `Starting_Wages` int(11) NOT NULL,
  `Completion_Wages` int(11) NOT NULL,
  `ASAM_Level` enum('.5','1.0','2.0','2.5','3.0','4.0') NOT NULL,
  `Drug_Tests` int(11) NOT NULL,
  `Urine_Tests` int(11) DEFAULT NULL,
  `Breath_Tests` int(11) DEFAULT NULL,
  `Saliva_Tests` int(11) DEFAULT NULL,
  `Hair_Tests` int(11) DEFAULT NULL,
  `Residential_Treat` int(11) DEFAULT NULL,
  `Prior_Mental_Treat` int(11) DEFAULT NULL,
  `Prior_Substance_Abuse` int(11) DEFAULT NULL,
  `Graduates` int(11) DEFAULT NULL,
  PRIMARY KEY (`Quarterly_Period`,`Quarterly_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quarterly_report`
--

LOCK TABLES `quarterly_report` WRITE;
/*!40000 ALTER TABLE `quarterly_report` DISABLE KEYS */;
INSERT INTO `quarterly_report` VALUES ('2011-07-01','First Quarter',30,21,5,2,2,6,1,2,1,3,25000,28000,'.5',100,25,20,30,25,3,2,3,20),('2011-10-01','Second Quarter',42,34,4,2,2,5,0,3,2,2,30000,31000,'1.0',120,25,30,40,35,4,3,4,34),('2012-01-01','Third Quarter',50,40,5,2,3,7,2,4,1,4,26000,29000,'2.0',160,40,40,40,40,6,5,6,38),('2012-04-01','Fourth Quarter',46,38,4,1,3,4,5,5,3,5,20000,25000,'.5',160,40,40,40,40,4,3,4,38);
/*!40000 ALTER TABLE `quarterly_report` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `research_demographic`
--

DROP TABLE IF EXISTS `research_demographic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `research_demographic` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Six_Month_Plans` text,
  `Five_Year_Plans` text,
  `How_Into_Drugs` text NOT NULL,
  `Why_do_Drugs` text NOT NULL,
  `Addicted` enum('Yes','No') NOT NULL,
  `How_Addicted` smallint(5) unsigned NOT NULL,
  `Likes_N_Hobbies` text,
  `Wishful_Activities` text,
  `Relationship_Situation` enum('I am not in steady relationship','I am in a steady relationship with a women and we live together','I am in a steady relationship with a man and we live together','I am in a steady relationship with a women and we do not live together','I am in a steady relationship with a man and we do not live together','Other Please Explain') NOT NULL,
  `Other_Relationship` text,
  `Jobs_Past_5years` enum('None','1-2','3-4','4-6','more than 6') NOT NULL,
  `Job_Situation_Pastyear` enum('mostly fulltime employment','mix of fulltime and part-time employment','mostly part-time employed','mostly unemployed','Other') NOT NULL,
  `Other_Job_Situation` text,
  `Work_Type_Lastwk` varchar(200) DEFAULT NULL,
  `Skills_Expertise` text,
  `Live_Last_Month` enum('House Apartment or Condominium that I own','House Apartment or Condominium that I rent','I stayed with family or relatives','I stayed with friends or acquaintances','I lived in a shelter','I lived on the streets/homeless','Other') NOT NULL,
  `Other_living` varchar(200) DEFAULT NULL,
  `Health_Insurance` enum('Yes','No') NOT NULL,
  `Insurance_Type` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `research_demographic`
--

LOCK TABLES `research_demographic` WRITE;
/*!40000 ALTER TABLE `research_demographic` DISABLE KEYS */;
INSERT INTO `research_demographic` VALUES ('Joe Walter Black','1978-08-05','get a job	','get a house','friends peer pressure','curious','Yes',5,'watch movies','travel','I am in a steady relationship with a women and we live together','','1-2','mostly fulltime employment','','construction','welding, carpenter work','House Apartment or Condominium that I rent','','Yes','Atena');
/*!40000 ALTER TABLE `research_demographic` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `social_network1`
--

DROP TABLE IF EXISTS `social_network1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `social_network1` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `People_in_Network` tinyint(4) NOT NULL,
  `Know_in_Network` tinyint(4) NOT NULL,
  `Closely_Know` tinyint(4) NOT NULL,
  `Hang_With_Regulary` tinyint(4) NOT NULL,
  `Hang_with_Amount` enum('Daily','Weekly','Monthly','Every 3-6 Months','Every 7 months or more') NOT NULL,
  `Know_Outside_Groups` enum('Yes','No') NOT NULL,
  `Connect_outdside_Group` enum('Yes','No') NOT NULL,
  `Other_Conn` text,
  `Closeness` tinyint(4) NOT NULL,
  `Personal_closeness` tinyint(4) NOT NULL,
  `Group_Jealousy` tinyint(4) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `social_network1`
--

LOCK TABLES `social_network1` WRITE;
/*!40000 ALTER TABLE `social_network1` DISABLE KEYS */;
INSERT INTO `social_network1` VALUES ('Joe Walter Black','1978-08-05','local bar',5,3,3,4,'Weekly','No','No','',8,7,4);
/*!40000 ALTER TABLE `social_network1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `social_network2`
--

DROP TABLE IF EXISTS `social_network2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `social_network2` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `People_in_Network` tinyint(4) NOT NULL,
  `Know_in_Network` tinyint(4) NOT NULL,
  `Closely_Know` tinyint(4) NOT NULL,
  `Hang_With_Regulary` tinyint(4) NOT NULL,
  `Hang_with_Amount` enum('Daily','Weekly','Monthly','Every 3-6 Months','Every 7 months or more') NOT NULL,
  `Know_Outside_Groups` enum('Yes','No') NOT NULL,
  `Connect_outdside_Group` enum('Yes','No') NOT NULL,
  `Other_Conn` text,
  `Closeness` tinyint(4) NOT NULL,
  `Personal_closeness` tinyint(4) NOT NULL,
  `Group_Jealousy` tinyint(4) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `social_network2`
--

LOCK TABLES `social_network2` WRITE;
/*!40000 ALTER TABLE `social_network2` DISABLE KEYS */;
/*!40000 ALTER TABLE `social_network2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `social_network3`
--

DROP TABLE IF EXISTS `social_network3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `social_network3` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `People_in_Network` tinyint(4) NOT NULL,
  `Know_in_Network` tinyint(4) NOT NULL,
  `Closely_Know` tinyint(4) NOT NULL,
  `Hang_With_Regulary` tinyint(4) NOT NULL,
  `Hang_with_Amount` enum('Daily','Weekly','Monthly','Every 3-6 Months','Every 7 months or more') NOT NULL,
  `Know_Outside_Groups` enum('Yes','No') NOT NULL,
  `Connect_outdside_Group` enum('Yes','No') NOT NULL,
  `Other_Conn` text,
  `Closeness` tinyint(4) NOT NULL,
  `Personal_closeness` tinyint(4) NOT NULL,
  `Group_Jealousy` tinyint(4) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `social_network3`
--

LOCK TABLES `social_network3` WRITE;
/*!40000 ALTER TABLE `social_network3` DISABLE KEYS */;
/*!40000 ALTER TABLE `social_network3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `social_network4`
--

DROP TABLE IF EXISTS `social_network4`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `social_network4` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `People_in_Network` tinyint(4) NOT NULL,
  `Know_in_Network` tinyint(4) NOT NULL,
  `Closely_Know` tinyint(4) NOT NULL,
  `Hang_With_Regulary` tinyint(4) NOT NULL,
  `Hang_with_Amount` enum('Daily','Weekly','Monthly','Every 3-6 Months','Every 7 months or more') NOT NULL,
  `Know_Outside_Groups` enum('Yes','No') NOT NULL,
  `Connect_outdside_Group` enum('Yes','No') NOT NULL,
  `Other_Conn` text,
  `Closeness` tinyint(4) NOT NULL,
  `Personal_closeness` tinyint(4) NOT NULL,
  `Group_Jealousy` tinyint(4) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `social_network4`
--

LOCK TABLES `social_network4` WRITE;
/*!40000 ALTER TABLE `social_network4` DISABLE KEYS */;
/*!40000 ALTER TABLE `social_network4` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `social_network5`
--

DROP TABLE IF EXISTS `social_network5`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `social_network5` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Main_Group` text NOT NULL,
  `People_in_Network` tinyint(4) NOT NULL,
  `Know_in_Network` tinyint(4) NOT NULL,
  `Closely_Know` tinyint(4) NOT NULL,
  `Hang_With_Regulary` tinyint(4) NOT NULL,
  `Hang_with_Amount` enum('Daily','Weekly','Monthly','Every 3-6 Months','Every 7 months or more') NOT NULL,
  `Know_Outside_Groups` enum('Yes','No') NOT NULL,
  `Connect_outdside_Group` enum('Yes','No') NOT NULL,
  `Other_Conn` text,
  `Closeness` tinyint(4) NOT NULL,
  `Personal_closeness` tinyint(4) NOT NULL,
  `Group_Jealousy` tinyint(4) NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `social_network5`
--

LOCK TABLES `social_network5` WRITE;
/*!40000 ALTER TABLE `social_network5` DISABLE KEYS */;
/*!40000 ALTER TABLE `social_network5` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sociogram`
--

DROP TABLE IF EXISTS `sociogram`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sociogram` (
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `First_Group` text NOT NULL,
  `Second_Group` text NOT NULL,
  `Third_Group` text NOT NULL,
  `Fourth_Group` text NOT NULL,
  `Fifth_Group` text NOT NULL,
  PRIMARY KEY (`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sociogram`
--

LOCK TABLES `sociogram` WRITE;
/*!40000 ALTER TABLE `sociogram` DISABLE KEYS */;
INSERT INTO `sociogram` VALUES ('Joe Walter Black','1978-08-05','local bar','informal gatherings','hunting buddies','family','drug court treatment team');
/*!40000 ALTER TABLE `sociogram` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `store_login`
--

DROP TABLE IF EXISTS `store_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `store_login` (
  `Id` int(11) NOT NULL,
  `UserName` varchar(30) NOT NULL,
  `UserPassword` varchar(20) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `Id` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `store_login`
--

LOCK TABLES `store_login` WRITE;
/*!40000 ALTER TABLE `store_login` DISABLE KEYS */;
/*!40000 ALTER TABLE `store_login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `weekly_data`
--

DROP TABLE IF EXISTS `weekly_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `weekly_data` (
  `Entry_Date` date NOT NULL,
  `Participant_Nmbr` int(10) unsigned NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Phase` enum('Phase 1','Phase 2','Phase 3','Phase 4','Phase 5','Terminated','Graduated','On Hold') NOT NULL,
  `Termin_Date` varchar(11) DEFAULT NULL,
  `Termin` text,
  `Grad_Date` varchar(11) DEFAULT NULL,
  `Hold_N_Date` text,
  `Last_Step_Cmplt` enum('Step 1','Step 2','Step 3','Step 4','Step 5','Step 6','Step 7','Step 8','Step 9','Step 10','Step 11','Step 12') NOT NULL,
  `Fee_Balance` varchar(20) NOT NULL,
  `Fee_Amount` varchar(20) NOT NULL,
  `Fees_Paid` enum('Yes','No','Other') NOT NULL,
  `Fees_Other` text,
  `Date_of_Offense` varchar(12) DEFAULT NULL,
  `Reason_Sanction` text NOT NULL,
  `Type_Sanction` text NOT NULL,
  `Date_Exp_Sanction` text NOT NULL,
  `Drug_Screen_Date` date DEFAULT NULL,
  `Screen_Types` enum('Urine','Breath','Saliva','Hair') NOT NULL,
  `Screen_Results` enum('Positive','Negative') NOT NULL,
  `Drug_Found` text,
  `Drug_Court_Atnd` text,
  `NA_Atnd` text,
  `AA_Atnd` text,
  `Court_Ses_Atnd` text,
  `New_Charges` text,
  `Employment` enum('full time employed','part time employed','not employed') NOT NULL,
  `Diploma_GED` enum('','No','Yes') NOT NULL,
  `Counselor_Comments` text,
  PRIMARY KEY (`Entry_Date`,`Name`,`Birth_Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `weekly_data`
--

LOCK TABLES `weekly_data` WRITE;
/*!40000 ALTER TABLE `weekly_data` DISABLE KEYS */;
INSERT INTO `weekly_data` VALUES ('2012-01-05',1,'Joe Walter Black','1978-08-05','Phase 1','','				','','No Holds','Step 1','20','20','Yes','','2011-11-26','n/a	','n/a','n/a','2011-12-30','Urine','Negative','None','Excellent Attendance','Excellent Attendance','Excellent Attendance','Excellent Attendance','None','full time employed','Yes','Making Good Progress'),('2012-01-12',1,'Joe Walter Black','1978-08-05','Phase 2','','				','','No Holds','Step 2','20','20','Yes','','2011-11-26','n/a	','n/a','n/a','2012-01-01','Saliva','Negative','None','Excellent Attendance','Excellent Attendance','Excellent Attendance','Excellent Attendance','None','full time employed','','Making Good Progress');
/*!40000 ALTER TABLE `weekly_data` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed 
