import java.util.ArrayList;

/**
 * 
 * @author jmerc
 *
 */
public class scheduler {
	// Variables
	ArrayList<schedule> schedules = new ArrayList<schedule>();
	ArrayList<course> priorityList = new ArrayList<course>();
	ArrayList<course> sortedPriorityList = new ArrayList<course>();
	ArrayList<course> fillerList = new ArrayList<course>();
	// End Variables

	// ---------------------------------------------------------------------------------------------------------

	// Constructors
	public scheduler(ArrayList<course> courses) {
		for (int i = 0; i < courses.size(); i++) {
			if (courses.get(i).getPriority())
				priorityList.add(courses.get(i));
			else
				fillerList.add(courses.get(i));
		}
	}
	// End Constructors

	// ---------------------------------------------------------------------------------------------------------

	// Methods
	/**
	 * Returns an empty list if there is a conflict preventing a class
	 * 
	 * @return schedule list
	 */
	public ArrayList<schedule> createSchedules() {
		sortByOfferings();
		constructPriorityBase();
		addFillers();
		return schedules;
	}

	/**
	 * 
	 * @return false if user selected credits is less than credits required by
	 *         sum of priority classes
	 */
	public boolean checkCreditCap(double userCredits) {
		double creditSum = 0;

		for (int i = 0; i < priorityList.size(); i++)
			creditSum += priorityList.get(i).getCreditAmount();

		if (userCredits < creditSum)
			return false;
		else
			return true;
	}
	// End Methods

	// ---------------------------------------------------------------------------------------------------------

	// Helpers
	private int minOfferingAmount() {
		int minAmount = priorityList.get(0).amountOfOfferings();
		for (int i = 0; i < priorityList.size(); i++)
			if (priorityList.get(i).amountOfOfferings() < minAmount)
				minAmount = priorityList.get(i).amountOfOfferings();

		return minAmount;
	}

	private void sortByOfferings() {
		int min = minOfferingAmount();
		while (sortedPriorityList.size() != priorityList.size()) {
			for (int i = 0; i < priorityList.size(); i++)
				if (priorityList.get(i).amountOfOfferings() == min)
					sortedPriorityList.add(priorityList.get(i));
			min++;
		}
	}

	/**
	 * 
	 * @return true if at least one schedule could be created, otherwise false
	 */
	private boolean constructPriorityBase() {
		boolean valid = true;
		int scheduleIndex = -1;

		while (valid) {
			schedules.add(new schedule());
			scheduleIndex++;

			for (int courseIndex = 0; courseIndex < sortedPriorityList.size(); courseIndex++) {
				if (!(schedules.get(scheduleIndex).addCourseOffering(sortedPriorityList.get(courseIndex)
						.getOffering(sortedPriorityList.get(courseIndex).getIndex())))) {
					if (courseIndex == 0 && sortedPriorityList.get(courseIndex).indexIsLast())
						valid = false;
					
					else if (sortedPriorityList.get(courseIndex).indexIsLast()) {
						while (sortedPriorityList.get(courseIndex).indexIsLast() && courseIndex != 0) {
							sortedPriorityList.get(courseIndex).incIndex();
							courseIndex--;
						}
						if (courseIndex != 0)
							sortedPriorityList.get(courseIndex).incIndex();	
					}
					
					else {
						sortedPriorityList.get(courseIndex).incIndex();
						courseIndex--;
					}

				}
				else if (sortedPriorityList.get(0).indexIsLast())
					valid = false;
			}
		}
		if (schedules.isEmpty())
			return false;
		else
			return true;
	}

	private void addFillers() {

	}
	// End Helpers
}
