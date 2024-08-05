package model.user;

import service.SellerService;

public class Admin extends User {
	public Admin() {
		super();
	}
	SellerService sService;
	Admin(SellerService service){
		this.sService = service;		
	}
	public void addSeller(int sid) {
		sService.add(sid);
	}
	public void removeSeller(int sid) {
		sService.remove(sid);
	}
	
}
