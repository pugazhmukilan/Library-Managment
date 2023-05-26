
import java.util.*;




class Books{
    String bookname;
    int bookid;
    String publisher;
    String genre;
    ArrayList<Integer> id=new ArrayList<Integer>();
    ArrayList<String> bookname1=new ArrayList<String>();
    public Books( String name,int i,String p,String g){
        this.bookname=name;
        this.bookid=i;
        this.publisher=p;
        this.genre=g;

    }
    
    //getter methods

    String get_bookname(){
        return bookname;
    }

    String get_bookpublisher(){
        return publisher;
    }
    int get_bookid(){
      
        return bookid;
    }

    String get_genre(){
        return genre;
    }

    //setter methods
    void set_bookname(String s){
        this.bookname=s;
    }
    void set_publisher(String s){
        this.publisher=s;

    }
    void set_bookid(int i){
        this.bookid=i;
    }
    void set_genre(String s){
        this.genre=s;
    }
}
class library{
    ArrayList <Books> book;

    public library(){
        book=new ArrayList<>();


    }
    public void add_book(Books book){
        this.book.add(book);
        System.out.println("Book successfully entred");
    }
    public void display_book(){
        for (Books i: book){
        System.out.println("Book Name :"+i.get_bookname());
        System.out.println("Book ID :"+i.get_bookid());
        System.out.println("Book Publisher :"+i.get_bookpublisher());
        System.out.println("Book Genere :"+i.get_genre());
        

        }
}
    public void search(String name){
        int length=book.size();
        int count=0;
        for (Books i: book){
            if (i.get_bookname().equals(name)){
                System.out.println("Book Name :"+i.get_bookname());
                System.out.println("Book ID :"+i.get_bookid());
                System.out.println("Book Publisher :"+i.get_bookpublisher());
                System.out.println("Book Genere :"+i.get_genre());
                break;
            }
            else{
                count++;

            }
        if (count== length){
            System.out.println("Book not found");
        }
    }
    

}
    public void delete(int i){
        for (Books k: book){
            if (k.get_bookid()==i){
                book.remove(k);
            }
        }
        System.out.println("Book removed!");
    }
}
public class LibraryManagment 
{

    public static void main(String[] args) {
        LibraryManagment l1=new LibraryManagment();
        
        library l= new library();
        

        Scanner scan = new  Scanner(System.in);
        while (true){
        l1.list();
        System.out.println("Enter the choise:");
        int i=scan.nextInt();
        switch(i){
            case 1:
                try{
                System.out.print("Enter the ID  of the book :");
                int id=scan.nextInt();
                System.out.print("Enter the Name of the book :");
                String name= scan.next();
                System.out.print("Enter the Publisher of the book :");
                String publisher = scan.next();
                System.out.print("Enter the Genre of the Book: ");
                String genre=scan.next();

                Books b= new Books(name,id,publisher,genre);
                
                l.add_book(b);
                System.out.println("Book Entry Successfull");
                }
                catch(Exception e){
                    System.out.println(e);
                }
                break;
            case 2:
                try{
                    System.out.println("Enter the Book id :");
                    int deleteid=scan.nextInt();
                    l.delete(deleteid);
                }
                catch(Exception e){
                    System.out.println(e);
                }
                
                    break;
            case 3:
                try{
                    System.out.println("Enter the book name :");
                    String n=scan.next();
                    l.search(n);
                }
                catch(Exception e){
                    System.out.println(e);
                }
                    break;
            case 4:
                try{
                    l.display_book();
                }
                catch(Exception e){
                    System.out.println(e);
                }
            case 5:
                System.out.println("Program Exit");
                break;

        }
            }
        


    }
    void list(){

        System.out.println("-------------------------------");
        System.out.println("LIBRARY OPERATIONS");
        System.out.println("-------------------------------");
        System.out.println("Book entry---------1");
        System.out.println("delete book--------2");
        System.out.println("search book--------3");
        System.out.println("view whole library-4");
        System.out.println("exit --------------5");
    }
}