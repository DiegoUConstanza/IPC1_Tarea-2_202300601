package ipc1_tarea2;

import java.util.Scanner;

public class IPC1_Tarea2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int menu;
        double a,b;
        do {
            System.out.println(" _______| Calculadora |_______");
            System.out.println("1. Suma +");
            System.out.println("2. Resta -");
            System.out.println("3. Multiplicacion *");
            System.out.println("4. Division /");
            System.out.println("5. Salir");
            System.out.println("Digite una opcion");
            menu = sc.nextInt();
            
            switch(menu){
                case 1:
                    LimpiarPantalla();
                    System.out.println(" -----| Suma |-----");
                    System.out.println("Digite el primer digito");
                    a = sc.nextDouble();
                    System.out.println("Digite el segundo digito");
                    b = sc.nextDouble();
                    System.out.println("Resultado = " + Suma(a,b));
                    break;
                
                case 2:
                    LimpiarPantalla();
                    System.out.println(" -----| Resta |-----");
                    System.out.println("Digite el primer digito");
                    a = sc.nextDouble();
                    System.out.println("Digite el segundo digito");
                    b = sc.nextDouble();
                    System.out.println("Resultado = " + Resta(a,b));
                    break;
                
                case 3:
                    LimpiarPantalla();
                    System.out.println(" -----| Multiplicacion |-----");
                    System.out.println("Digite el primer digito");
                    a = sc.nextDouble();
                    System.out.println("Digite el segundo digito");
                    b = sc.nextDouble();
                    System.out.println("Resultado = " + Multiplicacion(a,b));
                    break;
                
                case 4:
                    LimpiarPantalla();
                    System.out.println(" -----| Division |-----");
                    System.out.println("Digite el primer digito");
                    a = sc.nextDouble();
                    System.out.println("Digite el segundo digito");
                    b = sc.nextDouble();
                    System.out.println("Resultado = " + Division(a,b));
                    break;
                
                case 5:
                    LimpiarPantalla();
                    System.out.println("Adios, vuelva pronto!");
                    break;
                    
                default:
                    LimpiarPantalla();
                    System.out.println("Digite una opcion valida");
                    break;
            }
        } while (menu!=5);
        
    }
    
    public static double Suma(double a, double b){
        return a+b;
    }
    
    public static double Resta(double a, double b){
        return a-b;
    }
    
    public static double Multiplicacion(double a, double b){
        return a*b;
    }
    
    public static double Division(double a, double b){
        return a/b;
    }
    
    public static void LimpiarPantalla(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

