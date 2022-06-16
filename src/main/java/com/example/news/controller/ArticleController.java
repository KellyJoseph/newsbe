package com.example.news.controller;

import com.example.news.model.Article;
import com.example.news.service.ArticleService;
import com.example.news.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class ArticleController {

    private ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        super();
        this.articleService = articleService;
    }

    @GetMapping("/home")
    public String getHelloWorld() {
        return "Hello World";
    }

    @GetMapping("/getTestArticle")
    public Article getTestArticle() {
        return new Article("This is a title", "This is a body");
    }

    @RequestMapping(path = "/createNewArticle", method = RequestMethod.POST)
    public ResponseEntity<Article> createNewArticle(@RequestBody Map<String, String> requestBody) {
        String title = requestBody.get("title");
        String subHeading = requestBody.get("subHeading");
        Integer authorId = Integer.valueOf(requestBody.get("authorId"));
        Article article = articleService.createNewArticle(title, subHeading, authorId);
        return new ResponseEntity<Article>(article, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Article> getAllArticles(){
        return articleService.getAllArticles();
    }

//    @GetMapping("{id}")
//    public ResponseEntity<Article> getArticleById(@PathVariable("id") long articleId){
//        return new ResponseEntity<Article>(articleService.getArticleById(articleId), HttpStatus.OK);
//    }
//
//    @PutMapping("{id}")
//    public ResponseEntity<Article> updateArticle(@PathVariable("id") long id
//            ,@RequestBody Article article){
//        Article article = articleService.updateArticle(article, id);
//        return new ResponseEntity<Article>(articleService.updateArticle(article, id), HttpStatus.OK);
//    }
//
//    @DeleteMapping("{id}")
//    public ResponseEntity<String> deleteArticle(@PathVariable("id") long id){
//        return new ResponseEntity<String>("Article deleted successfully!.", HttpStatus.OK);
//    }
}
