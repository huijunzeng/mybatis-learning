CREATE TABLE `teacher` (
  `teacher_id` varchar(20) NOT NULL COMMENT '老师id',
  `class_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '班级id',
  `teacher_sex` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '老师性别简码',
  `teacher_name` varchar(255) NOT NULL COMMENT '老师名字',
  PRIMARY KEY (`teacher_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;