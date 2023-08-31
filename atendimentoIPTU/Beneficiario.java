//Projeto de POO
public class Beneficiario {
    private String nome, tipoImovel, rg, cpf;
    private double renda, tamanhoImovel, debitos, valorAPagarRenda, valorAPagarm2;
    private boolean beneficiavel, beneficiado;

    private Beneficiario(String nome, String tipoImovel, String rg, String cpf, double renda, double tamanhoImovel, double debitos, double valorAPagarRenda,
                         double valorAPagarm2, boolean beneficiavel, boolean beneficiado) {
        this.nome = nome;
        this.tipoImovel = tipoImovel;
        this.rg = rg;
        this.cpf = cpf;
        this.renda = renda;
        this.tamanhoImovel = tamanhoImovel;
        this.debitos = debitos;
        this.valorAPagarRenda = valorAPagarRenda;
        this.valorAPagarm2 = valorAPagarm2;
        this.beneficiavel = beneficiavel;
        this.beneficiado = beneficiado;
    }

    public Beneficiario(String nome, String rg)  /* Cadastro Simplificado */ {
        this(nome, /*TipoImovel*/ null, rg, /*cpf*/ null, /*renda*/ 0.0, /*tamanhoImovel*/ 0.0, /*debitos*/ 0.0,
                /*valorAPagarRenda*/ 0.0, /* ValorAPagarm2 */0.0, /* Beneficiavel */ false, /* Beneficiado */ false);
    }

    public Beneficiario(String nome, String tipoImovel, String rg, String cpf, double renda, double tamanhoImovel, /* Cadastro Completo */
                        double debitos, double valorAPagarRenda, double valorAPagarm2) {
        this(nome, tipoImovel, rg, cpf, renda, tamanhoImovel, debitos, /*valorAPagarRenda*/ 0.0, /* ValorAPagarm2 */ 0.0, /* Beneficiavel */ true, /* Beneficiado */ false);
    }

    public void CompletaCadastro(String cpf, String tipoImovel, double tamanhoImovel, double renda, double debitos) {
        this.cpf = cpf;
        this.tipoImovel = tipoImovel;
        this.tamanhoImovel = tamanhoImovel;
        this.renda = renda;
        this.debitos = debitos;
        this.beneficiavel = true;
    }

    /* Versão anterior da classe:

     public class Beneficiario
    {
        private String nome, tipoImovel;
        private String rg, cpf;
        private double renda, tamanhoImovel, debitos;
        private boolean beneficiavel, beneficiado;
        private double valorApagarRenda = 0.0;
        private double valorAPagarm2 = 0.0;
        public Beneficiario(String nome, String rg)
        {
            this.nome = nome;
            this.rg = rg;
            this.cpf = "";
            this.tipoImovel = null;
            this.tamanhoImovel = 0;
            this.renda = 0;
            this.debitos = 0;
            this.beneficiado = false;
        }

        public Beneficiario(String nome, String rg, String cpf, String tipoImovel, double tamanhoImovel, double renda, double debitos)
        {
            this.nome = nome;
            this.rg = rg;
            this.cpf = cpf;
            this.tipoImovel =  tipoImovel;
            this.tamanhoImovel = tamanhoImovel;
            this.renda = renda;
            this.debitos = debitos;
            this.beneficiavel = true;
        }
    
        public void CompletaCadastro(String cpf, String tipoImovel, double tamanhoImovel, double renda, double debitos)
        {
            this.cpf = cpf;
            this.tipoImovel =  tipoImovel;
            this.tamanhoImovel = tamanhoImovel;
            this.renda = renda;
            this.debitos = debitos;
            this.beneficiavel = true;
        }
     */
    private void DescontoIptu(){
            if (beneficiavel && !beneficiado && 5000.00 >= renda )
        {
                this.valorAPagarRenda = 0.9 * debitos;
        } else {
                this.valorAPagarRenda = 0.95 * debitos;
            }

            this.valorAPagarm2 = debitos - (10.00 * tamanhoImovel);

            beneficiado = true;

        }


    public double DescontoRenda() {
        DescontoIptu();
        return valorAPagarRenda;
    }

    public double DescontoM2() {
        DescontoIptu();
        return valorAPagarm2;
    }

    /*Getters e setters*/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(String tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public double getTamanhoImovel() {
        return tamanhoImovel;
    }

    public void setTamanhoImovel(double tamanhoImovel) {
        this.tamanhoImovel = tamanhoImovel;
    }

    public double getDebitos() {
        return debitos;
    }

    public void setDebitos(double debitos) {
        this.debitos = debitos;
    }
}
