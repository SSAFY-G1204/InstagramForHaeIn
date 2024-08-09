package com.example.instagramclonecoding.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "relations")
public class Relation {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long relationId;

    @ManyToOne
    @JoinColumn(name = "followingId")
    private User users;


    @Column(nullable = false)
    private int followerId;

}
