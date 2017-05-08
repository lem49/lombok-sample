package de.sample.lombok.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString(includeFieldNames = false)
@EqualsAndHashCode
@RequiredArgsConstructor
public class Surename {

	private final String surename;

}