/*
Navicat MySQL Data Transfer

Source Server         : my
Source Server Version : 50718
Source Host           : 127.0.0.1:3306
Source Database       : myblog

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-07-06 10:13:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for blog_article
-- ----------------------------
DROP TABLE IF EXISTS `blog_article`;
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
  `keyword` varchar(40) DEFAULT NULL COMMENT '关键字词',
  PRIMARY KEY (`id`),
  KEY `cls_id_index` (`cls_id`)
) ENGINE=InnoDB AUTO_INCREMENT=201 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blog_article
-- ----------------------------
INSERT INTO `blog_article` VALUES ('161', '测试:0', '这是一个大新闻哟，大新闻！', '测试硬梆梆无可奈何花落去', '1', '2017-07-05 09:05:15', '2017-07-05 09:05:15', '1', '0', '0', '1', null, 'jjc', '黑色,是哇,DJ');
INSERT INTO `blog_article` VALUES ('162', '测试:1', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '0', null, 'jjc', null);
INSERT INTO `blog_article` VALUES ('163', '测试:2', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '1', null, '韩天峰', null);
INSERT INTO `blog_article` VALUES ('164', '测试:3', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '0', null, '', null);
INSERT INTO `blog_article` VALUES ('165', '测试:4', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '1', null, '', null);
INSERT INTO `blog_article` VALUES ('166', '测试:5', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '0', null, '', null);
INSERT INTO `blog_article` VALUES ('167', '测试:6', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '1', null, '', null);
INSERT INTO `blog_article` VALUES ('168', '测试:7', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '0', null, '', null);
INSERT INTO `blog_article` VALUES ('169', '测试:8', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '1', null, '', null);
INSERT INTO `blog_article` VALUES ('170', '测试:9', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '0', null, '', null);
INSERT INTO `blog_article` VALUES ('171', '测试:10', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '1', null, '', null);
INSERT INTO `blog_article` VALUES ('172', '测试:11', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '0', null, '', null);
INSERT INTO `blog_article` VALUES ('173', '测试:12', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '1', null, '', null);
INSERT INTO `blog_article` VALUES ('174', '测试:13', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '0', null, '', null);
INSERT INTO `blog_article` VALUES ('175', '测试:14', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '1', null, '', null);
INSERT INTO `blog_article` VALUES ('176', '测试:15', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '0', null, '', null);
INSERT INTO `blog_article` VALUES ('177', '测试:16', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '1', null, '', null);
INSERT INTO `blog_article` VALUES ('178', '测试:17', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '0', null, '', null);
INSERT INTO `blog_article` VALUES ('179', '测试:18', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '1', null, '', null);
INSERT INTO `blog_article` VALUES ('180', '测试:19', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '0', null, '', null);
INSERT INTO `blog_article` VALUES ('181', '测试:0', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '1', null, '', null);
INSERT INTO `blog_article` VALUES ('182', '测试:1', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '0', null, '', null);
INSERT INTO `blog_article` VALUES ('183', '测试:2', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '1', null, '', null);
INSERT INTO `blog_article` VALUES ('184', '测试:3', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '0', null, '', null);
INSERT INTO `blog_article` VALUES ('185', '测试:4', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '1', null, '', null);
INSERT INTO `blog_article` VALUES ('186', '测试:5', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '0', null, '', null);
INSERT INTO `blog_article` VALUES ('187', '测试:6', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '1', null, '', null);
INSERT INTO `blog_article` VALUES ('188', '测试:7', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '0', null, '', null);
INSERT INTO `blog_article` VALUES ('189', '测试:8', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '1', null, '', null);
INSERT INTO `blog_article` VALUES ('190', '测试:9', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '0', null, '', null);
INSERT INTO `blog_article` VALUES ('191', '测试:10', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '1', null, '', null);
INSERT INTO `blog_article` VALUES ('192', '测试:11', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '0', null, '', null);
INSERT INTO `blog_article` VALUES ('193', '测试:12', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '1', null, '', null);
INSERT INTO `blog_article` VALUES ('194', '测试:13', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '0', null, '', null);
INSERT INTO `blog_article` VALUES ('195', '测试:14', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '1', null, '', null);
INSERT INTO `blog_article` VALUES ('196', '测试:15', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '0', null, '', null);
INSERT INTO `blog_article` VALUES ('197', '测试:16', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '1', null, '', null);
INSERT INTO `blog_article` VALUES ('198', '测试:17', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '0', null, '', null);
INSERT INTO `blog_article` VALUES ('199', '测试:18', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '1', null, '', null);
INSERT INTO `blog_article` VALUES ('200', '测试:19', null, '测试硬梆梆无可奈何花落去', '1', '2017-07-01 08:35:06', '2017-07-01 08:35:06', '1', '0', '0', '0', null, '', null);

-- ----------------------------
-- Table structure for blog_class
-- ----------------------------
DROP TABLE IF EXISTS `blog_class`;
CREATE TABLE `blog_class` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL COMMENT '分类名称',
  `descontent` varchar(255) NOT NULL COMMENT '分类描述',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='文章表';

-- ----------------------------
-- Records of blog_class
-- ----------------------------
INSERT INTO `blog_class` VALUES ('1', '心情', '心情分类', null, '2017-07-01 06:32:42');

-- ----------------------------
-- Table structure for blog_config
-- ----------------------------
DROP TABLE IF EXISTS `blog_config`;
CREATE TABLE `blog_config` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `config_key` varchar(255) NOT NULL,
  `config_val` varchar(255) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ukey` (`config_key`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=88 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blog_config
-- ----------------------------
INSERT INTO `blog_config` VALUES ('64', 'test123', 'hellowworld', '2017-06-29 19:04:43', null);
INSERT INTO `blog_config` VALUES ('72', 'nickName', '梦幻流苏', '2017-06-30 00:00:00', null);
INSERT INTO `blog_config` VALUES ('73', 'signature', '梦幻流苏的个人博客啊，没事儿常来看看呗', '2017-06-30 00:16:54', null);
INSERT INTO `blog_config` VALUES ('75', 'mood_ch', '一个人的道路总是那么漫长！', '2017-06-30 00:19:42', null);
INSERT INTO `blog_config` VALUES ('76', 'mood_en', 'A person\'s road is always so long', '2017-06-30 00:19:42', null);
INSERT INTO `blog_config` VALUES ('77', 'headImg', 'http://cdnq.duitang.com/uploads/item/201504/15/20150415H0546_YGatC.thumb.224_0.jpeg', '2017-06-30 00:19:42', null);
INSERT INTO `blog_config` VALUES ('78', 'subTitle1', '我爱你', '2017-06-30 00:19:42', null);
INSERT INTO `blog_config` VALUES ('79', 'subTitle2', 'jjcbs', '2017-06-30 00:19:42', null);
INSERT INTO `blog_config` VALUES ('80', 'nickNameFull', '梦幻流苏 | LongBob', '2017-06-30 00:19:42', null);
INSERT INTO `blog_config` VALUES ('81', 'job', 'PHP高级工程师', '2017-06-30 00:19:42', null);
INSERT INTO `blog_config` VALUES ('82', 'address', '四川省-达州市', '2017-06-30 00:19:42', null);
INSERT INTO `blog_config` VALUES ('83', 'mobile', '15823978441', '2017-06-30 00:19:42', null);
INSERT INTO `blog_config` VALUES ('84', 'email', '710190609@qq.com', '2017-06-30 00:19:42', null);
INSERT INTO `blog_config` VALUES ('85', 'friendLink', '[{\"title\":\"百度\",\"href\":\"http://www.baidu.com\"}]', '2017-06-30 00:19:42', null);
INSERT INTO `blog_config` VALUES ('86', 'putNo', '蜀ICP备11002373号-1', '2017-06-30 00:19:42', null);
INSERT INTO `blog_config` VALUES ('87', 'copyright', 'jjcbs版权所有', '2017-06-30 00:19:42', null);

-- ----------------------------
-- Table structure for blog_user
-- ----------------------------
DROP TABLE IF EXISTS `blog_user`;
CREATE TABLE `blog_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(40) NOT NULL,
  `user_passwd` varchar(40) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `user_nick` varchar(40) NOT NULL COMMENT '用户昵称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blog_user
-- ----------------------------
