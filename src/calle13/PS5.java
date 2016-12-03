/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calle13;
import java.util.Scanner;
/**
 *
 * @author BRYAN BUITRAGO
 */
public class PS5 extends Electrodomestico{
    Scanner s = new Scanner(System.in);
    double alto, ancho;
    String color;
    String leerjuego;
    boolean encender;
    boolean abrirbandeja;
    boolean subir, bajar, izquierda, derecha=false;
    boolean botonX, botonCuadrado, botonTriangulo, botonCirculo;
    boolean start, selec;
    boolean prenderConsola;
    boolean botonR1,botonR2,botonL1,botonL2;

    public PS5(double alto, double ancho, String marca, String entradaelectrica) {
        super(marca, entradaelectrica);
        this.alto = alto;
        this.ancho = ancho;
    }
    
    public void encender()
    {
        
    }
    public void abrirBandeja()
    {
        
    }
    public void seleccionJuego()
    {
        //Cliente debe selecionar diferentes tipos de juegos de lucha.
        int sl;
        do{
            System.out.println("1. Mortal Kombat X");
            System.out.println("2. Strret Fighter IV");
            System.out.println("3. The king of Figther");
            System.out.println("4. UFC");
            sl = s.nextInt();
            }
        while(sl>4);
        switch(sl){
            case 1:
                System.out.println("Has elegido Mortal Kombat X");
            break;
            case 2:
                System.out.println("Has elegido Strret Fighter IV");
            break;
            case 3:
                System.out.println("Has elegido The king of Figther");
            break;
            case 4:
                System.out.println("Has elegido UFC");
            break;
            default:
                System.out.println("¡No eres digno!, no has elegido con sabiduria.");
        }
    }
    public void saltar()
    {
        
    }
   
    public void agacharse()
    {
        
    }
    public void derecha()
    {
        // Jose crea mover derecha
       if(derecha != true){
           derecha = true;
           System.out.println("Te mueves a la derecha");
       }else{
           derecha = false;
       }
    }
    public void izquierda()
    {
        // Jose crea mover derecha
        if(derecha != true){
           derecha = true;
           System.out.println("Te mueves a la izquierda");
       }else{
           derecha = false;
       }
    }
    public void patadaAlta()
    {
        
    }
    public void patadaBaja()
    {
        
    }
    public void puñoAlto()
    {
        
    }
    public void puñoBajo()
    {
        
    }
    public void pausa()
    {
        
    }
    public void selector()
    {
        
    }
    public void combo1()
    {
        
    }
    public void combo2()
    {
        
    }
    public void combo3()
    {
        
    }
    public void combo4()
    {
        
    }
    @Override
    void enceder() {
        
    }
        
    
}
