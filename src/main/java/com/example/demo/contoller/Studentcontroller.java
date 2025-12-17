package com.example.project.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.project.entity.Studententity;
import com.example.project.service.Studentservice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
@RestController
public class Studentcontroller {
    @Autowired
    Studentservice src;
    @PostMapping("/post")
    public Studententity postdata(@RequestBody Studententity st){// @Reqbody -- json la irukurathah obj ah store pannum 
        return src.savedata(st);
      
    }
    @GetMapping("/get")
    public List<Studententity> getdata(){
        return src.retdata();

    }
    @GetMapping("/get{id}")
    public Studententity getIdval(@PathVariable int id){// particular variable ooda data mattum
        return src.id(id);

    }
    @PutMapping("/put/{id}")
    public Studententity update(@PathVariable int id , @RequestBody Studententity st){
        return src.upt(id,st);
   }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id,@RequestBody Studententity st){
        return src.dlt(id);
    }

    

}
