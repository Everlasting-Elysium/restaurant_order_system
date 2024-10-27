package com.elysiam.restaurant_order_system.pojo.dto;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
public class UserDto {
    private Integer userId;
    @NotBlank(message = "用户名不能为空")
    private String userName;
    @Length(min = 6,max = 12)
    @NotBlank(message = "密码名不能为空")
    private String password;    
}
