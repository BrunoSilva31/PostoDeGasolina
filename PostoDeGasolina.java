import java.util.Scanner;

public class Repeticao2 {
    
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int cod = sc.nextInt();


        while(cod != 4){
            if(cod == 1){
                alcool = alcool + 1;
            } else if(cod == 2){
                gasolina = gasolina + 1;
            } else if(cod == 3){
                diesel = diesel + 1;
            } else {
                System.err.println("Código inválido. Tente novamente: ");
            }
            cod = sc.nextInt();

        } 

        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        System.out.println("Muito obrigado");
        
        sc.close();
    }

}
