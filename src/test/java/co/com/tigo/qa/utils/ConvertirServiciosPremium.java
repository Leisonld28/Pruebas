package co.com.tigo.qa.utils;

public class ConvertirServiciosPremium {

    public static String conversion(String opcion){

        switch (opcion){
            case "AmazonMusic":
                return "2";
           /* case "Deezer":
                return "3";*/
        }
        return opcion;
    }
}
