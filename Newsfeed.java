public class Newsfeed {
  
  // arrays
  String[] trendingArticles;
  int[] views;
  double[] ratings;
  
  // constructor
  // takes three arrays
  public Newsfeed(String[] initialArticles, int[] initialViews, double[] initialRatings){
    trendingArticles = initialArticles;
    views = initialViews;
    ratings = initialRatings;
  }
  
  // getTopArticle method
  public String getTopArticle(){
    return trendingArticles[0];
  }
  
  // viewArticle method
  public void viewArticle(int articleNumber){
    views[articleNumber] = views[articleNumber] + 1;
    System.out.println("The article '" + trendingArticles[articleNumber] + "' has now been viewed " + views[articleNumber] + " times!");
  }
  
  // changeRating method
  public void changeRating(int articleNumber, double newRating){
    if (newRating > 5 || newRating < 0) {
      System.out.println("The rating must be between 0 and 5 stars!");
    } else {
      ratings[articleNumber] = newRating;
      System.out.println("The article '" + trendingArticles[articleNumber] + "' is now rated " + ratings[articleNumber] + " stars!");
    }
  }
  
  // main method
  public static void main(String[] args){
    // populate String array of Articles
    String[] robotArticles = {"Oil News", "Innovative Motors", "Humans: Exterminate Or Not?", "Organic Eye Implants", "Path Finding in an Unknown World"};
    // populate int array of views
    int[] robotViewers = {87, 32, 13, 11, 7};
    // populate double array of ratings
    double[] robotRatings = {2.5, 3.2, 5.0, 1.7, 4.3};
    // uses constructor
    Newsfeed robotTimes = new Newsfeed(robotArticles, robotViewers, robotRatings);
    
    // calls the constructor
    robotTimes.viewArticle(2);
    // calls the constructor again
    robotTimes.viewArticle(2);
    // print calls the getTopArticle method
    System.out.println("The top article is " + robotTimes.getTopArticle());
    // calls the changeRating method
    robotTimes.changeRating(3, 5);
  }
}
