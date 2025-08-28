import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    public static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> todasPessoas) {
        Map<String, List<Pessoa>> listaMap = todasPessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.toList()));
        return listaMap;
    }

    public static Map<String, List<Integer>> obterIdadePorCargo(List<Pessoa> todasPessoas) {
        return todasPessoas.stream()
                .collect(Collectors.groupingBy(
                        Pessoa::getCargo,
                        Collectors.mapping(Pessoa::getIdade, Collectors.toList())));
    }

    public static Map<String, List<Pessoa>> obterPessoasPorCargoAcimaDe40anos(List<Pessoa> todasPessoas) {
        Map<String, List<Pessoa>> listaMap = todasPessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo,
                        Collectors.filtering(pessoal -> pessoal.getIdade() > 40, Collectors.toList())));
        return listaMap;
    }

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(
            List<Pessoa> todasPessoas) {
        return todasPessoas.stream()
                .collect(Collectors.groupingBy(
                        Pessoa::getCargo,
                        () -> new TreeMap<>(java.util.Collections.reverseOrder()),
                        Collectors.toCollection(TreeSet::new)));
    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> todasPessoas) {
        Map<String, Long> listaMap = todasPessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.counting()));
        return listaMap;
    }

    public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> todasPessoas) {
        Map<String, Map<Integer, Long>> listaMap = todasPessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo, 
                Collectors.groupingBy(Pessoa::getIdade, Collectors.counting())));
        return listaMap;
    }

    public static Map<String, Double> obterMediaSalarioPorCargo(List<Pessoa> todasPessoas) {
        Map<String, Double> listaMap = todasPessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo, 
                Collectors.averagingDouble(Pessoa::getSalario)));
        return listaMap;
    }

    public static Map<String, TreeSet<String>> obterHobbiesPorCargo(List<Pessoa> todasPessoas) {
        return todasPessoas.stream()
                .collect(Collectors.groupingBy(
                        Pessoa::getCargo,
                        Collectors.flatMapping(
                            pessoa -> pessoa.getHobbies().stream(), Collectors.toCollection(TreeSet::new))));
    }

}
