import java.util.*;

public class PostManager {

    public int calculateEngagement(int... interactions) {
        int totalScore = 0;
        if (interactions == null || interactions.length == 0) {
            return 0;
        }
        for (int score : interactions) {
            totalScore += score;
        }
        return totalScore;
    }

    public String getCategoryRating(int engagementScore) {
        if (engagementScore >= 1000) {
            return "Viral";
        } else if (engagementScore >= 500) {
            return "Popular";
        } else if (engagementScore >= 100) {
            return "Good";
        } else if (engagementScore >= 50) {
            return "Low";
        } else {
            return "Poor";
        }
    }

    public void displayPostStats(String postTitle, int engagementScore){
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
    }

    public void displayPostStats(String postTitle, int engagementScore, String category) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category);
    }

    public List<String> manageHashtags(String[] hashtags) {
        List<String> uniqueHashtags = new ArrayList<>();
        for (String tag : hashtags) {
            if (!uniqueHashtags.contains(tag)) {
                uniqueHashtags.add(tag);
            }
        }
        return uniqueHashtags;
    }

    public LinkedList<String> findTrendingPosts(Map<String, Integer> posts) {
        LinkedList<String> trending = new LinkedList<>();
        for (Map.Entry<String, Integer> entry : posts.entrySet()) {
            if (entry.getValue() >= 150) {
                trending.add(entry.getKey());
            }
        }
        return trending;
    }

    public List<String> getUniqueAuthors(String... authors) {
        List<String> uniqueAuthors = new ArrayList<>();
        Set<String> seen = new HashSet<>();
        for (String author : authors) {
            if (!seen.contains(author)) {
                seen.add(author);
                uniqueAuthors.add(author);
            }
        }
        return uniqueAuthors;
    }

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

        Map<String, Integer> samplePosts = new HashMap<>();
        samplePosts.put("Advanced Java Tutorial", 500);
        samplePosts.put("Spring Boot Guide", 150);
        samplePosts.put("Introduction to Git", 80);

        List<String> trendingPosts = postManager.findTrendingPosts(samplePosts);
        List<String> sortedTrendingPosts = new ArrayList<>(trendingPosts);
        Collections.sort(sortedTrendingPosts);
        System.out.println("Trending Posts: " + sortedTrendingPosts);

        List<String> uniqueAuthors = postManager.getUniqueAuthors("Alice", "Bob", "Charlie", "Alice", "Bob");
        System.out.println("Unique Authors: " + uniqueAuthors);
    }
}
