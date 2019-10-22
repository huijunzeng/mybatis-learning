CREATE TABLE `student` (
  `student_id` varchar(20) NOT NULL COMMENT '学生id',
  `class_id` varchar(20) NOT NULL COMMENT '班级id',
  `student_sex` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生性别简码',
  `student_name` varchar(255) NOT NULL COMMENT '学生名字',
  PRIMARY KEY (`student_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;