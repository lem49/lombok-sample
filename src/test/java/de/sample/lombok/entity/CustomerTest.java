package de.sample.lombok.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void testEqualsNullExpectedFalse() {
		assertFalse(Customer.builder().id(1).build().equals(null));
	}

	@Test
	public void testToString() {
		assertEquals(
				"Customer(id=1, firstname=Firstname(abc), surename=Surename(def), emails=[EMailAddress(nono)], addresses=[Address(street=home, city=sweet, postcode=Postcode(home))])",
				Customer.builder().id(1).firstname("abc").surename("def").address().street("home").city("sweet")
						.postcode("home").add().email(new EMailAddress("nono")).build().toString());
	}
}