/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheribola;

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class bola {
    public double Jari ;
    public void setJari(double nilaiBaru){
        this.Jari=nilaiBaru;
    }
    public double volumebola (){
        return 1.33 * 3.14 * Jari * Jari * Jari;
    }
    public double luaspermukaanbola (){
        return 4 * 3.14 * Jari * Jari ;
    }
}
