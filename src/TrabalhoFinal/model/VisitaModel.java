/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabalhoFinal.model;

/**
 *
 * @author henri
 */
public class VisitaModel {
    private int idVisitante;
    private String nomeVis,telefoneVis,cpfVis, dataNascimentoVis,rgVis,sexoVis,nomeDoPreso, parentesco, dataVis, horaVis, motivoVis;

    public VisitaModel() {
    }

    public VisitaModel(int idVisitante, String nomeVis, String telefoneVis, String cpfVis, String dataNascimentoVis, String rgVis, String sexoVis, String nomeDoPreso, String parentesco, String dataVis, String horaVis, String motivoVis) {
        this.idVisitante = idVisitante;
        this.nomeVis = nomeVis;
        this.telefoneVis = telefoneVis;
        this.cpfVis = cpfVis;
        this.dataNascimentoVis = dataNascimentoVis;
        this.rgVis = rgVis;
        this.sexoVis = sexoVis;
        this.nomeDoPreso = nomeDoPreso;
        this.parentesco = parentesco;
        this.dataVis = dataVis;
        this.horaVis = horaVis;
        this.motivoVis = motivoVis;
    }

    public int getIdVisitante() {
        return idVisitante;
    }

    public void setIdVisitante(int idVisitante) {
        this.idVisitante = idVisitante;
    }

    public String getNomeVis() {
        return nomeVis;
    }

    public void setNomeVis(String nomeVis) {
        this.nomeVis = nomeVis;
    }

    public String getTelefoneVis() {
        return telefoneVis;
    }

    public void setTelefoneVis(String telefoneVis) {
        this.telefoneVis = telefoneVis;
    }

    public String getCpfVis() {
        return cpfVis;
    }

    public void setCpfVis(String cpfVis) {
        this.cpfVis = cpfVis;
    }

    public String getDataNascimentoVis() {
        return dataNascimentoVis;
    }

    public void setDataNascimentoVis(String dataNascimentoVis) {
        this.dataNascimentoVis = dataNascimentoVis;
    }

    public String getRgVis() {
        return rgVis;
    }

    public void setRgVis(String rgVis) {
        this.rgVis = rgVis;
    }

    public String getSexoVis() {
        return sexoVis;
    }

    public void setSexoVis(String sexoVis) {
        this.sexoVis = sexoVis;
    }

    public String getNomeDoPreso() {
        return nomeDoPreso;
    }

    public void setNomeDoPreso(String nomeDoPreso) {
        this.nomeDoPreso = nomeDoPreso;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getDataVis() {
        return dataVis;
    }

    public void setDataVis(String dataVis) {
        this.dataVis = dataVis;
    }

    public String getHoraVis() {
        return horaVis;
    }

    public void setHoraVis(String horaVis) {
        this.horaVis = horaVis;
    }

    public String getMotivoVis() {
        return motivoVis;
    }

    public void setMotivoVis(String motivoVis) {
        this.motivoVis = motivoVis;
    }
    
    
}


