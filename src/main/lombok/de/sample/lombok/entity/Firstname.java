package de.sample.lombok.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString(includeFieldNames = false)
@Getter
@EqualsAndHashCode
@RequiredArgsConstructor
public class Firstname {

	private final String firstname;
}
