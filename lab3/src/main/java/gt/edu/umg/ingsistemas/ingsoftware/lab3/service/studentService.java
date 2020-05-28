/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingsistemas.ingsoftware.lab3.service;

import gt.edu.umg.ingsistemas.ingsoftware.lab3.dao.studentRepository;
import gt.edu.umg.ingsistemas.ingsoftware.lab3.model.Students;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentService {
    
    @Autowired
    private studentRepository repo;
    
    public List<Students> getStudents()
    {
        List<Students> allst = (List <Students>) repo.findAll();    
        return allst;
    }
    
    public Students getStudentById(Integer id)
    {
        return this.repo.findById(id).get();
    }
    
    public Students insertStu(Students std)
    {
        return this.repo.save(std);
    }
    
    public void delById(Integer id)
    {
        this.repo.deleteById(id);
    }
    public String sayHello(String name)
    {
        return "Hello "+name+", This is my IS´s project";
    }
    
}
