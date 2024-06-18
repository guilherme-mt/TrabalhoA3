Alunos.java
package com.mycompany.cursosti;


public class Alunos {
    int id;
    private String nome;
    private String email;
    private int trilhas_id;
   

    public Alunos(int id, String nome, String email, int trilhas_id) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.trilhas_id = trilhas_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEmail(){
        return email;
    }

    public void setEmail(){
        this.email = email;
        
    }

    public int getTrilhas_id() {
        return trilhas_id;
    }

    public void setTrilhas_id(int trilhas_id) {
        this.trilhas_id = trilhas_id;
    }

}
