package cn.ln.truck.service.account.entity.custom;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ApiModel(description = "客户实体模型")
@Getter
@Setter
@ToString
public class CustomEntity
{
    @ApiModelProperty(value = "主键", required = false)
    private int id;
    @ApiModelProperty(value = "电话号码", required = false)
    private String tel;
    @ApiModelProperty(value = "地址", required = false)
    private String address;
    @ApiModelProperty(value = "是否启用", required = false)
    private int active;
}
