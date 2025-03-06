import java.util.Scanner;

public class EX3_sequenciaInteiro {
    public static void main(String[] args){
        Scanner entradaDados = new Scanner(System.in);

        int sequencia = 1;
        
        System.out.print("Digite um numero inteiro: ");
        int numero = entradaDados.nextInt();
    
        while (sequencia <= numero){

            System.out.println("O valor é: " + sequencia);
            sequencia = sequencia * 2;

        }
    }
}
