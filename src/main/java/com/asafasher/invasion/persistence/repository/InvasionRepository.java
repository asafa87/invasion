package com.asafasher.invasion.persistence.repository;

import com.asafasher.invasion.enums.Gender;
import com.asafasher.invasion.persistence.model.Invasion;
import com.asafasher.invasion.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvasionRepository extends JpaRepository<Invasion, Long> {
}
