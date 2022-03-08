/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.clase2grupo42;
import java.util.Scanner;//libreria que nos va permitir ller desde teclado
/**
 * comentarios en bloque
 * @author Usuario
 */
public class Clase2Grupo42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//método principal
        // comentarios linea por linea, usado para documentar
        
        /* comentarios muy largos
        pero que deseo sean comentados de manera rapida
        y precisa  
        escribo mas */
        
        // variables básicas de Java  
        
        //tipo   nombre    asignación  valor   y finalmente ;
          int    entero         =        10      ;// int de Python 2 E 32 Bits
        // valores 4.294.967.296 /2 = positivo el valor max es 2.147.483.647 incluye al 0
        //en negativo es -2147483648
          short  corto          =        10      ;// int pequeño 2 E 16 bits
          // 65565 /2 = 32
          long   largo          =        10      ;//int 2 E 64
          // long 18.446.744.000.000.000.000 /2 
          float  flotante       =        10.1f   ;//flotante o de punto decimal
          //parte entera como parte decimal
          //por ejemplo: 3.65
          //32 bits para parte entera y 32 bits para la parte decimal
          double doble          =        10.1    ;// 64 para ineteroy 64 lo decimal
          char   caracter       =        '@'    ;//solo usa un caracter, los char
          boolean booleano      =        true   ;//solo puede ser true o false
// deben ser definidos usando comillas sencillas ''
                   
          // variables básicas de Java //-------------------------------------
          
          int a, b ,c; float d;//punto y coma es el que ordena el fin de una instrucción
          a = (short)1.5;//(short) fuerza o obliga al dato siguiente a ser de ese tipo
          b = 2;
          c = 3;
          d = 4;
          
          
          //casteo
          //char -> short -> int -> long  -> double ->  String
          //                     -> float -> double ->  String
        
          
          if (a<b){
             System.out.println(a +" es menor que "+b);//concatena si hay un String
             a=a+1;
          }
          else if (b<a){
              System.out.println(b+" es menor que"+a );
          }
          else {
              System.out.println(a+b);//si no hay un String entonces opera
              System.out.println("los dos son iguales, pero sumados da"+(a+b));
                                 //instrucción de sumar primero y ese resultado
          }
          
          double resultado=a+d*-c/b;
          double resultado2=(((a+d)*c)/b);
          System.out.println(resultado);
          System.out.println(resultado2);
          
          
          /*
          () mas prioridad y el cambio de signo '-'antes de una variable
          / y * segundo eg jerarquia
          + - 
          % residuo
          */
          
          int suma=a+b;//suma
          int resta=a-b;//resta
          int multiplica=a*b;//suma
          float division=(float)a/(float)b;//division
          int modulo=a%b;//modulo o residuo
          double modulo2 = 2.5d%2.0d;
          
          System.out.println("suma="+suma);
          System.out.println("resta="+resta);
          System.out.println("multiplicacion="+multiplica);
          System.out.println("division="+division);
          System.out.println("residuo="+modulo);
          System.out.println("residuo="+modulo2);
          
          
          /* >
          <
          <=
          >=
          ==
          !=
          todos son iguales a Python
          */
          
          Scanner teclado=new Scanner(System.in);//input en Python
          //'teclado' es un Objeto de Tipo Scanner que se puede usar N cantidad de veces 
          System.out.println("digite algo: ");
          String Void=teclado.nextLine();//usar este siempre
          System.out.println("digite otra cosa:");
          String WhilE=teclado.nextLine();//captura todo en String
          
          
          System.out.println(Void+"\n"+WhilE);
          
          int num1=teclado.nextInt();
          float num2=teclado.nextFloat();
          System.out.println(num1+"\n"+num2);
          
          
        //switch es un IF de comparación más eficiente igual a  
        switch (num1) {//NO está en Python
            //variable a comparar igual a
            case 0:
                System.out.println("digito un cero");
                break;
            case 1:
                System.out.println("digito un uno");
                break;
            case 2:
                System.out.println("digito un dos");
                break;
            default:
                System.out.println("digito otra cosa \u00a9");
                break;
        }
        
        switch (caracter){
            case '#':System.out.println("es el numeral");break;
            case '$':System.out.println("es el signo pesos");break;
            case '%':System.out.println("es el porcentaje");break;
            case '@':System.out.println("es el arroba");break;
            case '.':System.out.println("es el punto");break;
            default:System.out.println("no es ninguno común");break;            
        }
        
        String str="mAX";
        switch(str){
            case "max":System.out.println("esta en minusculas");break;
            case "Max":System.out.println("esta en Capital");break;
            case "MAX":System.out.println("esta en MAYUSCULAS");break;
            default:System.out.println("esta en un desOrdEn");break;
                
        }
        
        /*
        and en Python este en Java es && doble ampersan
        or en Python es ||  doble barra
        not en Python es  ! admiración 
        */
        
        if (num1 >0 && num1<9){
            System.out.println("es un numero en unidades");

        }
        else if (num1 >=10 && num1<100){
            System.out.println("es un numero de decenas");
        }
        else {
            System.out.println("es un numero de centenas o mayor");
        }
          
        System.out.println(!!booleano);//negación de un booleano
        
        
    }
    
}
