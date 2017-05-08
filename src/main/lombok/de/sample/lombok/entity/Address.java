package de.sample.lombok.entity;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@Builder
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class Address {

	private final String street;
	private final String city;
	private final Postcode postcode;

	public static class AddressBuilder {

		private final Customer.CustomerBuilder customerBuilder;

		public AddressBuilder() {
			this(null);
		}

		public AddressBuilder(Customer.CustomerBuilder customerBuilder) {
			this.customerBuilder = customerBuilder;
		}

		public AddressBuilder postcode(final String postcode) {
			this.postcode = new Postcode(postcode);
			return this;
		}

		public Customer.CustomerBuilder add() {
			return customerBuilder.add(this.build());
		}
	}

}