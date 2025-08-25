/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabalhoFinal.model;

/**
 *
 * @author diogo
 */
public class FuncionarioModel {
    private String nomeFunc, cpfFunc, dataNascimentoFunc,RG,sexo,cargo,dataAdmissao,email,telefone,turno;
    private int id_func;

    public FuncionarioModel(){}

    public FuncionarioModel(String nomeFunc, String cpfFunc, String dataNascimentoFunc, String RG, String sexo, String cargo, String dataAdmissao, String email, String telefone, String turno) {
        this.nomeFunc = nomeFunc;
        this.cpfFunc = cpfFunc;
        this.dataNascimentoFunc = dataNascimentoFunc;
        this.RG = RG;
        this.sexo = sexo;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.email = email;
        this.telefone = telefone;
        this.turno = turno;
        this.id_func=id_func;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getCpfFunc() {
        return cpfFunc;
    }

    public void setCpfFunc(String cpfFunc) {
        this.cpfFunc = cpfFunc;
    }

    public String getDataNascimentoFunc() {
        return dataNascimentoFunc;
    }

    public void setDataNascimentoFunc(String dataNascimentoFunc) {
        this.dataNascimentoFunc = dataNascimentoFunc;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
     public int getId_func() {
        return id_func;
    }

    public void setId_func(int id_func) {
        this.id_func = id_func;
    }
}
