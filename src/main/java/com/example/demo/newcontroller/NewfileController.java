import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
package com.example.demo.newcontroller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class NewfileController{
    @Autowired

    Newservice src
    @PostMapping("/post")
    public Newfile savedata(@RequestBody  newww){
        return src.savedata(newww);
      
    }
    @GetMapping("/get")
    public Newfile getidval(@PathVariable Long id ){
        return src.getidval();

    }
    @GetMapping("/get/{id}"){
        public Newfile findall(){
            return src.findall();
        }
    }
   
    @PutMapping("/put/{id}") //update
    public Newfile update(@PathVariable int id , @RequestBody Newfile newww ){
        return src.updatet(id,newww);
   }
    @DeleteMapping("/delete/{id}") // delete
    public String delete(@PathVariable int id,@RequestBody Newfile newww){
        return src.delete(id);
    }

}