package com.r4t.new_r4t_service.Model;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;
import java.util.List;

@Data
@Entity
@Table(name="REQUIREMENT")
public class RequirementModel {
    @Id
    @Column(name = "requirement_ID", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger requirement_ID;

    @Column(name = "bezeichnung")
    private String bezeichnung;

    @Column(name = "beschreibung")
    private String beschreibung;

    @OneToMany(targetEntity = TestrunModel.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "requirement_ID", referencedColumnName = "requirement_ID")
    private List<TestrunModel> testrun_ID;

    @OneToMany(targetEntity = TestcaseModel.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "requirement_ID", referencedColumnName = "requirement_ID")
    private List<TestcaseModel> testcase_ID;
}
