package gameStore01;
import java.util.*;
public class Book {
	
	private final static int YEAR = Calendar.getInstance().get(Calendar.YEAR);
	
	private String author;
	private String title;
	private String publisher;
	private int copyrightYear;
	
	private Book() {
		super();
	} // Book()
	
	public Book(String author, String title, String publisher, int copyrightYear) {
		this.author = author;
		this.title = title;
		this.publisher = publisher;
		this.copyrightYear = copyrightYear;
	} // Book()
	
	public String getAuthor() {
		return author;
	} // getAuthor()
	
	public String getTitle() {
		return title;
	} // getTitle()
	
	public String getPublisher() {
		return publisher;
	} // getPublisher()
	
	public int getCopyrightYear() {
		return copyrightYear;
	} // getCopyrightYear()
	
	public String toString() {
		return "Author: " + author + "\nTitle: " + title + "\nPublisher: " 
				+ publisher + "\nCopyright Year: " + copyrightYear;
	} // toString()
	
	public int getAge() {
		return YEAR - copyrightYear;
	} // getAge()
} // class Book
