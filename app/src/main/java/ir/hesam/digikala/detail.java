package ir.hesam.digikala;

public class detail {
    String name_detail;
    int photo1_detail;
    int photo2_detail;
    int photo3_detail;
    String price_detail;
    String receiver_name;
    String date_order;
    String receiver_number;
    String receiver_address;


    @Override
    public String toString() {
        return "detail{" +
                "name_detail='" + name_detail + '\'' +
                ", photo1_detail=" + photo1_detail +
                ", photo2_detail=" + photo2_detail +
                ", photo3_detail=" + photo3_detail +
                ", price_detail='" + price_detail + '\'' +
                ", receiver_name='" + receiver_name + '\'' +
                ", date_order='" + date_order + '\'' +
                ", receiver_number='" + receiver_number + '\'' +
                ", receiver_address='" + receiver_address + '\'' +
                '}';
    }

    public detail(String name_detail , int photo1_detail , int photo2_detail , int photo3_detail , String price_detail
                  , String receiver_name, String date_order, String receiver_number, String receiver_address){
        this.name_detail = name_detail;
        this.photo1_detail = photo1_detail;
        this.photo2_detail = photo2_detail;
        this.photo3_detail = photo3_detail;
        this.price_detail = price_detail;
        this.receiver_name = receiver_name;
        this.date_order = date_order;
        this.receiver_number = receiver_number;
        this.receiver_address = receiver_address;
    }

}
