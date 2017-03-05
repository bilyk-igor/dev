package ua.consultation;

public class Passenger {

	private String name;
	private String surname;
	private Ticket ticket;
	
	
	public Passenger(String name, String surname, Ticket ticket) {
		super();
		this.name = name;
		this.surname = surname;
		this.ticket = ticket;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public Ticket getTicket() {
		return ticket;
	}


	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	
	
	
}
