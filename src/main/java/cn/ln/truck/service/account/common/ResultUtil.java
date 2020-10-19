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
        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.YEAR, date.getYear());
        cal.set(Calendar.MONTH,date.getMonth());
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 00);
        cal.set(Calendar.MINUTE, 00);
        cal.set(Calendar.SECOND, 00);
        return cal.getTime();
    }


    public static Date getMonthLastDate(Date date)
    {
        int year = date.getYear();  //年
        int month = date.getMonth(); //月

        Calendar cal = Calendar.getInstance();
        // 设置年份
        cal.set(Calendar.YEAR, year);
        // 设置月份
        // cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.MONTH, month+1); //设置当前月的上一个月
        // 获取某月最大天数
        //int lastDay = cal.getActualMaximum(Calendar.DATE);
        int lastDay = cal.getMinimum(Calendar.DATE); //获取月份中的最小值，即第一天
        // 设置日历中月份的最大天数
        //cal.set(Calendar.DAY_OF_MONTH, lastDay);
        cal.set(Calendar.DAY_OF_MONTH, lastDay - 1); //上月的第一天减去1就是当月的最后一天
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);

        return cal.getTime();
    }


}
