package ir.hesam.digikala;

public class MainMoudel {
    Integer kalaPhot;
    String kalaName;
    String price;
    String made;
    Integer timer;




    public MainMoudel (Integer kalaPhot , String kalaName , String price , String made , Integer timer) {
        this.kalaPhot = kalaPhot;
        this.kalaName = kalaName;
        this.price = price;
        this.made = made;
        this.timer = timer;
    }
    public String getPrice() {
        return price;
    }

    public String getMade() {
        return made;
    }

    public Integer getLangLogo() {
        return kalaPhot;
    }

    public String getLangName() {
        return kalaName;
    }

    public Integer getTimer() { return timer; }

    @Override
    public String toString() {
        return "MainMoudel{" +
                "kalaPhot=" + kalaPhot +
                ", kalaName='" + kalaName + '\'' +
                ", price='" + price + '\'' +
                ", made='" + made + '\'' +
                ", timer=" + timer +
                '}';
    }


    public  long time_remain;
}

