public class SistemaBiblioteca {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        // new aloca a memória (em heap, se eu não me engano) e chama o construtor
        // Livro() é a chamada do construtor da classe Livro
        // livro1 é um objeto Livro.
        // livro1 armazena o endereço para o objeto Livro
        Livro livro2 = new Livro("Senhor das Moscas", "Willian Golding", "123");

        livro2.exibirInformacoes();

        livro2.emprestarLivro();
        livro2.emprestarLivro();

        livro2.devolverLivro();
        livro2.devolverLivro();
    }
}

class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    // Construtor
    Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true;
    }

    // Se eu fizer mais de um construtor, eu posso instanciar um objeto de formas diferentes
    // Talvez isso seja ruim, ja que não faz sentido existir um livro sem autor e titulo
    Livro() {
        this.disponivel = true;
    }

    // public: é assim pois o objetivo é permitir o acesso fora da classe
    // String: é o tipo do retorno
    public String getTitulo() {return titulo;}

    public String getAutor() {return autor;}

    public String getIsbn() {return isbn;}

    //Quando se trata de boolean, o get é substituido por is, fica tipo uma pergunta.
    public boolean isDisponivel() {return disponivel;}

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public void setAutor(String autor) {this.autor = autor;}

    public void setIsbn(String isbn) {this.isbn = isbn;}

    public void emprestarLivro() {
        if (this.disponivel == true) {
            this.disponivel = false;
            System.out.println("O livro " + this.titulo + " foi emprestado com sucesso!");
        } else {
            System.out.println("O livro " + this.titulo + " já está emprestado.");
        }
    }

    public void devolverLivro() {
        if (this.disponivel == false) {
            this.disponivel = true;
            System.out.println("O livro " + this.titulo + " foi devolvido com sucesso!");
        } else {
            System.out.println("O livro " + this.titulo + " não está emprestado.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " +this.isbn);
        System.out.println("Disponivel: " + this.disponivel);
    }
}
