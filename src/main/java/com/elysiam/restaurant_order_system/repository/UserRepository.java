package com.elysiam.restaurant_order_system.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.elysiam.restaurant_order_system.pojo.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer>{

}
