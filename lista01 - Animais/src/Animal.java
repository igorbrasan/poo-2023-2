public class Animal {
    private String tipo, nome;
    private int idade;

    public Animal(String tipo, String nome, int idade){
        this.idade = idade;
        this.tipo = tipo;
        this.nome = nome;
    }

    public int consumoDiarioEmGramas(){
        int consumo;
        if(tipo == "ave"){
            consumo = 100;
        }else if (tipo == "mamifero"){
            consumo = 2000;
        }else if (tipo == "anfibio"){
            consumo = 20;
        }else{
            throw  new IllegalArgumentException("Você deve escolher um dos tipos: mamifero, ave, anfibio");
        }
        return consumo;

    }
    //Getters and setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
