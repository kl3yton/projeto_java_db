package src.model;

// A classe Colaborador herda os atributos e métodos da classe Entidade
public class Colaborador extends Entidade {

    // Construtor que inicializa o colaborador com id e nome
    public Colaborador(int id, String nome) {
        super(id, nome); // Chama o construtor da classe Entidade
    }

    // Sobrescreve o toString para exibir as informações do colaborador
    @Override
    public String toString() {
        return "Colaborador [ID=" + id + ", Nome=" + nome + "]";
    }
}
