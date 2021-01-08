package com.wcs.checkpoint3.entity;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

    @Entity
    @Table(name= "user")

    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;


        @Column(nullable = false)
        private String firstname;

        @Column(nullable = false)
        private String lastname;


        @Column
        private Instant createdAt;

         public User() { }

            public User(String firstname, String lastname, Instant createdAt) {

                this.firstname = firstname;
                this.lastname = lastname;
                this.createdAt = createdAt;
            }

            // Getters

            public Long getId() {
                return id;
            }

            public String getFirstname() {
                return firstname;
            }

            public String getLastname() {
                return lastname;
            }

            public Instant getCreatedAt() {
                return createdAt;
            }

            //Setters

            public void setId(Long id) {
                this.id = id;
            }

            public void setFirstname(String firstname) {
                this.firstname = firstname;
            }

            public void setLastname(String lastname) {
                this.lastname = lastname;
            }

            public void setCreatedAt(Instant createdAt) {
                this.createdAt = createdAt;