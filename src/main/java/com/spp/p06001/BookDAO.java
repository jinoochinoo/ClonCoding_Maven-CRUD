package com.spp.p06001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class BookDAO implements IBookDao {

	private  HashMap<String, Book> dbBook;
	
	public BookDAO() {
		dbBook = new HashMap<String, Book>();
	}
	
	@Override
	public void insertBook(String name, String author, String isbn, String price) {
		
		Book book = new Book();
		
		book.setName(name);
		book.setAuthor(author);
		book.setIsbn(isbn);
		book.setPrice(price);
		
		dbBook.put(isbn, book);
		
	}

	@Override
	public ArrayList<Book> readBooks() {
		
		ArrayList<Book> books = new ArrayList<Book>();
		
		// Iterator 이용
		Set<String> keys = dbBook.keySet();
		Iterator<String> iterator = keys.iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			Book book = dbBook.get(key);
			books.add(book);
		}

		return books;
	}

	@Override
	public Book readBook(String isbn) {
		
		return dbBook.get(isbn);
	}

	@Override
	public void updateBook(String name, String author, String isbn, String price) {
		
		Book book = dbBook.get(isbn);
		
		book.setName(name);
		book.setAuthor(author);
		book.setPrice(price);
	}

	@Override
	public void deleteBook(String isbn) {
		
		dbBook.remove(isbn);
		
	}
	
	

}
