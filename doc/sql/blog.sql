-- MySQL dump 10.13  Distrib 5.7.18, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: myblog
-- ------------------------------------------------------
-- Server version	5.7.18-0ubuntu0.16.04.1

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
-- Table structure for table `blog_article`
--

DROP TABLE IF EXISTS `blog_article`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `blog_article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL COMMENT '标题',
  `subhead` varchar(255) DEFAULT NULL COMMENT '副标题',
  `content_file` varchar(255) NOT NULL COMMENT '正文markdown文件路径',
  `cls_id` int(11) DEFAULT '1' COMMENT '分类id',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `user_id` int(11) NOT NULL COMMENT '内容发布者id',
  `browse_time` int(11) NOT NULL DEFAULT '0' COMMENT '浏览次数',
  `hot_order` tinyint(3) NOT NULL DEFAULT '0' COMMENT '热门推荐排序',
  `is_hot` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '是否热门推荐',
  `img` varchar(255) DEFAULT '' COMMENT '文章主图',
  `author` varchar(40) NOT NULL COMMENT '作者',
  PRIMARY KEY (`id`),
  KEY `cls_id_index` (`cls_id`)
) ENGINE=InnoDB AUTO_INCREMENT=201 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blog_article`
--

LOCK TABLES `blog_article` WRITE;
/*!40000 ALTER TABLE `blog_article` DISABLE KEYS */;
INSERT INTO `blog_article` (`id`, `title`, `subhead`, `content_file`, `cls_id`, `update_time`, `create_time`, `user_id`, `browse_time`, `hot_order`, `is_hot`, `img`, `author`) VALUES (161,'测试:0','这是一个大新闻哟，大新闻！','测试硬梆梆无可奈何花落去',1,'2017-07-01 06:33:28','2017-07-01 06:33:28',1,0,0,1,NULL,'jjc'),(162,'测试:1',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,0,NULL,'jjc'),(163,'测试:2',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,1,NULL,'韩天峰'),(164,'测试:3',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,0,NULL,''),(165,'测试:4',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,1,NULL,''),(166,'测试:5',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,0,NULL,''),(167,'测试:6',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,1,NULL,''),(168,'测试:7',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,0,NULL,''),(169,'测试:8',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,1,NULL,''),(170,'测试:9',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,0,NULL,''),(171,'测试:10',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,1,NULL,''),(172,'测试:11',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,0,NULL,''),(173,'测试:12',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,1,NULL,''),(174,'测试:13',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,0,NULL,''),(175,'测试:14',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,1,NULL,''),(176,'测试:15',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,0,NULL,''),(177,'测试:16',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,1,NULL,''),(178,'测试:17',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,0,NULL,''),(179,'测试:18',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,1,NULL,''),(180,'测试:19',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,0,NULL,''),(181,'测试:0',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,1,NULL,''),(182,'测试:1',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,0,NULL,''),(183,'测试:2',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,1,NULL,''),(184,'测试:3',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,0,NULL,''),(185,'测试:4',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,1,NULL,''),(186,'测试:5',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,0,NULL,''),(187,'测试:6',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,1,NULL,''),(188,'测试:7',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,0,NULL,''),(189,'测试:8',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,1,NULL,''),(190,'测试:9',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,0,NULL,''),(191,'测试:10',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,1,NULL,''),(192,'测试:11',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,0,NULL,''),(193,'测试:12',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,1,NULL,''),(194,'测试:13',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,0,NULL,''),(195,'测试:14',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,1,NULL,''),(196,'测试:15',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,0,NULL,''),(197,'测试:16',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,1,NULL,''),(198,'测试:17',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,0,NULL,''),(199,'测试:18',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,1,NULL,''),(200,'测试:19',NULL,'测试硬梆梆无可奈何花落去',1,'2017-07-01 08:35:06','2017-07-01 08:35:06',1,0,0,0,NULL,'');
/*!40000 ALTER TABLE `blog_article` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blog_class`
--

DROP TABLE IF EXISTS `blog_class`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `blog_class` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL COMMENT '分类名称',
  `descontent` varchar(255) NOT NULL COMMENT '分类描述',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='文章表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blog_class`
--

LOCK TABLES `blog_class` WRITE;
/*!40000 ALTER TABLE `blog_class` DISABLE KEYS */;
INSERT INTO `blog_class` (`id`, `name`, `descontent`, `update_time`, `create_time`) VALUES (1,'心情','心情分类',NULL,'2017-07-01 06:32:42');
/*!40000 ALTER TABLE `blog_class` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blog_config`
--

DROP TABLE IF EXISTS `blog_config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `blog_config` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `config_key` varchar(255) NOT NULL,
  `config_val` varchar(255) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ukey` (`config_key`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=88 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blog_config`
--

LOCK TABLES `blog_config` WRITE;
/*!40000 ALTER TABLE `blog_config` DISABLE KEYS */;
INSERT INTO `blog_config` (`id`, `config_key`, `config_val`, `create_time`, `update_time`) VALUES (64,'test123','hellowworld','2017-06-29 19:04:43',NULL),(72,'nickName','梦幻流苏','2017-06-30 00:00:00',NULL),(73,'signature','梦幻流苏的个人博客啊，没事儿常来看看呗','2017-06-30 00:16:54',NULL),(75,'mood_ch','一个人的道路总是那么漫长！','2017-06-30 00:19:42',NULL),(76,'mood_en','A person\'s road is always so long','2017-06-30 00:19:42',NULL),(77,'headImg','http://cdnq.duitang.com/uploads/item/201504/15/20150415H0546_YGatC.thumb.224_0.jpeg','2017-06-30 00:19:42',NULL),(78,'subTitle1','我爱你','2017-06-30 00:19:42',NULL),(79,'subTitle2','jjcbs','2017-06-30 00:19:42',NULL),(80,'nickNameFull','梦幻流苏 | LongBob','2017-06-30 00:19:42',NULL),(81,'job','PHP高级工程师','2017-06-30 00:19:42',NULL),(82,'address','四川省-达州市','2017-06-30 00:19:42',NULL),(83,'mobile','15823978441','2017-06-30 00:19:42',NULL),(84,'email','710190609@qq.com','2017-06-30 00:19:42',NULL),(85,'friendLink','[{\"title\":\"百度\",\"href\":\"http://www.baidu.com\"}]','2017-06-30 00:19:42',NULL),(86,'putNo','蜀ICP备11002373号-1','2017-06-30 00:19:42',NULL),(87,'copyright','jjcbs版权所有','2017-06-30 00:19:42',NULL);
/*!40000 ALTER TABLE `blog_config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blog_user`
--

DROP TABLE IF EXISTS `blog_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `blog_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(40) NOT NULL,
  `user_passwd` varchar(40) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `user_nick` varchar(40) NOT NULL COMMENT '用户昵称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blog_user`
--

LOCK TABLES `blog_user` WRITE;
/*!40000 ALTER TABLE `blog_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `blog_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-04 16:17:21
