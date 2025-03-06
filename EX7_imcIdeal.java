import java.util.Scanner;

public class EX7_imcIdeal {
    public static void main(String[] args){
        Scanner entradaDados = new Scanner(System.in);

        int contador = 0;
        int imcSaudavel = 0;
        int imcObesa = 0;
        double imc = 0;

        do{
            System.out.println("Vamos calcular o seu IMC!");
            System.out.println("Digite o seu peso: (Exemplo: 80)");
            double peso = entradaDados.nextDouble();

            System.out.println("Agora digite a sua altura: (Exemplo: 1,80) ");
            double altura = entradaDados.nextDouble();

            double alturaPessoa = altura * altura;
            imc = peso / alturaPessoa;

            System.out.println();
            System.out.println("O seu IMC é de: " + imc);

            if(imc >= 18.5 && imc <= 24.9){
                imcSaudavel++;
            }else{
                imcObesa++;
            }
            contador++;

        }while(contador < 1);

        System.out.println("O numero de pessoas que não são consideradas obesas de acordo com o IMC é: " + imcSaudavel);
        System.out.println("E o numero de pessoas que  são consideradas obesas de acordo com o IMC é: " + imcObesa);
    }
    
}
