package march2018.prob1_;

public class Publisher {

	private String name;

	private String country;

	private int rank;

	private double revenue;

	public Publisher(String name, String country, int rank, double revenue) {
		this.name = name;
		this.country = country;
		this.rank = rank;
		this.revenue = revenue;
	}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public int getRank() {
		return rank;
	}

	public double getRevenue() {
		return revenue;
	}

}
