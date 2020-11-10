package com.bellapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "country")
@NoArgsConstructor
public class Country{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Getter
    @Setter
    private Long id;

    @Version
    private Integer version;

    @Column(name = "name", length = 255, nullable = false)
    @Getter
    @Setter
    private String name;

    @Column(name = "code", length = 3, nullable = false)
    @Getter
    @Setter
    private String code;

    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY)
    @Getter
    @Setter
    private Set<User> users;
}
