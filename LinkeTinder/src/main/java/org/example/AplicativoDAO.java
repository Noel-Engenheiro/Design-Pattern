package org.example;

import java.sql.SQLException;
import java.util.Scanner;

public class AplicativoDAO {
    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
                boolean exit = false;
                while(!exit){
                    System.out.println("Escolha uma opção : " + "\n 1 Listar Candidato " + "\n 2 Inserir Candidato " + "\n 3 Atualizar dados do Candidato " +
                            "\n 4 Deletar Candidato " + "\n 5 Listar Empresa " + "\n 6 Inserir Empresa " + "\n 7 Atualizar dados da Empresa " +
                            "\n 8 Deletar Empresa " + "\n 9 Listar Competência do Candidato " + "\n 10 Inserir Competência do Candidato " + "\n 11 Atualizar Competência do Candidato "+
                            "\n 12 Deletar Competência do candidato" + "\n 13 Listar Vagas disponíveis" + "\n 14 Inserir Vagas na Tabela" +
                            "\n 15 Atualizar Vagas da tabela " + "\n 16 Deletar Vagas da tabela " + "\n 17 Sair do programa ");
                    int opcao = input.nextInt();
                    switch (opcao){
                        case 1 :
                            CandidatoDAO.listar_Candidato(9, "k", "f", "j", "j", 3, "j", 3, "j", 3);
                            break;
                        case 2 :
                            ICandidatoDAO.inserir_Candidato();
                            break;
                        case 3 :
                            ICandidatoDAO.atualizar_Dados_Do_Candidato();
                            break;
                        case 4 :
                            ICandidatoDAO.deletar_Candidato();
                            break;
                        case 5 :
                            EmpresaDAO.listar_Empresa();
                            break;
                        case 6 :
                            IEmpresaDAO.inserir_Empresa();
                            break;
                        case 7 :
                            IEmpresaDAO.atualizar_Dados_Da_Empresa();
                        case 8 :
                            IEmpresaDAO.deletar_Empresa();
                            break;
                        case 9 :
                            CompetenciaDAO.listar_Competencia_Candidato();
                            break;
                        case 10 :
                            ICompetenciaDAO.inserir_Competencia_Candidato();
                            break;
                        case 11 :
                            ICompetenciaDAO.atualizar_Competencia_Candidato();
                        case 12 :
                            ICompetenciaDAO.deletar_Competencia_Candidato();
                            break;
                        case 13 :
                            TabelaDeVagasDAO.listar_Vagas_Disponiveis();
                            break;
                        case 14 :
                            ITabelaDeVagasDAO.inserir_Vagas_Na_Tabela();
                            break;
                        case 15 :
                            ITabelaDeVagasDAO.atualizar_Vagas_Da_Tabela();
                        case 16 :
                            ITabelaDeVagasDAO.deletar_Vagas_Da_Tabela();
                            break;
                        case 17 :
                            exit = true;
                            break;
                        default :
                            System.out.println("Escolha uma opção válida");
                    }
                }
            }
        }
