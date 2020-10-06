package cn.ln.truck.service.account.service.truck;

import cn.ln.truck.service.account.entity.truck.TruckEntity;

import java.util.List;

public interface TruckService
{
    TruckEntity findTruckByCode(String code,String areaNumber);
    List<TruckEntity> findTruckAll();
    int insertUser(TruckEntity truckEntity);
}
