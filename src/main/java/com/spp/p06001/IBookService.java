package com.spp.p06001;

import java.util.ArrayList;

public interface IBookService {
	
	void registerBook(String name, String author, String isbn, String price);
	ArrayList<Book> readBooks();
	Book readBook(String isbn);
	void modifyBook(String name, String author, String isbn, String price);
	void deleteBook(String isbn);
}
