package com.wcs.checkpoint3.entity;


import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "posts")
public class Posts {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    User user;

    @Column(nullable = false)
    private String message;

    @Column(nullable = false)
    private String imageUrl;


    @Column
    private Instant createdAt;

     public Posts() { }

        public Posts(String message, String imageUrl, Instant createdAt) {
                this.message = message;
                this.imageUrl = imageUrl;
                this.createdAt = createdAt;
        }

        // Getters

        public Long getId() {
            return id;
        }

        public User getUser() {
            return user;
        }

        public String getMessage() {
            return message;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public Instant getCreatedAt() {
            return createdAt;
        }

        //Setters

        public void setId(Long id) {
            this.id = id;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public void setCreatedAt(Instant createdAt) {
            this.createdAt = createdAt;
        }


}