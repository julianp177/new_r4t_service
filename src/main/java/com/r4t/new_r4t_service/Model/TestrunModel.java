package com.r4t.new_r4t_service.Model;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;
import java.util.List;

@Data
@Entity
@Table(name="TESTRUN")
public class TestrunModel {
    @Id
    @Column(name = "testrun_ID", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger testrun_ID;

    @Column(name = "bezeichnung")
    private String bezeichnung;

    @Column(name = "requirement_ID")
    private BigInteger requirement_ID;

    @Column(name = "user_ID")
    private Long user_ID;

    @OneToMany(targetEntity = TestcaseModel.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "testrun_ID", referencedColumnName = "testrun_ID")
    private List<TestcaseModel> testcase_ID;
}
