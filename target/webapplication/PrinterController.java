package webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrinterController {

    @RequestMapping("/show")
    public String show() {
        return "<h1>hello world!</h1>";
    }
}
