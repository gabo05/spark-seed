package com.spark.extended;

import lombok.Data;
import lombok.Getter;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class ControllerFilterMessage{
	@Getter(AccessLevel.NONE) protected boolean Ok;
	protected Object message;

	public boolean isOk(){
		return Ok;
	}
}