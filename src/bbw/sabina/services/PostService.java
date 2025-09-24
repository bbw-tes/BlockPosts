package bbw.sabina.services;
import bbw.sabina.models.*;
import java.util.ArrayList;
import java.util.List;

public class PostService {
    // Step 1: List to store all posts
    private List<Post> posts = new ArrayList<>();

    // Step 2: Create Methods
    // Method: create a post
    public Post createPost(String title, String content, User user) {
        Post post = new Post(title, content, user);
        // ADd new post to list
        posts.add(post);
        return post;
    }
    // Methode: fetch or load all List data
    public List<Post> getAllPosts(){
        return posts;
    }

    public void deletePost(int id) {
        for (Post post : posts) {
        }
    }


}
