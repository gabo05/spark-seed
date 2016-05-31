package com.spark.extended;

import spark.Request;
import spark.Response;
import spark.Route;

import com.dbutil.SQL2OWrapper;

public class ControllerBase{
	protected SQL2OWrapper sqlO;

	public ControllerBase(){
	}
	public ControllerBase(SQL2OWrapper _sqlO){
		this.sqlO = _sqlO;
	}
	public ControllerFilterMessage before(Request request, Response response){
		return new ControllerFilterMessage(true, "");
	}
	public ControllerFilterMessage after(Request request, Response response){
		return new ControllerFilterMessage(true, "");
	}
	public ControllerFilterMessage beforeGet(Request request, Response response){
		return new ControllerFilterMessage(true, "");
	}
	public ControllerFilterMessage afterGet(Request request, Response response){
		return new ControllerFilterMessage(true, "");
	}
	public ControllerFilterMessage beforePost(Request request, Response response){
		return new ControllerFilterMessage(true, "");
	}
	public ControllerFilterMessage afterPost(Request request, Response response){
		return new ControllerFilterMessage(true, "");
	}
	public ControllerFilterMessage beforePut(Request request, Response response){
		return new ControllerFilterMessage(true, "");
	}
	public ControllerFilterMessage afterPut(Request request, Response response){
		return new ControllerFilterMessage(true, "");
	}
	public ControllerFilterMessage beforeDelete(Request request, Response response){
		return new ControllerFilterMessage(true, "");
	}
	public ControllerFilterMessage afterDelete(Request request, Response response){
		return new ControllerFilterMessage(true, "");
	}
	public ControllerFilterMessage beforeOptions(Request request, Response response){
		return new ControllerFilterMessage(true, "");
	}
	public ControllerFilterMessage afterOptions(Request request, Response response){
		return new ControllerFilterMessage(true, "");
	}
}
