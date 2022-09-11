package be.intecbrussel.zoo.controllers.interfaces;

import org.springframework.ui.Model;

public interface CountryController {

    String showAllCountries(Model model);
    String createCountry (String countryName, String continent);
}
