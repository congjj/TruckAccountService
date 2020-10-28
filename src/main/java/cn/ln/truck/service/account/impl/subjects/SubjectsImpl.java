package cn.ln.truck.service.account.impl.subjects;

import cn.ln.truck.service.account.entity.subjects.SubjectsEntity;
import cn.ln.truck.service.account.mapper.subjects.SubjectsMapper;
import cn.ln.truck.service.account.service.subjects.SubjectsService;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.JSONValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<SubjectsEntity> findSubjectsByUserIdAndTruckId(String userId, String truckId)
    {
        List<SubjectsEntity>list = findSubjectsByUserId(userId);
        List<SubjectsEntity>resultList = new ArrayList<SubjectsEntity>();
        for (int i=0;i<list.size();i++)
        {
            String jsonStr = list.get(i).getTrucksId();
            if(jsonStr==null || jsonStr.trim() .length()==0)
            {
                resultList.add(list.get(i));
            }
            else
            {
                JSONObject jsonObject = (JSONObject) JSONValue.parse(jsonStr);
                JSONArray truckIds = (JSONArray) jsonObject.get("ids");
                for (int j = 0; j < truckIds.size(); j++)
                {
                    if( truckIds.get(j).toString().equals(truckId))
                    {
                        resultList.add(list.get(i)) ;
                    }
                }
            }
        }
        return resultList;
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
