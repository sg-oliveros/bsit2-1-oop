import java.util.*;

public class Main {
    public static void main(String[] args) {
        PostManager postManager = new PostManager();

        System.out.println("== Social Media Post Manager ==");
        int engagementScore = postManager.calculateEngagement(150, 75, 25);
        String category = postManager.getCategoryRating(engagementScore);
        postManager.displayPostStats("Java Programming Tips", engagementScore, category);
        System.out.println();

        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        List<String> uniqueHashtags = postManager.manageHashtags(hashtags);
        System.out.println("Unique Hashtags: " + uniqueHashtags);

        HashMap<String, Integer> samplePosts = new HashMap<>();
        samplePosts.put("Advanced Java Tutorial", 800);
        samplePosts.put("Spring Boot Guide", 1200);

        ArrayList<String> postTitles = new ArrayList<>(samplePosts.keySet());
        LinkedList<String> trendingPosts = postManager.findTrendingPosts(postTitles, samplePosts);
        Collections.sort(trendingPosts);
        System.out.println("Trending Posts: " + trendingPosts);

        HashSet<String> authors = postManager.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");
        System.out.println("Unique Authors: " + authors);
    }
}
