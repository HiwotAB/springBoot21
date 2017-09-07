package com.hiwotab.springboot21.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
@Entity
@Table(name="USER_DATA")
public class NewUsers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="email",nullable = false)
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="firs_tname")
    private String firstname;
    @Column(name="last_name")
    private String lastname;
    @Column(name="enabled")
    private boolean enabled;
    @Column(name="username")
    private String username;
//    @Column(name="selectVal")
//    private String selectVal;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(joinColumns=@JoinColumn(name="user_id"),
            inverseJoinColumns=@JoinColumn(name="role_id"))
    private Collection<UseRole> roles;

    public NewUsers()
    {
        this.roles=new ArrayList<UseRole>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Collection<UseRole> getRoles() {
        return roles;
    }

    public void setRoles(Collection<UseRole> roles) {
        this.roles = roles;
    }

    public void addRole(UseRole role)
    {
        this.roles.add(role);
    }

//        public String getSelectVal() {
//            return selectVal;
//        }
//
//        public void setSelectVal(String selectVal) {
//            this.selectVal = selectVal;
//        }
}
