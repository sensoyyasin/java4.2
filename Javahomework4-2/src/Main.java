		import Adapter.MernisServiceAdapter;
		import Concrete.CustomerManager;
		import Concrete.GameManager;
		import Entities.Campaign;
		import Entities.Customer;
		import Entities.Game;

		import java.util.Calendar;
		import java.util.Date;

		public class Main {

			public static void main(String[] args) {
				 Customer customer = new Customer();
			        customer.setId(1);
			        customer.setFirstName("Yasin");
			        customer.setSirName("Sensoy");
			        customer.setNationalityId(12345678901L);
			        customer.setBirthDate(2001);

			        Campaign campaign = new Campaign(1, 250);

			        Game game = new Game();
			        game.setId(1);
			        game.setgameName("Bruce");
			        game.setToken(100);

			        CustomerManager manager = new CustomerManager(new MernisServiceAdapter());
			        GameManager gameManager = new GameManager();
			        
			        manager.add(customer);

	}

}
