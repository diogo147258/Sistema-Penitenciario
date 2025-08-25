/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabalhoFinal.model;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author andre
 */
public class CelaModel {
    
    private int numero;
    private int capacidade;
    private String status;
    private List<PresoModel> presos;
    
    public CelaModel (){}
    
    public CelaModel(int numero, int capacidade, String status) {
        
        
        this.numero = numero;
        this.capacidade = capacidade;
        this.status = status;
        this.presos = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<PresoModel> getPresos() {
        return presos;
    }

    public void setPresos(List<PresoModel> presos) {
        this.presos = presos;
    }

    public boolean adicionarPreso(PresoModel preso) {
        if (presos.size() < capacidade) {
            presos.add(preso);
            return true;
        } else {
            return false; // Cela cheia
        }
    }

    public boolean removerPreso(PresoModel preso) {
        return presos.remove(preso);
    }


    //@Override
    //public String toString() {
     //   return "Cela " + numero + " (Capacidade: " + capacidade + ", Status: " + status + ", Presos: " + presos.size() + ")";
    //}
    @Override
public String toString() {
    return "Cela " + this.numero;  // ou o que quiser mostrar no combo
}

}

    
  
