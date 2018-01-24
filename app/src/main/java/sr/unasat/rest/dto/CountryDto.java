package sr.unasat.rest.dto;

/**
 * Created by mnarain on 1/24/2018.
 */

// data transfer object (DTO)
public class CountryDto {
    private String name;
    private String capital;
    private String region;

    // default constructor
    public CountryDto() {
    }

    // custom constructor
    public CountryDto(String name, String capital, String region) {
        this.name = name;
        this.capital = capital;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    // convert System.Out to custom string
    @Override
    public String toString() {
        return  "Country:"+ "\n" +
                "Name= " + name + "\n" +
                "Capital= " + capital + "\n" +
                "Region= " + region + "\n" +
                "--------------------------------" + "\n";
    }
}
