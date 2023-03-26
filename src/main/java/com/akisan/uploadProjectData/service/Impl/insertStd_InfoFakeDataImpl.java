package com.akisan.uploadProjectData.service.Impl;

import com.akisan.uploadProjectData.entity.std_allinfo;
import com.akisan.uploadProjectData.entity.std_exam;
import com.akisan.uploadProjectData.service.insertStd_InfoFakeData;
import com.akisan.uploadProjectData.mapper.std_allinfoMapper;
import com.akisan.uploadProjectData.mapper.std_examMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.akisan.uploadProjectData.util.returnFakeDataUtil.*;

@Service
public class insertStd_InfoFakeDataImpl implements insertStd_InfoFakeData {
    @Autowired
    private std_allinfoMapper std_allinfoMapper;
    @Autowired
    private std_examMapper std_examMapper;

    @Override
    public void insertFakeData() {
        List<std_allinfo> fakeName = new ArrayList<>();
        List<std_exam> fakeExam = new ArrayList<>();

        //生成50条std_info信息
        for(int i=0;i<50;i++){
            std_allinfo std_info1 = new std_allinfo();
            String name = getFamilyName();
            String classname = getClassName();
            String inSchool = getInSchool();

            std_info1.setName(name);
            std_info1.setClassname(classname);
            std_info1.setInschool(inSchool);

            fakeName.add(std_info1);
        }

        std_allinfoMapper.insertFakeData(fakeName);

        //生成50条std_exam信息 id与name取自std_info
        for(int i=0;i<50;i++){
            std_exam std_exam1 = new std_exam();
            fakeName.get(i).setId(std_allinfoMapper.getStdId(fakeName.get(i).getName()).get(0).getId());
            std_exam1.setStdid(fakeName.get(i).getId());
            std_exam1.setName(fakeName.get(i).getName());
            for(int l=0;l<3;l++){
                std_exam std_exam2 = new std_exam();
                std_exam2.setStdid(std_exam1.getStdid());
                std_exam2.setName(std_exam1.getName());
                std_exam2.setExamclass(getClassName1());
                std_exam2.setScore(getScore1());

                fakeExam.add(std_exam2);
            }
        }

        std_examMapper.insertFakeData(fakeExam);

    }
}
