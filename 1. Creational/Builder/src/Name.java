public class Name implements Constants{
	
	private String firstName;
	private String lastName;

	private Name(Builder builder) {
		this.firstName = builder.fName;
		this.lastName = builder.lName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public static class Builder {
		public String fName;
		public String lName;

		public Builder setFName(String fName) {
			this.fName = fName;
			return this;
		}

		public Builder setLName(String lName) {
			this.lName = lName;
			return this;
		}

		// Avoiding null check
		public Name build() {
			return new Name(this);
		}

	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("First name = ").append(getFirstName()).append(LINE_SEPERATOR)
			.append("Last name = ").append(getLastName());
		return sb.toString();
	}
}
