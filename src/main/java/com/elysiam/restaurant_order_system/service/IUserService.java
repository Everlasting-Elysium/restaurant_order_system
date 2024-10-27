package com.elysiam.restaurant_order_system.service;

import com.elysiam.restaurant_order_system.pojo.User;
import com.elysiam.restaurant_order_system.pojo.dto.UserDto;

public interface IUserService {
    /*
     * 新增用户
     * @param user
     */
    User Create(UserDto user);

    User Get(Integer userID);

    User Update(UserDto user);

}
