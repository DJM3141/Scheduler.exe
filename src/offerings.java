import java.util.ArrayList;

public class offerings extends course{
	//Variables
	private String courseNumber;		//Course Number: IE 14046
	private int startTime;				//Time course begins(24hr): IE 1305
	private int endTime;				//Time course ends(24hr): IE 1355
	private courseType type;			//Type of course(full or track A/B)
	
	//List of days the course runs, index 0 = Sunday, continues in chronological order. True = ran on this day.
	private ArrayList<Boolean> days = new ArrayList<Boolean>();
	//End Variables
	
	//---------------------------------------------------------------------------------------------------------
		
	//Constructors
	public offerings() {
		super();
		courseNumber = null;
		startTime = 0;
		endTime = 0;
		type = null;
	}
	
	public offerings(String CourseNumber, int StartTime, int EndTime, courseType Type, ArrayList<Boolean> Days, String dept, String lv, double credAmt, boolean pri) {
		super(dept, lv, credAmt, pri);
		courseNumber = CourseNumber;
		startTime = StartTime;
		endTime = EndTime;
		type = Type;
		
		for (int i = 0; i < 7; i++)
			days.add(Days.get(i));
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
		startTime = Integer.parseInt(stTime);
	}
	
	public void setStartTime(int stTime) {
		startTime = stTime;
	}
	
	public void setEndTime(String edTime) {
		endTime = Integer.parseInt(edTime);
	}
	
	public void setEndTime(int edTime) {
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
	
	public int getStartTime() {
		return startTime;
	}
	
	public int getEndTime() {
		return endTime;
	}
	
	public courseType getType() {
		return type;
	}
	
	// Used to Print out the Days of the offering
	public String printDays(){
		String temp = "";
		for (int i = 0; i < days.size(); i++) {
			boolean cur = days.get(i);
			if (cur == true) {
				if ( i == 0 ) {
					temp = temp + "Sunday ";
				} else if ( i == 1 ) {
					temp = temp + "Monday ";
				} else if ( i == 2 ) {
					temp = temp + "Tuesday ";
				} else if ( i == 3 ) {
					temp = temp + "Wednesday ";
				} else if ( i == 4 ) {
					temp = temp + "Thursday ";
				} else if ( i == 5 ) {
					temp = temp + "Friday ";
				} else if ( i == 6 ) {
					temp = temp + "Saturday ";
				}
			}
		}
		return temp;
	}
}
