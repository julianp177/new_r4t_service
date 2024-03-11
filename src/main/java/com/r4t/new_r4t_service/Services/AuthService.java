package com.r4t.new_r4t_service.Services;

import com.r4t.new_r4t_service.Model.TestrunModel;
import com.r4t.new_r4t_service.Model.UserModel;
import com.r4t.new_r4t_service.Repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

@Service
public class AuthService {

    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public String getRole(Long userId) {
        return this.userRepository.getRoleById(userId);
    }

    public boolean checkUser(String userName) {
        if(userRepository.checkUserByUserName(userName)!=null){
            return true;
        }else{
            return false;
        }
    }

    public String getPassword(String userName) {
        return userRepository.getPassword(userName);
    }
    public boolean checkPassword(String requestedPassword, String userName) {
        String password = getPassword(userName);
        return requestedPassword.equals(password);
    }

    public String getFirstName(String userName){
        return this.userRepository.getFirstName(userName);
    }

    public String getLastName(String userName){
        return this.userRepository.getLastName(userName);
    }

    public Integer getUserId(String userName){
        return this.userRepository.getUserId(userName);
    }

    public List<String> getUserNames() { return this.userRepository.getUserNames();}

    public String addUser(String newUserData){

        UserModel newUser = new UserModel();

        String[] parts = newUserData.split(";");

        newUser.setUserName(parts[0]);
        newUser.setPasswort(parts[1]);
        newUser.setVorname(parts[2]);
        newUser.setNachname(parts[3]);

        userRepository.save(newUser);

        return "User wurde hinzugefügt";
    }
    @Transactional
    public String changePassword(String newPasswordData) {

        String[] parts = newPasswordData.split(";");
        userRepository.changePasswordByUsername(parts[0],parts[1]);

        return "Passwort wurde geändert";
    }
}
