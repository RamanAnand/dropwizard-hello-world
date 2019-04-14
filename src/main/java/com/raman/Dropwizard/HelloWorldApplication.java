package com.raman.Dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class HelloWorldApplication extends Application<HelloWorldConfiguration>{
	
	public static void main(String[] args) throws Exception
	{
		 new HelloWorldApplication().run(new String[] {"server","config.yml"} );
		
	}

	@Override
	public void run(HelloWorldConfiguration configuration, Environment environment) throws Exception {
		// TODO Auto-generated method stub
		final DemoResource resource =  new DemoResource(configuration.getMessage(), configuration.getFirstParameter()
				, configuration.getSecondParameter());
		environment.jersey().register(resource);
	}

}
