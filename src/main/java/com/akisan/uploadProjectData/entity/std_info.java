package com.akisan.uploadProjectData.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;

@Data
@ApiModel(description = "学生 - 详细信息表")
public class std_info {
    @ApiModelProperty(value = "对应sys_user的id")
    private Integer id;

    @ApiModelProperty(value = "对应sys_user的id")
    private String name;

    @ApiModelProperty(value = "对应sys_user的id")
    private String classname;

    @ApiModelProperty(value = "对应sys_user的id")
    private String inschooltime;
}
