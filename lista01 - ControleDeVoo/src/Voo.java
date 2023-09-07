import java.time.LocalTime;
import java.util.Date;

public class Voo {
    public String diamesano, hora, identificador;
    public int passageiros;

    public Voo(String diamesano, String hora, int passageiros) {
        this.diamesano = diamesano;
        this.hora = hora;
        this.passageiros = passageiros;
        this.identificador = String.valueOf(LocalTime.now().getNano());
    }

    public boolean comprarPassagem(){
        if(passageiros < 100){
            passageiros++;
            return true;
        }else {
            return false;
        }

    }
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getDiamesano() {
        return diamesano;
    }

    public void setDiamesano(String diamesano) {
        this.diamesano = diamesano;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }
}
