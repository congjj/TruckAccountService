package cn.ln.truck.service.account.mapper.subjects;


import cn.ln.truck.service.account.entity.subjects.SubjectsEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SubjectsMapper
{
    SubjectsEntity findSubjectsById(String Id);
    List<SubjectsEntity> findSubjectsByUserId(String userId);
    List<SubjectsEntity> findSubjectsAll();
    int insertSubject(SubjectsEntity subjectsEntity);
    int updateSubject(SubjectsEntity subjectsEntity );
}
