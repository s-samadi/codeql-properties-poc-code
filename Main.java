public class Main {
  static void getUserCredientials(String username, String password) {
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void main(String[] args) {
    getUserCredientials("username", "password");
    getUserCredientials("john", "smith");
    getUserCredientials("harry", "potter");
  }
}
