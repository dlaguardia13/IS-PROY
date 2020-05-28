/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingsistemas.ingsoftware.lab3.dao;

import java.util.List;
import gt.edu.umg.ingsistemas.ingsoftware.lab3.model.Students;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository extends CrudRepository<Students, Integer>{
   
    
}
