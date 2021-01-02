package cn.ln.truck.service.account.impl.custom;

import cn.ln.truck.service.account.entity.custom.CustomEntity;
import cn.ln.truck.service.account.mapper.custom.CustomMapper;
import cn.ln.truck.service.account.service.custom.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomImpl implements CustomService
{
    @Autowired
    CustomMapper customMapper;

    @Override
    public CustomEntity findCustomById(String Id)
    {
        return this.customMapper.findCustomById(Id);
    }

    @Override
    public List<CustomEntity> findCustomByUserId(String userId)
    {
        return this.customMapper .findCustomByUserId(userId);
    }

    @Override
    public List<CustomEntity> findCustomAll()
    {
        return this.customMapper .findCustomAll();
    }

    @Override
    public int insertCustom(CustomEntity customEntity)
    {
        customEntity.setActive(1);
        if(customEntity .getName()==null || customEntity .getTel()==null)
        {
            return 0;
        }
        return  this.customMapper.insertCustom(customEntity);
    }

    @Override
    public int updateCustom(CustomEntity customEntity)
    {
        return this.customMapper .updateCustom(customEntity);
    }
}
