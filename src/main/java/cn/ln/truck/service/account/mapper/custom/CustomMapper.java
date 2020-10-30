package cn.ln.truck.service.account.mapper.custom;

import cn.ln.truck.service.account.entity.custom.CustomEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomMapper
{
    CustomEntity findCustomById(String Id);
    List<CustomEntity> findCustomByUserId(String userId);
    List<CustomEntity> findCustomAll();
    int insertCustom(CustomEntity customEntity);
    int updateCustom(CustomEntity customEntity );
}
