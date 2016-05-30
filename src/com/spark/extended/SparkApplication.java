package com.spark.extended;

//Reflect
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

//Spark
import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.put;
import static spark.Spark.delete;
import static spark.Spark.options;
import static spark.Spark.externalStaticFileLocation;
import spark.Request;
import spark.Response;
import spark.Route;

//Utils
import com.util.*;

public class SparkApplication{

	public static void registerController(ControllerBase controller){
        for (Method method : controller.getClass().getMethods()) {
           HttpMethod httpMethod = (HttpMethod)method.getAnnotation(HttpMethod.class);
           if (httpMethod != null) {
               switch(httpMethod.type()){
               		case GET:{
               			get(httpMethod.path(), (req, res) -> {
               				ControllerFilterMessage beforeAllResult = controller.before(req, res);

               				if(!beforeAllResult.isOk())
               					return beforeAllResult.getMessage();

               				ControllerFilterMessage beforeResult = controller.beforeGet(req, res);

               				if(!beforeResult.isOk())
               					return beforeResult.getMessage();

               				Object result = method.invoke(controller, req, res);

               				ControllerFilterMessage afterAllResult = controller.after(req, res);

               				if(!afterAllResult.isOk())
               					return afterAllResult.getMessage();

               				ControllerFilterMessage afterResult = controller.afterGet(req, res);

               				if(!afterResult.isOk())
               					return beforeResult.getMessage();

               				return result;
               			});
               			break;
               		}
               		case POST:{
               			post(httpMethod.path(), (req, res) -> {
               				ControllerFilterMessage beforeAllResult = controller.before(req, res);

               				if(!beforeAllResult.isOk())
               					return beforeAllResult.getMessage();

               				ControllerFilterMessage beforeResult = controller.beforePost(req, res);

               				if(!beforeResult.isOk())
               					return beforeResult.getMessage();

               				Object result = method.invoke(controller, req, res);

               				ControllerFilterMessage afterAllResult = controller.after(req, res);

               				if(!afterAllResult.isOk())
               					return afterAllResult.getMessage();

               				ControllerFilterMessage afterResult = controller.afterPost(req, res);

               				if(!afterResult.isOk())
               					return beforeResult.getMessage();

               				return result;
               			});
               			break;
               		}
               		case PUT:{
               			put(httpMethod.path(), (req, res) -> {
               				ControllerFilterMessage beforeAllResult = controller.before(req, res);

               				if(!beforeAllResult.isOk())
               					return beforeAllResult.getMessage();

               				ControllerFilterMessage beforeResult = controller.beforePut(req, res);

               				if(!beforeResult.isOk())
               					return beforeResult.getMessage();

               				Object result = method.invoke(controller, req, res);

               				ControllerFilterMessage afterAllResult = controller.after(req, res);

               				if(!afterAllResult.isOk())
               					return afterAllResult.getMessage();

               				ControllerFilterMessage afterResult = controller.afterPut(req, res);

               				if(!afterResult.isOk())
               					return beforeResult.getMessage();

               				return result;
               			});
               			break;
               		}
               		case DELETE:{
               			delete(httpMethod.path(), (req, res) -> {
               				ControllerFilterMessage beforeAllResult = controller.before(req, res);

               				if(!beforeAllResult.isOk())
               					return beforeAllResult.getMessage();

               				ControllerFilterMessage beforeResult = controller.beforeDelete(req, res);

               				if(!beforeResult.isOk())
               					return beforeResult.getMessage();

               				Object result = method.invoke(controller, req, res);

               				ControllerFilterMessage afterAllResult = controller.after(req, res);

               				if(!afterAllResult.isOk())
               					return afterAllResult.getMessage();

               				ControllerFilterMessage afterResult = controller.afterDelete(req, res);

               				if(!afterResult.isOk())
               					return beforeResult.getMessage();

               				return result;
               			});
               			break;
               		}
               		case OPTIONS:{
               			options(httpMethod.path(), (req, res) -> {
               				ControllerFilterMessage beforeAllResult = controller.before(req, res);

               				if(!beforeAllResult.isOk())
               					return beforeAllResult.getMessage();

               				ControllerFilterMessage beforeResult = controller.beforeOptions(req, res);

               				if(!beforeResult.isOk())
               					return beforeResult.getMessage();

               				Object result = method.invoke(controller, req, res);

               				ControllerFilterMessage afterAllResult = controller.after(req, res);

               				if(!afterAllResult.isOk())
               					return afterAllResult.getMessage();

               				ControllerFilterMessage afterResult = controller.afterOptions(req, res);

               				if(!afterResult.isOk())
               					return beforeResult.getMessage();

               				return result;
               			});
               			break;
               		}
               }
           }
        }
    }

    public static void externalFilesLocation(String location){
    	String currentDir = StringUtil.getAsUnixPath(System.getProperty("user.dir"));
        
        externalStaticFileLocation(currentDir + location);
    }
}