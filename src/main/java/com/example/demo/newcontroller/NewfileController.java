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
            return src.findall()
        }
    }
   
    @PutMapping("/put/{id}") //update
    public Studententity update(@PathVariable int id , @RequestBody Studententity st){
        return src.updatet(id,st);
   }
    @DeleteMapping("/delete/{id}") // delete
    public String delete(@PathVariable int id,@RequestBody Studententity st){
        return src.delet(id);
    }

}