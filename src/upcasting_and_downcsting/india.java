package upcasting_and_downcsting;

public class india extends asia_continent{
    String language = "hindi";


    public void location(){
        System.out.println("Near china and pakistan");
    }

    public static void main(String[] args) {
        asia_continent country = new india();  // upcasting ...object created with upcasting is nor use to call method of child
        System.out.println(country.language);
        country.location();

               //downcasting
       // india a= new asia_continent();          //error
        india a = (india)country;     //    --downcasting

       a.location();
      System.out.println(a.language);
    }
}
