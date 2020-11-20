package com.hanoli.catdescuentosedocta;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

import com.hanoli.catdescuentosedocta.config.CORSFilter;

import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;

public class CatDescuentosEdoCta extends Application {
	
	public Set<Class<?>> getClasses(){
		Set<Class<?>> classes = new HashSet<Class<?>>();
			
			classes.add(UploadFileService.class);
			classes.add(ApiListingResource.class);
			classes.add(SwaggerSerializers.class);
			classes.add(CORSFilter.class);
			return classes;
			
		
	}

}
