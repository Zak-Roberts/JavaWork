package com.cognizant.libraryTestDrivenDevelopment;

public class Journal extends Item {

	private int numOfJournals;
	private int numArticles;

	Journal() {

	}

	Journal(String name, String author, int NumArticles, int numOfCopies) {

		super(name, author, numOfCopies);
		this.getLibraryId();

		this.setNumArticles(numArticles);
		setNumOfJournals(getNumOfJournals() + numOfCopies);

	}

	public int getNumArticles() {
		return numArticles;
	}

	public void setNumArticles(int numArticles) {
		this.numArticles = numArticles;
	}

	public String toString() {
		return getLibraryId() + ", " + getName() + ", " + getAuthor() + ", " + getItemType() + ", " + getNumArticles()
				+ ", " + isItemInLibrary() + ", " + numOfCopies + "\n";
	}

	@Override
	public String read() {
		return "read much like a book, except factual";
	}

	public int getNumOfJournals() {
		return numOfJournals;
	}

	public void setNumOfJournals(int numOfJournals) {
		this.numOfJournals = numOfJournals;
	}

	public String addJournal(String name, String author, int numArticles, int numCopies) {
		Journal j = new Journal(name, author, 24, numCopies);
		return "You have added " + numCopies + " copies of '" + name + "' to your library";
	}

//	public String removeJournal(String name, String author, int numCopies) {
//		for (Item item : Item.items) {
//			int i = 0;
//			while (i < numCopies) {
//				if (item.getName().equals(name) && item.getAuthor().equals(author)) {
//					items.remove(item);
//					item.numOfCopies--;
//				}
//				i++;
//			}
//		}
//		return "You have removed " + numCopies + " copies of '" + name + "' from your library";
//	}

}
