package be.intecbrussel.zoo.controllers.interfaces;

import be.intecbrussel.zoo.data.Animal;
import be.intecbrussel.zoo.data.Country;
import be.intecbrussel.zoo.services.interfaces.AnimalService;
import be.intecbrussel.zoo.services.interfaces.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AnimalControllerImpl implements AnimalController{

    private AnimalService animalService;

    private CountryService countryService;


    @Autowired
    public AnimalControllerImpl(AnimalService animalService, CountryService countryService) {
        this.animalService = animalService;
        this.countryService = countryService;
    }


    @Override
    @GetMapping("/animals/{countryName}")
    public String seeAllAnimalsByCountry(Model model,@PathVariable("countryName") String countryName) {

       // Animal animal = new Animal();


        //model.addAttribute("animals",animalService.getAllByCountry(countryName));

        return "animals";
    }

    @Override
    @PostMapping
    public String addAnimal(String animalName, String countryName) {
        Animal animal = new Animal();
        animal.setAnimalName(animalName);

        animalService.addAnimal(new Animal(animalName,new Country(countryName)));
        return null;
    }

    @Override
    public String deleteAnimal(long animalId) {
        return null;
    }
}
