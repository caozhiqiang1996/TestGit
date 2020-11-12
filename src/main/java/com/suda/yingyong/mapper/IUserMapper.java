package com.suda.yingyong.mapper;

import com.suda.yingyong.pojo.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IUserMapper {
    List<User> selectUserAndCharge(int user_id);

}
