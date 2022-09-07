package com.fabiomirgo.compositepk.domain.movement;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movimento_manual")
@Entity(name = "movimento_manual")
@IdClass(MovementId.class)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ManualMovementEntity {

    @Id
    @Column(name = "dat_mes")
    private Integer month;

    @Id
    @Column(name = "dat_ano")
    private Integer year;

    @Id
    @Column(name = "num_lancamento")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer release;

    @Id
    @Column(name = "cod_produto")
    private String productCode;

    @Id
    @Column(name = "cod_cosif")
    private String cosifCode;

    @Column(name = "des_descricao")
    private String description;
}
