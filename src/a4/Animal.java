package a4;


/**
 *
 * @author Juliana
 */
public class Animal {
    private String nome;
    private String raca;
    private String dataNasc;
    private String CpfD;
public Animal(){
}
public Animal(String nome, String raca, String dataNasc, String CpfD){
    this.nome= nome;
    this.raca= raca;
    this.dataNasc= dataNasc;
    this.CpfD= CpfD;
}
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCpfD() {
        return CpfD;
    }

    public void setCpfD(String CpfD) {
        this.CpfD = CpfD;
    }
}




