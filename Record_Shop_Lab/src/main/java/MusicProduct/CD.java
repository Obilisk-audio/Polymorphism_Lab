package MusicProduct;
import Interfaces.IProduct;

public class CD extends MusicProduct {
    private Boolean album;
    private Boolean multiCD;

    public CD(String name, String genre, String condition, double cost, double price, boolean album, boolean multiCD){
        super(name, genre, condition, cost, price);
        this.album = false;
        this.multiCD = false;
    }

    public void addAlbum(){
        setAlbum(true);
    }
    public void setAlbum(boolean album) {
        this.album = album;
    }
    public boolean isAlbum() {
        return album;
    }


    public void addMultiCD(){
        setMultiCD(true);
    }
    public void setMultiCD(boolean multiCD) {
        this.multiCD = multiCD;
    }
    public boolean isMultiCD() {
        return multiCD;
    }

}
