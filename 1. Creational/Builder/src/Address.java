public class Address implements Constants {
	
	private String street;
	private String city;
	private String country;

	private Address(Builder b) {
		this.street = b.street;
		this.city = b.city;
		this.country = b.country;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public static class Builder {

		public String street;
		public String city;
		public String country;

		public Builder setStreet(String street) {
			this.street = street;
			return this;
		}

		public Builder setCity(String city) {
			this.city = city;
			return this;
		}

		public Builder setCountry(String country) {
			this.country = country;
			return this;
		}
		// Avoiding null check
		public Address build() {
			return new Address(this);
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Street = ").append(getStreet()).append(LINE_SEPERATOR)
			.append("City = ").append(getCity()).append(LINE_SEPERATOR)
			.append("Country = ").append(getCountry());
		return sb.toString();
	}

}
