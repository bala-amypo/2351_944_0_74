package com.example.demo.newservice;
import com.example.demo.newentity.NewFile;


public interface Newservice{
    NewFile savedata(NewFile newfile);
    NewFile getidval(Long id);

}