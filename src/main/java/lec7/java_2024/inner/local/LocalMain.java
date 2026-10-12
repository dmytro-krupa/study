package lec7.java_2024.inner.local;

public class LocalMain {
    public static void main(String[] args) {

        String addressString = "Lviv,Street,20,90";

        String street = getStreetFromAddressString(addressString);

        System.out.println();

        System.out.println("String is: " + street);

//        int x = 5;
//
//        if(x == 8){
//            System.out.println(x);
//        } else {
//
//
//            class A{
//                //private final int x = 5;
//                private String name = "54gwf";
//
//                public String getName() {
//                    return name + x;
//                }
//            }
//
//            A a = new A();
//            //багатопотокова магія
//
//            System.out.println(a.getName());
//        }

    }


    public static String getStreetFromAddressString(String addressString){
        if(addressString == null || addressString.isEmpty()){
            System.out.println("Address string is null or empty");
            return null;
        }

        record Address(
             String city,
             String street,
             String building,
             String apartments){}


        String[] parts = addressString.split(",");

        Address address = new Address(parts[0], parts[1], parts[2], parts[3]);


        System.out.printf("""
                Address is:
                City: %s
                Street: %s
                Building: %s
                Apartments: %s
                %n""", address.city(), address.street(), address.building(), address.apartments());

        return parts[1];

    }
}
