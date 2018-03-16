package com.example.APIrest.controller;

import java.util.ArrayList;
import java.util.List;
import com.example.APIrest.model.Skill;
import org.json.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillController {
    
    private List<Skill> skills;

    private SkillController(){
        skills = new ArrayList<Skill>();

        ArrayList<String> names1= new ArrayList<String>();
        names1.add("JavaScript (Jquery,  AJAX,  node, react, redux)");
        names1.add("PHP (Symfony)");
        names1.add("CSS3 (Bootstrap, Foundation, Flexbox)");
        names1.add("HTML5");
        skills.add(new Skill("Langages de programmations", "Web", names1));


        ArrayList<String> names2= new ArrayList<String>();
        names2.add("Java(Android, JEE)");
        names2.add("c");
        names2.add("C++");
        names2.add("Pascal");
        names2.add("OpenGl");
        names2.add("CUDA");
        names2.add("netLogo");
        names2.add("SQL");
        names2.add("LATEX");
        names2.add("R");
        skills.add(new Skill("Langages de programmations", "Autres", names2));


        ArrayList<String> names3= new ArrayList<String>();
        names3.add("Linux");
        names3.add("Windows");
        skills.add(new Skill("Système d'exploitation", "", names3));


        ArrayList<String> names4= new ArrayList<String>();
        names4.add("MySQL");
        names4.add("Oracle");
        names4.add("MongoDB");
        skills.add(new Skill("Système de Gestion de Base de données", "", names4));


        ArrayList<String> names5= new ArrayList<String>();
        names5.add("Word");
        names5.add("Powerpoint");
        names5.add("Excel");
        names5.add("Cplex");
        names5.add("AgroUML");
        skills.add(new Skill("Logiciels", "", names5));


        ArrayList<String> names6= new ArrayList<String>();
        names6.add("Visual studio code");
        names6.add("Atom");
        names6.add("Eclipse");
        names6.add("Cplex");
        names6.add("AgroUML");
        skills.add(new Skill("Environnement de développement", "", names6));


        ArrayList<String> names7= new ArrayList<String>();
        names7.add("Arabe : Langue  maternelle");
        names7.add("Français : Bilingue");
        names7.add("Anglais : Intermédiaire");
        names7.add("Espagnol : Notions");
        skills.add(new Skill("Langues", "", names7));
    }

    // method GET
    @RequestMapping("/skills")
    public List<Skill> skills(){
        return(this.skills);
    }

    @RequestMapping("/skills/{id}")
    public Skill skill(@PathVariable Integer id){
        return (this.skills.get(id));
    }

}