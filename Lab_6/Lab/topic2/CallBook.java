
public class CallBook {
    public static void main(String[] args) {
        Book book1 = new Book(1,"papaya","aonglee",500,true);
        System.out.println("ID is "+ book1.getId());
        System.out.println("Title is "+ book1.getTitle());
        System.out.println("Writer is "+ book1.getWriter());
        System.out.println("Price is "+ book1.getPrice());
        System.out.println("Available is "+ book1.inAvailable());
        
        Book book2 = new Book();
        book2.setId(2);
        book2.setTitle("wanipop panejon");
        book2.setWriter("afdol");
        book2.setPrice(1000);
        book2.setAvailable(true);
        System.out.println("ID is "+ book2.getId());
        System.out.println("Title is "+ book2.getTitle());
        System.out.println("Writer is "+ book2.getWriter());
        System.out.println("Price is "+ book2.getPrice());
        System.out.println("Available is "+ book2.inAvailable());
    }
}
