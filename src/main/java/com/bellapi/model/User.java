package com.bellapi.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user")
@NoArgsConstructor
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Getter
    @Setter
    private Long id;

    @Version
    private Integer version;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "office_id")
    @Getter
    @Setter
    private Office office;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id")
    @Getter
    @Setter
    private Country country;

    @Column(name = "first_name", length = 50, nullable = false)
    @Getter
    @Setter
    private String firstName;

    @Column(name = "second_name", length = 50)
    @Getter
    @Setter
    private String secondName;

    @Column(name = "middle_name", length = 50)
    @Getter
    @Setter
    private String middleName;

    @Column(name = "position", length = 50, nullable = false)
    @Getter
    @Setter
    private String position;

    @Column(name = "phone", length = 20)
    @Getter
    @Setter
    private String phone;

    @Column(name = "is_identified", nullable = false)
    @Getter
    @Setter
    private Boolean isIdentified;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL,optional = false, fetch = FetchType.LAZY)
    @Getter
    @Setter
    private Document document;
}
