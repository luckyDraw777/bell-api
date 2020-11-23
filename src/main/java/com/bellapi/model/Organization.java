package com.bellapi.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "organization")
@Getter
@Setter
public class Organization{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Version
    private Integer version;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "full_name", length = 100, nullable = false)
    private String fullName;

    @Column(name = "inn", length = 10, nullable = false)
    private String inn;

    @Column(name = "kpp", length = 10, nullable = false)
    private String kpp;

    @Column(name = "address", length = 100, nullable = false)
    private String address;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive;

    @OneToMany(mappedBy = "organization",cascade = CascadeType.ALL)
    private List<Office> offices;

}
