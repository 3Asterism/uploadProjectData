package com.akisan.uploadProjectData.service.Impl;

import com.akisan.uploadProjectData.entity.std_actv;
import com.akisan.uploadProjectData.entity.std_allinfo;
import com.akisan.uploadProjectData.entity.std_exam;
import com.akisan.uploadProjectData.mapper.std_actvMapper;
import com.akisan.uploadProjectData.mapper.std_allinfoMapper;
import com.akisan.uploadProjectData.mapper.std_examMapper;
import com.akisan.uploadProjectData.service.insertStd_InfoFakeData;
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
    @Autowired
    private std_actvMapper std_actvMapper;

    @Override
    public void insertFakeData() {
        List<std_allinfo> fakeName = new ArrayList<>();
        List<std_exam> fakeExam = new ArrayList<>();
        List<std_actv> fakeActv = new ArrayList<>();

        //生成50条std_allinfo信息
        for(int i=0;i<50;i++){
            std_allinfo std_info1 = new std_allinfo();

            std_info1.setName(getFamilyName());
            std_info1.setClassname(getClassName());
            std_info1.setInschool(getInSchool());
            std_info1.setAcademy(getAcademy());

            fakeName.add(std_info1);
        }

        std_allinfoMapper.insertFakeData(fakeName);

        //生成50条std_exam信息 id与name取自std_info
        for(int i=0;i<50;i++){
            std_exam std_exam1 = new std_exam();
            fakeName.get(i).setId(std_allinfoMapper.getStdId(fakeName.get(i).getName()).get(0).getId());
            std_exam1.setStdid(fakeName.get(i).getId());
            std_exam1.setName(fakeName.get(i).getName());
            std_exam1.setAcademy(fakeName.get(i).getAcademy());
            for(int l=0;l<3;l++){
                std_exam std_exam2 = new std_exam();
                std_exam2.setStdid(std_exam1.getStdid());
                std_exam2.setName(std_exam1.getName());
                std_exam2.setAcademy(std_exam1.getAcademy());
                std_exam2.setExamclass(getClassName1());
                std_exam2.setScore(getScore1());

                fakeExam.add(std_exam2);
            }
        }

        std_examMapper.insertFakeData(fakeExam);


        //生成50条std_actv信息 id与name取自std_info
        for(int i=0;i<50;i++){
            std_actv std_actv1 = new std_actv();
            fakeName.get(i).setId(std_allinfoMapper.getStdId(fakeName.get(i).getName()).get(0).getId());
            std_actv1.setStdid(fakeName.get(i).getId());
            std_actv1.setName(fakeName.get(i).getName());
            std_actv1.setAttempt(getAttempt());
            for(int l=0;l<3;l++){
                std_actv std_actv2 = new std_actv();
                std_actv2.setStdid(std_actv1.getStdid());
                std_actv2.setName(std_actv1.getName());
                std_actv2.setActvname(getActvName());
                std_actv2.setAttempt(std_actv1.getAttempt());

                fakeActv.add(std_actv2);
            }
        }

        std_actvMapper.insertFakeData(fakeActv);

    }
}
