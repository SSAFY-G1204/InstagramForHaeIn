package com.example.instagramclonecoding.service;

import com.example.instagramclonecoding.entity.Post;
import com.example.instagramclonecoding.entity.Relation;
import com.example.instagramclonecoding.entity.User;
import com.example.instagramclonecoding.repository.PostRepository;
import com.example.instagramclonecoding.repository.RelationRepository;
import com.example.instagramclonecoding.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private RelationRepository relationRepository;

    public Optional<Post> findByUserId(Long userId) {
        return postRepository.findByUserUserId(userId);
    }

    // 사용자가 팔로잉 한 사람들이 작성한 포스트들을 찾는 메서드
    public List<Optional<Post>> findFolollowingPostsByUserId(Long userId) {

        // 관계 테이블에서 내가 파리미터로 준 userId를 follower로 두고 있는 관계들을 찾는다.
        List<Relation> relations = relationRepository.findRelationByFollowerId(userId);
        // 사용자에게 내보내줄 객체 만들고
        List<Optional<Post>> posts = new ArrayList<Optional<Post>>();
        // relation 관계에서 userId찾고 찾은 userId 기반으로 post 객체들을 찾는다.
        for( int idx = 0 ; idx<relations.size(); idx++){
            Optional<Post> tgtpost = findByUserId(relations.get(0).getUsers().getUserId());
            posts.add(tgtpost);
        }
        return posts;
    }






}
