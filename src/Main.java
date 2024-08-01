public class Main {
    public static void main(String[] args) {
        // Criando logins com diferentes senhas
        Login login1 = new Login("usuario1", "1234", "instagram");  // Senha correta, 4 dígitos
        Login login2 = new Login("usuario2", "1237", "google");      // Senha correta, 4 digitos
        Login login3 = new Login("usuario3", "12345", "twitter");   // Senha incorreta, mais de 4 dígitos
    }
}
