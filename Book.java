/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numPages, boolean required)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numPages;
        refNumber = "";
        courseText = required;
        
    }

    // Add the methods here ...
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public boolean getCourseText()
    {
        return courseText;
    }
    
    public void setRefNumber(String ref)
    {
        refNumber = ref;
    }
    
    public void raiseBorrowed()
    {
        borrowed += 1;
    }
    
    public void printAuthor()
    {
        System.out.println("Author: " + author);
    }
    
    public void printTitle()
    {
        System.out.println("Title: " + title);
    }
    
    public void printDetails()
    {
        System.out.print("Author: " + author + 
        ", Title: " + title + ", Pages: " + pages + 
        ", Times Borrowed: " + borrowed);
        
        if (refNumber.length() > 0)
        {
            System.out.println(", Reference Number: " + refNumber);
        }
        else System.out.println(", Reference Number: zzz");
            
    }
}
