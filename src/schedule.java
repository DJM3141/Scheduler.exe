import java.util.ArrayList;

/**
 * 
 * @author jmerc
 *
 */
public class schedule {
	// Variables
	private ArrayList<ArrayList<offerings>> daysList = new ArrayList<ArrayList<offerings>>();
	private int coursesAdded = 0;
	private double creditAmount = 0;
	private ArrayList<offerings> fillerList = new ArrayList<offerings>();
	// End Variables

	// ---------------------------------------------------------------------------------------------------------

	// Constructors
	public schedule() {
		daysList.add(new ArrayList<offerings>()); // Sunday (0)
		daysList.add(new ArrayList<offerings>()); // Monday (1)
		daysList.add(new ArrayList<offerings>()); // Tuesday (2)
		daysList.add(new ArrayList<offerings>()); // Wednesday (3)
		daysList.add(new ArrayList<offerings>()); // Thursday (4)
		daysList.add(new ArrayList<offerings>()); // Friday (5)
		daysList.add(new ArrayList<offerings>()); // Saturday (6)
		coursesAdded = 0;
		creditAmount = 0;
	}
	// End Constructors

	// ---------------------------------------------------------------------------------------------------------

	// Setters
	/**
	 * Checks for course conflicts and adds the course
	 * 
	 * @return returns false if there is a course conflict, true if course was
	 *         added without issues
	 */
	public boolean addCourseOffering(offerings offering) {
		int currentStart = offering.getStartTime();
		int currentEnd = offering.getEndTime();

		// Check for existing conflicts
		for (int day = 0; day < 7; day++)
			if (offering.getDay(day))
				for (int i = 0; i < daysList.get(day).size(); i++) {
					if (currentStart >= (daysList.get(day).get(i)).getStartTime()
							&& currentStart <= (daysList.get(day).get(i)).getEndTime())
						return false;
					else if (currentEnd >= (daysList.get(day).get(i)).getStartTime()
							&& currentEnd <= (daysList.get(day).get(i)).getEndTime())
						return false;
				}

		// Add Offering to schedule
		for (int day = 0; day < 7; day++)
			if (offering.getDay(day)) {
				if (daysList.get(day).size() == 0)
					daysList.get(day).add(offering);
				else
					for (int i = 0; i < daysList.get(day).size(); i++) {
						if (offering.getStartTime() < daysList.get(day).get(i).getStartTime()) {
							daysList.get(day).add(i, offering);
							i = daysList.get(day).size();
						} else if (i == daysList.get(day).size() - 1) {
							daysList.get(day).add(offering);
							i++;
						}
					}
			}
		creditAmount += offering.getCreditAmount();
		return true;
	}

	public boolean addFiller(offerings offering) {
		int currentStart = offering.getStartTime();
		int currentEnd = offering.getEndTime();

		// Check for existing conflicts
		for (int day = 0; day < 7; day++)
			if (offering.getDay(day))
				for (int i = 0; i < daysList.get(day).size(); i++) {
					if (currentStart >= (daysList.get(day).get(i)).getStartTime()
							&& currentStart <= (daysList.get(day).get(i)).getEndTime())
						return false;
					else if (currentEnd >= (daysList.get(day).get(i)).getStartTime()
							&& currentEnd <= (daysList.get(day).get(i)).getEndTime())
						return false;
				}

		// Add Offering to filler list
		if (fillerList.isEmpty())
			fillerList.add(offering);
		else {
			for (int index = 0; index < fillerList.size(); index++) {
				if (Integer.parseInt(offering.getLevel()) < Integer.parseInt(fillerList.get(index).getLevel())) {
						fillerList.add(index, offering);
						return true;
				}
			}
		fillerList.add(offering);
		
		}
		return true;
	}
	
	public void removeOffering(offerings offering) {
		for (int day = 0; day < 7; day++)
			if (offering.getDay(day))
				daysList.get(day).remove(offering);
	}

	public void incCourseAmount() {
		coursesAdded++;
	}

	public void setDayList(int day, ArrayList<offerings> list) {
		daysList.set(day, list);
	}

	// End Setters

	// ---------------------------------------------------------------------------------------------------------

	// Getters
	public ArrayList<offerings> getOfferingsList(int day) {
		return daysList.get(day);
	}

	public int courseAmount() {
		return coursesAdded;
	}

	public double getCreditTotal() {
		return creditAmount;
	}
	
	public ArrayList<offerings> getFillerList() {
		return fillerList;
	}
	
	// End Getters
}
