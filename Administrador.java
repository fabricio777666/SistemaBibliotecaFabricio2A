
public class Administrador {
    private int id;
    private String nome;
    private String email;
    private String cargo;
    // Construtor
    public Administrador(int id, String nome, String email, String cargo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String exibirInformacoes() {
    String info = "Id: " + getId() + ", Usuario: " + getNome() + ", Email: " + getEmail() + ", Cargo: " + cargo;
        return info;
    }

}
