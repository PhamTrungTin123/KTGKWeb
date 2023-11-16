package BT2_1;
import BT2_1.SearchEngineSpec;


public class SearchUtilities {
	 private static SearchEngineSpec[] commonSpecs = { 
	         new SearchEngineSpec("Google", "http://www.google.com/search?q="),
	         new SearchEngineSpec("Yahoo", "http://search.yahoo.com/bin/search?p="),
	         new SearchEngineSpec("Lycos", "http://search.lycos.com/web?q="),
	         new SearchEngineSpec("HotBot", "http://hotbot.com/web?q="),
	         new SearchEngineSpec("MSN", "http://search.msn.com/results.asp?q="), };


	   public static SearchEngineSpec[] getCommonSpecs() {
	      return (commonSpecs);
	   }


	   /**
	    * Given a search engine name and a search string, builds a URL for the results
	    * page of that search engine for that query. Returns null if the search engine
	    * name is not one of the ones it knows about.
	    */


	   public static String makeURL(String searchEngineName, String searchString) {
	      SearchEngineSpec[] searchSpecs = getCommonSpecs();
	      String searchURL = null;
	      for (int i = 0; i < searchSpecs.length; i++) {
	         SearchEngineSpec spec = searchSpecs[i];
	         if (spec.getName().equalsIgnoreCase(searchEngineName)) {
	            searchURL = spec.makeURL(searchString);
	            break;
	         }
	      }
	      return (searchURL);
	   }

}
