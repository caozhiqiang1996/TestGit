package com.suda.yingyong.services;

import com.suda.yingyong.pojo.ChargeHistory;
import com.suda.yingyong.pojo.User;

import java.sql.Date;
import java.util.List;

public interface IChargeHistoryService
{
    public List<ChargeHistory> getUserPaymentHistoryByUserId(Integer userid);
    public List<User> getForbiddenUserIDByExpiredDate(Date targetDate);
}
