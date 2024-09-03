package Recipiente;

public class CliRecipiente {
    public static void main(String[] args){
        Recipiente recipiente = new Recipiente(100);

        Substancia alcool = new Substancia("Alcool", true);

        recipiente.setSubstancia(alcool);

        System.out.println("Recipiente criado com capacidade de: " + recipiente.getCapacidade());
        System.out.println("Substância adicionada: " + recipiente.getSubstancia().getNome());
        System.out.println("A substância é inflamável? " + (recipiente.getSubstancia().isInflamavel() ? "Sim" : "Não"));
    }
}
