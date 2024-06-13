/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.animais;

/**
 *
 * @author 1424714
 */
public class Gato extends AnimalEstimacao {
    
    private String raca;
    private double metrosAndados;
   
    public Gato(int id, String nome, String raca ,double peso){
        super(id, nome, peso);
        this.raca = raca;
        this.metrosAndados = 0; 
        this.especie = "Gato";
    }
    
    public Gato(int id, String nome, double peso){
        super(id, nome, peso);
        this.raca = "Nao definida";
        this.metrosAndados = 0; 
        this.especie = "Gato";
    }

    public String getRaca(){
        return raca;
    }
    
    public void setRaca(String raca){
        this.raca = raca;
    }
    
    public double getMetrosAndados(){
        return metrosAndados;
    }
    
    public void andar(double metros){
        this.metrosAndados += metros;
    }
    
    @Override
    public String produzSom() {
    return "meow meow meow meow, meow, meow meow meow meow meow meow meow meow";
    }
    
    @Override
    public void exibe(){
        super.exibe();
        System.out.println("Raca: " + raca);
        System.out.println("Metros percorridos: " + metrosAndados);
    }
}
