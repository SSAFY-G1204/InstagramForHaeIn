package com.example.instagramclonecoding.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "profiles")
public class Profile {

//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long profileId;
    @Id
    @OneToOne
    @MapsId
    @JoinColumn(name = "userId")  // 외래 키로 profiles 테이블에서 userId를 사용합니다.
    private User users;



    @Column(nullable = false)
    private String profileImg;
    @Column(nullable = false)
    private int profileText;

    @Column(nullable = false)
    private int followings;

    @Column(nullable = false)
    private int followers;
}
