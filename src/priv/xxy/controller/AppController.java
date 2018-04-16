package priv.xxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/4/16/016.
 */
@Controller
public class AppController {

    @RequestMapping
    public String test(){
        return null;
    }

    @RequestMapping
    public void method(){}
}
