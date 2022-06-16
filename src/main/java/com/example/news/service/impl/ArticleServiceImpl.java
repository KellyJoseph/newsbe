package com.example.news.service.impl;

import com.example.news.exception.ResourceNotFoundException;
import com.example.news.model.Article;
import com.example.news.model.User;
import com.example.news.repository.ArticleRepo;
import com.example.news.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
//public class ArticleServiceImpl implements ArticleService {
//    private ArticleRepo articleRepo;
//
//    public ArticleServiceImpl(ArticleRepo articleRepo) {
//        super();
//        this.articleRepo = articleRepo;
//    }
//
//    @Override
//    public Article saveArticle(Article article) {
//        return this.articleRepo.save(article);
//    }
//
//    @Override
//    public Article getArticleById(Long id) {
////		Optional<Employee> employee = employeeRepo.findById(id);
////		if(employee.isPresent()) {
////			return employee.get();
////		}else {
////			throw new ResourceNotFoundException("Employee", "Id", id);
////		}
//        return articleRepo.findById(id).orElseThrow(() ->
//                new ResourceNotFoundException("Article", "Id", id));
//
//    }
//
//    @Override
//    public List<Article> getAllArticles() {
//        return articleRepo.findAll();
//    }
//
//    @Override
//    public Article updateArticle(Article article, Long id) {
//
//        // we need to check whether employee with given id is exist in DB or not
//        Article existingArticle = articleRepo.findById(id).orElseThrow(
//                () -> new ResourceNotFoundException("Article", "Id", id));
//
//        //existingArticle.setFirstName(Article.getFirstName());
//        //existingArticle.setLastName(Article.getLastName());
//        //existingArticle.setEmail(Article.getEmail());
//        // save existing Article to DB
//        articleRepo.save(existingArticle);
//        return existingArticle;
//    }
//
//    @Override
//    public Void deleteArticle(Long id) {
//        // check whether a Article exist in a DB or not
//        articleRepo.findById(id).orElseThrow(() ->
//                new ResourceNotFoundException("Article", "Id", id));
//        articleRepo.deleteById(id);
//        return null;
//    }
//
