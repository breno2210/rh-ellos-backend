package sistema_ellos.dto;

public class FuncionarioDTO {

    private Long id;
    private String nome;
    private String cargo;

    public FuncionarioDTO() {}

    public FuncionarioDTO(Long id, String nome, String cargo) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
