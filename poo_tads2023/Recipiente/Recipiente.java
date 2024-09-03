package Recipiente;

public class Recipiente {
    private int capacidade;
    private int quantidade;
    private Substancia substancia;

    public Recipiente(int capacidade){
        this.capacidade = capacidade;
        this.quantidade = 0;
        this.substancia = null;
    }

    public boolean adicionar(int qtde){
        if(quantidade + qtde <= capacidade){
            quantidade += qtde;
            return true;
        }
        return false;
    }
    public boolean remover(int qtde){
        if(quantidade >= qtde){
            quantidade -= qtde;
            return true;
        }
        return false;
    }

    public void esvaziar(){
        quantidade = 0;
    }
    public int getCapacidade(){
        return capacidade;
    }
    public void setCapacidade(int cap){
        this.capacidade = cap;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int qtde){
        this.quantidade = qtde;
    }
    public Substancia getSubstancia(){
        return substancia;
    }
    public void setSubstancia(Substancia sub){
        this.substancia = sub;
    }
}
