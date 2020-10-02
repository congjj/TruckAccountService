package cn.ln.truck.service.account.impl;

import cn.ln.truck.service.account.mapper.UsersMapper;
import cn.ln.truck.service.account.entity.UsersEntity;
import cn.ln.truck.service.account.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UsersService
{
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public UsersEntity findUserById(String id)
    {
        return this.usersMapper.findUserById(id);
    }

    @Override
    public List<UsersEntity> findUserAll()
    {
        return  this.usersMapper.findUserAll() ;
    }
}
