package cn.ln.truck.service.account.entity.account;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class AccountEntity
{
    private int id;
    private int subjectId;
    private int truckId;
    private String subjectName;
    private double price;
    private double count;
    private double result;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private Date accountDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private Date modifyTime;
    private int active;
    private int customId;
    private String remark;
}
