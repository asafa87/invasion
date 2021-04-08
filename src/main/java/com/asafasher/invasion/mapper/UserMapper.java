package com.asafasher.invasion.mapper;

import com.asafasher.invasion.api.user.UserDTO;
import com.asafasher.invasion.persistence.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper extends Mapper<User, UserDTO> {

    @Override
    public UserDTO map(User t) {
        return UserDTO.builder()
                .userId(t.getUserId())
                .gender(t.getGender())
                .name(t.getName())
                .lastName(t.getLastName())
                .build();
    }

    @Override
    public User unmap(UserDTO d) {
        return User.builder()
                .userId(d.getUserId())
                .gender(d.getGender())
                .name(d.getName())
                .lastName(d.getLastName())
                .build();
    }

}