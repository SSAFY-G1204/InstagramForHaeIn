package com.example.instagramclonecoding.service;


import com.example.instagramclonecoding.entity.Relation;
import com.example.instagramclonecoding.repository.RelationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelationService {

    @Autowired
    private RelationRepository relationRepository;

    public List<Relation> findRelationByFollowerId(Long userId) {
        return relationRepository.findRelationByFollowerId(userId);
    }
}
