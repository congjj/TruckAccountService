package cn.ln.truck.service.account.common;


import lombok.Getter;

@Getter
public enum ResultEnum
{
    UNKONW_ERROR(1001, "未知错误"),
    OPERATION_ERROR(201,"失败"),
    SUCCESS(200, "成功");


    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg)
    {
        this.code = code;
        this.msg = msg;
    }
}
