import java.util.*;

class Book{
     int id;
     String title, author;
     int quantity;
     double price;
     int numsold;

    public Book( int theId, String theTitle, String theAuthor, int theQuantity, double thePrice){
        this.id = theId;
        this.title = theTitle;
        this.author = theAuthor;
        this.quantity = theQuantity;
        this.price = thePrice;
        this.numsold = 0;
    }

    // get the price
    public double getPrice() { return price;}
    // get the number sold
    public int getNumsold() {return numsold;}
    // sell k copies
    public void sell(int k){ numsold += k;}
    // set the price
    public void setPrice(double newPrice){price = newPrice;}

    // put the book on sale
    public void putOnSale( int percent, double minPrice){
        setPrice( computeSalePrice(percent, minPrice));
    }

    // determine popularity
    /** public static Book mostPopular( Book[] booklist){
        int bestNum = bookList[0].numSold;
        int bestIndex = 0;

        for (int j = 1; j<booklist.length; j++){
            if (booklist[j].numsold > bestNum){
                bestNum = booklist[j].numsold;
                bestIndex = j;
            }
        }
        return booklist[bestIndex];
    } **/

    /** private method **/
    // compute the sale price
    private double computeSalePrice(int percent, double minPrice){
        double newPrice = price - percent*.01;
        if (newPrice < minPrice) {
            newPrice = minPrice;
        }
        return newPrice;
    }
}


public class Main {

    public static void main(String[] args) {

        List<Book> bookList = new LinkedList<>();
        Book b1 = new Book(123456,"The Cat in the Hat", "Random", 10, 20.00);
        Book b2 = new Book(6546, "Halo", "Bon Jovie", 35, 10.5);
        Book b3 = new Book(569879, "Forget", "Travis", 5, 15.25);

        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);

        for(Book b:bookList){
            System.out.println(b.id+" "+b.title+" "+b.author+" "+b.quantity+" "+b.price);
        }
    }
}
