package com.asafasher.invasion.mapper;

import com.asafasher.invasion.api.invasion.InvasionDTO;
import com.asafasher.invasion.api.user.UserDTO;
import com.asafasher.invasion.persistence.model.Invasion;
import com.asafasher.invasion.persistence.model.User;
import org.springframework.stereotype.Component;

@Component
public class InvasionMapper extends Mapper<Invasion, InvasionDTO> {

    @Override
    public InvasionDTO map(Invasion t) {
        return InvasionDTO.builder()
                .creationDate(t.getCreationDate())
                .userId(t.getUserId())
                .location(t.getLocation())
                .invasionId(t.getInvasionId())
                .build();
    }

    @Override
    public Invasion unmap(InvasionDTO d) {
        return Invasion.builder()
                .creationDate(d.getCreationDate())
                .userId(d.getUserId())
                .location(d.getLocation())
                .build();
    }
}