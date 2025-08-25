/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabalhoFinal.controller;

import TrabalhoFinal.model.CelaModel;
import TrabalhoFinal.model.PresoModel;
import TrabalhoFinal.util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class CelaController {

    public List<CelaModel> buscarCelas() {
        List<CelaModel> celas = new ArrayList<>();
        Conexao conexao = new Conexao();
        Connection conn = conexao.conectar();
        String sql = "SELECT numero, capacidade, status FROM celas LIMIT 10";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                celas.add(new CelaModel(
                        rs.getInt("numero"),
                        rs.getInt("capacidade"),
                        rs.getString("status")
                ));
            }
        } catch (Exception ex) {
            System.err.println(ex);
            celas = null;
        }
        return celas;
    }

    public List<PresoModel> buscarPresosPorCela(int celaId) {
        List<PresoModel> presos = new ArrayList<>();
        Conexao conexao = new Conexao();
        Connection conn = conexao.conectar();
        String sql = "SELECT id_preso, cela_id, nome, data_nascimento, cpf, data_prisao, pena_anos, filiacao, naturalidade, cor FROM prisao WHERE cela_id = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, celaId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                presos.add(new PresoModel(
                        rs.getInt("id_preso"),
                        rs.getInt("cela_id"),
                        rs.getString("nome"),
                        rs.getString("data_nascimento"),
                        rs.getString("cpf"),
                        rs.getString("data_prisao"),
                        rs.getString("pena_anos"),
                        rs.getString("filiacao"),
                        rs.getString("naturalidade"),
                        rs.getString("cor")
                ));
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao buscar presos por cela: " + ex.getMessage());
            presos = null;
        }

        return presos;
    }

}
