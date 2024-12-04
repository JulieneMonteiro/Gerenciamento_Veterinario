package a4;

/**
 *
 * @author Juliene Monteiro
 * Integrantes: 
 * Juliana Simões Baur Muniz - 1230208587
 * Juliene Cristine de Oliveira Monteiro - 1230204288
 * Nicole de Oliveira Medeiros - 1230205889
 */
public class Dono {
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private String email;

    // Construtor: inicia um novo objeto Dono com os valores passados como parametros.
    public Dono(String nome, String cpf, String telefone, String endereco, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
    }

    // Metodos getters: retornam os valores dos atributos privados.
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }
    public String getEmail() {
        return email;
    }
    

    // Metodos setters: Modificam os valores dos atributos privados.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
     public void setEmail(String email) {
        this.email = email;
    }
    
}