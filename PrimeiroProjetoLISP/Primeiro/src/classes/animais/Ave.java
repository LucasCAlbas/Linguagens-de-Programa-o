/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.animais;

/**
 *
 * @author 1424714
 */
public class Ave extends AnimalEstimacao {
    
    private boolean voa;
    
    public Ave(int id, String nome, String especie ,double peso, boolean voa){
        super(id, nome, peso); 
        this.especie = especie;
        this.voa = voa;
    }
    
    public boolean getVoa(){
        return voa;
    }
    
    @Override
    public String produzSom() {
    return "twi twi twi twi twi, tiw twiitwiwtiwitwiwiwiwiwiwiwi";
    }
    
    @Override
    public void exibe(){
        super.exibe();
        if(voa){
        System.out.println("A ave voa? : Sim");
        }
    }
}
