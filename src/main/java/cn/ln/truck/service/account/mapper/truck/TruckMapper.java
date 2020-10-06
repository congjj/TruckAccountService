package cn.ln.truck.service.account.mapper.truck;


import cn.ln.truck.service.account.entity.truck.TruckEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TruckMapper
{
    // 当传递的参数个数是两个以上是需要用 @Param
    TruckEntity findTruckByCode(@Param("code")String code, @Param("areaNumber")String areaNumber);
    List<TruckEntity> findTruckAll();
    int insertTruck(TruckEntity truckEntity);
}
