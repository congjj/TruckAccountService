package cn.ln.truck.service.account.controller.users;

import cn.ln.truck.service.account.common.Result;
import cn.ln.truck.service.account.common.ResultUtil;
import cn.ln.truck.service.account.entity.users.LoginEntity;
import cn.ln.truck.service.account.entity.users.UsersEntity;
import cn.ln.truck.service.account.service.users.UsersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@Api(value = "UsersController", tags = {"用户操作相关API"})
@RestController
@RequestMapping("/user")
public class UsersController
{
    @Autowired
    private UsersService userService;


    @ApiOperation(value = "获取用户")
    @RequestMapping(method = RequestMethod.POST, path = "getUser")
    public Result<Object> getUser(@RequestBody String usercode)
    {
        UsersEntity user = userService.findUserById(usercode);
        if (user != null)
        {
            return ResultUtil.success(user);
        } else
        {
            return ResultUtil.success("用户不存在");
        }
    }

    @ApiOperation(value = "获取所有用户列表")
    @RequestMapping(method = RequestMethod.POST, path = "getUserList")
    public Result<Object> getUserList()
    {
        List<UsersEntity> users = userService.findUserAll();
        return ResultUtil.success(users);
    }

    @ApiOperation(value = "创建用户")
    @RequestMapping(method = RequestMethod.POST, path = "insertUser")
    public Object insertUser(@RequestBody UsersEntity usersEntity)
    {
        int count = userService.insertUser(usersEntity ) ;
        if(count>0)
        {
            return ResultUtil .success();
        }
        else {
            return ResultUtil.error("") ;
        }
    }

    @ApiOperation(value = "修改用户")
    @RequestMapping(method = RequestMethod.POST, path = "updateUser")
    public Object updateUser(@RequestBody UsersEntity usersEntity)
    {
        int count = userService.updateUser(usersEntity) ;
        if(count>0)
        {
            return ResultUtil .success();
        }
        else {
            return ResultUtil.error("") ;
        }
    }

    @ApiOperation(value = "用户登录")
    @RequestMapping(method = RequestMethod.POST, path = "userLogin")
    public Object userLogin(@RequestBody LoginEntity loginEntity)
    {
        UsersEntity user = userService.findUserById(loginEntity.getUserId());
        if (user == null)
        {
            return ResultUtil.error(loginEntity.getUserId()+"  不存在!");

        } else
        {
            if(user.getActive()==1)
            {
                if(user.getPassword().equals(loginEntity.getPassword()))
                {
                    return ResultUtil.success(user);
                }
                else
                {
                    return ResultUtil.error("密码错误！");
                }
            }
            else
            {
                return ResultUtil.error(loginEntity.getUserId()+"  已被停用!");
            }

        }
    }












//    所有的 api 都用 post
//    @RequestMapping("/getUser/{id}")
//    public Result<Object> getUser(@PathVariable String id) {
//        UsersEntity user = userService.findUserById(id);
//        if (user != null) {
//            return ResultUtil.success(SUCCESS, user);
//        } else {
//            return ResultUtil.success(OPERATION_ERROR, "用户不存在");
//        }
//
//    }




}
