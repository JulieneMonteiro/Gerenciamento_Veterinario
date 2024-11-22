
package a4;

import java.util.ArrayList;

/**
 *
 * @author Nicole de Oliveira Medeiros
 */
public class Veterinario {

    //atributos
    private String nome;
    private String CRMV;
    private String telefone;
    private ArrayList<String> agendaTrab; //exemplo: "Segunda-feira, quarta-feira" (os horários são os mesmos todos os dias)
    
    //construtor
    public void Veterinario(String nome, String crmv, String tel, ArrayList<String> agenda){
        this.setNome(nome);
        this.setCRMV(crmv);
        this.setTelefone(tel);
        this.agendaTrab = agenda;
    }
    
    //métodos getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCRMV() {
        return CRMV;
    }
    public void setCRMV(String CRMV) {
        this.CRMV = CRMV;
    }

    public ArrayList<String> getAgendaTrab() {
        return agendaTrab;
    }
    public void setAgenda (ArrayList<String> novaAgenda){
        this.agendaTrab = novaAgenda;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}