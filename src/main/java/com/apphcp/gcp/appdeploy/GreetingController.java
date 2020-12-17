package com.apphcp.gcp.appdeploy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue = "World") String name){
         return new Greeting(counter.incrementAndGet(), String.format(template, name));
     }

    @RequestMapping(value = "/greetingList", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Greeting> greetingList(){
        Greeting g1 = new Greeting(1, "hola");
        Greeting g2 = new Greeting(2, "hola2");
        List<Greeting> list = new ArrayList<>();
        list.add(g1);
        list.add(g2);
        return list;
     }

}
