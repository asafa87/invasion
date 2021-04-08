package com.asafasher.invasion.component;

import com.asafasher.invasion.api.invasion.InvasionDTO;
import com.asafasher.invasion.api.user.UserDTO;
import com.asafasher.invasion.mapper.InvasionMapper;
import com.asafasher.invasion.mapper.UserMapper;
import com.asafasher.invasion.persistence.repository.InvasionRepository;
import org.springframework.stereotype.Component;

@Component
public class InvasionBean {

    private InvasionRepository invasionRepository;
    private InvasionMapper invasionMapper;

    public InvasionBean(
            InvasionRepository invasionRepository,
            InvasionMapper userMapper
    ) {
        this.invasionRepository = invasionRepository;
        this.invasionMapper = invasionMapper;
    }


    public Long postInvasion(InvasionDTO invasionDTO) {
       return  this.invasionRepository.save(this.invasionMapper.unmap(invasionDTO)).getInvasionId();
    }
}
