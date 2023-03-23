package com.akisan.uploadProjectData.mapper;

import com.akisan.uploadProjectData.entity.std_exam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface std_examMapper {
    void insertFakeData(@Param("std_exam") List<std_exam> std_exam);
}
