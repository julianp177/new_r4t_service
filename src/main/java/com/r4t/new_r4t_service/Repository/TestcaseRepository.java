package com.r4t.new_r4t_service.Repository;


import com.r4t.new_r4t_service.Model.TestcaseModel;
import com.r4t.new_r4t_service.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TestcaseRepository extends JpaRepository<TestcaseModel,String> {

    @Modifying
    @Query("UPDATE TestcaseModel t SET t.ergebnis = :ergebnis WHERE t.testcase_ID = :testcase_ID")
    void addResultByTestcaseId(@Param("ergebnis") String ergebnis,@Param("testcase_ID") String testcase_ID);

    @Modifying
    @Query("UPDATE TestcaseModel t SET t.testrun_ID = :testrun_ID WHERE t.testcase_ID = :testcase_ID")
    void assignTestcaseByTestcaseId(@Param("testrun_ID") String testrun_ID,@Param("testcase_ID") String testcase_ID);
}
