package de.sample.lombok.entity;

import java.util.ArrayList;
import java.util.Collection;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Singular;
import lombok.ToString;

@Getter
@Builder
@ToString
// @ToString /* (of = { "id", "firstname", "surename" }) */
@EqualsAndHashCode(of = { "id" })
@RequiredArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Customer {

	private int id;
	private final Firstname firstname;
	private final Surename surename;
	@Singular
	private Collection<EMailAddress> emails;
	private Collection<Address> addresses;

	public static class CustomerBuilder {

		public CustomerBuilder firstname(final String firstname) {
			this.firstname = new Firstname(firstname);
			return this;
		}

		public CustomerBuilder surename(final String surename) {
			this.surename = new Surename(surename);
			return this;
		}

		public Address.AddressBuilder address() {
			return new Address.AddressBuilder(this);
		}

		public CustomerBuilder add(final Address address) {
			if (null == this.addresses) {
				this.addresses = new ArrayList<>();
			}
			this.addresses.add(address);
			return this;
		}
	}
}