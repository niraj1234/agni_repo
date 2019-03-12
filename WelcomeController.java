WelcomeController.java


@RestController
public class WelcomeController {

   @Autowired
   private NewsService newsService;

   @GetMapping("/welcome")
   public String welcome(){
     return "Welcome to Agni Project";
   }

}