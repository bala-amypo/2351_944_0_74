package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.newentity.Newfile;

@Repository
public interface NewfileRepo extends JpaRepository<NewfileRepo,Long>{

}