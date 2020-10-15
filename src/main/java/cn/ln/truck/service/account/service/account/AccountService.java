package cn.ln.truck.service.account.service.account;

import cn.ln.truck.service.account.entity.account.AccountEntity;
import java.util.Date;
import java.util.List;


public interface AccountService
{
    List<AccountEntity> findAccountByCode(int truckId,  Date accountDate);
    int insertAccount(AccountEntity accountEntity );
}
