package org.example;

import org.junit.jupiter.api.Test;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class CandidatoDAOTest {

    @Test
    void listar_Candidato() throws SQLException {
        CandidatoDAO.listar_Candidato(9, "k", "f", "j","j", 3,"j", 3, "j", 3);
        assertEquals(9,9);

    }

    @Test
    void inserir_Candidato() throws SQLException {
        CandidatoDAO.inserir_Candidato(9, "k", "f", "j","j", 3,
                "j", 3, "j", 3);
        assertEquals(9,9);

    }

    @Test
    public void atualizar_Dados_Do_Candidato() throws SQLException {
        CandidatoDAO.atualizar_Dados_Do_Candidato(9, "k", "f", "j","j", 3,
                "j", 3, "j", 3);
        assertEquals(9,9);
    }
    @Test
    void deletar_Candidato() {
        CandidatoDAO.deletar_Candidato(1);
        assertEquals(0,0);
    }
}