package com.main;

//Spark
import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.externalStaticFileLocation;
import spark.Request;
import spark.Response;
import spark.Route;

//Spark Extended
import com.spark.extended.*;

//Controllers
import com.controllers.*;

//Sql2O
import com.dbutil.SQL2OWrapper;

public class Main extends SparkApplication{
    public static void main(String[] args) {
        
        externalFilesLocation("/src/com/public");
        //port(4567)

        SQL2OWrapper sqlO = new SQL2OWrapper();

        registerController(new HomeController(sqlO));
        registerController(new AccountController(sqlO));
    }
}
