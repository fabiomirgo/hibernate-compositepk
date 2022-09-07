package com.fabiomirgo.compositepk.domain.movement;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MovementId implements Serializable {
    private Integer month;
    private Integer year;
    private Integer release;
    private String productCode;
    private String cosifCode;
}
