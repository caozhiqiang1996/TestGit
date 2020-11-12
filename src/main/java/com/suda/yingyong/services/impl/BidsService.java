package com.suda.yingyong.services.impl;

import com.suda.yingyong.mapper.IBids;
import com.suda.yingyong.pojo.Bids;
import com.suda.yingyong.services.IBidsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Component
public class BidsService implements IBidsService {
    @Autowired
    IBids iBids;

    @Override
    public List<Bids> SearchBids(Date start_time, Date end_time) {
        return iBids.SearchBids(start_time,end_time);
    }
}
