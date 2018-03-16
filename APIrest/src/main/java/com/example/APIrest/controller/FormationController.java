package com.example.APIrest.controller;

import java.util.ArrayList;
import java.util.List;
import com.example.APIrest.model.Formation;
import org.json.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormationController {
    
    private List<Formation> formations;

    private FormationController(){
        formations = new ArrayList<Formation>();
        formations.add(new Formation("2011-2012", "Baccalauréat"));
        formations.add(new Formation("2012-2014", "1ère et 2ème année de Licence en Informatique Faculté des sciences Sfax-TUNISIE"));
        formations.add(new Formation("2014-2015", "3ème année de Licence en Informatique Normandie université : UFR ST, Le Havre-FRANCE. Double diplôme avec la faculté des Sciences de Sfax-TUNISIE (via Erasmus Mundus)"));
        formations.add(new Formation("2015-2017", "1ère année et 2ème année de Master en Informatique Normandie université : UFR ST, Le Havre-FRANCE"));
    }

    // method GET
    @RequestMapping("/formations")
    public List<Formation> formations(){
        return(this.formations);
    }

    @RequestMapping("/formations/{id}")
    public Formation formation(@PathVariable Integer id){
        return (this.formations.get(id));
    }
/*
    // method DELETE
    @RequestMapping(value="/formations/{id}", method=RequestMethod.DELETE)
    
    // method PUT
    @RequestMapping(value="/formation", method=RequestMethod.PUT)
    public String formationCreate(@RequestBody String jsonFormation) throws JSONException{
        JSONObject jObject = new JSONObject(jsonFormation);
        this.formations.add( new Formation(jObject.getString("duration"), jObject.getString("duration")));
        return("true");
    }

    // method 

*/
}