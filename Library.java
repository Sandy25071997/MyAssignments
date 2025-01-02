package week2.day1;

public class Library {
	// Method to add a book
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}

	// Method to issue a book
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		// Create an object of the Library class
		Library library = new Library();

		// Call the addBook method and store the return value
		String bookAdded = library.addBook("The Compound Effect");

		// Call the issueBook method
		library.issueBook();

		// Display the title of the book added
		System.out.println("The book added is: " + bookAdded);
	}

}
