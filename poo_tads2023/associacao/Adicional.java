package associacao;

import java.util.Objects;

public class Adicional {

    private final String nome;

    public Adicional(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do adicional não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adicional adicional = (Adicional) o;
        return Objects.equals(nome, adicional.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
