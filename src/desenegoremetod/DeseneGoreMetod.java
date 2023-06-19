package desenegoremetod;

import java.util.Scanner;

public class DeseneGoreMetod {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen Desen Başlangıç Değerini Girin : ");
        int desen = scanner.nextInt();
        recursiveMethod(desen);
    }
    
    
    
    public static void recursiveMethod(int n) {
        System.out.print(n + " ");

        if (n > 0) {
            recursiveMethod(n - 5);
            System.out.print(n + " ");
        }   
        
    }   
    
}
