package com.dbutil;

//sql2o
import org.sql2o.Sql2o;
import org.sql2o.converters.UUIDConverter;
import org.sql2o.quirks.PostgresQuirks;

//UUID
import java.util.UUID;

public class SQL2OWrapper{

	private static DBOptions defaults = new DBOptions("", "", "", "", "");

	public static Sql2o getSql2O(DBOptions options){
		Sql2o sql2o = new Sql2o("jdbc:postgresql://" + options.getDbHost() + ":" + options.getDbPort() + "/" + options.getDatabase(),
            options.getDbUsername(), options.getDbPassword(), new PostgresQuirks() {
	        {
	            // make sure we use default UUID converter.
	            converters.put(UUID.class, new UUIDConverter());
	        }
	    });
	    return sql2o;
	}

	public static Sql2o getSql2O(){
		Sql2o sql2o = new Sql2o("jdbc:postgresql://" + defaults.getDbHost() + ":" + defaults.getDbPort() + "/" + defaults.getDatabase(),
            defaults.getDbUsername(), defaults.getDbPassword(), new PostgresQuirks() {
	        {
	            // make sure we use default UUID converter.
	            converters.put(UUID.class, new UUIDConverter());
	        }
	    });
	    return sql2o;
	}
}