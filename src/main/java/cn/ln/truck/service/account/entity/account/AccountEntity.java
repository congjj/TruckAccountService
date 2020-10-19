package cn.ln.truck.service.account.entity.account;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel(description = "记账实体模型")
@Getter
@Setter
@ToString
public class AccountEntity
{
    @ApiModelProperty(value = "主键", required = false)
    private int id;
    @ApiModelProperty(value = "记账Id", required = false)
    private int subjectId;
    @ApiModelProperty(value = "货车Id", required = false)
    private int truckId;
    @ApiModelProperty(value = "项目名称", required = false)
    private String subjectName;
    @ApiModelProperty(value = "记账单价", required = false)
    private double price;
    @ApiModelProperty(value = "记账数量", required = false)
    private double count;
    @ApiModelProperty(value = "记账数目", required = false)
    private double result;
    @ApiModelProperty(value = "记账日期", required = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private Date accountDate;
    @ApiModelProperty(value = "记账日期1", required = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private Date accountDate1;
    @ApiModelProperty(value = "修改时间", required = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private Date modifyTime;
    @ApiModelProperty(value = "是否有效", required = false)
    private int active;
    @ApiModelProperty(value = "客户Id", required = false)
    private int customId;
    @ApiModelProperty(value = "客户名称", required = false)
    private String customName;
    @ApiModelProperty(value = "备注", required = false)
    private String remark;
}
