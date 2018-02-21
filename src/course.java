/**
 * Course object
 * @author jmerc
 *
 */

public class course {
	
	//Variables
	private String department;		//Course department: IE CS
	private String level;			//Course level: IE 3141
	private String courseNumber;	//Course Number: IE 14046
	private String days;			//Day(s) course occurs(MTWRF): IE MWF
	private String startTime;		//Time course begins(24hr): IE 13:05
	private String endTime;			//Time course ends(24hr): IE 13:55
	private int creditAmount;		//Course credit value: IE 3
	private courseType type;		//Type of course(full or track A/B)
	private boolean priority;		//Is course needed this semester(Default False)
	//End Variables
	
	//---------------------------------------------------------------------------------------------------------
	
	//Constructors
	public course() {
		department = null;
		level = null;
		courseNumber = null;
		days = null;
		startTime = null;
		endTime = null;
		creditAmount = 0;
		type = null;
		priority = false;
	}
	
	public course(String dept, String lv, String crn, String d, String stTime, String edTime, int credAmt, courseType typ, boolean pri) {
		department = dept;
		level = lv;
		courseNumber = crn;
		days = d;
		startTime = stTime;
		endTime = edTime;
		creditAmount = credAmt;
		type = typ;
		priority = pri;
	}
	//End Constructors
	
	//---------------------------------------------------------------------------------------------------------
	
	//Setters
	public void setDepartment(String dept) {
		department = dept;
	}
	
	public void setLevel(String lv) {
		level = lv;
	}
	
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
	
	public void setCreditAmount(String credAmt) {
		creditAmount = Integer.parseInt(credAmt);
	}
	
	public void setCreditAmount(int credAmt) {
		creditAmount = credAmt;
	}
	
	public void setType(courseType typ) {
		type = typ;
	}
	
	public void setPriority(boolean pri) {
		priority = pri;
	}
	//End Setters
	
	//---------------------------------------------------------------------------------------------------------
	
	//Getters
	public String getDepartment() {
		return department;
	}
	
	public String getLevel() {
		return level;
	}
	
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
	
	public int getCreditAmount() {
		return creditAmount;
	}
	
	public courseType getType() {
		return type;
	}
	
	public boolean getPriority() {
		return priority;
	}
	//End Getters
}
