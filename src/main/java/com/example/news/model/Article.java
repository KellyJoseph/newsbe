package com.example.news.model;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

import static org.springframework.util.Assert.notNull;


@Entity
@Table(name="article")
public class Article {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Column(name="title")
    private String title;
    @Column(name="subHeading")
    private String body;
    @Column(name="type") // make enum, news, review, op ed etc
    private String type;
    @Column(name="status") // make enum Published, Draft or Pending
    private String status;
    @Column(name="publishDate")
    private Date publishDate;
    @Column(name="views_number")
    private int viewsNumber;
    @Column(name="likes_number")
    private int likesNumber;
    @Column(name="score")
    private int score;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "author_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User author;

    public Article() {
    }

    public Article(String title, String body, User author) {
        // constructor with required field
        notNull(title, "Method called with null parameter (title)");
        notNull(body, "Method called with null parameter (body)");
        notNull(body, "Method called with null parameter (author)");
        notNull(body, "Method called with null parameter (publishDate)");

        this.title = title;
        this.body = body;
        this.author = author;
        this.publishDate = new Date();
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }

    public void setBody(String body) {
        this.body = body;
    }
    public String getBody() {
        return this.body;
    }

    public void setDate(Date date) {
        this.publishDate = publishDate;
    }
    public Date getDate() {
        return this.publishDate;
    }

    public Article(String title, String body) {
        super();
        this.title = title;
        this.body = body;
        this.publishDate = new Date();
    }

}