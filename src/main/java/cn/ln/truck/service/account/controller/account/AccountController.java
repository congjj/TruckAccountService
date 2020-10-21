package cn.ln.truck.service.account.controller.account;


import cn.ln.truck.service.account.common.Result;
import cn.ln.truck.service.account.common.ResultUtil;
import cn.ln.truck.service.account.entity.account.AccountEntity;
import cn.ln.truck.service.account.service.account.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


@Api(value = "AccountController", tags = {"记账操作相关API"})
@RestController
@RequestMapping("/account")
public class AccountController
{
    @Autowired
    AccountService accountService;

    @ApiOperation(value = "获取记账信息")
    @RequestMapping(method = RequestMethod.POST, path = "getAccountByCode")
    public Result<Object> getAccountByCode(@RequestBody AccountEntity accountEntity)
    {
        return  ResultUtil.success(this.accountService.findAccountByCode(accountEntity.getTruckId(),accountEntity.getAccountDate()));
    }

    @ApiOperation(value = "记账操作")
    @RequestMapping(method = RequestMethod.POST, path = "insertAccount")
    public Result<Object> insertAccount(@RequestBody AccountEntity accountEntity)
    {
        return  ResultUtil.success(this.accountService.insertAccount(accountEntity));
    }

    @ApiOperation(value = "修改记账操作")
    @RequestMapping(method = RequestMethod.POST, path = "updateAccount")
    public Result<Object> updateAccount(@RequestBody AccountEntity accountEntity)
    {
        return  ResultUtil.success(this.accountService.updateAccount(accountEntity));
    }

}
