package OOP;


public class Main {

    String bookName = "";
    int ISBM = 0;
    int numberOFpages = 0;
    boolean isAvailable = false;
    boolean onSale = false;
    boolean isDigital = false;
    boolean isKidFriendly = false;

    // authors firs and last name to search all books by the author 
    String authorFirstName = "";
    String authorLastName = "";
    String genre = "";

    public Main(String bookname, int isbm, int pagenumber, boolean available, boolean onsale, boolean digital,
            boolean kidfriendly, String fname, String lname,
            String genre) {
        this.bookName = bookname;//
        this.ISBM = isbm;//
        this.numberOFpages = pagenumber;//
        this.isAvailable = available;//
        this.onSale = onsale;//
        this.isDigital = digital;///
        this.isKidFriendly = kidfriendly;//
        this.authorFirstName = fname;//
        this.authorLastName = lname;//
        this.genre = genre;

    };

    public Main(String bookname) {
        this.bookName = bookname;
    }

    //method 1 //
    public void setAuthorFirstName(String newAuthorFirstName) {
        this.authorFirstName = newAuthorFirstName;
    }

    //method 2 //
    public void numberofpages(int numberofpages) {
        numberOFpages = numberofpages;
    }

    //method 3//
    public void setISBM(int isbmnumber) {
        ISBM = isbmnumber;
    }

    //method 4 : method to see if book is available //
    public boolean isAvailable() {
        return isAvailable;
    }

    //method 5//
    public boolean isOnSale() {
        return onSale;
    }

    
    //method 6//
    public boolean isDigitial() {
        return isDigital;
    }

    //method 7//
     public boolean kidfriendly() {
        return isKidFriendly;
    }
    
   

    
    //method 8//
    public void setAuthorLastName(String newAuthorFirstName) {
        authorLastName = newAuthorFirstName;
    }
    
    
    //method 9
    public void setgenre(String genre) {
    this.genre = genre;
    }
    
     //method 10//
    public void setBookName(String book) {
    bookName = book;
    }   
    
  

    public static void main(String[] args) {

        Main bookOne = new Main("The Great book");

        bookOne.setAuthorFirstName("Luis Cuevas");
        bookOne.setISBM(12311992);
        System.out.println(bookOne.authorFirstName);
        System.out.println(bookOne.ISBM);
        System.out.println(bookOne.isAvailable());

    };

}