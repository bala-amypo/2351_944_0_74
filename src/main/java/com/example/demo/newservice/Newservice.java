package com.example.demo.newservice;
import com.example.demo.newentity.NewFile;
import java.util.*;

public interface Newservice{
    NewFile savedata(NewFile newfile);
    NewFile getidval(Long id);
    List<NewFile>getall();
    NewFile update(Long id,Newfile newww);
    void delete(Long id);

}