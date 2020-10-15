package cn.ln.truck.service.account.impl.subjects;

import cn.ln.truck.service.account.entity.subjects.SubjectsEntity;
import cn.ln.truck.service.account.mapper.subjects.SubjectsMapper;
import cn.ln.truck.service.account.service.service.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectsImpl implements SubjectsService
{
    @Autowired
    SubjectsMapper subjectsMapper;


    @Override
    public SubjectsEntity findSubjectsById(String Id)
    {
        return this.subjectsMapper.findSubjectsById(Id);
    }

    @Override
    public List<SubjectsEntity> findSubjectsByUserId(String userId)
    {
        return this.subjectsMapper.findSubjectsByUserId(userId);
    }

    @Override
    public List<SubjectsEntity> findSubjectsAll()
    {
        return this.subjectsMapper .findSubjectsAll();
    }

    @Override
    public int insertSubject(SubjectsEntity subjectsEntity)
    {
        return 0;
    }

    @Override
    public int updateSubject(SubjectsEntity subjectsEntity)
    {
        return 0;
    }
}
