package com.akisan.uploadProjectData.mapper;

import com.akisan.uploadProjectData.entity.std_info;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface std_infoMapper {
    void insertFakeData(@Param("std_info") List<std_info> std_info);
}
