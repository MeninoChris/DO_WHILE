import java.util.Scanner;
import java.text.DecimalFormat;

public class EX9_cardapioLanchonete {
    static Scanner entradaDados = new Scanner(System.in);
    static double totalCompra = 0;
    public static void main(String[] args){
        Menu();
        
    }
    
    static void Menu(){

        int codigo;
        char continuarCompra;
    do{    

    System.out.println("    Bem vindo a lanchonete do seu Zé!");
        System.out.println("    Aqui o cardapio: ");

        System.out.println("|---------------- CARDAPIO -----------------|");
        System.out.println("|Código          Produto              Preço |" );
        System.out.println("|                                           |");
        System.out.println("|100         Cachorro Quente         R$ 1,20|");
        System.out.println("|101         Bauru Simples           R$ 1,30|");
        System.out.println("|102         Bauru com Ovo           R$ 1,50|");
        System.out.println("|103         Hamburguer              R$ 1,20|");
        System.out.println("|104         CheeseBurguer           R$ 1,30|");
        System.out.println("|105         Refrigerante            R$ 1,00|");
        System.out.println("|                                           |");
        System.out.println("| 0           Finalizar                     |");
        System.out.println("|                                           |");
        System.out.println("|---------------- ||||||||| ----------------|");

        System.out.print("Escreva o codigo do produto que você queira: ");
        codigo = entradaDados.nextInt();
        System.out.println("");
        System.out.println("");
        System.out.println("");

        
            switch (codigo){
                case 100: cachorroQuente(); break;
                case 101: Bauru(); break;
                case 102: bauruOvo(); break;
                case 103: Hamburguer(); break;
                case 104: CheeseBurguer(); break;
                case 105: Refrigerante(); break;
                case 0: 
                System.out.println("Compra finalizada! Total a pagar: R$ " + totalCompra);
                System.out.println("Obrigado por comprar na lanchonete do seu Zé!");
                break;
                default:  
                System.out.println("ERRO!");
                System.out.println("Digite um codigo de produto corretamente");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                Menu();
                break;
            }
              
              if (codigo != 0) {
                System.out.println();
                System.out.println("Deseja continuar comprando? (S para sim / N para não): ");
                continuarCompra = entradaDados.next().charAt(0);
                if (continuarCompra == 'N' || continuarCompra == 'n') {
                    codigo = 0;  
                }
            }

        }while(codigo != 0);


    }
    
    static void cachorroQuente(){
        System.out.print("Selecione a quantidade que você quer ");
        int quantidade = entradaDados.nextInt();
        double valorPago = quantidade * 1.20;
        totalCompra += valorPago;

        System.out.printf("Você escolheu o Cachorro Quente! E escolheu: " + quantidade + " cachorros quentes, cada um custa R$ 1,20, então o valor a ser pago será de: R$%.2f", valorPago);
        return;
    }
    static void Bauru(){
        System.out.print("Selecione a quantidade que você quer ");
        int quantidade = entradaDados.nextInt();
        double valorPago = quantidade * 1.30;
        totalCompra += valorPago;

        System.out.printf("Você escolheu o Bauru Simples! E escolheu: " + quantidade + " baurus, cada um custa R$ 1,30, então o valor a ser pago será de: R$%.2f", valorPago);
        return;
    }
    static void bauruOvo(){
        System.out.print("Selecione a quantidade que você quer ");
        int quantidade = entradaDados.nextInt();
        double valorPago = quantidade * 1.50;
        totalCompra += valorPago;

        System.out.printf("Você escolheu o Bauru com  Ovo! E escolheu: " + quantidade + " baurus, cada um custa R$ 1,50, então o valor a ser pago será de: R$%.2f", valorPago);
        return;
    }
    static void Hamburguer(){
        System.out.print("Selecione a quantidade que você quer ");
        int quantidade = entradaDados.nextInt();
        double valorPago = quantidade * 1.20;
        totalCompra += valorPago;

        System.out.printf("Você escolheu o Hamburguer! E escolheu: " + quantidade + " Hamburguers, cada um custa R$ 1,20, então o valor a ser pago será de: R$%.2f", valorPago);
        return;
    }
    static void CheeseBurguer(){
        System.out.print("Selecione a quantidade que você quer ");
        int quantidade = entradaDados.nextInt();
        double valorPago = quantidade * 1.30;
        totalCompra += valorPago;

        System.out.printf("Você escolheu o CheeseBurguer! E escolheu: " + quantidade + " CheeseBurguers, cada um custa R$ 1,30, então o valor a ser pago será de: R$%.2f", valorPago);
        return;
    }
    static void Refrigerante(){
        System.out.print("Selecione a quantidade que você quer ");
        int quantidade = entradaDados.nextInt();
        double valorPago = quantidade * 1.00;
        totalCompra += valorPago;

        System.out.printf("Você escolheu o Refrigerante! E escolheu: " + quantidade + " cachorros quentes, cada um custa R$ 1,00, então o valor a ser pago será de: R$%.2f", valorPago);
        return;
    }
    
}
