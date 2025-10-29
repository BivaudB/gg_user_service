package project.gg.users.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "users_role")
public record UserRoles(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_role")
    UUID idRole,

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    User userId,

    @Column(name = "role_name", nullable = false)
    String roleName
) {}
