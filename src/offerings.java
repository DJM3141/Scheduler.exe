
public class offerings extends course{
	//Variables
	private String courseNumber;	//Course Number: IE 14046
	private String days;			//Day(s) course occurs(MTWRF): IE MWF
	private String startTime;		//Time course begins(24hr): IE 1305
	private String endTime;			//Time course ends(24hr): IE 1355
	private courseType type;		//Type of course(full or track A/B)
	//End Variables
	
	//---------------------------------------------------------------------------------------------------------
		
	//Constructors
	public offerings() {
		courseNumber = null;
		days = null;
		startTime = null;
		endTime = null;
		type = null;
	}
	
	public offerings(String crn, String d, String stTime, String edTime, courseType typ) {
		courseNumber = crn;
		days = d;
		startTime = stTime;
		endTime = edTime;
		type = typ;
	}
	//End Constructors
	
	//---------------------------------------------------------------------------------------------------------
		
	//Setters
	public void setCourseNumber(String crn) {
		courseNumber = crn;
	}
	
	public void setDays(String d) {
		days = d;
	}
	
	public void setStartTime(String stTime) {
		startTime = stTime;
	}
	
	public void setEndTime(String edTime) {
		endTime = edTime;
	}
	
	public void setType(courseType typ) {
		type = typ;
	}
	//End Setters
	
	//---------------------------------------------------------------------------------------------------------
		
	//Getters
	public String getCourseNumber() {
		return courseNumber;
	}
	
	public String getDays() {
		return days;
	}
	
	public String getStartTime() {
		return startTime;
	}
	
	public String getEndTime() {
		return endTime;
	}
	
	public courseType getType() {
		return type;
	}
}
