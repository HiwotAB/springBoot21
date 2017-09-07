package com.hiwotab.springboot21.model;

import javax.persistence.*;
import java.util.Set;
@Entity
public class UseRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(unique = true)
    private String urole;
    @ManyToMany(mappedBy="roles",fetch=FetchType.LAZY)
    private Set<NewUsers> users;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrole() {
        return urole;
    }

    public void setUrole(String urole) {
        this.urole = urole;
    }

    public Set<NewUsers> getUsers() {
        return users;
    }

    public void setUsers(Set<NewUsers> users) {
        this.users = users;
    }

    public void addUser(NewUsers user)
    {
        this.users.add(user);
    }
}
