package Abstrakcia4;

public abstract class User {
    public abstract String getUserData();

    int id;
    String login;
    String password;

    public User() {
        int id = 0;
        String login = "no login";
        String password = "no password";
    }

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

