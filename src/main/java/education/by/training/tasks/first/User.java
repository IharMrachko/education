package education.by.training.tasks.first;

public class User {
    int uniqueIidentificator;
    String name;
    int password;
    String roles;
    public User(int uniqueIidentificator, String name, int password, String roles) {
        this.uniqueIidentificator = uniqueIidentificator;
        this.name = name;
        this.password = password;
        this.roles = roles;
    }
  }
