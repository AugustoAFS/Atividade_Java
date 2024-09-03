package associacao;

import java.util.*;

public class CliCliente {

    private static List<Marca> marcas = new ArrayList<>();
    private static List<Modelo> modelos = new ArrayList<>();
    private static List<Cor> cores = new ArrayList<>();
    private static List<Adicional> adicionais = new ArrayList<>();

    public static void main(String[] args) {
        addMarca();
        addModelo();
        addCor();
        addAdicionais();

        Scanner scanner = new Scanner(System.in);
        Marca marca = escolherItem("Escolha a marca:", marcas, scanner);
        Modelo modelo = escolherItem("Escolha o modelo:", modelos, scanner);
        Cor cor = escolherItem("Escolha a cor:", cores, scanner);
        List<Adicional> adicionaisSelecionados = escolherAdicionais(scanner);
        Carro carro = new Carro(marca, modelo, cor, adicionaisSelecionados);
        System.out.println("Carro criado:");
        System.out.println(carro);
        scanner.close();
    }

    private static <T> T escolherItem(String prompt, List<T> items, Scanner scanner) {
        System.out.println(prompt);
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }

        int escolha = -1;
        while (escolha < 0 || escolha >= items.size()) {
            try {
                escolha = Integer.parseInt(scanner.nextLine()) - 1;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um número válido.");
            }
        }
        return items.get(escolha);
    }

    private static List<Adicional> escolherAdicionais(Scanner scanner) {
        List<Adicional> adicionaisSelecionados = new ArrayList<>();
        System.out.println("Escolha os adicionais (separe os números com vírgulas):");
        for (int i = 0; i < adicionais.size(); i++) {
            System.out.println((i + 1) + ". " + adicionais.get(i));
        }

        String[] indices = scanner.nextLine().split(",");
        for (String indice : indices) {
            try {
                int index = Integer.parseInt(indice.trim()) - 1;
                if (index >= 0 && index < adicionais.size()) {
                    adicionaisSelecionados.add(adicionais.get(index));
                } else {
                    System.out.println("Índice de adicional inválido: " + (index + 1));
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida: " + indice.trim());
            }
        }

        return adicionaisSelecionados;
    }

    public static void addMarca() {
        marcas.add(new Marca("Volkswagen"));
        marcas.add(new Marca("Ford"));
        marcas.add(new Marca("Fiat"));
        marcas.add(new Marca("Honda"));
        marcas.add(new Marca("Hyundai"));
        marcas.add(new Marca("Peugeot"));
        marcas.add(new Marca("Chevrolet"));
        marcas.add(new Marca("Toyota"));
        marcas.add(new Marca("Renault"));
        marcas.add(new Marca("Jeep"));
        marcas.add(new Marca("Nissan"));
        marcas.add(new Marca("Citroen"));
        marcas.add(new Marca("Kia"));
        marcas.add(new Marca("BMW"));
        marcas.add(new Marca("Mercedes-Benz"));
        marcas.add(new Marca("Audi"));
        marcas.add(new Marca("Volvo"));
        marcas.add(new Marca("Land Rover"));
        marcas.add(new Marca("Mitsubishi"));
        marcas.add(new Marca("Suzuki"));
    }

    public static void addModelo() {
        modelos.add(new Modelo("Gol"));
        modelos.add(new Modelo("Fiesta"));
        modelos.add(new Modelo("Uno"));
    }

    public static void addCor() {
        cores.add(new Cor("Preto"));
        cores.add(new Cor("Branco"));
        cores.add(new Cor("Prata"));
    }

    public static void addAdicionais() {
        adicionais.add(new Adicional("Ar-condicionado"));
        adicionais.add(new Adicional("Direção hidráulica"));
    }
}
