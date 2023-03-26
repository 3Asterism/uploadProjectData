package com.akisan.uploadProjectData.mapper;

import com.akisan.uploadProjectData.entity.std_allinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface std_allinfoMapper {
    void insertFakeData(@Param("std_info") List<std_allinfo> std_info);

    List<std_allinfo> getStdId(@Param("name") String name);
}
