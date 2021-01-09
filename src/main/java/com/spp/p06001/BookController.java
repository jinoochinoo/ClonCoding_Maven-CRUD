package com.spp.p06001;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {

	BookService bookService;
	
	public BookController() {
		bookService = new BookService();
	}
	
	@RequestMapping("/reg")
	public String registerBook(Model model) {
		return "book/registerBook";
	}
	
	@RequestMapping("/regCon")
	public String registerConfirmBook(Model model, HttpServletRequest req) {
		
		String name = req.getParameter("name");
		String author = req.getParameter("author");
		String isbn = req.getParameter("isbn");
		String price = req.getParameter("price");
		
		bookService.registerBook(name, author, isbn, price);
		
		return "redirect:/book/readBooks";
	}
	
	@RequestMapping("/readBooks")
	public String readBooks(Model model, HttpServletRequest req) {
		
		ArrayList<Book> dbList = bookService.readBooks();
		model.addAttribute("list", dbList);
		
		return "book/readBooks";
	}
	
	@RequestMapping("/mod")
	public String modifyBook(Model model, HttpServletRequest req) {
		String isbn = req.getParameter("isbn");
		Book book = bookService.readBook(isbn);
		model.addAttribute("b", book);
		return "book/modifyBook";
	}
	
	@RequestMapping("/modCon")
	public String modifyConfirmBook(Model model, HttpServletRequest req) {
		
		String name = req.getParameter("name");
		String author = req.getParameter("author");
		String isbn = req.getParameter("isbn");
		String price = req.getParameter("price");
		
		bookService.modifyBook(name, author, isbn, price);
		
		return "redirect:/book/readBooks";
	}
	
	@RequestMapping("/del")
	public String deleteBook(Model model, HttpServletRequest req) {
		
		String isbn = req.getParameter("isbn");
		
		bookService.deleteBook(isbn);
		
		return "redirect:/book/readBooks";
	}
}
