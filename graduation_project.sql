/*
 Navicat MySQL Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : localhost:3306
 Source Schema         : graduation_project

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 22/04/2023 23:08:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for article_comment
-- ----------------------------
DROP TABLE IF EXISTS `article_comment`;
CREATE TABLE `article_comment`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `mather_id` int NOT NULL COMMENT '数学家id',
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评论内容',
  `user_id` int NOT NULL COMMENT '用户id',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '评论时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of article_comment
-- ----------------------------
INSERT INTO `article_comment` VALUES (1, 1, 'aaaaaa', 1, '2023-04-22 21:14:45');
INSERT INTO `article_comment` VALUES (2, 1, '2222', 2, '2023-04-22 21:14:53');
INSERT INTO `article_comment` VALUES (3, 2, '323232', 1, '2023-04-22 21:15:00');
INSERT INTO `article_comment` VALUES (4, 2, '121212', 1, '2023-04-22 21:15:06');

-- ----------------------------
-- Table structure for math_data
-- ----------------------------
DROP TABLE IF EXISTS `math_data`;
CREATE TABLE `math_data`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名字',
  `birth_date` date NULL DEFAULT NULL COMMENT '出生时间',
  `die_date` date NULL DEFAULT NULL COMMENT '去世时间',
  `basic_Information` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '基本信息',
  `accomplishment` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '成就',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '照片存放地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of math_data
-- ----------------------------
INSERT INTO `math_data` VALUES (1, '白正国', '1916-01-01', '2015-01-20', '教授，浙江平阳人。1940年毕业于浙江大学数学系。1956年加入共产党。曾在浙江大学讲师、副教授。建国之后，历任浙江师范学院副教授，杭州大学副教授、教授、数学系主任，中国数学学会理事和浙江分会副理事长、理事长。专于微分几何。在射影微分几何、大范围微分几何黎曼几何等方面有所建树。解决了富比尼提出的射影曲面存在的问题，得出如果一个曲面有一族且只有一族渐近曲线是射影等价的，则它们必须属于线形丛，其逆亦真的结果。撰有《关于一族渐近曲线是射影等价的曲面》等论文。2015年1月27日凌晨，浙江大学数学系白正国教授在杭州的家中逝世，享年100虚岁。\r\n\r\n教授，浙江平阳人。1940年毕业于浙江大学数学系。1956年加入共产党。曾在浙江大学讲师、副教授。建国之后，历任浙江师范学院副教授，杭州大学副教授、教授、数学系主任，中国数学学会理事和浙江分会副理事长、理事长。专于微分几何。在射影微分几何、大范围微分几何黎曼几何等方面有所建树。解决了富比尼提出的射影曲面存在的问题，得出如果一个曲面有一族且只有一族渐近曲线是射影等价的，则它们必须属于线形丛，其逆亦真的结果。撰有《关于一族渐近曲线是射影等价的曲面》等论文。2015年1月27日凌晨，浙江大学数学系白正国教授在杭州的家中逝世，享年100虚岁。\r\n\r\n教授，浙江平阳人。1940年毕业于浙江大学数学系。1956年加入共产党。曾在浙江大学讲师、副教授。建国之后，历任浙江师范学院副教授，杭州大学副教授、教授、数学系主任，中国数学学会理事和浙江分会副理事长、理事长。专于微分几何。在射影微分几何、大范围微分几何黎曼几何等方面有所建树。解决了富比尼提出的射影曲面存在的问题，得出如果一个曲面有一族且只有一族渐近曲线是射影等价的，则它们必须属于线形丛，其逆亦真的结果。撰有《关于一族渐近曲线是射影等价的曲面》等论文。2015年1月27日凌晨，浙江大学数学系白正国教授在杭州的家中逝世，享年100虚岁。\r\n白正国（1916），教授，浙江平阳人。1940年毕业于浙江大学数学系。1956年加入共产党。曾在浙江大学讲师、副教授。建国之后，历任浙江师范学院副教授，杭州大学副教授、教授、数学系主任，中国数学学会理事和浙江分会副理事长、理事长。专于微分几何。在射影微分几何、大范围微分几何黎曼几何等方面有所建树。解决了富比尼提出的射影曲面存在的问题，得出如果一个曲面有一族且只有一族渐近曲线是射影等价的，则它们必须属于线形丛，其逆亦真的结果。撰有《关于一族渐近曲线是射影等价的曲面》等论文。2015年1月27日凌晨，浙江大学数学系白正国教授在杭州的家中逝世，享年100虚岁。', '白正国的成名之作是在40年代初解决了射影微分几何中著名的Fubini问题。在30-40年代，以苏步青为首的浙大射影几何学派是与当时的意大利学派、美国学派三足鼎立的举世公认的学派，白正国便是这个学派的代表人物之一。当时在射影微分几何方面有一个引起国际数学界注意的问题：是否存在曲面，它的一族渐近曲线是互相射影等价的？问题的起因来自德国著名数学家W.Blaschke的一个定理：若非直纹曲面有一族渐近曲线属于线形丛，则此族是射影等价的。意大利著名数学家G.Fubini研究了Blaschke定理的逆问题，即如果一族渐近曲线是射影等价的，则此族是否必属于线形丛？Fubini自己解决了当曲面为直纹面时的情况，得到了问题的肯定回答。由此，Fubini提问：除了一族渐近曲线属于线形丛的曲面以外，是否还有非直纹面的曲面，它的一族渐近曲线是互相射影等价的？这个难题被称为Fubini问题。白正国经过潜心研究，终于圆满地解决了此问题。回答也是肯定的，即：除了有一族渐近曲线属于线形丛外，还存在且只存在一种特殊的射影极小曲（projective minimal surfaces of concidence），它的一族渐近曲线是互相射影等价的。对白正国的这一结果，G.Fubini来信大加赞许，并要求杂志社提前发表白正国的论文。后来，这一成果被载入由Terracini执笔的“Fubini传”中。苏步青教授在专著《射影曲面概论》中对他的得意门生的这个成果也以专题作了详细介绍。此外，白正国在射影微分几何的曲面论方面还有许多独创性的工作。例如关于Moutard二次曲面，Godeaux二次曲面序列等，并对直纹空间中曲面的射影理论作了系统性的研究，完成论文近10篇，先后发表于40年代美国数学会的有关杂志上。从50年代起，白正国转入一般空间的微分几何学的研究。1957年，他发表了论文“关于空间曲线多边形的全曲率”，推广了著名的W.Fenchel定理，其结果如下：设C是空间一曲线多边形，具有内角θ1…θn，则它的全曲率满足下列不等式：其中等号当且仅当由凸曲线弧连接而成的平面曲线多边形时成立。在空间曲线的整体微分几何中，这是一个非常简洁而有鲜明几何意义的不等式。它被载入《中国数学十年》一书，也被《中国百科全书》数学卷所提及。1962-1966年期间，《数学学报》在杭州大学设立编辑部，由白正国负责。1965年在制定国家十二年科学规划中，杭州大学数学系的几何学和函数论都成为有关该项目的重点执行单位之一。在黎曼几何方面，白正国完美地解决了日本著名几何学家矢野健太郎（K.Yano）提出的存在若干独立保圆变换的黎曼空间的尺度形式问题，这是保圆几何中一个关键性的基本问题。1980年，由著名数学大师陈省身教授倡导的“双微”（微分几何与微分方程）会议第一次会议在北京召开，出席会议的法国著名几何学家M.Berger曾向白正国索要这个成果的论文单行本。此外，白正国还研究了黎曼空间中子流形的Codazzi-Ricci方程与Gauss方程的相关性，共形平坦黎曼空间及常曲率空间的曲率张量的特征，共形平坦黎曼空间中的共形平坦超曲面等，先后在国内各大数学杂志上发表论文10余篇，得到了许多重要结果。粉碎“四人帮”后，白正国的研究方向又从黎曼流形的局部性质转向整体性质。他对拟常曲率流形做了系统的研究，得到不少精彩的结果。例如，他证明了：可以等距嵌入两个不同常曲率流形的黎曼流形必是拟常曲率流形，其逆亦真。这是一个前所未知的有趣定理。后来，巴西著名几何学家M . do Carmo也独立地得到了类似的结果。另外，白正国的整体子流形几何方面也给出了不少很好的定理。', '2023-04-22 21:13:08', NULL);
INSERT INTO `math_data` VALUES (2, '蔡申瓯', NULL, '2017-10-21', '男，上海交通大学教授。浙江温州人，1980年浙江省高考理科“状元”，考入北京大学物理系。1994年于美国西北大学获得博士学位。蔡申瓯教授曾先后在美国洛斯阿拉莫斯国家实验室、普林斯顿大学高等研究所、美国纽约大学柯朗研究所等机构从事科研工作，主要涉及应用数学、物理学、生物学以及神经科学领域的前沿课题。2001年，他凭借自己前期的研究成果与科研潜力成为美国Alfred P. Sloan Research Fellowship获得者。2009年12月，蔡教授来到上海交通大学，现担任自然科学研究院的院长和致远学院教学指导委员会的副主任。主讲课程有统计力学与热力学、专业研讨课等。2017年10月21日美国东部时间凌晨4时12分在纽约家中离世。\r\n', NULL, '2023-04-22 21:14:13', NULL);

-- ----------------------------
-- Table structure for support
-- ----------------------------
DROP TABLE IF EXISTS `support`;
CREATE TABLE `support`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` int NULL DEFAULT NULL COMMENT '点赞数类型，数学家/用户评论',
  `user_id` int NULL DEFAULT NULL COMMENT '点赞用户',
  `target_id` int NULL DEFAULT NULL COMMENT '目标id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of support
-- ----------------------------
INSERT INTO `support` VALUES (1, 1, 1, 1);
INSERT INTO `support` VALUES (2, 1, 1, 1);
INSERT INTO `support` VALUES (3, 1, 1, 1);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `account` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户',
  `password` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `birth_date` datetime NULL DEFAULT NULL COMMENT '生日',
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `role` int NOT NULL COMMENT '权限',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'glty', 'admin', 'admin', '2023-04-28 16:02:38', '1314312132', '192.168！@.com', 0, '2023-04-22 16:53:37');
INSERT INTO `user` VALUES (2, NULL, 'inlink', 'inlink', NULL, NULL, NULL, 0, '2023-04-22 16:53:37');
INSERT INTO `user` VALUES (3, NULL, 'asads', 'asads', NULL, '你好新来的!', NULL, 1, '2023-04-22 16:53:37');

SET FOREIGN_KEY_CHECKS = 1;
