public class Account implements Constants {
	private int id;
	private String email;
	private Name name;
	private Address address;

	private Account(Builder builder) {
		this.id = builder.id;
		this.email = builder.email;
		this.name = builder.name;
		this.address = builder.address;
	}

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email; 
	}

	public Name getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	public static class Builder {
		private int id;
		private String email;
		private Name name;
		private Address address;

		public Builder setId(int id) {
			this.id = id;
			return this;
		}

		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}

		public Builder setName(Name name) {
			this.name = name;
			return this;
		}

		public Builder setAddress(Address address) {
			this.address = address;
			return this;
		}
		// Ignoring null check for now. We should rather throw
		// illegal state exeption.
		public Account build() {
			return new Account(this);
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Account created successfully with the: ")
			.append(LINE_SEPERATOR)
			.append("ID = ").append(getId()).append(LINE_SEPERATOR)
			.append("Email = ").append(getEmail()).append(LINE_SEPERATOR)
			.append(getName().toString()).append(LINE_SEPERATOR)
			.append(getAddress().toString());
		return sb.toString();
	}

}
