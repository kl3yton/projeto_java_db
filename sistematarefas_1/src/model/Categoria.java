package src.model;

// Classe que representa uma categoria
public class Categoria {
    private int id;
    private String nome;

    // Construtor
    public Categoria(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Getters e setter
    public int getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    // Representação em texto
    @Override
    public String toString() {
        return "Categoria [ID=" + id + ", Nome=" + nome + "]";
    }
}
