package com.spp.p06001;

import java.util.ArrayList;

public class BookService implements IBookService {
	
	BookDAO bookDAO;
	
	public BookService() {
		bookDAO = new BookDAO();
	}

	@Override
	public void registerBook(String name, String author, String isbn, String price) {
		bookDAO.insertBook(name, author, isbn, price);
	}

	@Override
	public ArrayList<Book> readBooks() {
		return bookDAO.readBooks();
	}

	@Override
	public Book readBook(String isbn) {
		return bookDAO.readBook(isbn);
	}

	@Override
	public void modifyBook(String name, String author, String isbn, String price) {
		bookDAO.updateBook(name, author, isbn, price);
	}

	@Override
	public void deleteBook(String isbn) {
		bookDAO.deleteBook(isbn);
	}
	


}
