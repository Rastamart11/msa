package com.erpsol.camel.invoke;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class RestRouter extends RouteBuilder{
	@Override
    public void configure() throws Exception {
		String IN_id = "${header.id}";
		
    	restConfiguration()
        	.contextPath("/api/rest").apiContextPath("/api-doc")
        	.apiProperty("api.title", "Camel REST API")
        	.apiProperty("api.version", "1.0")
        	.apiProperty("cors", "true")
        	.apiContextRouteId("doc-api")
            //.component("servlet")
        	.bindingMode(RestBindingMode.json)
        	.dataFormatProperty("json.in.disableFeatures", "FAIL_ON_UNKNOWN_PROPERTIES");

    	rest("/shoppingCart").description("Shopping Cart REST service")
        	.produces("application/json")
        	.consumes("application/json")
        	.get("/{id}").description("ShoppingCart")
            	.route().routeId("shoppingCart-api")
            	.log(IN_id)
            	.to("sql-stored:getShoppingCart(VARCHAR " + IN_id + ", OUT INTEGER OUT_code, OUT VARCHAR OUT_message)?" + 
            			"dataSource=#dataSource")
            	.bean("shoppingCartService", "getShoppingCartResponse")
             	.setHeader("Access-Control-Allow-Header", constant("*"))
             	.setHeader("Access-Control-Allow-Origin", constant("*"))
             	.setHeader("Access-Control-Allow-Methods", constant("POST, GET, OPTIONS,HEAD,PUT,DELETE,PATCH"))
            	.log("Processed order ${body}")
            	.endRest();        	
    }
}
