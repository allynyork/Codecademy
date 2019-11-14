public class Newsfeedlearning {
  
  // constructor
  public Newsfeedlearning(){
    
  }
  
  // First, make a method called getTopics(), which:
  // is public
  // returns a String array
  // does not take any parameters
  // For now, leave the method empty
  public String[] getTopics(){
    // Inside the getTopics() method, create a String array called topics and set it equal to an array containing these elements, in order: 
    // Opinion Tech Science Health
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    // Then, return topics from the method
    return topics;
  }

  // main method
  public static void main(String[] args){
    Newsfeedlearning sampleFeed = new Newsfeedlearning();
    /*
    String[] topics = sampleFeed.getTopics();
    System.out.println(topics);
    */
  }
}