package cn.ln.truck.service.account.controller.truck;


import cn.ln.truck.service.account.common.Result;
import cn.ln.truck.service.account.common.ResultUtil;
import cn.ln.truck.service.account.entity.truck.TruckEntity;
import cn.ln.truck.service.account.entity.users.UsersEntity;
import cn.ln.truck.service.account.service.truck.TruckService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@Api(value = "TruckController", tags = {"货车操作相关API"})
@RestController
@RequestMapping("/truck")
public class TruckController
{
    @Autowired
    TruckService truckService;

    @ApiOperation(value = "获取货车信息")
    @RequestMapping(method = RequestMethod.POST, path = "getTruck")
    public Result<Object> getTruck(@RequestBody TruckEntity truckEntity)
    {
        return  ResultUtil.success(this.truckService.findTruckByCode(truckEntity.getCode(),truckEntity.getAreaNumber()));
    }

    @ApiOperation(value = "获取所有货车列表")
    @RequestMapping(method = RequestMethod.POST, path = "getTruckList")
    public Result<Object> getTruckList()
    {
        return ResultUtil.success(  this.truckService .findTruckAll());
    }



}
