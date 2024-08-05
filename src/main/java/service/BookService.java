package service;

import java.util.Map;
import java.util.HashMap;

public class BookService {
	
	Map<String, Long> bookNameToIsbn = new HashMap<>();
	
	public void add(long isbn) {
		
	}
	public void remove(long isbn) {
		
	}
	public void buy(long isbn) {
		
	}
	public long getIsbn(String bookName) {
		return bookNameToIsbn.get(bookName);
		
	}
}
