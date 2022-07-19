import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.print("Menu de opcoes:\n");
        System.out.println("\t1 para somar\n\t2 para subtrair\n\t3 para multiplicar\n\t4 para dividir.");

        float c;
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int a = numero.nextInt();

        int o;
        do {
            numero = new Scanner(System.in);
            System.out.print("Digite a opcao: ");
            o = numero.nextInt();
            if(o != 1 && o != 2 && o != 3 && o != 4)
                System.out.println("Erro, opcao invalida!");

        } while (o != 1 && o != 2 && o != 3 && o != 4);

        System.out.print("Digite o segundo numero: ");
        int b = numero.nextInt();


        if (o == 1) {
            c = a + b;
            System.out.println(a + " + " + b + " = " + c);
        } else if (o == 2) {
            c = a - b;
            System.out.println(a + " - " + b + " = " + c);
        } else if (o == 3) {
            c = a * b;
            System.out.println(a + " * " + b + " = " + c);
        } else{
            c = a / b;
            System.out.println(a + " / " + b + " = " + c);
        }
    }
}
