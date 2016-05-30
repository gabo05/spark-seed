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

public class AccountController extends ControllerBase{
	@HttpMethod(path="/account/login", type=HttpMethodType.GET)
	public Object hello(Request request, Response response){
		SimpleMessage message = new SimpleMessage("OK", "It's suppsed to return a valid login");

        response.status(200);
        response.type("application/json");

        return JSONUtil.dataToJson(message);
	}
}