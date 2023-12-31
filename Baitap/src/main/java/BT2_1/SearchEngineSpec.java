package BT2_1;

public class SearchEngineSpec {
	private String name, baseURL;
	   public SearchEngineSpec(String name, String baseURL) {
	      this.name = name;
	      this.baseURL = baseURL;
	   }
	   /**
	    * Builds a URL for the results page by simply concatenating the base URL
	    * (http://...?someVar=") with the URL-encoded search string (jsp+training).
	    */


	   public String makeURL(String searchString) {
	      return (baseURL + searchString);
	   }


	   public String getName() {
	      return (name);
	   }

}
