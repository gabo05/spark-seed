package com.controllers;

//Spark
import spark.Request;
import spark.Response;
import spark.Route;

//ViewModels
import com.viewmodels.*;

//Utils
import com.util.*;

//Spark Extended
import com.spark.extended.*;

//Sql2O
import com.dbutil.SQL2OWrapper;

public class HomeController extends ControllerBase{
	
	public HomeController(){
		super();
	}
	public HomeController(SQL2OWrapper _sqlO){
		super(_sqlO);
	}

	@HttpMethod(path="/home/hello", type=HttpMethodType.GET)
	public Object hello(Request request, Response response){
		SimpleMessage message = new SimpleMessage("OK", "We can code it!");

        response.status(200);
        response.type("application/json");

        return JSONUtil.dataToJson(message);
	}
	@HttpMethod(path="/home/save", type=HttpMethodType.POST)
	public Object save(Request request, Response response){
		SimpleMessage message = new SimpleMessage("OK", "Record saved");

        response.status(200);
        response.type("application/json");

        return JSONUtil.dataToJson(message);
	}
	@HttpMethod(path="/home/add", type=HttpMethodType.PUT)
	public Object add(Request request, Response response){
		SimpleMessage message = new SimpleMessage("OK", "New record saved");

        response.status(200);
        response.type("application/json");

        return JSONUtil.dataToJson(message);
	}
	@HttpMethod(path="/home/remove", type=HttpMethodType.DELETE)
	public Object delete(Request request, Response response){
		SimpleMessage message = new SimpleMessage("OK", "Record deleted");

        response.status(200);
        response.type("application/json");

        return JSONUtil.dataToJson(message);
	}
	@HttpMethod(path="/home/options", type=HttpMethodType.OPTIONS)
	public Object options(Request request, Response response){
		SimpleMessage message = new SimpleMessage("OK", "I don't know what this method does...");

        response.status(200);
        response.type("application/json");

        return JSONUtil.dataToJson(message);
	}
}
