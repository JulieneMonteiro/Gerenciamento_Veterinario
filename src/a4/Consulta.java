
package a4;

/**
 *
 * @author Nicole de Oliveira Medeiros
 * Integrantes: 
 * Juliana Simões Baur Muniz - 1230208587
 * Juliene Cristine de Oliveira Monteiro - 1230204288
 * Nicole de Oliveira Medeiros - 1230205889
 */
public class Consulta {
    private String diaHora; //formato: "dd/mm/aaaa[hh:mm]"
    private String donoCPF;
    private Animal animal;
    private Veterinario veterinario;
    
    //construtor
    public void Consulta(String diaHora, String donoCPF, Animal animal, Veterinario veterinario){
        this.setDiaHora(diaHora);
        this.setDonoCPF(donoCPF);
        this.setAnimal(animal);
        this.setVeterinario(veterinario);
    }
    
    //métodos getters e setters
    public String getDiaHora() {
        return diaHora;
    }
    public void setDiaHora(String diaHora) {
        this.diaHora = diaHora;
    }

    public String getDonoCPF() {
        return donoCPF;
    }
    public void setDonoCPF(String donoCPF) {
        this.donoCPF = donoCPF;
    }

    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    
    public Veterinario getVeterinario(){
        return veterinario;
    }
    public void setVeterinario(Veterinario veterinario){
        this.veterinario = veterinario;
    }
}
