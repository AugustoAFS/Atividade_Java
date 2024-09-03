package Recipiente;

public class Substancia {
    private String nome;
    private boolean inflamavel;

    public Substancia(String nome){
        this.nome = nome;
    }
    public Substancia(String nome, boolean inflamavel){
        this.nome = nome;
        this.inflamavel = inflamavel;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setInflamavel(boolean inflamavel){
        this.inflamavel = inflamavel;
    }

    public String getNome(){
        return nome;
    }
    public boolean isInflamavel(){
        return inflamavel;
    }
}
