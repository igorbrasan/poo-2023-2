public class Conta{
    int agencia;
    int numero;
    boolean especial;
    double saldo, limite, limiteUsado;
    Titular titular;

    public Conta(Titular titular)
    {
        this.titular = titular;
        this.especial = false;
        this.limite = 0.0;
        this.saldo = 0.00;

    }
    public Conta(Titular titular, int agencia, int numero, double saldo, double limite, double limiteUsado)
    {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.especial = true;
        this.saldo = saldo;
        this.limite = limite;
        this.limiteUsado = limiteUsado;

    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public boolean isEspecial() {
        return especial;
    }
    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public double getLimiteUsado() {
        return limiteUsado;
    }
    public void setLimiteUsado(double limiteUsado) {
        this.limiteUsado = limiteUsado;
    }
    public Titular getTitular() {
        return titular;
    }
    public void setTitular(Titular titular) {
        this.titular = titular;
    }

private boolean Saque(double saque){
    boolean saqueRealizado;
        if(!especial)
    {
        return saqueRealizado = false;
    } else if(!especial && saque<saldo){
        saldo = saldo - saque;
    }

    this.limiteUsado = limiteUsado + saque;
}
}

(saldo + limite - limiteUsado >= saque)


















