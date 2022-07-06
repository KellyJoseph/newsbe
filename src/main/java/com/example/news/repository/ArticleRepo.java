package com.example.news.repository;

import com.example.news.model.Article;
import com.example.news.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface ArticleRepo extends JpaRepository<Article, Long> {

//    @Query(value = "SELECT * FROM article", nativeQuery = true)
//    Collection<? extends Article> getAllArticles();
    @Query(value = "SELECT * FROM article", nativeQuery = true)
    List<Article> getAllArticles();


    @Query("select article from Article article where article.id = ?1")
    Article findById(Integer articleId);
}
