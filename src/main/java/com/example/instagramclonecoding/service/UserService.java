package com.example.instagramclonecoding.service;

import com.example.instagramclonecoding.entity.Relation;
import com.example.instagramclonecoding.entity.User;
import com.example.instagramclonecoding.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    @Autowired
    private  UserRepository userRepository;


    public List<User> findUsersByNickname(String keyword) {
        return userRepository.findUsersByNickname(keyword);
    }


}




