package cn.ln.truck.service.account.service.custom;

import cn.ln.truck.service.account.entity.custom.CustomEntity;

import java.util.List;

public interface CustomService
{
    CustomEntity findCustomById(String Id);
    List<CustomEntity> findCustomByUserId(String userId);
    List<CustomEntity> findCustomAll();
    int insertCustom(CustomEntity customEntity);
    int updateCustom(CustomEntity customEntity );
}
