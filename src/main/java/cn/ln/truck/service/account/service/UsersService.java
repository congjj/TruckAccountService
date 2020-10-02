package cn.ln.truck.service.account.service;

import cn.ln.truck.service.account.entity.UsersEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UsersService
{
    UsersEntity findUserById(String id);

    List<UsersEntity> findUserAll();
}
