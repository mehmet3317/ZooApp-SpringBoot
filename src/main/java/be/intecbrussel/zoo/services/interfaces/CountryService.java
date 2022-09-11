package be.intecbrussel.zoo.services.interfaces;

import be.intecbrussel.zoo.data.Country;

import java.util.List;

public interface CountryService {

    List<Country> getAllCountries();
    void getCountryByName(String countryName);
}
