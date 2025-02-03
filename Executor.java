import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Executor {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
        new Pessoa("Rodolfo", "Masculino"),
        new Pessoa("Ricky", "Masculino"),
        new Pessoa("Roberto", "Masculino"),
        new Pessoa("Roberta", "Feminino"),
        new Pessoa("Rogeria", "Feminino"),
        new Pessoa("Roxele", "Feminino")
        );

        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> Arrays.asList(p.getGenero())
                        .contains("Feminino"))
                .collect(Collectors.toList());

        System.out.println("********************");
        System.out.println("Lista Completa");
        System.out.println("********************");
        pessoas.forEach(System.out::println);
        System.out.println("********************");
        System.out.println("Lista de mulheres:");
        System.out.println("********************");
        mulheres.forEach(System.out::println);
        System.out.println("********************");


    }
}