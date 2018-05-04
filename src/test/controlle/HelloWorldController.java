package test.controlle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Mekeater on 2018/4/28.
 */
@Controller
@RequestMapping("/mvc")
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello()
    {
        return "hello";
    }
}
