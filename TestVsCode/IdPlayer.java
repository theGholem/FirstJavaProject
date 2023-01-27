
/**
 * 
 * @author Konan
 * @since  27/01/2023
 * 
 * @apiNote this class create on player who have an name and his old
 */
public class IdPlayer{

    // our attribut

    private String name;
    private int old;

    /**
     * @apiNote IdPlayer class constructor
     * 
     * @param n
     * @param o
     */
    public IdPlayer(String n,int o){
        this.name=n;
        this.old=o;
    }

    /**
     * 
     * @return name of player
     */
    public String getName(){
        return this.name;
    }

    /**
     * 
     * @return old of person
     */
    public int getOld(){
        return this.old;
    }

    /**
     * show player's caracteristic
     */
    public void display(){
        System.out.println("\nNAME : "+this.getName()+"\nOld : "+this.getOld()+" ans");
    }
}