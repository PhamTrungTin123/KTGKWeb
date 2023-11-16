package BT2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SurveyData {
	 private Map<String, SurveyItem> surveys;
	   public SurveyData() {
	      SurveyItem gv = new SurveyItem("giao_vien", "Giao Vien", 0);
	      SurveyItem bs = new SurveyItem("bac_si", "Bac Si", 0);
	      SurveyItem dn = new SurveyItem("doanh_nhan", "Doanh Nhan", 0);
	      SurveyItem kts = new SurveyItem("kien_truc_su", "Kien Truc Su", 0);
	      SurveyItem ns = new SurveyItem("nhac_si", "Nhac Si", 0);
	      SurveyItem cs = new SurveyItem("ca_si", "Ca Si", 0);
	      surveys = new HashMap<String, SurveyItem>();
	      surveys.put(gv.getName(), gv);
	      surveys.put(bs.getName(), bs);
	      surveys.put(dn.getName(), dn);
	      surveys.put(kts.getName(), kts);
	      surveys.put(ns.getName(), ns);
	      surveys.put(cs.getName(), cs);
	   }


	   

	   public double getPercent(String job) {
	      double result = 0;
	      if (surveys.containsKey(job)) {
	         if (this.getToTal() == 0) result = 0;
	         else {
	            result = surveys.get(job).getVoteQuantity() * 100.0 / this.getToTal();
	            result = Math.round(result * 100) / 100.0;
	         }
	      }
	      return result;
	   }


	   public int getToTal() {
		   int total = 0;
		      for (SurveyItem acc : surveys.values()) {
		         total = total + acc.getVoteQuantity();
		      }
		      return total;
	}




	public void increasingValue(String job) {
	      surveys.get(job).increaseVote();
	   }


	   public Collection<SurveyItem> getSurveyItems() {
	      return surveys.values();
	   }


	   public String getDescription(String job) {
	      return surveys.get(job).getDescription();
	  }

}
