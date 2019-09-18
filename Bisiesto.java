import java.util.Scanner;
public class Bisiesto{

        public static void main(String[] args) {
            int año;
            Scanner input = new Scanner (System.in);
            System.out.println("Escribe un año para saber si es bisiesto:"); 
            año = input.nextInt(); 

            if ((año%4==0) && (año%100!=0) || (año%400==0)){
                System.out.println("true");
            }
                else 
                    System.out.println("false");
}
}