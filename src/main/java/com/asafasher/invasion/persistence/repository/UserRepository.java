package com.asafasher.invasion.persistence.repository;

import com.asafasher.invasion.enums.Gender;
import com.asafasher.invasion.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public default User getUserByID(Long id) {
        return User.builder().userId(id).name("asaf").lastName("asher").gender(Gender.MALE).build();
    }
}
