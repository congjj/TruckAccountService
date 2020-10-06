package cn.ln.truck.service.account.controller.account;


import cn.ln.truck.service.account.common.Result;
import cn.ln.truck.service.account.common.ResultUtil;
import cn.ln.truck.service.account.entity.account.AccountEntity;
import cn.ln.truck.service.account.service.account.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "AccountController", tags = {"记账操作相关API"})
@RestController
@RequestMapping("/account")
public class AccountController
{
    @Autowired
    AccountService accountService;

    @ApiOperation(value = "获取货车信息")
    @RequestMapping(method = RequestMethod.POST, path = "getAccountByCode")
    public Result<Object> getTruck(@RequestBody AccountEntity accountEntity)
    {
        return  ResultUtil.success(this.accountService.findAccountByCode(accountEntity.getTruckId(),accountEntity.getAccountDate()));
    }




}
