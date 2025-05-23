
import java.util.Scanner;
public class SistemaBibliotecaFabricio2A {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Sistema de Biblioteca ===");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Cadastrar usuario");
            System.out.println("3 - Cadastrar administrador");
            System.out.println("4 - Emprestar livro");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opcao: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer
            if (opcao == 5) {
                System.out.println("Saindo...");
                break;
            }
            switch (opcao) {
                case 1 -> {
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Titulo: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();
                    Livro livro = new Livro(isbn, titulo, autor, ano);
                    if (biblioteca.cadastrarLivro(livro)) {
                        System.out.println("Livro cadastrado com sucesso!");
                    } else {
                        System.out.println("Erro: Livro com esse ISBN ja existe.");
                    }
                }
                case 2 -> {
                    System.out.print("ID do usuario: ");
                    int userId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    Usuario usuario = new Usuario(userId, nome, email);
                    if (biblioteca.cadastrarUsuario(usuario)) {
                        System.out.println("Usuario cadastrado com sucesso!");
                    } else {
                        System.out.println("Erro: Usuário com esse ID já existe.");
                    }
                }
                case 3 -> {
                    System.out.print("ID do administrador: ");
                    int admId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String admNome = scanner.nextLine();
                    System.out.print("Email: ");
                    String admEmail = scanner.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();
                    Administrador adm = new Administrador(admId, admNome, admEmail, cargo);
                    if (biblioteca.cadastrarAdministrador(adm)) {
                        System.out.println("Administrador cadastrado com sucesso!");
                    } else {
                        System.out.println("Erro: Administrador com esse ID já existe.");
                    }
                }
                case 4 -> {
                    System.out.print("ISBN do livro para emprestimo: ");
                    String isbnEmprestimo = scanner.nextLine();
                    System.out.print("ID do usuario: ");
                    int usuarioIdEmprestimo = scanner.nextInt();
                    scanner.nextLine();
                    if (biblioteca.emprestarLivro(isbnEmprestimo, usuarioIdEmprestimo)) {
                        System.out.println("Livro emprestado com sucesso!");
                    } else {
                        System.out.println("Erro: livro nao disponivel ou usuario invalido.");
                    }
                }
                default ->
                    System.out.println("Opcao invalida!");
            }
        }
        scanner.close();
    }
}
