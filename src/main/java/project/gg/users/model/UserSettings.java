package project.gg.users.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "user_settings")
public record UserSettings(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_settings")
    UUID idSettings,

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    User userId,

    @Column(name = "dark_mode", nullable = false)
    Boolean darkMode,

    @Column(nullable = false)
    Boolean notifications
) {}
