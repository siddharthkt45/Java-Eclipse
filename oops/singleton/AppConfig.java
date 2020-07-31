package oops.singleton;

public class AppConfig {

	private AppConfig() {
								//Now, no one can instantiate this class from another class
	}
	
	private static AppConfig obj = null;  //if the object is not used in MainClass it remains null
						//making it private static ensures that no-one can access this object
	
	public static AppConfig getInstance() {
		if(obj == null) {
			obj = new AppConfig();	//if the object is used, we initialize it, thus optimizing the code 
		}
		return obj;						//anyone can access the obj using this method only
	}

}
