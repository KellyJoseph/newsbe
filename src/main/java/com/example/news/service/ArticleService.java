package com.example.news.service;

import com.example.news.model.Article;
import com.example.news.model.User;
import com.example.news.repository.ArticleRepo;
import com.example.news.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {

    UserService userService;
    private final UserRepo userRepo;
    private final ArticleRepo articleRepo;
    public ArticleService(UserRepo userRepo, ArticleRepo articleRepo, UserService userService) {
        this.articleRepo = articleRepo;
        this.userRepo = userRepo;
        this.userService = userService;
    }

    public Article createNewArticle(String title, String body, Integer authorId) {
        User author = userRepo.findById(1);
        Article article = new Article(title, body, author);
        Article savedArticle = articleRepo.save(article);
        return savedArticle;
    }

    public Optional<Article> updateArticle(Article article, long id) {
        return articleRepo.findById(id);
    }

    public Optional<Article> getArticleById(long articleId) {
        return articleRepo.findById(articleId);
    }

    public List<Article> getAllArticles() {
        return articleRepo.findAll();
    }
}
