package com.bellapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "document")
@NoArgsConstructor
public class UserDocument{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Getter
    @Setter
    private Long id;

    @Version
    private Integer version;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @Getter
    @Setter
    private User user;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "document_type_id")
    private Document document;

    @Column(name = "document_date", nullable = false)
    @Getter
    @Setter
    private Date date;

    @Column(name = "document_number", length = 10, nullable = false)
    @Getter
    @Setter
    private String documentNumber;



}
