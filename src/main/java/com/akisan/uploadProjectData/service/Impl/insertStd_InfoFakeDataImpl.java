package com.akisan.uploadProjectData.service.Impl;

import com.akisan.uploadProjectData.entity.std_info;
import com.akisan.uploadProjectData.service.insertStd_InfoFakeData;
import com.akisan.uploadProjectData.mapper.std_infoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.akisan.uploadProjectData.util.returnFakeDataUtil.*;

@Service
public class insertStd_InfoFakeDataImpl implements insertStd_InfoFakeData {
    @Autowired
    private std_infoMapper std_infoMapper;

    @Override
    public void insertFakeData() {
        List<std_info> fakeName = new ArrayList<>();

        //生成50条std_info信息
        for(int i=0;i<50;i++){
            std_info std_info1 = new std_info();
            String name = getFamilyName();
            String classname = getClassName();
            String inSchool = getInSchool();

            std_info1.setName(name);
            std_info1.setClassname(classname);
            std_info1.setInschool(inSchool);

            fakeName.add(std_info1);
        }
        std_infoMapper.insertFakeData(fakeName);
    }
}
