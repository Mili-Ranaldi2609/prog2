package involucion;


import java.util.ArrayList;
import java.util.List;
    public class Country {
        private String name;
        private List<Country> neighboringCountries;


        public Country(String name) {
            this.name = name;
            this.neighboringCountries = new ArrayList<>();
        }


        public void addNeighboringCountry(Country country) {
            neighboringCountries.add(country);
        }


        public void getNeighboringCountries(){
            System.out.println("Paises limitrofes de "+ getName()+": ");
            for(Country country: neighboringCountries){
                System.out.println("- " + country.getName());
            }
        }


        public String getName() {
            return name;
        }

    }
