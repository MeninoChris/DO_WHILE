import java.util.Scanner;

public class EX6_numeroMenor {
    public static void main(String[] args){
        Scanner entradaDados = new Scanner(System.in);

        int contador = 0;
        int numeroMenor =  Integer.MAX_VALUE;

        do{
            contador++;
            System.out.print("Digite o " + contador + "° numero: ");
            int numero = entradaDados.nextInt();

            if (numeroMenor > numero){
                numeroMenor = numero;
            }

        }while(contador < 10);
        System.out.println(numeroMenor);
    }
    
}
