/**
 * Created by Manav on 2016-12-30.
 */

public class SongSections {

    String name;

    /**
     *
     * @param n - Each Song section will be made with its name pre set as its main feature
     */
    public SongSections(String n){
        name = n;
    }

    public void setName(String n){
        name=n;
    }

    public String getName (){
        return name;
    }

}
