package cn.ln.truck.service.account.impl.account;

import cn.ln.truck.service.account.common.ResultUtil;
import cn.ln.truck.service.account.entity.account.AccountEntity;
import cn.ln.truck.service.account.mapper.account.AccountMapper;
import cn.ln.truck.service.account.service.account.AccountService;
import org.apache.ibatis.session.SqlSessionFactory;
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
        Date d1 = ResultUtil.getMonthFirstDate(accountDate);
        Date d2 = ResultUtil.getMonthLastDate(accountDate);
        return this.accountMapper .findAccountByCode(truckId,d1,d2);
    }

    @Override
    public int insertAccount(AccountEntity accountEntity)
    {
        return this.accountMapper .insertAccount(accountEntity );
    }

    @Override
    public int updateAccount(AccountEntity accountEntity)
    {
        return this.accountMapper.updateAccount(accountEntity);
    }

}
