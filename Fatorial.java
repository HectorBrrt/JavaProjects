import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite um numero para saber seu fatorial: ");

        int n = numero.nextInt();
        int i = 2;
        int fat = 1;

        while( i <=n ){
            fat = fat * i;
            i++;
        }
        System.out.printf("Fatorial de %d = %d", n, fat);
    }
}
