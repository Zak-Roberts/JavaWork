package com.cognizant.libraryTestDrivenDevelopment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public abstract class Item {

	private static int numOfItems;
	private static int numOfItemsMade;
	private String libraryId;
	private String name;
	private String author;
	private String itemType;
	private Date dateTakenOut;
	private Date dateReturned;
	private boolean itemInLibrary;
	private String lastPerson;

	protected int numOfCopies;

	static ArrayList<Item> items = new ArrayList<Item>();
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

	Item() {

	}

	Item(String name, String author, int numOfCopies) {

		setNumOfItemsMade(getNumOfItemsMade() + 1);
		this.setLibraryId(libraryId);

		this.setName(name.toUpperCase());
		this.setAuthor(author.toUpperCase());
		this.setItemType(itemType);
		this.numOfCopies = numOfCopies;
		this.itemInLibrary = true;

		items.add(this);
		setNumOfItems(getNumOfItems() + numOfCopies);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;

		if (this instanceof Book) {
			this.itemType = "BOOK";
		} else if (this instanceof Map) {
			this.itemType = "MAP";
		} else if (this instanceof Journal) {
			this.itemType = "JOURNAL";
		}
	}

	public String getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(String libraryId) {

		if (this instanceof Book) {
			this.libraryId = "B" + String.format("%03d", getNumOfItemsMade());
		} else if (this instanceof Map) {
			this.libraryId = "M" + String.format("%03d", getNumOfItemsMade());
		} else if (this instanceof Journal) {
			this.libraryId = "J" + String.format("%03d", getNumOfItemsMade());
		}
	}

	public String getDateTakenOut() {
		return sdf.format(dateTakenOut);
	}

	public void setDateTakenOut(String dateTakenOut2) {
		try {
			this.dateTakenOut = sdf.parse(dateTakenOut2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getDateReturned() {
		return sdf.format(dateReturned);
	}

	public void setDateReturned(String dateReturned2) {
		try {
			this.dateReturned = sdf.parse(dateReturned2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean isItemInLibrary() {
		return itemInLibrary;
	}

	public void setItemInLibrary(boolean itemInLibrary) {
		this.itemInLibrary = itemInLibrary;
	}

	public String getLastPerson() {
		return lastPerson;
	}

	public void setLastPerson(String lastPerson) {
		this.lastPerson = lastPerson;
	}

	public abstract String read(); // hard to implement for this example

	public static int getNumOfItemsMade() {
		return numOfItemsMade;
	}

	public void setNumOfItemsMade(int numOfItemsMade) {
		Item.numOfItemsMade = numOfItemsMade;
	}

	public String checkOutItem(String firstName, String lastName, String name) {
		name = name.toUpperCase();
		for (Item item : items) {
			if (item.getName().equals(name) && item.isItemInLibrary() == true && item.numOfCopies > 0) {
				item.setDateTakenOut(sdf.format(java.util.Date
						.from(LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant())));
				item.setDateReturned(sdf.format(java.util.Date
						.from(LocalDate.now().plusWeeks(2).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant())));
				item.setLastPerson(firstName + " " + lastName);
				item.numOfCopies = (item.numOfCopies - 1);
				return "You have successfully checked out the item '" + name + "' until " + item.getDateReturned()
						+ "\nThere is " + item.numOfCopies + " copies left in the library";
			} else if (item.numOfCopies == 0) {
				item.setItemInLibrary(false);
				return "You can't take " + name + ", we don't have any more copies!";
			} else {
				return "You can't take " + name + ", we don't have it!";
			}
		}
		return "";
	}

	public String checkInItem(String firstName, String lastName, String name) {
		name = name.toUpperCase();
		for (Item item : items) {
			if (item.getName().equals(name)) {
				item.setItemInLibrary(true);
				item.setDateReturned(sdf.format(java.util.Date
						.from(LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant())));
				item.setLastPerson(firstName + " " + lastName);
				item.numOfCopies = (item.numOfCopies + 1);
				return "You have returned the item '" + name + "' on " + item.getDateReturned() + "\nThere are now "
						+ item.numOfCopies + " copies in the library";
			} else {
				return "You can't return " + name + ", we already have it!";
			}
		}
		return "";
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNumOfItems() {
		return Item.numOfItems;
	}

	public void setNumOfItems(int numOfItems) {
		Item.numOfItems = numOfItems;
	}

	// public static String checkItemWithPerson(String name) {
	// String firstName = "";
	// String lastName = "";
	//
	// for(Item item : items) {
	// if(item.getName().equals(name)) {
	// firstName = item.getLastPerson();
	// return firstName + " has a copy of " + name;
	// }
	// else if(item.getLastPerson() == null){
	// return "No one has a copy of '" + name + "' out currently";
	// }
	// }
	//
	// return "";
	// }

	// add item method
	public String addItem(String name, String author, int numCopies) {
		// needs to work for all 3 items...
		return "You have added " + numCopies + " of '" + name + "' to the library";
	}

	// remove item method
	public String removeItem(String name, String author, int numCopies) {
		int copies = numCopies;
		for (Item item : items) {
			if (item.getName().equals(name) && item.getAuthor().equals(author) && copies <= item.numOfCopies) {
				items.remove(item);
				item.numOfCopies--;
				copies--;
				numOfItems--;
				
			}
		}
		return "You have removed " + numCopies + " copies of '" + name + "' from the library";
	}

	// update item method
	public String updateItem(String name, String author, int numCopies) {

		return "You have updated " + numCopies + " copies of '" + name + "'";
	}

}
