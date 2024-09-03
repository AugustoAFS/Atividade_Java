package associacao;

import java.util.Objects;

public class Marca {

    private final String nome;

    public Marca(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome da marca não pode ser nulo ou vazio.");
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
        Marca marca = (Marca) o;
        return Objects.equals(nome, marca.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
