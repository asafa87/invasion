package com.asafasher.invasion.persistence.model;

import com.asafasher.invasion.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "invasion", catalog = "invasion")
public class Invasion {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long invasionId;
    private Long userId;
    private String location;
    private ZonedDateTime creationDate;
}
