package model.user;

import service.BookSearchService;
import service.BookService;

public class Buyer extends User {
	BookService bService;
	BookSearchService bsService;
	public Buyer() {
		super();
	}
	public Buyer(BookService bService) {
		super();
		this.bService = bService;
	}

	 public void buyBook(String name) {
		 bService.buy(bService.getIsbn(name));
	 }
	 public void searchBook(String name) {
		 bsService.search(name);
	 }
}
