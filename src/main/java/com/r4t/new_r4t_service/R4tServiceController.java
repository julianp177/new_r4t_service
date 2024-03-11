package com.r4t.new_r4t_service;

import com.r4t.new_r4t_service.Model.RequirementModel;
import com.r4t.new_r4t_service.Model.TestrunModel;
import com.r4t.new_r4t_service.Services.AuthService;
import com.r4t.new_r4t_service.Services.DataService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class R4tServiceController {

    private final AuthService authService;
    private final DataService dataService;

    public R4tServiceController(AuthService authService, DataService dataService) {
        this.authService = authService;
        this.dataService = dataService;
    }
    @GetMapping("/getData/{userId}") //Gibt alle Daten aus
    public List<TestrunModel> getData(@PathVariable Long userId) {
        return this.dataService.getData(userId);
    }
    @GetMapping("/get/usernames") //Gibt alle Daten aus
    public List<String> getUserName() {
        return this.authService.getUserNames();
    }
    @GetMapping("/usercheck/{userName}") //Gibt den Text der angegebenen Message aus
    public boolean checkUser(@PathVariable String userName) {
        return this.authService.checkUser(userName);
    }
    @GetMapping("/passwordcheck/{password}/{userName}") //Gibt den Text der angegebenen Message aus
    public boolean checkPassword(@PathVariable String password,@PathVariable String userName) {
        return this.authService.checkPassword(password,userName);
    }
    @GetMapping("/get/firstname/{username}")
    public String getFirstName(@PathVariable String username){
        return this.authService.getFirstName(username);
    }
    @GetMapping("/get/lastname/{username}")
    public String getLastName(@PathVariable String username){
        return this.authService.getLastName(username);
    }
    @GetMapping("/get/userid/{username}")
    public Integer getUserId(@PathVariable String username){
        return this.authService.getUserId(username);
    }
    @GetMapping("/get/req")
    public List<RequirementModel> getRequirement(){
        return this.dataService.getRequirementData();
    }
    @GetMapping("/get/role/{userId}")
    public String getRole(@PathVariable long userId){
        return this.authService.getRole(userId);
    }



    @PostMapping("/adduser")
    @ResponseStatus(HttpStatus.CREATED)
    public String addUser(@RequestBody String newUserData) {
        return authService.addUser(newUserData);
    }
    @PostMapping("/change/password")
    @ResponseStatus(HttpStatus.CREATED)
    public String changePassword(@RequestBody String newPasswordData) {
        return authService.changePassword(newPasswordData);
    }
    @PostMapping("/add/requirement")
    @ResponseStatus(HttpStatus.CREATED)
    public String addRequirement(@RequestBody String newRequirementData) {
        return dataService.addRequirement(newRequirementData);
    }
    @PostMapping("/add/testrun")
    @ResponseStatus(HttpStatus.CREATED)
    public String addTestrun(@RequestBody String newTestrunData) {
        return dataService.addTestrun(newTestrunData);
    }
    @PostMapping("/add/testcase")
    @ResponseStatus(HttpStatus.CREATED)
    public String addTestcase(@RequestBody String newTestcaseData) {
        return dataService.addTestcase(newTestcaseData);
    }
    @PostMapping("/add/result")
    @ResponseStatus(HttpStatus.CREATED)
    public String addResult(@RequestBody String resultData) {
        return dataService.addResult(resultData);
    }
    @PostMapping("/assign/testcase")
    @ResponseStatus(HttpStatus.CREATED)
    public String assignTestcase(@RequestBody String assignmentData) {
        return dataService.assignTestcase(assignmentData);
    }
    @PostMapping("/assign/tester")
    @ResponseStatus(HttpStatus.CREATED)
    public String assignTester(@RequestBody String assignmentData) {
        return dataService.assignTester(assignmentData);
    }
}
