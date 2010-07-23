import grails.util.Environment;

class BootStrap {

	def fixtureLoader
	
     def init = { servletContext ->
		 if(Environment.isDevelopmentMode()) {
			 fixtureLoader.load("products")
		 }
     }
	 
     def destroy = {
     }
} 