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
	private String endTime;			//Time course ends(24hr):	IE 13:55
	private courseType type;		//Type of course(full or track A/B)
	private boolean priority;		//Is course needed this semester(Default True)
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
		type = null;
		priority = true;
	}
	
	public course(String dept, String lv, String crn, String d, String stTime, String edTime, courseType typ, boolean pri) {
		department = dept;
		level = lv;
		courseNumber = crn;
		days = d;
		startTime = stTime;
		endTime = edTime;
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
	
	public courseType getType() {
		return type;
	}
	
	public boolean getPriority() {
		return priority;
	}
	//End Getters
}
