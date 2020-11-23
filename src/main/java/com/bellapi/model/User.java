package com.bellapi.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Version
    private Integer version;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "office_id")
    private Office office;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id")
    private Country country;

    @Column(name = "first_name", length = 50, nullable = false)
    private String firstName;

    @Column(name = "second_name", length = 50)
    private String secondName;

    @Column(name = "middle_name", length = 50)
    private String middleName;

    @Column(name = "position", length = 50, nullable = false)
    private String position;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "is_identified", nullable = false)
    private Boolean isIdentified;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL,optional = false, fetch = FetchType.LAZY)
    private Document document;
}
