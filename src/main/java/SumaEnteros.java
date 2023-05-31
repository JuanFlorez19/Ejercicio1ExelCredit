import java.util.*;

public class SumaEnteros {

    public static void main (String[] args) {
        String miCadena= "asfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342r";
        char []	string_div = miCadena.toCharArray();
        String n="";
        int suma=0;

        for (int i=0; i<string_div.length; i++) {
            if(Character.isDigit(string_div[i])) {
                n+=string_div[i];
            }
        }
        System.out.println("1. Numeros enteros: "+n);

        for (int j=0; j<n.length(); j++ ) {
            suma += Integer.parseInt(String.valueOf(n.charAt(j)));
        }
        System.out.println("4. Suma numeros: "+suma);
    }
}
