package Sychronization;

public class SychronizationExample implements Runnable{
	int availableTickets = 1;
	@Override
	public void run() {

		synchronized (this) {
			if (availableTickets > 0) {
				System.out.println("Booking ticket by :-" + Thread.currentThread().getName());
				try {
					Thread.sleep(1000);// some time inorder to book a ticket

				} catch (Exception e) {
					System.out.println(e.toString());
				}
				availableTickets--;
				System.out.println("Booked ticket by:-" + Thread.currentThread().getName());
				System.out.println("more available tickets :- " + availableTickets);

			} else {
				System.out.println("ticket not booked :- " + Thread.currentThread().getName());
			}
		}
	}
	

}
