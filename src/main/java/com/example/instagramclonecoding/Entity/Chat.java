package com.example.instagramclonecoding.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "chats")
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ChannelId;
    @Column(nullable = false)
    private Long receivedId;
    @Column(nullable = false)
    private String content;

    @ManyToOne
    @JoinColumn(name="userId")
    private User user;

}
