package com.example.APIrest.controller;

import com.example.APIrest.model.Greeting;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    private ArrayList<Greeting> getGreetings(){
        ArrayList<Greeting> list = new ArrayList<Greeting>();
        list.add(new Greeting(5, String.format(template, "test")));
        list.add(new Greeting(6, String.format(template, "test23")));
        list.add(new Greeting(7, String.format(template, "test")));
        list.add(new Greeting(8, String.format(template, "test")));

        return(list);
    }

    @RequestMapping("/greeting/{id}")
    public Greeting greetingID(@PathVariable Integer id) {
        ArrayList<Greeting> l= this.getGreetings() ;
        return l.get(id);
    }

    @RequestMapping(value="/greeting/Delete/{id}", method=RequestMethod.DELETE)
    public Greeting greetingDelete(@PathVariable Integer id) {
        ArrayList<Greeting> l= this.getGreetings() ;
        l.remove(id);
        return l.get(id);
    }
}