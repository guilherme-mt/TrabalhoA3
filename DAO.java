DAO.java

  package com.mycompany.cursosti;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class DAO {
    public boolean existe(Usuario usuario)throws Exception{
        String sql = "SELECT * FROM usuarios WHERE login = ? AND senha = ?";
        
        try(Connection conn = Conexao.obtemConexao()){
        PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }      
        }
    }
    public void inserir(Cursos cursos)throws Exception{ 
            String sql = ("INSERT INTO cursos (nome, tipo) values(?, ?)");
    
    try(Connection conn = Conexao.obtemConexao()){
        PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cursos.getNome());
            ps.setString(2, cursos.getTipo());
          ps.execute();
    }
      }
    
    public void atualizar(Cursos cursos)throws Exception{
        String sql = ("UPDATE cursos SET nome = ? WHERE id = ?");
        // Update alunos set nome = ?, email = ?, trilhas_id = ? where id = ?
        
        
     try(Connection conn = Conexao.obtemConexao()){
        PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cursos.getNome());
            ps.setString(2, cursos.getTipo());
          ps.execute();
    }
        
      }
    
    public void excluir(Cursos cursos)throws Exception{
     String sql = ("DELETE FROM cursos WHERE id = ?");
     
     try(Connection conn = Conexao.obtemConexao()){
         PreparedStatement ps = conn.prepareStatement(sql);
         ps.setInt(1, cursos.getId());
         ps.execute();
         
     }
    }
            public void atualizarAlunos(Alunos alunos) throws Exception{
                String sql = ("UPDATE alunos SET nome = ?, email = ?, trilhas_id = ? WHERE id = ?");
                
                try(Connection conn = Conexao.obtemConexao()){
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.setString(1, alunos.getNome());
                    ps.setString(2, alunos.getEmail());
                    ps.setInt(3, alunos.getTrilhas_id());
                    ps.setInt(4, alunos.getId());
                    ps.execute();
                }
                
                

}
}
