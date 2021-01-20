import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/index")
public class ConverterController {
    public String converter() {
        return "index";
    }

    // với class
    @RequestMapping("/method0")
    public String method0() {
        return "page0";
    }

    //với method
    @RequestMapping("/method1")
    public String method1() {
        return "page1";
    }
    //với method

    @RequestMapping(value = { "/", "/home" })
    public String home() {
        return "home";
    }
    // với nhiều URL
    //Method home()Sẽ xử lý cả 2 URL “/” và “/home”


    @RequestMapping(value="/test", method = RequestMethod.GET)
    public String doGet() {
        return "test1";
    }
    //method là get sẽ được xử lý với doget và ngược lại
    @RequestMapping(value="/test", method = RequestMethod.POST)
    public String doPost() {
        return "test2";
    }
    // xử lý với http method
}
