package com.akisan.uploadProjectData.mapper;

import com.akisan.uploadProjectData.entity.std_info;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface std_infoMapper {
    void insertFakeData(@Param("std_info") std_info std_info);
}
