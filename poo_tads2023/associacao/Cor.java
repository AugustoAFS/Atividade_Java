package associacao;

import java.util.Objects;

public class Cor {

    private final String nome;

    public Cor(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome da cor não pode ser nulo ou vazio.");
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
        Cor cor = (Cor) o;
        return Objects.equals(nome, cor.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
