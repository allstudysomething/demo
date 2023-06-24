package com.example.demo.REST;

import com.example.demo.model.Post;
import com.example.demo.repository.Postrepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.net.ssl.SSLEngineResult;
import java.util.List;

//@Controller
@RestController
@RequestMapping("api/posts")
public class PostController {

    private final Postrepository postRepository;

    public PostController(Postrepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @GetMapping("/1")
    public ResponseEntity<List<Post>> one() {
        return ResponseEntity.status(HttpStatus.OK).body(postRepository.findAll());
//        return List<Post> findAll() {}
    }
}
