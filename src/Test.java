import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<course> testCourseList1 = new ArrayList<course>();
		ArrayList<Boolean> days = new ArrayList<Boolean>();
		ArrayList<schedule> testSchedules = new ArrayList<schedule>();

		for (int i = 0; i < 7; i++)
			days.add(false);
		
		// CS 3331
		days.set(0, false);
		days.set(1, true);
		days.set(2, false);
		days.set(3, true);
		days.set(4, false);
		days.set(5, false);
		days.set(6, false);
		testCourseList1.add(new course("CS", "3331", 3, true));
		testCourseList1.get(0).addOffering("82775", 1635, 1750, courseType.FULL, days);

		// CS 3421
		days.set(0, false);
		days.set(1, true);
		days.set(2, false);
		days.set(3, true);
		days.set(4, false);
		days.set(5, true);
		days.set(6, false);
		testCourseList1.add(new course("CS", "3421", 3, true));
		testCourseList1.get(1).addOffering("83288", 1005, 1055, courseType.FULL, days);

		// CS 3000
		days.set(0, false);
		days.set(1, true);
		days.set(2, false);
		days.set(3, true);
		days.set(4, false);
		days.set(5, false);
		days.set(6, false);
		testCourseList1.add(new course("CS", "3000", 2, true));
		testCourseList1.get(2).addOffering("82562", 1205, 1255, courseType.FULL, days);
	
		// CS 3425
		days.set(0, false);
		days.set(1, false);
		days.set(2, true);
		days.set(3, false);
		days.set(4, true);
		days.set(5, false);
		days.set(6, false);
		testCourseList1.add(new course("CS", "3425", 3, true));
		testCourseList1.get(3).addOffering("83476", 1405, 1520, courseType.FULL, days);
		testCourseList1.get(3).addOffering("85907", 1605, 1720, courseType.FULL, days);

		// CS 3513
		days.set(0, false);
		days.set(1, false);
		days.set(2, true);
		days.set(3, false);
		days.set(4, true);
		days.set(5, false);
		days.set(6, false);
		testCourseList1.add(new course("CS", "3513", 3, true));
		testCourseList1.get(4).addOffering("84907", 1105, 1220, courseType.FULL, days);
		testCourseList1.get(4).addOffering("85907", 1605, 1720, courseType.FULL, days);
		testCourseList1.get(4).addOffering("84721", 905, 920, courseType.FULL, days);

		scheduler testScheduler = new scheduler(testCourseList1);
		testSchedules = testScheduler.createSchedules();
		
		//Test Print
		for (int scheduleNumber = 0; scheduleNumber < testSchedules.size(); scheduleNumber++) {
			System.out.println("Schedule " + (scheduleNumber + 1));
			for (int day = 0; day < 7; day++) {
				if (day == 0)
					System.out.println("Sunday");
				else if (day == 1)
					System.out.println("Monday");
				else if (day == 2)
					System.out.println("Tuesday");
				else if (day == 3)
					System.out.println("Wednesday");
				else if (day == 4)
					System.out.println("Thursday");
				else if (day == 5)
					System.out.println("Friday");
				else if (day == 6)
					System.out.println("Saturday");
				for (int j = 0; j < testSchedules.get(scheduleNumber).getOfferingsList(day).size(); j++)
					System.out.println(testSchedules.get(scheduleNumber).getOfferingsList(day).get(j).getLevel() + "      "
							+ testSchedules.get(scheduleNumber).getOfferingsList(day).get(j).getStartTime() + " - "
							+ testSchedules.get(scheduleNumber).getOfferingsList(day).get(j).getEndTime());
				System.out.println();
			}
		}
	}
}
