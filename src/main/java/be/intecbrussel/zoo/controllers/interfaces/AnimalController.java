package be.intecbrussel.zoo.controllers.interfaces;

import be.intecbrussel.zoo.data.Country;

public interface AnimalController {

    String seeAllAnimalsByCountry(Country country);
    String addAnimal(String animalName, String countryName);
}
