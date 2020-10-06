package cn.ln.truck.service.account.impl.truck;

import cn.ln.truck.service.account.entity.truck.TruckEntity;
import cn.ln.truck.service.account.mapper.truck.TruckMapper;
import cn.ln.truck.service.account.service.truck.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruckServiceImpl implements TruckService
{
    @Autowired
    TruckMapper truckMapper;

    @Override
    public TruckEntity findTruckByCode(String code,String areaNumber)
    {
        return this.truckMapper.findTruckByCode(code,areaNumber);
    }

    @Override
    public List<TruckEntity> findTruckAll()
    {
        return this.truckMapper.findTruckAll();
    }

    @Override
    public int insertUser(TruckEntity truckEntity)
    {
        return this.truckMapper.insertTruck(truckEntity);
    }
}
