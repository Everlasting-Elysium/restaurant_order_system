package com.elysiam.restaurant_order_system.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elysiam.restaurant_order_system.pojo.User;
import com.elysiam.restaurant_order_system.pojo.dto.UserDto;
import com.elysiam.restaurant_order_system.repository.UserRepository;

@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User Create(UserDto user) {
        User userPojo = new User();
        BeanUtils.copyProperties(user, userPojo);
        return userRepository.save(userPojo);
    }

    @Override
    public User Get(Integer userID) {
        return userRepository.findById(userID).orElseThrow(() -> {
            throw new IllegalArgumentException("用户不存在");
        });
    }

    @Override
    public User Update(UserDto user) {
        User userPojo = new User();
        BeanUtils.copyProperties(user, userPojo);
        return userRepository.save(userPojo);
    }

}
