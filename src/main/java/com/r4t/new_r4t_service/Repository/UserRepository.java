package com.r4t.new_r4t_service.Repository;


import com.r4t.new_r4t_service.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserModel,String> {

    @Query("SELECT u.userName FROM UserModel u WHERE u.userName = :userName")
    String checkUserByUserName(@Param("userName") String userName);

    @Query("SELECT u.passwort FROM UserModel u WHERE u.userName = :userName")
    String getPassword(@Param("userName") String userName);

    @Query("SELECT u.vorname FROM UserModel u WHERE u.userName = :userName")
    String getFirstName(@Param("userName") String userName);

    @Query("SELECT u.nachname FROM UserModel u WHERE u.userName = :userName")
    String getLastName(@Param("userName") String userName);

    @Query("SELECT u.user_ID FROM UserModel u WHERE u.userName = :userName")
    Integer getUserId(@Param("userName") String userName);

    @Query("SELECT u.userName FROM UserModel u")
    List<String> getUserNames();

    @Query("SELECT u.role FROM UserModel u WHERE u.user_ID =:user_ID")
    String getRoleById(@Param("user_ID") Long user_ID);

    @Modifying
    @Query("UPDATE UserModel u SET u.passwort = :newPassword WHERE u.userName = :userName")
    void changePasswordByUsername(@Param("newPassword") String newPassword,@Param("userName") String userName);
}
