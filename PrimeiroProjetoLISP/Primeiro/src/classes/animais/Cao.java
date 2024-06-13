package classes.animais;

public class Cao extends AnimalEstimacao {
    // static pertence a CLASSE (independe de objetos)
    // final nao pode ser alterado, uma vez que tenha sido inicializado
    public static final String NOME_CIENTIFICO = "Canis Familiaris";
    private String raca;
    private double metrosAndados;
    
    public Cao(int id, String nome,
            String raca, double peso){
        super(id, nome, peso);
        this.raca = raca;
        this.metrosAndados = 0;    
        this.especie = "Cachorro";
    }
    
    /*
        sobrecarga de metodo (polimorfismo)
        metodos com o mesmo nome porem parametros diferentes
    */
    public Cao(int id, String nome, double peso){
        super(id, nome, peso);
        this.raca = "Nao definida";
        this.metrosAndados = 0; 
        this.especie = "Cachorro";
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
    return "au.";
    }
    
    @Override
    public void exibe(){
        super.exibe();
        System.out.println("Raca: " + raca);
        System.out.println("Metros percorridos: " + metrosAndados);
    }
}
