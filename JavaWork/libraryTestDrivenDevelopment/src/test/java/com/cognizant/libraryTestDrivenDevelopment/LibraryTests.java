package com.cognizant.libraryTestDrivenDevelopment;

import static org.junit.Assert.*;

import org.junit.Test;

public class LibraryTests {

	@Test		// @Test is metadata - data about data (what you'll be doing with the data)
	public void numOfBooksIncrementTest() {
		Book b = new Book();
		int idBefore = b.getNumOfBooks();
		Book book = new Book("Hello World", "Zak", 500,5);
		assertEquals("Number of books increment", idBefore + book.numOfCopies, book.getNumOfBooks());
	}
	
	@Test
	public void numOfJournalsIncrementTest() {
		Journal j = new Journal();
		int idBefore = j.getNumOfJournals();
		Journal journal = new Journal("Science Stuff", "Zak", 20, 3);
		assertEquals("Number of journals increment", idBefore+journal.numOfCopies, journal.getNumOfJournals());
	}
	
	@Test
	public void numOfMapsIncrementTest() {
		Map m = new Map();
		int idBefore = m.getNumOfMaps();
		Map map = new Map("Map of Mancehster", "Zak",50.53,1);
		assertEquals("Number of maps increment", idBefore+map.numOfCopies, map.getNumOfMaps());
	}

	@Test
	public void numOfItemsIncrementTest() {	
		int idBefore = Item.getNumOfItemsMade();
		Map map = new Map("Map of Mancehster", "Zak",50.53,1);
		assertEquals("Auto add to library array", idBefore+map.numOfCopies, Item.getNumOfItemsMade());
	}
	
	// test to see if libraryId is auto assigned
	@Test
	public void libraryIdAssignedTest() {
		int idBefore = Item.getNumOfItemsMade();
		Journal journal = new Journal("Science Stuff", "Zak", 20, 3);

		int idAfter = Item.getNumOfItemsMade();
		assertEquals("Auto increment added library items' Id","J" + String.format("%03d", idBefore+1) , journal.getLibraryId());
	}
	
	// check in function
	// check out function
	// add item function
	// remove item function
	// update item function
	
	// register person function
	@Test
	public void addPersonTest() {
		Library l = new Library();
		int sizeBefore = People.people.size();
		l.addPerson("Zak","Roberts","Congleton");
		assertEquals("Add person test", sizeBefore+1, People.people.size());
	}
	
	// delete person function
	@Test
	public void removePersonByIdTest() {
		Library l = new Library();
		l.addPerson("Zak","Roberts","Manchester");
		l.addPerson("Zak","World","Manchester");
		l.addPerson("Hello", "World", "Manchester");
		int sizeBefore = People.people.size();
		l.removePerson(4);
		assertEquals("Remove person by name test", sizeBefore-1, People.people.size());
	}
	
	@Test
	public void removePersonByNameTest() {
		Library l = new Library();
		l.addPerson("Zak","Roberts","Manchester");
		l.addPerson("Zak","World","Manchester");
		l.addPerson("Hello", "World", "Manchester");
		int sizeBefore = People.people.size();
		l.removePerson("Zak", "Roberts");
		assertEquals("Remove person by name test", sizeBefore-1, People.people.size());
	}
	
	// update person function (needs new instance of 'People', not using personId)
	@Test
	public void updatePersonTest() {
		Library l = new Library();
		People p = new People("Hello", "World", "Manchester");
		l.updatePerson(p, "firstname", "Nic");
		assertEquals("Update person's info test", "Nic", p.getFirstName());
	}
	
	//add book, map, journal
	@Test
	public void addMapTest() {
		Map m = new Map();
		int idBefore = m.getNumOfMaps();
		m.addMap("Map of the World", "MapPerson", 0.0, 100);
		assertEquals("adding map test", idBefore+m.numOfCopies, m.getNumOfMaps());
	}
	
	@Test
	public void addBookTest() {
		Book b = new Book();
		int idBefore = b.getNumOfBooks();
		b.addBook("Map of the World", "MapPerson", 420, 100);
		assertEquals("adding map test", idBefore+b.numOfCopies, b.getNumOfBooks());
	}
	
	@Test
	public void addJournalTest() {
		Journal j = new Journal();
		int idBefore = j.getNumOfJournals();
		j.addJournal("Map of the World", "MapPerson", 24, 100);
		assertEquals("adding map test", idBefore+j.numOfCopies, j.getNumOfJournals());
	}
	
	//remove book, map, journal
	
//	@Test
//	public void removeJournalTest() {
//		Journal j = new Journal();
//		int idBefore = j.getNumOfJournals();
//		j.removeItem("Science", "Zak", 3); // 3 is number of copies to remove
//		assertEquals("remove journal test", idBefore-3, j.getNumOfJournals());
//	}
}