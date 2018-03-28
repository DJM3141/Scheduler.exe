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
		boolean incomplete = false;
		int scheduleIndex = -1;

		while (valid) {
			valid = false; // Ends while loop if unchanged
			schedules.add(new schedule()); // Adds new schedule
			scheduleIndex++;
			// Loops until all courses have one offering in schedule.
			for (int courseIndex = 0; courseIndex < sortedPriorityList.size(); courseIndex++) {

				// Checks if course offering can be added, moves on if true
				if (!(schedules.get(scheduleIndex).addCourseOffering(sortedPriorityList.get(courseIndex)
						.getOffering(sortedPriorityList.get(courseIndex).getIndex())))) {
					// Checks if all offerings of a course have been tried and
					// rolls back to last course's next offering
					// Checks how far to roll back
					while (sortedPriorityList.get(courseIndex).indexIsLast() && courseIndex != 0) {
						sortedPriorityList.get(courseIndex).incIndex();
						courseIndex--;
					}

					if (courseIndex == 0 && sortedPriorityList.get(0).indexIsLast()
							&& schedules.get(scheduleIndex).courseAmount() != sortedPriorityList.size()) {
						schedules.remove(scheduleIndex);
						courseIndex = sortedPriorityList.size(); // End Loop
						incomplete = true;
					}

					// Moves on to next offering in current course and tries
					// again
					if (!(sortedPriorityList.get(courseIndex).indexIsLast())) {
						sortedPriorityList.get(courseIndex).incIndex();
					}
					courseIndex--;
				} else {
					schedules.get(scheduleIndex).incCourseAmount();
				}

			}

			// Checks if all courses have reached the end of offering list
			if (!(incomplete)) {
				for (int courseIndex = 0; courseIndex < sortedPriorityList.size(); courseIndex++)
					// Resumes while loop if there are still offerings to try
					// adding to create a new schedule
					if (!(sortedPriorityList.get(courseIndex).indexIsLast()))
						valid = true;

				if (valid) {
					int courseIndex = (sortedPriorityList.size() - 1);
					if (sortedPriorityList.get(courseIndex).indexIsLast()) {
						// Checks how far to roll back
						while (sortedPriorityList.get(courseIndex).indexIsLast() && courseIndex != 0) {
							sortedPriorityList.get(courseIndex).incIndex();
							courseIndex--;
						}
						sortedPriorityList.get(courseIndex).incIndex();
					}
					// Increments to next offering of course
					else if (courseIndex != 0) {
						sortedPriorityList.get(courseIndex).incIndex();
						courseIndex = 0;
					}
				}
			}
		}

		if (schedules.isEmpty())
			return false;
		else
			return true;
	}

	private void addFillers() {
		// To Do
	}
	// End Helpers
}
