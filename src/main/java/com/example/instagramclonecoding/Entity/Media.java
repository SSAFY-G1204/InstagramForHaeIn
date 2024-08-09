package com.example.instagramclonecoding.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "medias")
public class Media {

     // @MapsId를 통해 Users 엔티티의 userId와 동일한 값이 설정됩니다.

    @Id
    @ManyToOne
    @MapsId
    @JoinColumn(name = "postId")  // 외래 키로 profiles 테이블에서 userId를 사용합니다.
    private Post post;

    @Column
    private String imageSrc;

}
