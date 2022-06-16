package com.example.news.repository;

import com.example.news.model.Article;
import com.example.news.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArticleRepo extends JpaRepository<Article, Long> {
    @Query("select article from Article article")
    List<Article> getAllArticles();

    @Query("select article from Article article where article.id = ?1")
    Article findById(Integer article_id);
}
