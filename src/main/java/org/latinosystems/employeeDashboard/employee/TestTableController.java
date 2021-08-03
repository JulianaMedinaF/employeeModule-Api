package org.latinosystems.employeeDashboard.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/testTable")
public class TestTableController {

    private final TestTableService testTableService;

    @Autowired
    public TestTableController(TestTableService testTableService){
        this.testTableService = testTableService;
    }
    @GetMapping
    public List<TestTable> getTestTable(){
        return testTableService.getTestTable();
    }

    @PostMapping
    public void registerNewTest(@RequestBody TestTable testTable){
        testTableService.addNewTest(testTable);
    }

    @DeleteMapping(path ="{testTableId}")
    public void deleteTestTable(@PathVariable("testTableId") Long testTableid ){
        testTableService.deleteTestTable(testTableid);
    }

    @PutMapping(path ="{testTableId}")
    public void updateTestTable(@PathVariable("testTableId") Long testTableId,
                                @RequestParam(required = false) String description){
        testTableService.updateTestTable(testTableId, description);

    }

}
