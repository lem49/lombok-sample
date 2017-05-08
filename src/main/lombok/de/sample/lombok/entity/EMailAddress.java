package de.sample.lombok.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(includeFieldNames = false)
@EqualsAndHashCode
public class EMailAddress {

	private final String email;

	public EMailAddress(String email) {
		// validate email here
		this.email = email;
	}
}