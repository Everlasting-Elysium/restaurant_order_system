package com.elysiam.restaurant_order_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elysiam.restaurant_order_system.pojo.User;
import com.elysiam.restaurant_order_system.pojo.dto.ResponseMessage;
import com.elysiam.restaurant_order_system.pojo.dto.UserDto;
import com.elysiam.restaurant_order_system.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    @PostMapping
    public ResponseMessage<User> Add(@Validated @RequestBody UserDto user) {
        User userNew = userService.Create(user);
        return ResponseMessage.Success(userNew);
    }

    @GetMapping("{/userID}")
    public ResponseMessage<User> Get(@PathVariable Integer userID) {
        User userNew = userService.Get(userID);
        return ResponseMessage.Success(userNew);
    }

    @PostMapping
    public ResponseMessage<User> Edit(@Validated @RequestBody UserDto user) {
        User userNew = userService.Update(user);
        return ResponseMessage.Success(userNew);
    }
}
