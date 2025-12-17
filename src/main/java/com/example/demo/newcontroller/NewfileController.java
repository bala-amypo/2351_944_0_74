



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