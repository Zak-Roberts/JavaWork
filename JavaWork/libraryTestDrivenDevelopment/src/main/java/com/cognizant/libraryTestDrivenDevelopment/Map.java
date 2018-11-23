package com.cognizant.libraryTestDrivenDevelopment;

public class Map extends Item{
	
	private int numOfMaps;
	private double startCoords;
	
	Map(){
		
	}
	
	Map(String name, String author, double startCoords, int numOfCopies){
		
		super(name, author, numOfCopies);
		this.getLibraryId();

		this.setStartCoords(startCoords);
		setNumOfMaps(getNumOfMaps() + numOfCopies);

	}

	public double getStartCoords() {
		return startCoords;
	}

	public void setStartCoords(double startCoords) {
		this.startCoords = startCoords;
	}
	
	public String toString() {
		return getLibraryId() + ", " + getName() + ", " + getAuthor() + ", " + getItemType() + ", " + getStartCoords() + ", " + isItemInLibrary() + ", " + numOfCopies + "\n";
	}

	@Override
	public String read() {
		return "X: 54321, Y: 4324325";
	}

	public int getNumOfMaps() {
		return numOfMaps;
	}

	public void setNumOfMaps(int numOfMaps) {
		this.numOfMaps = numOfMaps;
	}
	
	public String addMap(String name, String author, double startCoords, int numCopies) {
		Map m = new Map(name, author, startCoords,numCopies);		
		return "You have added " + numCopies + " copies of '" + name + "' to your library";
	}

}
