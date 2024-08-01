public class Login {
    // Atributos privados
    private String nome;
    private String senha;
    
    // Atributo público
    public String nomePagina;
    
    // Construtor vazio
    public Login() {
        this.nome = "";
        this.senha = "";
        this.nomePagina = "";
    }
    
    // Construtor com atributos
    public Login(String nome, String senha, String nomePagina) {
        this.nome = nome;
        this.senha = senha;
        this.nomePagina = nomePagina;
        // Chama o método validaLogin no momento da criação
        if (validaLogin()) {
            System.out.println("Sucesso!");
        } else {
            System.out.println("Falha de Login, verifique sua senha!");
        }
    }
    
    // Métodos getter e setter para nome
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // Métodos getter e setter para senha
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    // Método privado para validação de login
    private boolean validaLogin() {
        return senha.length() == 4;
    }
}
