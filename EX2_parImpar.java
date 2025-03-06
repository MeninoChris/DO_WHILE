import java.util.Scanner;

public class EX2_parImpar {
    public static void main(String[] args){
        Scanner entradaDados = new Scanner(System.in);
        int contador = 0;
        int numeroPar = 0;
        int numeroImpar = 0;


        while(contador < 10){
            contador++;
            System.out.println("Digite o " + contador + "° número:");
            int num = entradaDados.nextInt();
            System.out.println();

            if(num%2 == 0){
                numeroPar++;
            } else{
                numeroImpar++;
            }
        }

        System.out.println();
        System.out.println("A quantidade de numero Pares inseridas foi de: " + numeroPar);
        System.out.println("A quantidade de numero Impares inseridas foi de: " + numeroImpar);

    }
    
}
