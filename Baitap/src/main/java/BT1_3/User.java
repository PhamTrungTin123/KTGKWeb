package BT1_3;

public class User {
	 private String firstName;
	   private String lastName;
	   private String email;
	   private String password;
	   private boolean female;
	   private int yearOfBirth;
	   private String industry;
	   private String jobTitle;
	   private String company;
	   private String city;
	   private String telephone;
	   private String[] favorites;
	   private String desiredPlatform;


	   public User() {
	   }


	   public User(String firstName, String lastName, String email,
	         String password, boolean female, int yearOfBirth, String industry,
	         String jobTitle, String company, String city, String telephone,
	         String[] favorites, String desiredPlatform) {
	      super();
	      this.firstName = firstName;
	      this.lastName = lastName;
	      this.email = email;
	      this.password = password;
	      this.female = female;
	      this.yearOfBirth = yearOfBirth;
	      this.industry = industry;
	      this.jobTitle = jobTitle;
	      this.company = company;
	      this.city = city;
	      this.telephone = telephone;
	      this.favorites = favorites;
	      this.desiredPlatform = desiredPlatform;
	   }


	   public String getFirstName() {
	      return firstName;
	   }


	   public void setFirstName(String firstName) {
	      this.firstName = firstName;
	   }


	   public String getLastName() {
	      return lastName;
	   }


	   public void setLastName(String lastName) {
	      this.lastName = lastName;
	   }


	   public String getEmail() {
	      return email;
	   }


	   public void setEmail(String email) {
	      this.email = email;
	   }


	   public String getPassword() {
	      return password;
	   }


	   public void setPassword(String password) {
	      this.password = password;
	   }


	   public boolean isFemale() {
	      return female;
	   }


	   public void setFemale(boolean female) {
	      this.female = female;
	   }


	   public int getYearOfBirth() {
	      return yearOfBirth;
	   }


	   public void setYearOfBirth(int yearOfBirth) {
	      this.yearOfBirth = yearOfBirth;
	   }


	   public String getIndustry() {
	      return industry;
	   }


	   public void setIndustry(String industry) {
	      this.industry = industry;
	   }


	   public String getJobTitle() {
	      return jobTitle;
	   }


	   public void setJobTitle(String jobTitle) {
	      this.jobTitle = jobTitle;
	   }


	   public String getCompany() {
	      return company;
	   }


	   public void setCompany(String company) {
	      this.company = company;
	   }


	   public String getCity() {
	      return city;
	   }


	   public void setCity(String city) {
	      this.city = city;
	   }


	   public String getTelephone() {
	      return telephone;
	   }


	   public void setTelephone(String telephone) {
	      this.telephone = telephone;
	   }


	   public String[] getFavorites() {
	      return favorites;
	   }


	   public void setFavorites(String[] favorites) {
	      this.favorites = favorites;
	   }


	   public String getDesiredPlatform() {
	      return desiredPlatform;
	   }


	   public void setDesiredPlatform(String desiredPlatform) {
	      this.desiredPlatform = desiredPlatform;
	   }

}
