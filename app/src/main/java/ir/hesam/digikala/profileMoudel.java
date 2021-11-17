package ir.hesam.digikala;

public class profileMoudel {

    String profile_obj_name;
    Integer profile_obj_photo;

    @Override
    public String toString() {
        return "profileMoudel{" +
                "profile_obj_name='" + profile_obj_name + '\'' +
                ", profile_obj_photo=" + profile_obj_photo +
                '}';
    }

    public String getProfile_obj_name() {
        return profile_obj_name;
    }

    public Integer getProfile_obj_photo() {
        return profile_obj_photo;
    }


    public profileMoudel(String profile_obj_name , int profile_obj_photo){
        this.profile_obj_name = profile_obj_name;
        this.profile_obj_photo = profile_obj_photo;
    }


}
