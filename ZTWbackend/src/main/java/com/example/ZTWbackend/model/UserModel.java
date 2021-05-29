package com.example.ZTWbackend.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "userId")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "preferred_color")
    private String preferredColor;
    @Column(name = "avatar")
    private String avatar;
    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
    private List<BoardModel> ownedBoards;
    @ManyToMany(mappedBy = "userList", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<BoardModel> collaborationBoards;
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private Set<AssignmentModel> assignments;

    public UserModel() {
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getPreferredColor() {
        return preferredColor;
    }

    public void setPreferredColor(String preferredColor) {
        this.preferredColor = preferredColor;
    }

    public List<BoardModel> getCollaborationBoards() {
        return collaborationBoards;
    }

    public void setCollaborationBoards(List<BoardModel> collaborationBoards) {
        this.collaborationBoards = collaborationBoards;
    }

    public Set<AssignmentModel> getDateAssignment() {
        return assignments;
    }

    public void setDateAssignment(Set<AssignmentModel> dateAssignment) {
        this.assignments = dateAssignment;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Set<AssignmentModel> getAssignments() {
        return assignments;
    }

    public void setAssignments(Set<AssignmentModel> assignments) {
        this.assignments = assignments;
    }

    public List<BoardModel> getOwnedBoards() {
        return ownedBoards;
    }

    public void setOwnedBoards(List<BoardModel> ownedBoards) {
        this.ownedBoards = ownedBoards;
    }
}
