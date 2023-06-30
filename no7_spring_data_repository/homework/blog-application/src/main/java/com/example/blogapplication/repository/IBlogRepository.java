package com.example.blogapplication.repository;

import com.example.blogapplication.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Long> {
//    @Query(value = "SELECT * FROM blog WHERE id LIKE :title", nativeQuery = true)
//    Page<Blog> searchByTitle(Pageable pageable, @Param("title") String title);

    Page<Blog> searchBlogsByTitleContaining(Pageable pageable, String tittle);

}
