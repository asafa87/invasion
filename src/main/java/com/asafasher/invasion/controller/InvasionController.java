package com.asafasher.invasion.controller;

import com.asafasher.invasion.api.invasion.InvasionDTO;
import com.asafasher.invasion.component.InvasionBean;
import com.asafasher.invasion.component.UserBean;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/invasion")
public class InvasionController {

    private InvasionBean invasionBean;

    public InvasionController(
            InvasionBean invasionBean
    ) {
        this.invasionBean = invasionBean;
    }


    @PostMapping("/")
    public Long postInvasion(@RequestBody InvasionDTO invasionDTO) {
        return this.invasionBean.postInvasion(invasionDTO);
    }
}
