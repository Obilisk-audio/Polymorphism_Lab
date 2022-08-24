package MusicProduct;
import Interfaces.IProduct;

public class Vinyl extends MusicProduct {
    private Boolean album;
    private Boolean multiRecord;

    public Vinyl(String name, String genre, String condition, double cost, double price, boolean album, boolean multiRecord){
        super(name, genre, condition, cost, price);
        this.album = false;
        this.multiRecord = false;
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


    public void addMultiRecord(){
            setMultiRecord(true);
        }
    public void setMultiRecord(boolean multiRecord) {
        this.multiRecord = multiRecord;
    }
    public boolean isMultiRecord() {
            return multiRecord;
        }

}

