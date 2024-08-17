package com.example.instagramclonecoding.repository;

import com.example.instagramclonecoding.entity.Post;
import com.example.instagramclonecoding.entity.Relation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RelationRepository extends JpaRepository<Relation, Long> {

    //followerId로 관계 찾기
    List<Relation> findRelationByFollowerId(Long userId);
}
