package com.commission.util;

import com.commission.bean.Commission;
import com.commission.dto.CommissionDto;
import org.springframework.beans.BeanUtils;

public class AppUtils {

    public static CommissionDto entityToDto(Commission commission){
        CommissionDto commissionDto=new CommissionDto();
        BeanUtils.copyProperties(commission,commissionDto);
        return commissionDto;
    }

    public static Commission dtoToEntity(CommissionDto accDto){
        Commission commission=new Commission();
        BeanUtils.copyProperties(accDto,commission);
        return commission;
    }

}
