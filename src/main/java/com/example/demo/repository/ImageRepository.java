package com.example.demo.repository;

import com.example.demo.model.ImageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<ImageModel, Long> {

    ImageModel findByUserId(Long userId);
    ImageModel findByPostId(Long postId);

}
