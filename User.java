import java.util.ArrayList;
import java.util.Date;

 public class User{
    private ArrayList<Photo> photo ;
    private Address address;
    private int size;
    private Date date;

  public User(ArrayList<Photo> photo, Address address, int size, Date date){
    this.photo = photo;
    this.address = address;
    this.size = size;
    this.date = date;
   }
  }
 