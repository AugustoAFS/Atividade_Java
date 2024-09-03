package associacao;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Carro {

    private final Marca marca;
    private final Modelo modelo;
    private final Cor cor;
    private final List<Adicional> adicionais;

    public Carro(Marca marca, Modelo modelo, Cor cor, List<Adicional> adicionais) {
        if (marca == null || modelo == null || cor == null || adicionais == null) {
            throw new IllegalArgumentException("Marca, modelo, cor e adicionais não podem ser nulos.");
        }
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.adicionais = new LinkedList<>(adicionais); // Cria uma cópia da lista de adicionais
    }

    public Marca getMarca() {
        return marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public Cor getCor() {
        return cor;
    }

    public List<Adicional> getAdicionais() {
        return new LinkedList<>(adicionais); // Retorna uma cópia da lista para garantir imutabilidade
    }

    @Override
    public String toString() {
        return "Carro {" +
                "Marca='" + marca + '\'' +
                ", Modelo='" + modelo + '\'' +
                ", Cor='" + cor + '\'' +
                ", Adicionais=" + adicionais +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return marca.equals(carro.marca) && modelo.equals(carro.modelo) && cor.equals(carro.cor) && adicionais.equals(carro.adicionais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, cor, adicionais);
    }
}
