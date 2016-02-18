package com.towardsmobile;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;


import freemarker.template.Configuration;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;




public class App {

	public static void main(String[] args) {
		staticFileLocation("/public");
		get("/", (req, res) -> {
			return new ModelAndView(null, "index.ftl");
	    }, templateEngine());
	}
	private static FreeMarkerEngine templateEngine() {
		FreeMarkerEngine engine = new FreeMarkerEngine();
		engine.setConfiguration(templateConfig());
		return engine;
	}
	private static Configuration templateConfig() {
		Configuration cfg = new Configuration();
	    
	    cfg.setClassForTemplateLoading(App.class, "../../");
	    return cfg;
	}
}