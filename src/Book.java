/**
 * This Enum declares 3 instance fields
 * @author--Zheng Wang
 */
public enum Book {
    //declare constants of enum type --- first, you need an Enum constructor
    STORIES("108 stories","1665"),
    ONIONS("How to pick onions","2002"),
    FUN("Jokes","2012");


    private final String title;
    private final String copyrightYear;
    //Enum constructor
    Book(String title, String copyrightYear){
        this.title = title;
        this.copyrightYear = copyrightYear;
    }

    public String getTitle(){
        return title;
    }

    public String getCopyrightYear(){
        return copyrightYear;
    }

}
