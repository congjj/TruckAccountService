package cn.ln.truck.service.account.common;

import static cn.ln.truck.service.account.common.ResultEnum.OPERATION_ERROR;
import static cn.ln.truck.service.account.common.ResultEnum.SUCCESS;

public class ResultUtil
{
    public static Result<Object> success(Object object)
    {
        ResultEnum resultEnum=SUCCESS;
        Result<Object> result = new Result<>();
        result.setCode(resultEnum.getCode());
        result.setMsg(resultEnum.getMsg());
        result.setData(object);
        return result;
    }
    public static Result<Object> success()
    {
        ResultEnum resultEnum=SUCCESS;
        Result<Object> result = new Result<>();
        result.setCode(resultEnum.getCode());
        result.setMsg(resultEnum.getMsg());
        return result;
    }

    public static Result<Object> error( String reason)
    {
        ResultEnum resultEnum=OPERATION_ERROR;
        Result<Object> result = new Result<>();
        result.setCode(resultEnum.getCode());
        result.setMsg(reason);
        return result;
    }
}
