package cn.ln.truck.service.account.controller.subjects;


import cn.ln.truck.service.account.common.Result;
import cn.ln.truck.service.account.common.ResultUtil;
import cn.ln.truck.service.account.service.subjects.SubjectsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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


    @ApiOperation(value = "获取科室列表", notes = "")
    @RequestMapping(method = RequestMethod.GET, path = "getSubjectByUserAndTruckId")
    public Result<Object> getSubjectByUserAndTruckId(
            @ApiParam(value = "用户Id", required = false) @RequestParam(required = false) String userId,
            @ApiParam(value = "货车Id", required = false) @RequestParam(required = false) String truckId
    ) {

        return  ResultUtil.success(this.subjectsService.findSubjectsByUserIdAndTruckId(userId,truckId));
    }




}
