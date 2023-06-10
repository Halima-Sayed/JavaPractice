package Replit;

public class R122 {
    String countryName;
    String capital;
    long population;

    public static void main(String[] args) {

        R122 m = new R122();
        m.countryName = "USA";
        m.capital = "Washington DC";
        m.population = 330000000;

        System.out.println("The capital of " + m.countryName + " is " + m.capital + " and population is " + m.population);

       R122 x = new R122();
        x.countryName = "Kazakhstan";
        x.capital = "Astana";
        x.population = 18500000;

        System.out.println("The capital of " + x.countryName + " is " + x.capital + " and population is " + x.population);


    }
}
