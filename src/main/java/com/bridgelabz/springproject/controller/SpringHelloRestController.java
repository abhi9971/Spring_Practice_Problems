package com.bridgelabz.springproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.springproject.model.User;


@RestController
@RequestMapping("/hello")

public class SpringHelloRestController {

    @RequestMapping(value={"", "/", "/home"})
    public String sayHello() {
        return "Hello From BridgeLabz!!!";
    }
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHelloParam1 (@RequestParam(value="name")String name) {
        return "Hello " + name + "!";
    }


    @GetMapping ("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello "+ name+ "!";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello" + user.getfName()+ " "+ user.getLName()+"!";
    }

    @PutMapping("/put/{firstName}")

    public String sayHello(@PathVariable String firstName,@RequestParam(value="lastName") String lastName) {

        return "Hello "+firstName + " "+ lastName + "!";
    }
}
