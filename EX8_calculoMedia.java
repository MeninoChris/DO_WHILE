import java.util.Scanner;

public class EX8_calculoMedia {
    public static void main(String[] args){
        Scanner entradaDados = new Scanner(System.in);

         double nota1, nota2;
         int contador = 0;
         
        do{
            System.out.print("Vamos calcular sua media! Primeiro insira sua primeira nota: ");
            nota1 = entradaDados.nextDouble();

            System.out.println();

            System.out.print("Agora insira sua segunda nota: ");
            nota2 = entradaDados.nextDouble();


           if( (nota1 < 0 || nota2 < 0) || (nota1 > 10 || nota2 > 10) ){
            System.out.println("Insira um valor valido!");
           }else{
            double media = (nota1 + nota2) /2;
            System.out.println("Sua media é: " + media);
            System.out.println();
            contador++;
           }

        }while(contador < 5 );

    }
    
}
