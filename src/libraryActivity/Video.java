package libraryActivity;

/**
 * @author Chris Imholte
 */
public class Video implements Media{

    private String title;
    private String director;
    private int numOfCopies;
    private int ownedCopies;



    public Video(String title, String director, int numOfCopies){
        this.director = director;
        this.title = title;
        this.numOfCopies = numOfCopies;
        ownedCopies = numOfCopies;
    }

    @Override
    public boolean checkOut() {
        if(numOfCopies>0){
            numOfCopies--;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean checkIn() {
        if(numOfCopies<ownedCopies){
            numOfCopies++;
            return true;
        }
        else{
            return false;
        }
    }


    public void information() {
        System.out.println(title+" "+director+" "+numOfCopies);

    }


    @Override
    public String toString(){

        return "Title: "+title+" \nDirector: "+director+" \nCopies remaining: "+numOfCopies;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
