package com.bellapi.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "office")
@Getter
@Setter
public class Office{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Version
    private Integer version;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "org_id")
    private Organization organization;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "address", length = 100)
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive;

    @OneToMany(mappedBy = "office", fetch = FetchType.LAZY)
    private List<User> users;


}
