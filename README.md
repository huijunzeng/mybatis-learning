springboot整合mybaits案例，其中包含一些基础学习知识，方便自己以后查漏补缺

涉及的工具：Swagger、Mysql8.0、Lombok（需要了解mybatis逆向工程怎么整合Lombok）、通用mapper 

目录结构：
├─src
│  ├─main
│  │  ├─java
│  │  │  └─com
│  │  │      └─example
│  │  │          │  MybatisLearningApplication.java
│  │  │          │  
│  │  │          ├─config
│  │  │          │      SwaggerConfig.java
│  │  │          │      
│  │  │          ├─constant
│  │  │          │      BaseEnum.java
│  │  │          │      
│  │  │          ├─controller
│  │  │          │      ClassController.java
│  │  │          │      GlobalExceptionHandler.java
│  │  │          │      StudentController.java
│  │  │          │      TeacherController.java
│  │  │          │      
│  │  │          ├─dto
│  │  │          │  │  ClassDtlListDto.java
│  │  │          │  │  ClassDto.java
│  │  │          │  │  ClassStudentRelDto.java
│  │  │          │  │  ClassTeacherRelDto.java
│  │  │          │  │  StudentDto.java
│  │  │          │  │  TeacherDtlListDto.java
│  │  │          │  │  TeacherDto.java
│  │  │          │  │  
│  │  │          │  └─base
│  │  │          │          BaseEnum.java
│  │  │          │          SexEnum.java
│  │  │          │          
│  │  │          ├─entity
│  │  │          │      ClassEntity.java
│  │  │          │      StudentEntity.java
│  │  │          │      TeacherEntity.java
│  │  │          │      
│  │  │          ├─exception
│  │  │          │      BaseCodeEnum.java
│  │  │          │      BaseResultCodeEnum.java
│  │  │          │      CustomizeException.java
│  │  │          │      ThrowingWrapper.java
│  │  │          │      
│  │  │          ├─mapper
│  │  │          │      ClassEntityMapper.java
│  │  │          │      StudentEntityMapper.java
│  │  │          │      TeacherEntityMapper.java
│  │  │          │      
│  │  │          ├─param
│  │  │          │      ClassDtlListPageQueryParam.java
│  │  │          │      ClassDtlListQueryParam.java
│  │  │          │      ClassSaveListParam.java
│  │  │          │      ClassSaveParam.java
│  │  │          │      PageParam.java
│  │  │          │      StudentSaveListParam.java
│  │  │          │      StudentSaveParam.java
│  │  │          │      TeacherSaveListParam.java
│  │  │          │      TeacherSaveParam.java
│  │  │          │      TeacherUpdateClassIdParam.java
│  │  │          │      TeacherUpdateMoreFieldsMoreValuesParam.java
│  │  │          │      TeacherUpdateOneFieldMoreValuesParam.java
│  │  │          │      TeacherUpdateOneFieldOneValueParam.java
│  │  │          │      TeacherUpdateParam.java
│  │  │          │      
│  │  │          ├─service
│  │  │          │      ClassService.java
│  │  │          │      StudentService.java
│  │  │          │      TeacherService.java
│  │  │          │      
│  │  │          └─utils
│  │  │                  BeanConverter.java
│  │  │                  DateUtils.java
│  │  │                  IdGenerate.java
│  │  │                  PageInfo.java
│  │  │                  
│  │  └─resources
│  │      │  application.properties
│  │      │  
│  │      ├─generator
│  │      │      generatorConfig.xml
│  │      │      
│  │      ├─mapper
│  │      │      ClassEntityMapper.xml
│  │      │      StudentEntityMapper.xml
│  │      │      TeacherEntityMapper.xml
│  │      │      
│  │      └─sql
│  │              class.sql
│  │              student.sql
│  │              teacher.sql
│  │              
│  └─test
│      └─java
│          └─com
│              └─example
│                      MybatisLearningApplicationTests.java
│  
│  pom.xml
│  README.md
                    
