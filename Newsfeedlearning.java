public class Newsfeedlearning {
  
  
  public Newsfeedlearning(){
    
  }
  
  public String[] getTopics(){
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    return topics;
  }

  public static void main(String[] args){
    Newsfeedlearning sampleFeed = new Newsfeedlearning();
    /*
    String[] topics = sampleFeed.getTopics();
    System.out.println(topics);
    */
  }
}