package project.gg.users.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "users")
public record User(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    UUID userId,

    @Column(nullable = false)
    String username,

    @Column(nullable = false)
    String email,

    @Column(nullable = false)
    String password,

    @Column(name = "creation_date", nullable = false)
    String creationDate
) {}
