/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg9;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author joshu
 */
public class Tarea9 {
    public static class Juego{
        int Desicion;
        int DesicionCPU;
        
        void Play(){
            System.out.println("Piedra, Papel y Tijeras");
            System.out.println("Escoje '1' = Piedra");
            System.out.println("Escoje '2' = Papel");  
            System.out.println("Escoje '3' = Tijeras");
            Scanner input = new Scanner(System.in);
            Desicion = input.nextInt();
            input.nextLine();
            
            Random rand = new Random();
            DesicionCPU = rand.nextInt(3)+1;
            System.out.println(DesicionCPU);
            
            if(Desicion == DesicionCPU){
                System.out.println("Empate");
            }else{
                if(Desicion == 1 && DesicionCPU == 2){
                    System.out.println("Pierdes");
                }else if(Desicion == 1 && DesicionCPU == 3){
                    System.out.println("Ganas");
                }
                
                if(Desicion == 2 && DesicionCPU == 1){
                    System.out.println("Ganas");
                }else if(Desicion == 2 && DesicionCPU == 3){
                    System.out.println("Pierdes");
                }
                
                if(Desicion == 3 && DesicionCPU == 1){
                    System.out.println("Pierdes");
                }else if(Desicion == 3 && DesicionCPU == 2){
                    System.out.println("Ganas");     
                }
            }
            
        }
              
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Juego NuevoJuego = new Juego();
        NuevoJuego.Play();
    }
    
}
