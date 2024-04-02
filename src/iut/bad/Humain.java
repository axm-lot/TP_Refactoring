/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iut.bad;

/**
 *
 * @author axm
 */
public class Humain implements Consommation{
    String nom, prenom;
    int age;
    
@Override
    public String toString() {
        return "Nom: " + this.nom + "\nPrenom: " + this.prenom + "\nAge: " + this.age;
    }
    
    @Override
    public void manger(){
        
    }
    
    
    @Override
    public void boire(){
        
    }    
}
