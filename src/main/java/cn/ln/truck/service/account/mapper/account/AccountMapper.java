package cn.ln.truck.service.account.mapper.account;


import cn.ln.truck.service.account.entity.account.AccountEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;


@Mapper
public interface AccountMapper
{
    // 当传递的参数个数是两个以上是需要用 @Param
    List<AccountEntity> findAccountByCode(@Param("truckId")int truckId, @Param("accountDate")Date accountDate,@Param("accountDate1")Date accountDate1);
    int insertAccount(AccountEntity accountEntity);


}
