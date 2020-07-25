package com.naman.oj.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // uses id gen. by DB instead of auto
    private Long id;

    private String fullName;

    private String password;

    private boolean active;

    @ManyToMany(fetch = FetchType.EAGER) // or Lazy
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private List<Role> roles;

    private String email;

    public User() {
    }
}
