package org.latinosystems.employeeDashboard.service;

import org.latinosystems.employeeDashboard.model.TestTable;
import org.latinosystems.employeeDashboard.repository.TestTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class TestTableService {

    private final TestTableRepository testTableRepository;

    @Autowired
    public TestTableService(TestTableRepository testTableRepository){
        this.testTableRepository = testTableRepository;
    }
    public List<TestTable> getTestTable(){
        return testTableRepository.findAll() ;
    }

    public void addNewTest(TestTable testTable) {
        Optional<TestTable> testTableOptional = testTableRepository.findTestTableByDescription(testTable.getDescription());
        if(testTableOptional.isPresent()){
            throw new IllegalStateException("description taken");
        }
        testTableRepository.save(testTable);
    }

    public void deleteTestTable(Long testTableid) {
        boolean exist = testTableRepository.existsById(testTableid);
        if(!exist){
            throw new IllegalStateException("Test with the id " + testTableid + " does not exists");
        }
        testTableRepository.deleteById(testTableid);
    }

    @Transactional
    public void updateTestTable(Long testTableId, String description) {
        TestTable testTable = testTableRepository.findById(testTableId).orElseThrow(() -> new IllegalStateException("Test with id " + testTableId + " does not exists"));
        if (description != null && description.length() > 0 && !Objects.equals(testTable.getDescription(), description)){
            Optional<TestTable> testTableOptional = testTableRepository.findTestTableByDescription(description);
            if(testTableOptional.isPresent()){
                throw new IllegalStateException("description taken");
            }
            testTable.setDescription(description);
        }
    }
}
