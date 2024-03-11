package com.r4t.new_r4t_service.Repository;


import com.r4t.new_r4t_service.Model.TestrunModel;
import com.r4t.new_r4t_service.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TestrunRepository extends JpaRepository<TestrunModel,String> {

    @Query("SELECT t FROM TestrunModel t WHERE t.user_ID = :user_ID")
    List<TestrunModel> findAllData(@Param("user_ID") Long user_ID);

    @Modifying
    @Query("UPDATE TestrunModel t SET t.user_ID = :user_ID WHERE t.testrun_ID = :testrun_ID")
    void assignTesterByTestrunId(@Param("user_ID") String user_ID,@Param("testrun_ID") String testrun_ID);
}
