public class Main {
    void main() {
        Grafo grafoRecomendacoes = new Grafo();

        // instaciando livros prontos
        Livro l1 = new Livro("Duna", "Frank Herbert", 1965);
        Livro l2 = new Livro("O Problema dos Três Corpos", "Cixin Liu", 2008);
        Livro l3 = new Livro("Fundação", "Isaac Asimov", 1951);
        Livro l4 = new Livro("A Guerra dos Tronos", "George R. R. Martin", 1996);
        Livro l5 = new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954);
        Livro l6 = new Livro("1984 ", "George Orwell", 1949);
        Livro l7 = new Livro("Frankenstein", "Mary Shelley", 1818);
        Livro l8 = new Livro("Crime e Castigo", "Fyodor Dostoevsky", 1866);
        Livro l9 = new Livro("Entendendo Algoritmos", "Aditya Bhargava", 2016);
        Livro l10 = new Livro("Código Limpo", "Robert C. Martin", 2008);

        // conexão (SCI-FI)
        grafoRecomendacoes.adicionarRecomendacao(l1, l2);
        grafoRecomendacoes.adicionarRecomendacao(l1,l3);
        
        grafoRecomendacoes.adicionarRecomendacao(l2, l1);
        grafoRecomendacoes.adicionarRecomendacao(l2, l6);

        grafoRecomendacoes.adicionarRecomendacao(l3, l1);
        grafoRecomendacoes.adicionarRecomendacao(l3, l2);

        // conexão (FANTASIA)
        grafoRecomendacoes.adicionarRecomendacao(l4, l5);
        grafoRecomendacoes.adicionarRecomendacao(l4, l1);

        grafoRecomendacoes.adicionarRecomendacao(l5, l4);
        grafoRecomendacoes.adicionarRecomendacao(l5, l3);

        // conexão (CLÁSSICOS)
        grafoRecomendacoes.adicionarRecomendacao(l6, l7);
        grafoRecomendacoes.adicionarRecomendacao(l6, l8);

        grafoRecomendacoes.adicionarRecomendacao(l7, l6);
        grafoRecomendacoes.adicionarRecomendacao(l7, l8);

        grafoRecomendacoes.adicionarRecomendacao(l8, l6);
        grafoRecomendacoes.adicionarRecomendacao(l8, l7);

        // concexões (TECNOLOGIA)
        grafoRecomendacoes.adicionarRecomendacao(l9, l10);
        grafoRecomendacoes.adicionarRecomendacao(l9, l1);

        grafoRecomendacoes.adicionarRecomendacao(l10, l9);
        grafoRecomendacoes.adicionarRecomendacao(l10, l6);

        // busaca por recomendações
        System.out.println("--- SISTEMA DE RECOMENDAÇÃO DE LIVROS ---");

        // recomendações para o livro Código Limpo
        System.out.println("\nUsuário terminou de ler: " + l10.getTitulo());
        System.out.println("Baseado nisso recomendamos os seguintes livros: ");
        for (Livro rec : grafoRecomendacoes.obterRecomedacoes(l10)) {
            System.out.println("- " + rec.getTitulo());
            System.out.println(rec.getAutor() + ", " + rec.getAno() + "\n");
        }

        // recomendações para o livro Duna
        System.out.println("\nUsuário terminou de ler: " + l1.getTitulo());
        System.out.println("Baseado nisso recomendamos os seguintes livros: ");
        for (Livro rec : grafoRecomendacoes.obterRecomedacoes(l1)) {
            System.out.println("- " + rec.getTitulo());
            System.out.println(rec.getAutor() + ", " + rec.getAno() + "\n"); 
        }

        // recomendações para o livro Entendendo Algoritmos
        System.out.println("\nUsuário terminou de ler: " + l9.getTitulo());
        System.out.println("Baseado nisso recomendamos os seguintes livros: ");
        for (Livro rec : grafoRecomendacoes.obterRecomedacoes(l9)) {
            System.out.println("- " + rec.getTitulo());
            System.out.println(rec.getAutor() + ", " + rec.getAno() + "\n"); 
        }

    }
}