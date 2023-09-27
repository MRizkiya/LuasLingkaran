/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipedata;

/**
 *
 * @author ASUS
 */
public class LuasLingkaran {
    public static void main(String[]args){
        //konstanta yang ditandai dengan kata final
        final double PI = 3.141592;
        double jari1 = 11.78;
        double Jari2 = 11.78;
        double luas = PI * jari1 * Jari2;
        
        System.out.println("luas lingkaran = " + luas);
        System.out.println("luas lingkaran paksa int = " + (int)luas);
        System.out.println("luas lingkaran pembulatan = "+ Math.round(luas));
        
        
                
    
    }
    
}
