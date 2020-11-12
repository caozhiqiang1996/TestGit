package com.suda.yingyong.mapper;

import com.suda.yingyong.pojo.Bids;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public interface IBids {
    @Select("select * from tb_bids where bids_create_time between #{start_time} and #{end_time}")
    List<Bids> SearchBids(@Param("start_time") Date start_time, @Param("end_time") Date end_time);
}
