// Define the Book case class
case class Book(title: String, author: String, isbn: String)

// Library management object
object LibraryManagement {
  // Initial set containing at least three different books
  var library: Set[Book] = Set(
    Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"),
    Book("1984", "George Orwell", "9780451524935"),
    Book("To Kill a Mockingbird", "Harper Lee", "9780061120084")
  )

  // Add a new book to the library
  def addBook(book: Book): Unit = {
    library += book
    println(s"Book '${book.title}' added to the library.")
  }

  // Remove a book from the library by its ISBN
  def removeBook(isbn: String): Unit = {
    val initialSize = library.size
    library = library.filterNot(_.isbn == isbn)
    if (library.size < initialSize) {
      println(s"Book with ISBN '$isbn' removed from the library.")
    } else {
      println(s"No book found with ISBN '$isbn'.")
    }
  }

  // Check if a book is already in the library by its ISBN
  def isBookInLibrary(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }

  // Display the current library collection with details of each book
  def displayLibrary(): Unit = {
    if (library.nonEmpty) {
      println("Current Library Collection:")
      library.foreach { book =>
        println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      }
    } else {
      println("The library is empty.")
    }
  }

  // Search for a book by its title and display its details if found
  def searchBookByTitle(title: String): Unit = {
    val foundBooks = library.filter(_.title.equalsIgnoreCase(title))
    if (foundBooks.nonEmpty) {
      foundBooks.foreach { book =>
        println(s"Book found: Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      }
    } else {
      println(s"No book found with title '$title'.")
    }
  }

  // Display all books by a specific author
  def displayBooksByAuthor(author: String): Unit = {
    val foundBooks = library.filter(_.author.equalsIgnoreCase(author))
    if (foundBooks.nonEmpty) {
      println(s"Books by '$author':")
      foundBooks.foreach { book =>
        println(s"Title: ${book.title}, ISBN: ${book.isbn}")
      }
    } else {
      println(s"No books found by author '$author'.")
    }
  }
}

// Testing the LibraryManagement object
object LibraryApp extends App {
  // Display initial library collection
  LibraryManagement.displayLibrary()
  
  // Add a new book to the library
  LibraryManagement.addBook(Book("Brave New World", "Aldous Huxley", "9780060850524"))

  // Remove a book from the library by its ISBN
  LibraryManagement.removeBook("9780451524935")

  // Check if a book is already in the library by its ISBN
  println(s"Is '1984' in the library? ${LibraryManagement.isBookInLibrary("9780451524935")}")

  // Search for a book by its title
  LibraryManagement.searchBookByTitle("To Kill a Mockingbird")

  // Display all books by a specific author
  LibraryManagement.displayBooksByAuthor("George Orwell")

  // Display updated library collection
  LibraryManagement.displayLibrary()
}
