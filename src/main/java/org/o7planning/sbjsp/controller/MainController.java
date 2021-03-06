package org.o7planning.sbjsp.controller;
 
import java.util.ArrayList;
import java.util.List;

import org.o7planning.sbjsp.StaApplet;
import org.o7planning.sbjsp.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class MainController {
 
    private static List<Person> persons = new ArrayList<Person>();
 
    static {
        persons.add(new Person("Bill", "Gates"));
        persons.add(new Person("Steve", "Jobs"));
    }
 
    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
 
        String message = "Hello Spring Boot + JSP";
 
        model.addAttribute("message", message);
 
        return "index";
    }
 
    @RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
    public String viewPersonList(Model model) {
 
        model.addAttribute("persons", persons);
 
        return "personList";
    }
 
    @RequestMapping(value = { "/jnlpIndex" }, method = RequestMethod.GET)
    public String viewJNLP(Model model) {
 
        model.addAttribute("persons", persons);
 
        return "jnlpIndex";
    }
    
    @RequestMapping(value = { "/mainStart" }, method = RequestMethod.GET)
    public String viewStart(Model model) {

        int val[] = StaApplet.getValues();
        model.addAttribute("values", val);
        
        return "mainStart";
    }
    
    @RequestMapping(value = { "/runJar" }, method = RequestMethod.GET)
    public String runJar(Model model) {
        return "runJar";
    }
    
    @RequestMapping(value = { "/moving" }, method = RequestMethod.GET)
    public String raceResult(Model model) {
        return "moving";
    }
}