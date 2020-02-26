package br.com.apparezzo.utils;

public class Utils {

    public static boolean AREZZO = getBrand().contains("arezzo");
    public static boolean SCHUTZ = getBrand().contains("schutz");

    public static String getBrand() {
        String brand = "";
        if (System.getProperty("brand") == null){
            System.out.println("App não adicionado Ex: -Dbrand=arezzo");
        }else{
            brand = System.getProperty("brand");
        }
        return brand;
    }

}
