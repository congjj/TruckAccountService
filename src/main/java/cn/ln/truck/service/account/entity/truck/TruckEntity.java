package cn.ln.truck.service.account.entity.truck;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class TruckEntity
{
    private int id;
    private String areaNumber;
    private String code;
    private int driverId;
    private Date getDate;
    private int active;
}
