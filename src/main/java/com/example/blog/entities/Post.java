package com.example.blog.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "text", length = 10000)
    private String content;
    @Column(name = "published_at")
    private Instant publishedAt;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    @Column(name = "upvote")
    private Integer upvote;
}