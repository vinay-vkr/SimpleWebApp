package com.Learn.SimpleWebApp.Controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

//@Controller // if we use Controller here it will return the page name
@RestController // If we use RESTController it will provide the text from the server. Simply it returns the data!
public class LoginController {

    @RequestMapping("/login") // By using request mapping we are getting data from server to client.
    public String login(){ //But to get data from client to server we need to pass an arguments in this line near PUBLIC STRING DISCOUNT(-----HERE WE NEED TO PASS ARGUMENTS--)
        return "Hey you are in Login page..!";
    }
}
