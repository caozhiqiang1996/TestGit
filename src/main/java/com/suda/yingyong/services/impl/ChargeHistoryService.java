package com.suda.yingyong.services.impl;

import com.suda.yingyong.mapper.IChargeHistory;
import com.suda.yingyong.mapper.IUserMapper;
import com.suda.yingyong.pojo.ChargeHistory;
import com.suda.yingyong.pojo.User;
import com.suda.yingyong.services.IChargeHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
@Component

public class ChargeHistoryService implements IChargeHistoryService {

    @Autowired
    IChargeHistory iChargeHistory;
    @Autowired
    IUserMapper iUserMapper;

    @Override
    public List<ChargeHistory> getUserPaymentHistoryByUserId(Integer userid) {

        List<ChargeHistory>  chs = iChargeHistory.selectChargeAndUser(userid);

        for ( ChargeHistory ch : chs){

            iChargeHistory.updateChargeHistory2(1,ch.getCh_id());;

        }
        return chs;

    }

    @Override
    public List<User> getForbiddenUserIDByExpiredDate(Date targetDate) {
        return null;
    }
}
