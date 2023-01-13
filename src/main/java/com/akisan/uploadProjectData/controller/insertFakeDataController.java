package com.akisan.uploadProjectData.controller;

import com.akisan.uploadProjectData.common.resultForRequestConstant;
import com.akisan.uploadProjectData.service.Impl.insertStd_InfoFakeDataImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/insertFakeData")
@Api(tags = "插入假数据模块")
public class insertFakeDataController {
    @Autowired
    insertStd_InfoFakeDataImpl insertStd_InfoFakeDataImpl;

    @PostMapping("/updateBlogComment")
    @ApiOperation(value = "修改博客评论")
    public resultForRequestConstant updateComment() {
        insertStd_InfoFakeDataImpl.insertFakeData();
        return resultForRequestConstant.success();
    }

}
