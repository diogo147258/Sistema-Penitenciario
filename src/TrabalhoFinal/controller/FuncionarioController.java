/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabalhoFinal.controller;

import TrabalhoFinal.model.FuncionarioModel;
import TrabalhoFinal.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author diogo
 */
public class FuncionarioController {
    public boolean inserir(FuncionarioModel funcionario) {
        
        Conexao conexao = new Conexao();
        Connection con = conexao.conectar();
        /*FALTA COR, NATURALIDADE, FILIACAO,*/
        String instrucao = "INSERT INTO funcionario ( nome_func,cpf_func ,data_nasc_func, rg, sexo, cargo, data_admissao,email, telefone, turno) VALUES (?,?,?,?,?,?,?,?,?,?)";
        boolean retorno = false;
        try {
            PreparedStatement ps = con.prepareStatement(instrucao);
            
            ps.setString(1, funcionario.getNomeFunc());
            ps.setString(2, funcionario.getCpfFunc());
            ps.setString(3, funcionario.getDataNascimentoFunc());
            ps.setString(4, funcionario.getRG());
            ps.setString(5, funcionario.getSexo());
            ps.setString(6, funcionario.getCargo());
            ps.setString(7, funcionario.getDataAdmissao());
            ps.setString(8, funcionario.getEmail());
            ps.setString(9, funcionario.getTelefone());
            ps.setString(10,funcionario.getTurno());
            int resultado = ps.executeUpdate();
            retorno = resultado >= 0;
        } catch (Exception ex) {
            System.err.println(ex);
        } finally {
            conexao.encerrar(con);
           return retorno; 
        }
    }
    
    
    
}
