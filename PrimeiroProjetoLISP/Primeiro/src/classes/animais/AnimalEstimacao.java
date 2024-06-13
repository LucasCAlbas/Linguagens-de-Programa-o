package classes.animais;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1424714
 */
public class AnimalEstimacao {
    protected final int id;
    protected String nome;
    protected double peso;
    protected String especie;
    
    public AnimalEstimacao(int id, String nome, double peso){
        this.id = id;
        this.nome = nome;
        this.peso = peso;
        this.especie = "Nao definida";
    }
    
        public int getId(){
        return id;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
        public double getPeso(){
        return peso;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public String getEspecie(){
        return especie;
    }
    
    public String produzSom() {
    return "";
    }
    
    public void exibe(){
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("Especie: " + especie);
    }
}
 