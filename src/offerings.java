import java.util.ArrayList;

public class offerings extends course{
	//Variables
	private String courseNumber;		//Course Number: IE 14046
	private String startTime;			//Time course begins(24hr): IE 1305
	private String endTime;				//Time course ends(24hr): IE 1355
	private courseType type;			//Type of course(full or track A/B)
	
	//List of days the course runs, index 0 = Sunday, continues in chronological order. True = ran on this day.
	private ArrayList<Boolean> days = new ArrayList<Boolean>(6);
	//End Variables
	
	//---------------------------------------------------------------------------------------------------------
		
	//Constructors
	public offerings() {
		courseNumber = null;
		startTime = null;
		endTime = null;
		type = null;
	}
	//End Constructors
	
	//---------------------------------------------------------------------------------------------------------
		
	//Setters
	public void setCourseNumber(String crn) {
		courseNumber = crn;
	}
	
	/**
	 * @param day
	 * Changes the selected day index to true.
	 */
	public void addDay(int day) {
		days.set(day, true);
	}
	
	/**
	 * @param day
	 * Changes the selected day index to false.
	 */
	public void removeDay(int day) {
		days.set(day, false);
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
	
	/**
	 * @return day value
	 * Retrieve the day's value
	 */
	public boolean getDay(int day) {
		return days.get(day);
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
