package probC;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Commissioned comissioned =new Commissioned("Mark",0.1,1000);
		Employee[] emp = {new Hourly("Ion",50,20), new Salaried("Ahmed",3000), 
				comissioned};
		Order ord1 = new Order("Order101",5,2017,12,10);
		Order ord2 = new Order("Order102",15,2017,12,15);
		comissioned.addOrder(ord1);
		comissioned.addOrder(ord2);
		
		for(Employee e : emp) {
			e.calcCompensation(1, 2018);
			e.print();
		
		}
		

	}

}
