package com.suda.yingyong.services;

import com.suda.yingyong.pojo.Bids;

import java.util.Date;
import java.util.List;

public interface IBidsService {
    List<Bids> SearchBids(Date start_time, Date end_time);
}
