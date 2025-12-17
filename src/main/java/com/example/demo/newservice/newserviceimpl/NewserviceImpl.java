package com.example.demo.newservice.newserviceimpl;
import java.util.*;


public class NewserviceImpl implements Newservice {
private final NewfileRepo rep;
public NewserviceImpl(NewfileRepo rep){
    this.rep = rep;
}
@Override
public Newfile savedata(Newfile newww){
    return rep.save(newfile)
}
@Override
public Newfile getidval(Long id){
    return rep.get()
}

}