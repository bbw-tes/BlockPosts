package bbw.sabina;
import bbw.sabina.models.Post;
import bbw.sabina.models.User;

public class Main {
    public static void main(String[] args) {
        //Ein User Objet und ein Post Objekt erstellen
        User user1 = new User("John", "123", false );
        Post post1 = new Post("OOP", "Ich kann es immer noch nicht", user1 );

        //User Object holen(lesen)
        System.out.println("Title: " + post1.getTitle());
        System.out.println("Content: " + post1.getContent());
        System.out.println("Author: " + post1.getUser().getUsername());
        System.out.println("Admin-Status: " + post1.getUser().isAdmin());

    }
}
