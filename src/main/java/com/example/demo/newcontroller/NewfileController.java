@RestController
public class NewfileController{
    @Autowired
    Newservice src
    @PostMapping("/post")
    public Newfile savedata(@RequestBody  newww){// @Reqbody -- json la irukurathah obj ah store pannum 
        return src.savedata(newww);
      
    }
    @GetMapping("/get")
    public List<Studententity> getdata(){
        return src.retdata();

    }
    @GetMapping("/get{id}")
    public Studententity getIdval(@PathVariable int id){// particular variable ooda data mattum
        return src.id(id);

    }
    @PutMapping("/update{id}")

}