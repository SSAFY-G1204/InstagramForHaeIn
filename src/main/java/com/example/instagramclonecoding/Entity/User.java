package com.example.instagramclonecoding.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String provider;

    @OneToMany(mappedBy="users")
    private List<Relation> relations = new ArrayList<>();

    //일대일
    @OneToOne(mappedBy="users")
    private Profile profile;

    //users에 의해 매핑 되었다.
    @OneToMany(mappedBy ="user")
    private List<Like> likes = new ArrayList<Like>();

    @OneToMany(mappedBy ="user")
    private List<Chat> chats = new ArrayList<Chat>();

}
