import java.time.Instant;
import java.time.LocalTime;
import java.time.Year;

public class Aluno {
    public String nome, curso;
    public int anoIngresso, disciplinasAprovado;

    public Aluno(String nome, int anoIngresso, String curso, int disciplinasAprovado) {
        this.nome = nome;
        this.anoIngresso = anoIngresso;
        this.curso = curso;
        this.disciplinasAprovado = disciplinasAprovado;
    }


    public int creditos(){
        return disciplinasAprovado * 4;
    }

    public int tempoDeCurso(){
        int year = Year.now().getValue();

        return year - anoIngresso;
    }

    //Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getDisciplinasAprovado() {
        return disciplinasAprovado;
    }

    public void setDisciplinasAprovado(int disciplinasAprovado) {
        this.disciplinasAprovado = disciplinasAprovado;
    }
}
