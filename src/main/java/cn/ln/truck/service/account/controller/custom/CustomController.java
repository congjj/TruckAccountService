package cn.ln.truck.service.account.controller.custom;


import cn.ln.truck.service.account.common.Result;
import cn.ln.truck.service.account.common.ResultUtil;
import cn.ln.truck.service.account.entity.custom.CustomEntity;
import cn.ln.truck.service.account.service.custom.CustomService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "CustomController", tags = {"客户操作相关API"})
@RestController
@RequestMapping("/custom")
public class CustomController
{
    @Autowired
    CustomService customService;

    @ApiOperation(value = "用过id获取客户信息")
    @RequestMapping(method = RequestMethod.POST, path = "getCustomById")
    public Result<Object> getCustomById(@RequestBody String Id)
    {
        return  ResultUtil.success(this.customService.findCustomById(Id));
    }

    @ApiOperation(value = "用过userId获取客户信息")
    @RequestMapping(method = RequestMethod.POST, path = "getCustomByUserId")
    public Result<Object> getCustomByUserId(@RequestBody String userId)
    {
        return  ResultUtil.success(this.customService.findCustomByUserId(userId));
    }


    @ApiOperation(value = "获取所有客户信息")
    @RequestMapping(method = RequestMethod.POST, path = "getCustomAll")
    public Result<Object> getCustomAll()
    {
        return  ResultUtil.success(this.customService.findCustomAll());
    }


    @ApiOperation(value = "创建客户信息")
    @RequestMapping(method = RequestMethod.POST, path = "insertCustom")
    public Result<Object> insertCustom(@RequestBody CustomEntity customEntity)
    {
        return  ResultUtil.success(this.customService.insertCustom(customEntity));
    }


    @ApiOperation(value = "修改客户信息")
    @RequestMapping(method = RequestMethod.POST, path = "updateCustom")
    public Result<Object> updateCustom(@RequestBody CustomEntity customEntity)
    {
        return  ResultUtil.success(this.customService.updateCustom(customEntity));
    }


}
