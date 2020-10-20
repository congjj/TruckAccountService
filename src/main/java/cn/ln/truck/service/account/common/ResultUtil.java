package cn.ln.truck.service.account.common;

import java.util.Calendar;
import java.util.Date;

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

    public static Date getMonthFirstDate(Date date)
    {
        final Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        final int last = cal.getActualMinimum(Calendar.DAY_OF_MONTH);
        cal.set(Calendar.DAY_OF_MONTH, last);
        return cal.getTime();
    }


    public static Date getMonthLastDate(Date date)
    {
        final Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        final int last = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        cal.set(Calendar.DAY_OF_MONTH, last);
        cal.set(Calendar.HOUR,23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND,59);
        return cal.getTime();
    }


}
