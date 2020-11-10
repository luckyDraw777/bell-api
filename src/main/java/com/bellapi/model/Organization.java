package com.bellapi.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "organization")
@NoArgsConstructor
public class Organization{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Getter
    @Setter
    private Long id;

    @Version
    private Integer version;

    @Column(name = "name", length = 50, nullable = false)
    @Getter
    @Setter
    private String name;

    @Column(name = "full_name", length = 100, nullable = false)
    @Getter
    @Setter
    private String fullName;

    @Column(name = "inn", length = 10, nullable = false)
    @Getter
    @Setter
    private String inn;

    @Column(name = "kpp", length = 10, nullable = false)
    @Getter
    @Setter
    private String kpp;

    @Column(name = "address", length = 100, nullable = false)
    @Getter
    @Setter
    private String address;

    @Column(name = "phone", length = 20)
    @Getter
    @Setter
    private String phone;

    @Column(name = "is_active", nullable = false)
    @Getter
    @Setter
    private Boolean isActive;

    @OneToMany(mappedBy = "organization",cascade = CascadeType.ALL)
    @Getter
    @Setter
    private Set<Office> offices;

}
