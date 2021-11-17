package ir.hesam.digikala;

public class MainElanat {

    String off_txt;
    int off_phot;

    public MainElanat(int op ,String ot ){
        this.off_phot = op;
        this.off_txt = ot;
    }

    public String getOff_txt() {
        return off_txt;
    }

    public int getOff_phot() {
        return off_phot;
    }

    @Override
    public String toString() {
        return "MainElanat{" +
                "off_txt='" + off_txt + '\'' +
                ", off_phot=" + off_phot +
                '}';
    }

}
