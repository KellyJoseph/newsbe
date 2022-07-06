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
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="title")
    private String title;
    @Column(name="sub_heading")
    private String subHeading;

    @Column(name="type") // make enum, news, review, op ed etc
    private String type;

    @Column(name="status") // make enum Published, Draft or Pending
    private String status;

    @Column(name="publish_date")
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

    public Article() {}
    public Article(String title, String subHeading, User author) {
        notNull(title, "Method called with null parameter (title)");
        notNull(subHeading, "Method called with null parameter (body)");
        notNull(author, "Method called with null parameter (author)");

        this.title = title;
        this.subHeading = subHeading;
        this.author = author;
        this.publishDate = new Date();
    }

    public String setTitle(String title) {
        this.title = title;
        return title;
    }
    public String setSubHeading(String subHeading) {
        this.subHeading = subHeading;
        return subHeading;
    }
    public Date setDate(Date publishDate) {
        this.publishDate = publishDate;
        return this.publishDate;
    }


    public String getTitle() { return title;}
    public String getSubHeading() { return subHeading; }
    public Date getDate() { return publishDate; }
}