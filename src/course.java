import java.util.ArrayList;

/**
 * Course object
 */

public class course {
	
	//Variables
	private String department;			//Course department: IE CS
	private String level;				//Course level: IE 3141
	private double creditAmount;		//Course credit value: IE 3
	private boolean priority;			//Is course needed this semester(Default False)
	private ArrayList<offerings> offeringsList = new ArrayList<offerings>();	//List of course offerings
	
	private int scheduleIndex;			//Used in the scheduling process to track offering location
	//End Variables
	
	//---------------------------------------------------------------------------------------------------------
	
	//Constructors
	public course() {
		department = null;
		level = null;
		creditAmount = 0;
		priority = false;
		scheduleIndex = 0;
	}
	
	public course(String dept, String lv, double credAmt, boolean pri) {
		department = dept;
		level = lv;
		creditAmount = credAmt;
		priority = pri;
		scheduleIndex = 0;
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
	
	public void addOffering() {
		offeringsList.add(new offerings());
	}
	
	public void addOffering(String CourseNumber, int startTime, int endTime, courseType Type, ArrayList<Boolean> Days) {
		offeringsList.add(new offerings(CourseNumber, startTime, endTime, Type, Days, department, level, creditAmount, priority));
	}
	
	public void setCreditAmount(String credAmt) {
		creditAmount = Double.parseDouble(credAmt);
	}
	
	public void setCreditAmount(double credAmt) {
		creditAmount = credAmt;
	}
	
	public void setPriority(boolean pri) {
		priority = pri;
	}
	
	public void incIndex() {
		if (scheduleIndex == offeringsList.size() - 1)
			scheduleIndex = 0;
		else
			scheduleIndex++;
		
	}
	
	public void resetIndex() {
		scheduleIndex = 0;
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
	
	public double getCreditAmount() {
		return creditAmount;
	}
	
	public boolean getPriority() {
		return priority;
	}
	
	public int amountOfOfferings() {
		return offeringsList.size();
	}
	
	/**
	 * returns the offering at index offering
	 * @param offering
	 * @return
	 */
	public offerings getOffering(int offering) {
		return offeringsList.get(offering);
	}
	
	public ArrayList<offerings> getOfferings() {
		return offeringsList;
	}
	
	public int getIndex() {
		return scheduleIndex;
	}
	
	public boolean indexIsLast() {
		if (scheduleIndex == offeringsList.size() - 1)
			return true;
		else
			return false;
	}
	//End Getters
}
