package cn.ln.truck.service.account.impl.account;

import cn.ln.truck.service.account.entity.account.AccountEntity;
import cn.ln.truck.service.account.mapper.account.AccountMapper;
import cn.ln.truck.service.account.service.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class AccountImpl implements AccountService
{
    @Autowired
    AccountMapper accountMapper;

    @Override
    public List<AccountEntity> findAccountByCode(int truckId, Date accountDate)
    {
        return this.accountMapper .findAccountByCode(truckId,accountDate);
    }

}
