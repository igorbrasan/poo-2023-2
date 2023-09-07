public class Automovel {
    private String combustivel, fabricante, modelo;


    public Automovel(String combustivel, String fabricante, String modelo){
        this.combustivel = combustivel;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }


    private float consumoMedio (String combustivel){
        float consumo;
        if(combustivel == "gasolina"){
            consumo = 15;
        } else if (combustivel == "alcool") {
            consumo = 12;
        }else if (combustivel == "flex"){
            consumo = 13.5F;
        }else {
            consumo = 99999;
        }
        return consumo;
    }

    public double consumo(double distancia){
        float consumoMedio = consumoMedio(combustivel);
        return distancia/consumoMedio;
    }



    //Getters e setters

    public String combustivel() {
        return combustivel;
    }

    public Automovel setCombustivel(String combustivel) {
        this.combustivel = combustivel;
        return this;
    }

    public String fabricante() {
        return fabricante;
    }

    public Automovel setFabricante(String fabricante) {
        this.fabricante = fabricante;
        return this;
    }

    public String modelo() {
        return modelo;
    }

    public Automovel setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }
}
