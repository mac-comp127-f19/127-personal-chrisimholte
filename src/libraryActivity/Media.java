package libraryActivity;

/**
 * @author Chris Imholte
 */
public interface Media {

    public String getTitle();
    public boolean checkOut();
    public boolean checkIn();
    public String preview();


}
