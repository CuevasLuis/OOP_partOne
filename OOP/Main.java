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


    public Main(String bookname, int isbm, int pagenumber, boolean available, boolean onsale, boolean digital, boolean kidfriendly, String fname, String lname,
    String genre){
    this.bookName = bookname;
    this.ISBM =  isbm;
    this.numberOFpages = pagenumber;
    this.isAvailable = available;
    this.onSale = onsale;
    this.isDigital = digital;
    this.isKidFriendly = kidfriendly;
    this.authorFirstName = fname;
    this.authorLastName = lname;
    this.genre = genre;

};
        
public Main(String bookname) {
    this.bookName = bookname;
}

//method 1 
public void setAuthorFirstName(String newAuthorFirstName) {
    this.bookName = newAuthorFirstName;
}

//method 2 
public String getAuthorFirstName() {
    return authorFirstName;
}





    

    public static void main(String[] args) {

        

        Main bookOne = new Main("The Great book");


    
        
    };









}