package bbw.sabina;
import bbw.sabina.models.Post;
import bbw.sabina.models.User;
import bbw.sabina.services.PostService;

public class Main {
    public static void main(String[] args) {
        //postService Objekt
        PostService postService = new PostService();
        Post post1 = new Post("OOP", "Ich kann es immer noch nicht", user1 );
        Post post2 = new Post("Clouding", "Das ist auch etwas wo ich nicht kann", user1);
        Post post3 = new Post("Java", "Why you, why you", user1);

        //User Object holen(lesen)
        System.out.println("Title: " + post1.getTitle());
        System.out.println("Content: " + post1.getContent());
        System.out.println("Author: " + post1.getUser().getUsername());
        System.out.println("Admin-Status: " + post1.getUser().isAdmin());

    }
}
