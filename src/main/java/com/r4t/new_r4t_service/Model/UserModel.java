package com.r4t.new_r4t_service.Model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="USERS")
public class UserModel {
    @Id
    @Column(name = "user_ID", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_ID;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "passwort")
    private String passwort;

    @Column(name = "vorname")
    private String vorname;

    @Column(name = "nachname")
    private String nachname;

    @Column(name = "email")
    private String email;

    @Column(name = "role")
    private String role;

    @OneToMany(targetEntity = TestrunModel.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "user_ID", referencedColumnName = "user_ID")
    private List<TestrunModel> testrun_ID;
}
