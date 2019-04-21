package asistensi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Thaliah
 */

public class thaliah {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);
        
        double a;
        double b;
        double c;
        double D = 0;
        double akar1, akar2, akar1a, akar2a, akar1b, akar2b, akar1c, akar2c;
        double m = 0;
        double x, y, x1, y1 = 0;
                
        System.out.print("Masukkan a, b, c = ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        if (a==0){
            System.out.println("Nilai a tidak boleh 0");
        }else if(a!=0){
            if(a==1){
            System.out.println("Polinomial x^2 + " + b + "x + " + c + " memiliki");
            }
            else if(a!=1){
                System.out.println("Polinomial " + a + "x^2 + " + b + "x + " + c + " memiliki");
            }
        
        D = (int)(Math.pow(b,2) - (4*a*c));
        System.out.println("1. " + "Diskriminan          : " + D);
        
        if(D==0){
            akar1 = -b/(2*a);
            System.out.println("2. Akar-akar polinomial : " + akar1);
            
        }else if(D>0){
          akar1 = ((-b) + Math.sqrt(D))/(2*a); //tanda akar gmn si mas?
          akar2 = ((-b) - Math.sqrt(D))/(2*a);
          akar1*=1000;
          akar1a = Math.floor(akar1);
          akar1a/=1000;
          akar2*=1000;
          akar2a = Math.floor(akar2);
          akar2a/=1000;
          System.out.println("2. Akar-akar polinomial : " + akar1a + " dan " + akar2a);
          
        }else if(D<0 && b==0){
          akar1 = (((-b) + Math.sqrt((-D)))/(2*a)); //tanda akar gmn si mas?
          akar2 = (((-b) - Math.sqrt((-D)))/(2*a));   
          akar1*=1000;
          akar1a = Math.floor(akar1);
          akar1a/=1000;
          akar2*=1000;
          akar2a = Math.floor(akar2);
          akar2a/=1000;
          System.out.println("2. Akar-akar polinomial : " + akar1a + "i dan " + akar2a + "i");
          
          
        }else if(D<0 && b!=0){
          akar1 = (int)-b/(2*a); //tanda akar gmn si mas?
          akar1*=1000;
          akar1c = Math.floor(akar1);
          akar1c /=1000;
          
                    akar1a = (Math.sqrt(-D))/(2*a);
          akar1a*=1000;
          akar1b = Math.floor(akar1a);
          akar1b/=1000;
          
          akar2 = (int)-b/(2*a); 
          akar2*=1000;
          akar2c = Math.floor(akar2);
          akar2c /=1000;
          
          akar2a = (Math.sqrt(-D))/(2*a);
          akar2a*=1000;
          akar2b = Math.floor(akar2a);
          akar2b/=1000;
             System.out.println("2. Akar-akar polinomial : " + akar1c + " + " + akar1b + "i dan " + akar2c + " - " +akar2b + "i");
        }  
        
        if (m==0){
            x = (-b)/(2*a);
            y = (-D)/(4*a);
            
            if(x==0){
                y*=1000;
                y1 = Math.floor(y);
                y1/=1000;
                
            System.out.println("3. Titik Stasioner      : (" + "0" + "," + y1 + ")");
            }
            else if(x!=0){
                x*=1000;
                x1 = Math.floor(x);
                x1 /=1000;
                
                y*=1000;
                y1 = Math.floor(y);
                y1 /=1000;
        
            System.out.println("3. Titik Stasioner      : ("+ x1 + ", " + y1 + ")");
            }
        if (a>0){
            System.out.println("4. Kecekungan Kurva     : Atas ");
        }
        else if (a<0){
            System.out.println("4. Kecekungan Kurva     : Bawah ");
        }
        
        if(a>0 && D!= 0){
            System.out.println("5. Nilai Maksimum Lokal : " + y1);
        }
        else if(a<0 && D!= 0){
            System.out.println("5. Nilai Minimal Lokal  : " + y1);
        }else{
            System.out.println("5. Nilai Minimal Lokal  : 0");
        }
}}}}
