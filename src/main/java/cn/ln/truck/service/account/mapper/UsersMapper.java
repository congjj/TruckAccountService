package cn.ln.truck.service.account.mapper;

import cn.ln.truck.service.account.entity.UsersEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UsersMapper
{
    UsersEntity findUserById(String id);
    List<UsersEntity> findUserAll();
}
