package bbw.sabina;
import bbw.sabina.models.Post;
import bbw.sabina.models.User;
import bbw.sabina.services.PostService;

public class Main {
    public static void main(String[] args) {
        //1. Create postService Object
        PostService postService = new PostService();

        // 2. create a user
        User user1 = new User("John", "1234", true);

        // 3. creating post via postService
        Post post1 = postService.createPost("OOP", "ich kann es immer noch nicht", user1);

        //fetch User Object
        System.out.println("Title: " + post1.getTitle());
        System.out.println("Content: " + post1.getContent());
        System.out.println("Author: " + post1.getUser().getUsername());
        System.out.println("Admin-Status: " + post1.getUser().isAdmin());
    }
}
