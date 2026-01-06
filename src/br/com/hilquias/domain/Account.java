package br.com.hilquias.domain;

public class Account {
    private final String USERNAME;
    private final int PASSWORD;

    public Account(String USERNAME, int PASSWORD) {
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
    }

    @Override
    public String toString() {
        return "---PERFIL---\n" +
                "Nome de usuário = " + USERNAME +
                "\nSua senha = " + PASSWORD +
                "\n -----------------------";
    }

}
