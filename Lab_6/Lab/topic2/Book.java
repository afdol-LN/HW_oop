
public class Book {
    private int id;
    private String writer;
    private String title;
    private double price;
    private boolean available;
    //default constructor
    public Book(){

    }
    //overloading constructor
    public Book(int id,String title,String writer,double price,boolean avb){
        this.id = id;
        this.title = title;
        this.writer = writer;
        this.price = price;
        this.available = avb;
    }
    //ID
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    //Title
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    //Writer
    public void setWriter(String writer){
        this.writer = writer;
    }
    public String getWriter(){
        return this.writer;
    }
    //Price
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }
    //Available
    public void setAvailable(boolean  available){
        this.available = available;
    }
    public boolean  inAvailable(){
        return this.available;
    }

    
}
