package com.akisan.uploadProjectData.service.Impl;

import com.akisan.uploadProjectData.entity.std_info;
import com.akisan.uploadProjectData.service.insertStd_InfoFakeData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.akisan.uploadProjectData.util.returnFakeDataUtil.*;

@Service
public class insertStd_InfoFakeDataImpl implements insertStd_InfoFakeData {

    @Override
    public void insertFakeData() {
        List<std_info> fakeName = new ArrayList<>();

        for(int i=0;i<3;i++){
            std_info std_info1 = new std_info();
            String name = getFamilyName();
            String inSchoolTime = getInSchoolTime();
            String classname = "";

            if(inSchoolTime.equals("2019")){
                classname = getClassName2In2019();
            }else{
                classname = getClassName2In2020();
            }

            std_info1.setName(name);
            std_info1.setInschooltime(inSchoolTime);
            std_info1.setClassname(classname);

            fakeName.add(std_info1);
        }
        System.out.println(fakeName);
    }
}
