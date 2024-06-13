/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import classes.animais.AnimalEstimacao;
import java.util.ArrayList;

/**
 *
 * @author 1424714
 */
public class Pessoa {
  
    private String nome;
    private ArrayList<AnimalEstimacao> pets;
    
    public Pessoa (String nome){
        this.nome = nome;
        pets = new ArrayList<>();
    }
    
    public void adota(AnimalEstimacao a){
        pets.add(a);
    }
    
    public AnimalEstimacao getPet(int i){
        return pets.get(i);
    }
    
    public void exibe(){
        System.out.println("Nome: " + nome);
        if(!pets.isEmpty()){
            System.out.println("Exibindo animais: ");
        for(AnimalEstimacao pet : pets){
            pet.exibe();
            }
        }
    }
}