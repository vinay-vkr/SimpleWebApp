package com.Learn.SimpleWebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller //This annotation is used to control the web page which has Home page. Suppose I am creating my project in that I need Home page, so controller will handle home page by using @Controller
@RestController //REST is REpresentational State Transfer, it used to transfer the data from the server to client in that scenario RestController will be used.
public class HomeController {

    @RequestMapping("/") // here, if a person search with slash */* then the below greet will be displayed on the web page. by using @RequestMapping
    //@ResponseBody // This annotation will be used for to get the response from the server to get the DATA, same like as RESTCONTROLLER annotation.
    public String greet(){
        return "Welcome to my Web App project";
    }

    //Now I am creating different request to the server for that I need to create different method for different request
    @RequestMapping("/about")
    public String about(){
        return "Now I printed this by using different request by using ** /about ** request";
    }
}
