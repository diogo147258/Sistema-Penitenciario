/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabalhoFinal.controller;

import TrabalhoFinal.model.VisitaModel;
import TrabalhoFinal.util.Conexao;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author henri
 */
public class VisitaController {

    public boolean inserir(VisitaModel visitante) {
        Conexao conexao = new Conexao();
        Connection con = conexao.conectar();
        String instrucao = "INSERT INTO visitante (idVisitante, nomeVisitante, telefoneVisitante, cpfVisitante, dataNascimentoVisitante, rgVisitante, sexoVisitante, nomeDoPreso, parentesco, dataVisita, horaVisita, motivoVisita) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        boolean retorno = false;
        try {
            PreparedStatement ps = con.prepareStatement(instrucao);


            ps.setInt(1, visitante.getIdVisitante());
            ps.setString(2, visitante.getNomeVis());
            ps.setString(3, visitante.getTelefoneVis());
            ps.setString(4, visitante.getCpfVis());
            ps.setString(5, visitante.getDataNascimentoVis());
            ps.setString(6, visitante.getRgVis());
            ps.setString(7, visitante.getSexoVis());
            ps.setString(8, visitante.getNomeDoPreso());
            ps.setString(9, visitante.getParentesco());
            ps.setString(10, visitante.getDataVis());
            ps.setString(11, visitante.getHoraVis());
            ps.setString(12, visitante.getMotivoVis());
            int resultado = ps.executeUpdate();
            retorno = resultado >= 0;

            JOptionPane.showMessageDialog(null, "Visita criada com sucesso!");
        } catch (Exception ex) {
            System.err.println(ex);
        } finally {
            conexao.encerrar(con);
            return retorno;
        }

    }

    public boolean atualizar(VisitaModel visitante) {
        Conexao conexao = new Conexao();
        Connection con = conexao.conectar();
        String instrucao = "UPDATE visitante SET nomeVisitante=?, telefoneVisitante=?, cpfVisitante=?, dataNascimentoVisitante=?, rgVisitante=?, sexoVisitante=?, nomeDoPreso=?, parentesco=?, dataVisita=?, horaVisita=?, motivoVisita=? WHERE idVisitante=?";
        boolean retorno = false;
        try {
            PreparedStatement ps = con.prepareStatement(instrucao);

        ps.setString(1, visitante.getNomeVis());
        ps.setString(2, visitante.getTelefoneVis());
        ps.setString(3, visitante.getCpfVis());
        ps.setString(4, visitante.getDataNascimentoVis());
        ps.setString(5, visitante.getRgVis());
        ps.setString(6, visitante.getSexoVis());
        ps.setString(7, visitante.getNomeDoPreso());
        ps.setString(8, visitante.getParentesco());
        ps.setString(9, visitante.getDataVis());
        ps.setString(10, visitante.getHoraVis());
        ps.setString(11, visitante.getMotivoVis());
        ps.setInt(12, visitante.getIdVisitante());

            int resultado = ps.executeUpdate();
            retorno = resultado >= 0;

            JOptionPane.showMessageDialog(null, "Visita atualizada com sucesso!");
        } catch (Exception ex) {
            System.err.println(ex);
        } finally {
            conexao.encerrar(con);
            return retorno;
        }
    }

    public boolean excluir(VisitaModel visitante) {
        Conexao conexao = new Conexao();
        Connection con = conexao.conectar();
        String instrucao = "DELETE FROM visitante WHERE idVisitante=?";
        boolean retorno = false;
        try {
            PreparedStatement ps = con.prepareStatement(instrucao);

            ps.setInt(1, visitante.getIdVisitante());
            int resultado = ps.executeUpdate();
            retorno = resultado >= 0;

            JOptionPane.showMessageDialog(null, "Visita excluída com sucesso!");

        } catch (Exception ex) {
            System.err.println(ex);
        } finally {
            conexao.encerrar(con);
            return retorno;
        }
    }

    public List<VisitaModel> listar() {
        Conexao conexao = new Conexao();
        Connection con = conexao.conectar();
        String instrucao = "SELECT * FROM visitante";
        List<VisitaModel> visitantes = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(instrucao);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                VisitaModel visitante = new VisitaModel();
                
                visitante.setNomeVis(rs.getString(1));
                visitante.setTelefoneVis(rs.getString(2));
                visitante.setCpfVis(rs.getString(3));
                visitante.setDataNascimentoVis(rs.getString(4));
                visitante.setRgVis(rs.getString(5));
                visitante.setSexoVis(rs.getString(6));
                visitante.setNomeDoPreso(rs.getString(7));
                visitante.setParentesco(rs.getString(8));
                visitante.setHoraVis(rs.getString(9));
                visitante.setMotivoVis(rs.getString(10));
                visitante.setDataVis(rs.getString(11));
                visitante.setIdVisitante(rs.getInt(12));

                visitantes.add(visitante);
            }
        } catch (Exception ex) {
            System.err.println(ex);
        } finally {
            conexao.encerrar(con);
            return visitantes;
        }
    }

}
