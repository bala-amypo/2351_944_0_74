package com.example.demo.newservice.newserviceimpl;
import java.util.*;


public class NewserviceImpl implements Newservice {
private final NewfileRepo rep;
public NewserviceImpl(NewfileRepo rep){
    this.rep = rep;
}
@Override
public Newfile savedata(Newfile newww){
    return rep.save(newww)
}
@Override
public Newfile getidval(Long id){
    return rep.get(id)
}
@Override
public List<NewFile>getall(){
    return new ArrayList<>();
    
}

}