package com.example.service;

import com.example.dto.ClassDtlListDto;
import com.example.entity.ClassEntity;
import com.example.mapper.ClassEntityMapper;
import com.example.param.ClassDtlListPageQueryParam;
import com.example.param.ClassDtlListQueryParam;
import com.example.param.ClassSaveListParam;
import com.example.param.ClassSaveParam;
import com.example.utils.BeanConverter;
import com.example.utils.IdGenerate;
import com.example.utils.PageInfo;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.exception.ThrowingWrapper.throwingConsumerWrapper;

/**
 * @Author: ZJH
 * @Date: 2019/10/15 14:43
 */

@Service
public class ClassSerice {

    @Autowired
    private ClassEntityMapper entityMapper;

    public void insert(ClassSaveParam classSaveParam) throws Exception {
        ClassEntity classEntity = BeanConverter.copy(classSaveParam, ClassEntity.class);
        classEntity.setClassId(String.valueOf(IdGenerate.getInstance().nextId()));
        entityMapper.insertSelective(classEntity);
    }

    public void insertBatch(ClassSaveListParam classSaveListParam) {
        List<ClassSaveParam> classList = classSaveListParam.getClassList();
        if (classList != null && !classList.isEmpty()) {
            List<ClassEntity> saveList = BeanConverter.copy(classList, ClassEntity.class);
            saveList.stream().forEach(throwingConsumerWrapper(classEntity -> classEntity.setClassId(String.valueOf(IdGenerate.getInstance().nextId())), Exception.class));
            entityMapper.insertBatch(saveList);
        }
    }

    public List<ClassDtlListDto> selectDtlListByParam(ClassDtlListQueryParam classDtlListQueryParam) {
        return entityMapper.selectDtlListByParam(classDtlListQueryParam.getClassName());
    }

    public PageInfo selectDtlListByPage(ClassDtlListPageQueryParam classDtlListPageQueryParam) {
        String className = classDtlListPageQueryParam.getClassName();
        int pageNum = classDtlListPageQueryParam.getPageNum();
        int pageSize = classDtlListPageQueryParam.getPageSize();
        int startIndex = (pageNum - 1) * pageSize;
        Integer totalRecord = entityMapper.selectTotalRecord(className);
        List<ClassDtlListDto> classList = entityMapper.selectDtlListByPage(className, startIndex, pageSize);
        return new PageInfo(pageNum, pageSize, totalRecord, classList);
    }

    public com.github.pagehelper.PageInfo selectDtlListByPageHelper(ClassDtlListPageQueryParam classDtlListPageQueryParam) {
        PageHelper.startPage(classDtlListPageQueryParam.getPageNum(), classDtlListPageQueryParam.getPageSize());
        return new com.github.pagehelper.PageInfo(entityMapper.selectDtlListByPageHelper(classDtlListPageQueryParam.getClassName()));
    }
}
