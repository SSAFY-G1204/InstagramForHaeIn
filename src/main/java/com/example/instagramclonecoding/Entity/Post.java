package com.example.instagramclonecoding.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "posts")
public class Post {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId ;


    //내용
    @Column(length = 100)
    private String content;

    //좋아요 수
    @Column(length = 100, nullable = false)
    private String liking;

    //등록일
    @Column(nullable = false)
    private Date rgtDate;

    //유저키
    @OneToMany(mappedBy ="post")
    @Column(nullable = false)
    private List<Like> likes = new ArrayList<Like>();

    @OneToMany(mappedBy ="post")
    @Column(nullable = false)
    private List<Comment> comments = new ArrayList<Comment>();

    @OneToMany(mappedBy = "post")
    @Column(nullable=false)
    private List<Media> medias = new ArrayList<Media>();

}
