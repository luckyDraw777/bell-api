package com.bellapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "document_type")
@NoArgsConstructor
public class Document{

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

    @OneToMany(mappedBy = "document", fetch = FetchType.LAZY)
    @Getter
    @Setter
    private Set<UserDocument> userDocuments;

}
