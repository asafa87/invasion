package com.asafasher.invasion.component;

import com.asafasher.invasion.api.user.UserDTO;
import com.asafasher.invasion.mapper.UserMapper;
import com.asafasher.invasion.persistence.repository.InvasionRepository;
import com.asafasher.invasion.persistence.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class UserBean{

    private UserRepository userRepository;
    private UserMapper userMapper;

    public UserBean(
            UserRepository userRepository,
            UserMapper userMapper
    ) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    public UserDTO getUserById(Long id) {
        return this.userMapper.map(this.userRepository.getUserByID(id));

    }
}
