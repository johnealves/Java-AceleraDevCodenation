package com.challenge.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.util.List;

@Entity
@EntityListeners({
})
@Table(name = "acceleration")
public class Acceleration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Size(max = 100)
    private String name;

    @NotNull
    @Size(max = 50)
    private String slug;

    @NotNull
    @Column(name = "created_at")
    @CreatedDate
    private Timestamp createdAt;

    @NotNull
    @OneToMany
    private List<Candidate> candidates;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "challenge_id")
    private Challenge challengeId;
}