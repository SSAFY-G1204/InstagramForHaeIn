package com.example.instagramclonecoding.controller;

import com.example.instagramclonecoding.entity.Post;
import com.example.instagramclonecoding.entity.User;
import com.example.instagramclonecoding.service.PostService;
import com.example.instagramclonecoding.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/home")
public class HomeController {


    @Autowired
    private PostService postService;

    //내가 팔로잉 하는 사람의 post 객체 찾기
    @GetMapping("/feeds")
    public List<Optional<Post>> GetMyFeed(@RequestParam long userId){
        return postService.findFolollowingPostsByUserId(userId);
    }

}
