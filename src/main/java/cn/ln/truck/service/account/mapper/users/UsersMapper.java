package cn.ln.truck.service.account.mapper.users;

import cn.ln.truck.service.account.entity.users.UsersEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsersMapper
{
    UsersEntity findUserById(String id);
    List<UsersEntity> findUserAll();
    int insertUser(UsersEntity usersEntity);
}
