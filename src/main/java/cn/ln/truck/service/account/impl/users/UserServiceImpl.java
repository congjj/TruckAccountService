package cn.ln.truck.service.account.impl.users;

import cn.ln.truck.service.account.mapper.users.UsersMapper;
import cn.ln.truck.service.account.entity.users.UsersEntity;
import cn.ln.truck.service.account.service.users.UsersService;
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

    @Override
    public int insertUser(UsersEntity usersEntity)
    {
        usersEntity.setActive(1);
        if(usersEntity.getId()==null || usersEntity.getName()==null || usersEntity .getPassword() ==null)
        {
            return 0;
        }
        return this.usersMapper .insertUser(usersEntity );
    }

    @Override
    public int updateUser(UsersEntity usersEntity)
    {
        return  this.usersMapper .updateUser(usersEntity );
    }

}
