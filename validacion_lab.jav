import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("2634522513: "+ValidarTel("2634522513"));
        System.out.println("1234567: "+ValidarTel("1234567"));
        System.out.println("12345678AS: "+ValidarTel("12345678AS"));
        System.out.println("2634: "+ValidarTel("2634"));

        System.out.println("Ingrese un CUIT");
        String CUIT = sc.nextLine();

        if (ValidarCUIT(CUIT)){
            System.out.println(CUIT+" Valido");
        }else {
            System.out.println(CUIT+" Invalido");
        }



    }
    public static boolean ValidarTel (String numTel){

        return numTel.matches("[0-9]{7,10}");
    }
    public static boolean ValidarCUIT(String CUIT){
        return CUIT.matches("[0-9]{11}");
    }

    public static boolean ValidarCorreo (String correo){
        return correo.matches("[-_A-za-z0-9.\\+]+([\\A-Za-z0-9._-])");
    }
}
