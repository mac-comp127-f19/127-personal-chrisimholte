package libraryActivity;

/**
 * @author Chris Imholte
 */
public class Podcast implements Media{

    private String title;
    private String author;
    private double runTime;


    public Podcast(String title, String author, double runTime){
        this.title = title;
        this.author = author;
        this.runTime = runTime;

    }
    @Override
    public String getTitle(){
        return title;
    }
    @Override
    public boolean checkOut(){
        System.out.println("Website: www.macalester.edu");
        return true;
    }
    @Override
    public boolean checkIn(){
        System.out.println("No need to check a podcast back in! Enjoy!");
        return true;
    }
    @Override
    public String preview(){
        return author + ", Run Time: " + runTime;
    }




}
