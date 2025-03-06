public class EX5_tabuada5 {
    public static void main(String[] args){

        int tabuada = 1;
        int resultado = 0;
        do{
            resultado = tabuada * 5;
            System.out.println("A tabuada de: " + tabuada + " * 5 é: " + resultado);
            tabuada++;
        }while(tabuada <= 10);
    }
    
}
