package com.r4t.new_r4t_service.Model;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;

@Data
@Entity
@Table(name="TESTCASE")
public class TestcaseModel {
    @Id
    @Column(name = "testcase_ID", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger testcase_ID;

    @Column(name = "bezeichnung")
    private String bezeichnung;

    @Column(name = "testrun_ID")
    private BigInteger testrun_ID;

    @Column(name = "requirement_ID")
    private BigInteger requirement_ID;

    @Column(name = "ergebnis")
    private String ergebnis;
}
