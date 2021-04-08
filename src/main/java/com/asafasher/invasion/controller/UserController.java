package com.asafasher.invasion.controller;

import com.asafasher.invasion.api.user.UserDTO;
import com.asafasher.invasion.component.UserBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserBean userBean;

    public UserController(
            UserBean userBean
    ) {
        this.userBean = userBean;
    }

    @GetMapping("/{userID}")
    public UserDTO getUserDetails(@PathVariable Long userID) {
        return userBean.getUserById(1L);
    }

}
