package com.akisan.uploadProjectData.mapper;

import com.akisan.uploadProjectData.entity.std_actv;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface std_actvMapper {
    void insertFakeData(@Param("std_actv") List<std_actv> std_actv);

}
