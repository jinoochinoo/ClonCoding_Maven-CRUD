package com.spp.p06001;

import java.util.ArrayList;

public interface IBookDao {
	
	void insertBook(String name, String author, String isbn, String price);
	ArrayList<Book> readBooks();
	Book readBook(String isbn);
	void updateBook(String name, String author, String isbn, String price);
	void deleteBook(String isbn);
}
