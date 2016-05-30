package com.dbutil;

import lombok.Data;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class DBOptions{
	protected String dbHost;
	protected String dbPort;
	protected String database;
	protected String dbUsername;
	protected String dbPassword;
}