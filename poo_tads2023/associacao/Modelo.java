package associacao;

import java.util.Objects;

public class Modelo {

    private final String nome;

    public Modelo(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do modelo não pode ser nulo ou vazio.");
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
        Modelo modelo = (Modelo) o;
        return Objects.equals(nome, modelo.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
