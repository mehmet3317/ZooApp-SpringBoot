package be.intecbrussel.zoo.data;

import javax.persistence.*;

@Entity
//@Table(name = "country")
public class Country {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)



    //@Column(name = "id", nullable = false)
   // private Long id;
   // @Id
    //@Column(name = "country_name")

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String countryName;
    @Column(name = "continent")
    private String continent;



    public Country() {
    }

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public Country(String countryName, String continent) {
        this.countryName = countryName;
        this.continent = continent;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", continent='" + continent + '\'' +
                '}';
    }
}
