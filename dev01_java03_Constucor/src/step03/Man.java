package step03;

public class Man {
   private String name;
   private String gender;
   private String job;
   private String tell;
   
   Man(){
//	   this.name = "아무개";
//	   this.gender = "남자";
//	   this.job = "백수";
//	   this.tell = null;
	   
	   this.setName("아무개");
	   this.setGender("남자");
	   this.setJob("백수");
	   this.setTell(null);
	   
   }
   Man(String name){
	   this();
	   this.setName(name);
   }
   Man(String name, String gender){
	   this(name);
	   this.setGender(gender);
   }
   Man(String name, String gender, String job){
	   this(name, gender);
	   this.setJob(job);
   }
   Man(String name, String gender, String job, String tell){
	   this(name, gender,job);
	   this.setTell(tell);
   }
   
   
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getGender() {
      return gender;
   }
   public void setGender(String gender) {
      this.gender = gender;
   }
   public String getJob() {
      return job;
   }
   public void setJob(String job) {
      this.job = job;
   }
   public String getTell() {
      return tell;
   }
   public void setTell(String tell) {
      this.tell = tell;
   }
   @Override
   public String toString() {
      return "Man [name=" + name + ", gender=" + gender + ", job=" + job + ", tell=" + tell + "]";
   }
}