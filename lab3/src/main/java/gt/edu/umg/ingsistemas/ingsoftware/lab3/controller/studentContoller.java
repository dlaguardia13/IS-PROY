package gt.edu.umg.ingsistemas.ingsoftware.lab3.controller;

import gt.edu.umg.ingsistemas.ingsoftware.lab3.model.Students;
import gt.edu.umg.ingsistemas.ingsoftware.lab3.service.studentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentContoller {
    @Autowired
    private studentService ser;
    
    @PostMapping("/sayHello/{name}")
    public String sayHelloC(@PathVariable String name)
    {
        return this.ser.sayHello(name);
    }
    
    @GetMapping("/viewall")
    public List<Students> getStudent()
    {
        return ser.getStudents();
    }
    
    @GetMapping("/viewbyid")
    public Students getStudentById(@RequestParam int id)
    {
        return this.ser.getStudentById(id);
    }
    
    @PostMapping("/insertStudent")
    public Students insertStudents(@RequestBody Students std)
    {
        return this.ser.insertStu(std);
    }
    
    @DeleteMapping("/delStudent/{id}")
    public void delstudents(@PathVariable int id)
    {
        this.ser.delById(id);
    }    
}
