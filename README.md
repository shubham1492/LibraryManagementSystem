Project: Library Management system 

Class Diagram: This diagram will show relationship Between All classes.

+--------------------------+
| LibraryManagementSystem  |
+--------------------------+
| - instance: LibraryManagementSystem |
| - library: Library         |
+--------------------------+
| + getInstance(): LibraryManagementSystem |
| + getLibrary(): Library    |
+--------------------------+
|
|
v
+---------------------+
|      Library        |
+---------------------+
| - books: List<Book>  |
| - patrons: List<Patron> |
+---------------------+
| + addBook(book: Book): void |
| + removeBook(book: Book): void |
| + updateBook(oldBook: Book, newBook: Book): void |
| + searchBooks(keyword: String): List<Book> |
| + addPatron(patron: Patron): void |
| + updatePatron(oldPatron: Patron, newPatron: Patron): void |
| + getBorrowingHistory(patron: Patron): List<Book> |
| + checkoutBook(patron: Patron, book: Book): boolean |
| + returnBook(patron: Patron, book: Book): void |
+---------------------+
|            |
|            |
|            |
v            v
+-----------+ +-------------+
|   Book    | |   Patron    |
+-----------+ +-------------+
| - title: String       | | - name: String |
| - author: String      | | - patronId: String |
| - ISBN: String        | | - borrowingHistory: List<Book> |
| - publicationYear: int| +-------------+
| - isAvailable: boolean|
+-----------+ +-------------+
| +getters() | | +getters() |
| +setters() | | +setters() |
+-----------+ +-------------+
