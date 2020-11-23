package com.bellapi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "document")
@Getter
@Setter
public class UserDocument{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Version
    private Integer version;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private User user;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "document_type_id")
    private Document document;

    @Column(name = "document_date", nullable = false)
    private Date date;

    @Column(name = "document_number", length = 10, nullable = false)
    private String documentNumber;



}
