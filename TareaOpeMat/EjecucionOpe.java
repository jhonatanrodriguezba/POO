package TareaOpeMat;

import java.util.Scanner;

public class EjecucionOpe {
    public static void main(String[] args) {

        Scanner menu = new Scanner(System.in);
        System.err.println("Digite 1 para sumar");
        System.err.println("Digite 2 Para resrar");
        System.err.println("Digite 3 para multiplicar");
        System.out.println("Digite 4 para dividir");
        System.out.println("Digite 5 para Potenciar");
        System.out.println("Digite 6 Para sacar raiz cuadrada");
        System.out.println("Digite 7 para usar Funcion Seno ");
        System.err.println("Digite 8 Para usar Funcion Coseno");
        System.err.println("Digite 9 Para usar Funcion Tangente");
        System.err.println("Digite 0 para usar logaritmos");
        int nummenu = 
        menu.nextInt();


        if (nummenu == 1){
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite el Primer numero...");
            int num1 = sc.nextInt();
            System.out.println("Digite el Segundo Numero...");
            int num2 = sc.nextInt();
            OperacionesMat ObjMat = new OperacionesMat(num1, num2);
             
            System.out.println(num1 + " + " + num2 + " = " + ObjMat.sumar());
        } else if (nummenu == 2) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite el primer numero...");
            int num1 = sc.nextInt();
            System.out.println("Digite Segundo Num...");
            int num2 = sc.nextInt();
            OperacionesMat ObjRest = new OperacionesMat(num1, num2);
            
            System.err.println(num1 + " - " + num2 + " = " + ObjRest.restar());
            
        } else if (nummenu == 3){
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite el primer numero...");
            int num1 = sc.nextInt();
            System.out.println("Digite el segundo numero...");
            int num2 = sc.nextInt();
            OperacionesMat ObjMult = new OperacionesMat(num1, num2);

            System.err.println(num1 + " * " + num2 + " = " + ObjMult.multiplicar());

        } else if (nummenu == 4){
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite el primero numero...");
            int num1 = sc.nextInt();
            System.out.println("Digite el segundo nuemero....");
            int num2 = sc.nextInt();
            OperacionesMat ObjDiv = new OperacionesMat(num1, num2);

            System.err.println(num1 + " / " + num2 + " = " + ObjDiv.dividir());

        } else if (nummenu == 5){
            Scanner sc = new Scanner (System.in);
            System.out.println("Digite el primer numeroo...");
            int num1 = sc.nextInt();
            System.out.println("Digite el segundo numero...");
            int num2 = sc.nextInt();
            OperacionesMat ObjPot = new OperacionesMat(num1, num2);

            System.err.println(num1 + " ^ " + num2 + " = " + ObjPot.potenciar());

        } else if (nummenu == 6){
            Scanner sc = new Scanner (System.in);
            System.out.println("Digite el primer numero...");
            int num1 = sc.nextInt();
            System.out.println("Digite el segundo numero...");
            int num2 = sc.nextInt();
            OperacionesMat ObjRaiz = new OperacionesMat(num1, num2);

            System.err.println("La raiz cuadrada de " + num1 + " es = " + ObjRaiz.raiza());
            System.err.println("La raiz cuadrada de " + num2 + " es = " + ObjRaiz.raizb());
        } else if (nummenu == 7){
            Scanner sc = new Scanner (System.in);
            System.out.println("Digite el numero.... ");
            int num1 = sc.nextInt();
            System.out.println("Digite el Segundo numero....");
            int num2 = sc.nextInt();
            OperacionesMat ObjSen = new OperacionesMat(num1, num2);

            System.err.println("Sen" + num1 + "°" + " = " + ObjSen.senoa());
            System.err.println("Sen" + num2 + "°" + " = " + ObjSen.senob());
            
        } else if (nummenu == 8){
            Scanner sc = new Scanner (System.in);
            System.out.println("Digite el numero...");
            int num1 = sc.nextInt();
            System.out.println("Digite el otro numero...");
            int num2 = sc.nextInt();
            OperacionesMat ObjCos = new OperacionesMat(num1, num2);

            System.err.println("Cos" + num1 + " = " + ObjCos.cosenoa());
            System.err.println("Cos" + num2 + " = " + ObjCos.cosenob());

        } else if (nummenu == 9){
            Scanner sc = new Scanner (System.in);
            System.out.println("Digita el numero...");
            int num1 = sc.nextInt();
            System.out.println("Digita el otro num...");
            int num2 = sc.nextInt();
            OperacionesMat ObjTan = new OperacionesMat(num1, num2);

            System.out.println("Tan" + num1 + " = " + ObjTan.tana());
            System.out.println("Tan" + num2 + " = " + ObjTan.tanb());

        } else if (nummenu == 0){
            Scanner sc = new Scanner (System.in);
            System.out.println("Digite el numeroo...");
            int num1 = sc.nextInt();
            System.out.println("Digita otro numero...");
            int num2 = sc.nextInt();
            OperacionesMat ObjLog = new OperacionesMat(num1, num2);

            System.err.println("Log" + num1 + " = " + ObjLog.logdieza());
            System.err.println("Log" + num2 + " = " + ObjLog.logdiezb());

        }
        
    }
}

