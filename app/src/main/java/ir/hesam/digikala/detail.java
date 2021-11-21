package ir.hesam.digikala;

public class detail {
    String name_detail;
    int photo1_detail;
    int photo2_detail;
    int photo3_detail;
    String price_detail;

    @Override
    public String toString() {
        return "detail{" +
                "name_detail='" + name_detail + '\'' +
                ", photo1_detail=" + photo1_detail +
                ", photo2_detail=" + photo2_detail +
                ", photo3_detail=" + photo3_detail +
                ", price_detail=" + price_detail +
                '}';
    }



    public detail(String name_detail , int photo1_detail , int photo2_detail , int photo3_detail , String price_detail){
        this.name_detail = name_detail;
        this.photo1_detail = photo1_detail;
        this.photo2_detail = photo2_detail;
        this.photo3_detail = photo3_detail;
        this.price_detail = price_detail;
    }

}
