package com.bellapi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "country")
@Getter
@Setter
public class Country{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Version
    private Integer version;

    @Column(name = "name", length = 255, nullable = false)
    private String name;

    @Column(name = "code", length = 3, nullable = false)
    private String code;

}
