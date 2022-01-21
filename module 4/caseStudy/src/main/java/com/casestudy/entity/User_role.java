package com.casestudy.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_role")
public class User_role {
    @Id
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role_id;

    @ManyToOne
    @JoinColumn(name = "username", nullable = false)
    private User username;

    public User_role() {
    }

    public User_role(Role role_id, User userName) {
        this.role_id = role_id;
    }

    public Role getRole_id() {
        return role_id;
    }

    public void setRole_id(Role role_id) {
        this.role_id = role_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }
}
