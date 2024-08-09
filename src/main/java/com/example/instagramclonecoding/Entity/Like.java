package com.example.instagramclonecoding.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "likes")
public class Like {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long likeId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "postId")
    private Post post;

//    @ManyToOne
//    @Column(nullable = false)
//    private long userId;
}
