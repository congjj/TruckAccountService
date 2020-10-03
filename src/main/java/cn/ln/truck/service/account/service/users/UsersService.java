package cn.ln.truck.service.account.service.users;

import cn.ln.truck.service.account.entity.users.UsersEntity;


import java.util.List;


public interface UsersService
{
    UsersEntity findUserById(String id);

    List<UsersEntity> findUserAll();

    int insertUser(UsersEntity usersEntity);

    int updateUser(UsersEntity usersEntity );
}
