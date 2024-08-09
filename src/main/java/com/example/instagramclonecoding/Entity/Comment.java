package com.example.instagramclonecoding.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;
    @Column(nullable = false)
    private String content;
    @Column(nullable = false)
    private Date rgtDate;

    @ManyToOne
    @JoinColumn(name="postId")
    private Post post;
}
