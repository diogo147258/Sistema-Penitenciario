/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabalhoFinal.controller;

import TrabalhoFinal.model.FuncionarioModel;
import TrabalhoFinal.model.PresoModel;
import TrabalhoFinal.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane; 

/**
 *
 * @author diogo
 */
public class FuncionarioController {
    public boolean inserir(FuncionarioModel funcionario) {
        
        Conexao conexao = new Conexao();
        Connection con = conexao.conectar();
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
    public boolean atualizar(FuncionarioModel funcionario) {
         
        Conexao conexao = new Conexao();
        Connection con = conexao.conectar();
        String instrucao = "UPDATE funcionario SET nome_func=?,cpf_func=?,data_nasc_func=?,rg=?, sexo=?,cargo=?, data_admissao=?, email=?, telefone=?, turno=? WHERE idFuncionario=?";
        boolean retorno = false;
        try {
            PreparedStatement ps = con.prepareStatement(instrucao);
           
            ps.setString(1, funcionario.getNomeFunc());
            ps.setString(2, funcionario.getCpfFunc());
            ps.setString(3, funcionario.getDataNascimentoFunc());
            ps.setString(4, funcionario.getRG());
            ps.setString(5, funcionario.getSexo());
            ps.setString(6, funcionario.getCargo());
            ps.setString(7,funcionario.getDataAdmissao());
            ps.setString(8, funcionario.getEmail());
            ps.setString(9, funcionario.getTelefone());
            ps.setString(10, funcionario.getTurno());
            ps.setInt(11, funcionario.getId_func());
            int resultado = ps.executeUpdate();
            retorno = resultado >= 0;
        } catch (Exception ex) {
            System.err.println(ex);
        } finally {
            conexao.encerrar(con);
           return retorno; 
        }
    }
     
     
       public boolean excluir(FuncionarioModel funcionario) {
        
        Conexao conexao = new Conexao();
        Connection con = conexao.conectar();
        String instrucao = "DELETE FROM funcionario WHERE idFuncionario = ?";
        boolean retorno = false;
        try {
            PreparedStatement ps = con.prepareStatement(instrucao);
            ps.setInt(1, funcionario.getId_func());
            int resultado = ps.executeUpdate();
            retorno = resultado >= 0;
            JOptionPane.showMessageDialog(null, "Funcionario excluído com sucesso!");
        } catch (Exception ex) {
            System.err.println(ex);
        } finally {
            conexao.encerrar(con);
            return retorno;
        }       
    }
 public List<FuncionarioModel> listar() {
        
        Conexao conexao = new Conexao();
        java.sql.Connection con = conexao.conectar();
        String instrucao = "SELECT * FROM funcionario";
        List<FuncionarioModel> lista = new ArrayList<>();
        try{
            PreparedStatement ps = con.prepareStatement(instrucao);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                FuncionarioModel funcionario = new FuncionarioModel();
                funcionario.setId_func(rs.getInt(1));
                funcionario.setNomeFunc(rs.getString(2));
                funcionario.setCpfFunc(rs.getString(3));
                funcionario.setDataNascimentoFunc(rs.getString(4));
                funcionario.setRG(rs.getString(5));
                funcionario.setSexo(rs.getString(6));
                funcionario.setCargo(rs.getString(7));
                funcionario.setDataAdmissao(rs.getString(8));
                funcionario.setEmail(rs.getString(9));
                funcionario.setTelefone(rs.getString(10));
                funcionario.setTurno(rs.getString(11));
                
                lista.add(funcionario);
            }
            return lista;
        }catch(Exception ex){
            System.err.println(ex);
            lista = null;
          }
        finally{
            conexao.encerrar(con);
            return lista;
        }
    }       
    
    
    
}
