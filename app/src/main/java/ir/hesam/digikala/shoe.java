package ir.hesam.digikala;

public class shoe {

    int photo;
    int timer;


    long time_remain ;
    public int getTimer() {
        return timer;
    }

    public shoe(int photo){
       this.photo = photo;
    }


    public int getPhoto() {
        return photo;
    }


    @Override
    public String toString() {
        return "shoe{" +
                "photo=" + photo +
                ", timer=" + timer +
                '}';
    }

    public void setTime_remain(long time_remain) {
        this.time_remain = time_remain;
    }

    public long getTime_remain() {
        return time_remain;
    }
}
