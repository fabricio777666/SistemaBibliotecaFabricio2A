import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Administrador> administradores;
    // Construtor
    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
        administradores = new ArrayList<>();
    }
    // Método para cadastrar um livro
    public boolean cadastrarLivro(Livro livro) {
        for (Livro l : livros) {
            if (l.getIsbn().equals(livro.getIsbn())) return false;
        }
        livros.add(livro);
        return true;
    }
    // Método para cadastrar um usuário
    public boolean cadastrarUsuario(Usuario usuario) {
        for (Usuario u : usuarios) {
            if (u.getId() == usuario.getId()) return false; 
        }
        usuarios.add(usuario);
        return true;
    }
    // Método para cadastrar um administrador
    public boolean cadastrarAdministrador(Administrador adm) {
        for (Administrador a : administradores) {
            if (a.getId() == adm.getId()) return false; 
        }
        administradores.add(adm);
        return true;
    }
    // Método para emprestar um livro
    public boolean emprestarLivro(String isbn, int usuarioId) {
        Livro livro = null;
        for (Livro l : livros) {
            if (l.getIsbn().equals(isbn)) {
                livro = l;
                break;
            }
        }
        Usuario usuario = null;
        for (Usuario u : usuarios) {
            if (u.getId() == usuarioId) {
                usuario = u;
                break;
            }
        }
        if (livro == null || usuario == null || !livro.isDisponivel()) return false;
        livro.setDisponivel(false);
        return true;
    }
}
