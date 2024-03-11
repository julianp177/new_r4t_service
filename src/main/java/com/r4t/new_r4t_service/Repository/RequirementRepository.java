package com.r4t.new_r4t_service.Repository;


import com.r4t.new_r4t_service.Model.RequirementModel;
import com.r4t.new_r4t_service.Model.TestrunModel;
import com.r4t.new_r4t_service.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RequirementRepository extends JpaRepository<RequirementModel,String> {

    @Query("SELECT r FROM RequirementModel r WHERE r.requirement_ID = :requirement_ID")
    List<RequirementModel> findReqData(@Param("requirement_ID") Long requirement_ID);
}
