package com.cognizant.libraryTestDrivenDevelopment;

public class Book extends Item{

	private int numOfBooks;
	private int bookLength;

	Book(){
		
	}
	
	Book(String name, String author, int bookLength, int numOfCopies){
		super(name, author, numOfCopies);
		this.getLibraryId();
		
		this.setBookLength(bookLength);
		setNumOfBooks(getNumOfBooks() + numOfCopies);

	}

	public int getBookLength() {
		return bookLength;
	}

	public void setBookLength(int bookLength) {
		this.bookLength = bookLength;
	}
	
	public String toString() {
		return getLibraryId() + ", " + getName() + ", "  + getAuthor() + ", " +  getItemType() + ", " + getBookLength() + ", " + isItemInLibrary() + ", " + numOfCopies +  "\n";
	}

	@Override
	public String read() {
		return "blurb on the back";
	}

	public int getNumOfBooks() {
		return numOfBooks;
	}

	public void setNumOfBooks(int numOfBooks) {
		this.numOfBooks = numOfBooks;
	}
	
	public String addBook(String name, String author, int bookLength, int numCopies) {
		Book b = new Book(name, author, 420, numCopies);		
		return "You have added " + numCopies + " copies of '" + name + "' to your library";
	}
	
}


