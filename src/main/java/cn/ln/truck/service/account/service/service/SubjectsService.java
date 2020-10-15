package cn.ln.truck.service.account.service.service;

import cn.ln.truck.service.account.entity.subjects.SubjectsEntity;

import java.util.List;

public interface SubjectsService
{
    SubjectsEntity findSubjectsById(String Id);
    List<SubjectsEntity> findSubjectsByUserId(String userId);
    List<SubjectsEntity> findSubjectsAll();
    int insertSubject(SubjectsEntity subjectsEntity);
    int updateSubject(SubjectsEntity subjectsEntity );
}
