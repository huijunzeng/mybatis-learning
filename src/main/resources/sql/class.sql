CREATE TABLE `class` (
  `class_id` varchar(20) NOT NULL COMMENT '班级id',
  `class_name` varchar(255) NOT NULL COMMENT '班级名称',
  PRIMARY KEY (`class_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;