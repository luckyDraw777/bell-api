package com.bellapi.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "office")
@NoArgsConstructor
public class Office{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Getter
    @Setter
    private Long id;

    @Version
    private Integer version;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "org_id")
    private Organization organization;

    @Column(name = "name", length = 50)
    @Getter
    @Setter
    private String name;

    @Column(name = "address", length = 100)
    @Getter
    @Setter
    private String address;

    @Column(name = "phone")
    @Getter
    @Setter
    private String phone;

    @Column(name = "is_active", nullable = false)
    @Getter
    @Setter
    private Boolean isActive;

    @OneToMany(mappedBy = "office", fetch = FetchType.LAZY)
    @Getter
    @Setter
    private Set<User> users;


}
