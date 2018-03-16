package com.example.APIrest.controller;

import java.util.ArrayList;
import java.util.List;
import com.example.APIrest.model.Experience;
import org.json.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienceController {
    
    private List<Experience> Experiences;

    private ExperienceController(){
        Experiences = new ArrayList<Experience>();
        Experiences.add(new Experience("11 Septembre 2017 - 22 Décembre 2017", "CDD 4 mois : Amélioration  de l’outil de compétence développé pendant le stage."));
        Experiences.add(new Experience("Mars - Août 2017", "Stage de validation du Master Ingeliance Technologies, Le Havre. Sujet  : Développement et évolution d'une  base de données de gestion des compétences de l'entreprise : • Établissement du cahier des  charges.• Création d’une base de données. • Création des  interfaces utilisateurs et administrateurse"));
        Experiences.add(new Experience("Avril - Mai 2015", "Stage de validation de la Licence 	Logement Habitat Services, Le Havre. Sujet : Création d'une base de données et sa liaison à un site  Web : • Création d’une base de données. • Création du site"));
    }

    // method GET
    @RequestMapping("/experiences")
    public List<Experience> experiences(){
        return(this.Experiences);
    }

    @RequestMapping("/experiences/{id}")
    public Experience experience(@PathVariable Integer id){
        return (this.Experiences.get(id));
    }

}