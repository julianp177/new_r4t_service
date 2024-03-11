package com.r4t.new_r4t_service.Services;

import com.r4t.new_r4t_service.Model.RequirementModel;
import com.r4t.new_r4t_service.Model.TestcaseModel;
import com.r4t.new_r4t_service.Model.TestrunModel;
import com.r4t.new_r4t_service.Repository.RequirementRepository;
import com.r4t.new_r4t_service.Repository.TestcaseRepository;
import com.r4t.new_r4t_service.Repository.TestrunRepository;
import com.r4t.new_r4t_service.Repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Long.parseLong;

@Service
public class DataService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TestrunRepository testrunRepository;

    @Autowired
    private TestcaseRepository testcaseRepository;

    @Autowired
    private RequirementRepository requirementRepository;

    public DataService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    public List<TestrunModel> getData(Long userId) {
        List<TestrunModel> testruns = new ArrayList<>();
        testruns = testrunRepository.findAllData(userId);
        return testruns;
    }

    public List<RequirementModel> getRequirementData() {
        List<RequirementModel> req = new ArrayList<>();
        req = requirementRepository.findAll();
        return req;
    }

    public String addRequirement(String newRequirementData){
        RequirementModel newRequirement = new RequirementModel();
        String[] parts = newRequirementData.split(";");
        newRequirement.setBezeichnung(parts[0]);
        newRequirement.setBeschreibung(parts[1]);
        requirementRepository.save(newRequirement);
        return "Anforderung wurde hinzugefügt";
    }
    public String addTestrun(String newTestrunData){
        TestrunModel newTestrun = new TestrunModel();
        String[] parts = newTestrunData.split(";");
        newTestrun.setBezeichnung(parts[0]);
        newTestrun.setRequirement_ID(new BigInteger(parts[1]));
        testrunRepository.save(newTestrun);
        return "Testlauf wurde hinzugefügt";
    }
    public String addTestcase(String newTestcaseData){
        TestcaseModel newTestcase = new TestcaseModel();
        String[] parts = newTestcaseData.split(";");
        newTestcase.setBezeichnung(parts[0]);
        newTestcase.setRequirement_ID(new BigInteger(parts[1]));
        testcaseRepository.save(newTestcase);
        return "Testfall wurde hinzugefügt";
    }
    @Transactional
    public String addResult(String resultData) {
        String[] parts = resultData.split(";");
        testcaseRepository.addResultByTestcaseId(parts[0],parts[1]);
        return "Ergebnis wurde angepasst";
    }
    @Transactional
    public String assignTestcase(String assignmentData) {
        String[] parts = assignmentData.split(";");
        testcaseRepository.assignTestcaseByTestcaseId(parts[0],parts[1]);
        return "Testfall wurde zugewiesen";
    }
    @Transactional
    public String assignTester(String assignmentData) {
        String[] parts = assignmentData.split(";");
        testrunRepository.assignTesterByTestrunId(parts[0],parts[1]);
        return "Tester wurde zugewiesen";
    }
}
