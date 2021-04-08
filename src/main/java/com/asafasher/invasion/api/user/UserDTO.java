package com.asafasher.invasion.api.user;

import com.asafasher.invasion.enums.Gender;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDTO {

    private Long userId;
    private String name;
    private String lastName;
    private Gender gender;
}
