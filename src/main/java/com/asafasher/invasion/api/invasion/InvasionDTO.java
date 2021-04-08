package com.asafasher.invasion.api.invasion;

import com.asafasher.invasion.enums.Gender;
import lombok.Builder;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
@Builder
public class InvasionDTO {

    private Long invasionId;
    private ZonedDateTime creationDate;
    private Long userId;
    private String location;
}
