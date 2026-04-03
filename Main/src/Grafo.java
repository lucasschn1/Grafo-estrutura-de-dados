import java.util.*;

public class Grafo {
    private Map<Livro, Set<Livro>> mapaDeRecomendacoes;

    public Grafo() {
        this.mapaDeRecomendacoes = new HashMap<>();
    }

    // criando nó no grafo com uma lista de conexões
    public void adicionarLivro(Livro livro) {
        if (!mapaDeRecomendacoes.containsKey(livro)) {
            mapaDeRecomendacoes.put(livro, new HashSet<>());
        }
    }

    // criando arestas/conexao
    public void adicionarRecomendacao(Livro origem, Livro destino) {
        adicionarLivro(origem);
        adicionarLivro(destino);

        mapaDeRecomendacoes.get(origem).add(destino);
    }

    public Set<Livro> obterRecomedacoes(Livro livro) {
        return mapaDeRecomendacoes.getOrDefault(livro, new HashSet<>());
    }
}
