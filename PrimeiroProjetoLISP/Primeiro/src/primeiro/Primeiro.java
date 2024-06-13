package primeiro;

import classes.Pessoa;
import classes.animais.Ave;
import classes.animais.Cao;
import classes.animais.Gato;

public class Primeiro {

    public static void main(String[] args) {
        Cao c1 = new Cao(1, "Ze Trevoso", "Pincher", 2.5);
        Cao c2 = new Cao(2, "Frufru", "Poodle", 3.5);

        
        // instanciando um novo Cao com outro construtor (sobrecarga de metodo)
        Gato g1 = new Gato(3, "Garfield", "Persa" , 10.9);

        
        Ave a1 = new Ave(4, "Lui", "Piriquito", 0.5, true);

        
        Pessoa p1 = new Pessoa ("Rogerio");
        p1.adota(c1);
        p1.adota(g1);
        p1.adota(a1);
        
        p1.exibe();
        
        if(p1.getPet(0).getEspecie().equals("Cachorro")){
            Cao teste = (Cao) p1.getPet(0);
            System.out.println(teste.getRaca());
        }
        
        
        
        System.out.println("O animal vai fazer som: " + c1.produzSom());
        System.out.println("O animal vai fazer som: " + c2.produzSom());
        System.out.println("O animal vai fazer som: " + g1.produzSom());
        System.out.println("O animal vai fazer som: " + a1.produzSom());
    }  
}
