public class ObjectClass {
    public static void main(String[] args) {
     
        CountryClass country = new CountryClass("India");
        System.out.println(country.myCountry);
        country.countryName();
     
    }
    
       
    public static class CountryClass {
       
        //Attribute
        private String myCountry;

            // Constructor
    public CountryClass(String country) {
        this.myCountry = country;
    }
    
    // Method
    public void countryName() {
        System.out.println("My country name is " + myCountry);
    }
}
 

}


