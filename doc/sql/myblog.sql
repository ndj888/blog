/*
Navicat MySQL Data Transfer

Source Server         : my
Source Server Version : 50718
Source Host           : 127.0.0.1:3306
Source Database       : myblog

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-06-21 21:17:43
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
  `cls_id` int(11) DEFAULT NULL COMMENT '分类id',
  `update_time` int(11) DEFAULT NULL COMMENT '更新时间',
  `create_time` int(11) DEFAULT NULL COMMENT '创建时间',
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blog_article
-- ----------------------------

-- ----------------------------
-- Table structure for blog_class
-- ----------------------------
DROP TABLE IF EXISTS `blog_class`;
CREATE TABLE `blog_class` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL COMMENT '分类名称',
  `descontent` varchar(255) NOT NULL COMMENT '分类描述',
  `update_time` int(11) DEFAULT NULL,
  `create_time` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='文章表';

-- ----------------------------
-- Records of blog_class
-- ----------------------------

-- ----------------------------
-- Table structure for blog_user
-- ----------------------------
DROP TABLE IF EXISTS `blog_user`;
CREATE TABLE `blog_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(40) NOT NULL,
  `user_passwd` varchar(40) NOT NULL,
  `create_time` int(11) DEFAULT NULL,
  `update_time` int(11) DEFAULT NULL,
  `user_nick` varchar(40) NOT NULL COMMENT '用户昵称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blog_user
-- ----------------------------
INSERT INTO `blog_user` VALUES ('1', '测试波波大', 'sdfsdsdf', '1123122121', '1123122121', '我爱一哈');
