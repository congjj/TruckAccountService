package cn.ln.truck.service.account.controller.subjects;


import cn.ln.truck.service.account.common.Result;
import cn.ln.truck.service.account.common.ResultUtil;
import cn.ln.truck.service.account.service.service.SubjectsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "SubjectsController", tags = {"费用科目操作相关API"})
@RestController
@RequestMapping("/subjects")
public class SubjectsController
{
    @Autowired
    SubjectsService subjectsService;

    @ApiOperation(value = "获取用户的费用项目")
    @RequestMapping(method = RequestMethod.POST, path = "getSubjectsByUserId")
    public Result<Object> getSubjectsByUserId(@RequestBody String  userId)
    {
        return  ResultUtil.success(this.subjectsService.findSubjectsByUserId(userId));
    }

    @ApiOperation(value = "用过id获取费用项目")
    @RequestMapping(method = RequestMethod.POST, path = "getSubjectById")
    public Result<Object> getSubjectById(@RequestBody String Id)
    {
        return  ResultUtil.success(this.subjectsService.findSubjectsById(Id));
    }

    @ApiOperation(value = "获取所有费用项目")
    @RequestMapping(method = RequestMethod.POST, path = "getSubjects")
    public Result<Object> getSubjects()
    {
        return  ResultUtil.success(this.subjectsService.findSubjectsAll());
    }

}
