import java.util.ArrayList;

/**
 * Course object
 * @author jmerc
 *
 */

public class course {
	
	//Variables
	private String department;		//Course department: IE CS
	private String level;			//Course level: IE 3141
	private int creditAmount;		//Course credit value: IE 3
	private boolean priority;		//Is course needed this semester(Default False)
	private ArrayList<offerings> offeringsList = new ArrayList<offerings>();	//List of course offerings
	//End Variables
	
	//---------------------------------------------------------------------------------------------------------
	
	//Constructors
	public course() {
		department = null;
		level = null;
		creditAmount = 0;
		priority = false;
	}
	
	public course(String dept, String lv, int credAmt, boolean pri) {
		department = dept;
		level = lv;
		creditAmount = credAmt;
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
	
	public void addOffering() {
		offeringsList.add(new offerings());
	}
	
	public void setCreditAmount(String credAmt) {
		creditAmount = Integer.parseInt(credAmt);
	}
	
	public void setCreditAmount(int credAmt) {
		creditAmount = credAmt;
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
	
	public int getCreditAmount() {
		return creditAmount;
	}
	
	public boolean getPriority() {
		return priority;
	}
	//End Getters
}
