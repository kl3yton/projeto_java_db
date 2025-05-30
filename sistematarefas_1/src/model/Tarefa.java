/**
 * Classe que representa uma Tarefa no sistema.
 * Contém informações como ID, descrição, status, categoria e colaborador.
 * O status é iniciado como "Pendente" por padrão.
 * Possui métodos getters e setters para manipular seus atributos,
 * além de um método toString para exibir as informações da tarefa
 * de forma legível no console.
 */

package src.model;

public class Tarefa {
    private int id;
    private String descricao;
    private String status;
    private Categoria categoria;
    private Colaborador colaborador;

    public Tarefa(int id, String descricao, Categoria categoria) {
        this.id = id;
        this.descricao = descricao;
        this.categoria = categoria;
        this.status = "Pendente";
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    @Override
    public String toString() {
        return "Tarefa [ID=" + id +
                ", Descrição=" + descricao +
                ", Status=" + status +
                ", Categoria=" + (categoria != null ? categoria.getNome() : "Sem Categoria") +
                ", Colaborador=" + (colaborador != null ? colaborador.getNome() : "Sem Colaborador") + "]";
    }
}
