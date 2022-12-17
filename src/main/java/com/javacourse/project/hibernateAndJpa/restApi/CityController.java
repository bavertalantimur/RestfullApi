package com.javacourse.project.hibernateAndJpa.restApi;

import com.javacourse.project.hibernateAndJpa.Business.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.javacourse.project.hibernateAndJpa.Entities.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CityController {
    private ICityService cityService;
    @Autowired
    public CityController(ICityService cityService) {
        this.cityService = cityService;
    }
   @GetMapping("/cities")
    //@RequestMapping(value = "/cities",method = RequestMethod.GET)
    public List<City> get(){
        return cityService.getAll();
    }

    @RequestMapping(value = "baver",method = RequestMethod.POST)
    public void create(@RequestBody City c ){
        cityService.add(c);
    }

    @RequestMapping(value = "update",method = RequestMethod.PUT)
    public void update(@RequestBody City c){
        cityService.update(c);
    }

    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable int id){
         cityService.delete(id);

         return "Başarıyla Silindi";
    }
    @GetMapping("city/{id}")
    public City getById(@PathVariable int id){

        return cityService.getById(id);
    }
    @PutMapping("update/{id}")
    public City updateNameById(@PathVariable int id,@RequestBody String name){
        return cityService.updateCityNameById(id,name);
    }

    //-----------------




}
