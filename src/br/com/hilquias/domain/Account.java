package br.com.hilquias.domain;

public class Account {
    private final String username;
    private final int password;

    public Account(String username, int password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "---PERFIL---\n" +
                "Nome de usuário = " + username +
                "\nSua senha = " + password +
                "\n -----------------------";
    }

}
