# Scheduler.exe
Overview: Scheduler will take user inputted courses with any number of offerings and create all possible schedules with the given course list that considers priority courses, user credit preference, and user time preferences.


  1) Run draftInterface and click add new course
  
  2)The first interface displays a very brrief description of our project and our names as developers. The user should hit the "New" button to start creating a new instance.
  3) Enter in information for course
    A) Course Department  (Ex. CS, MA, PH, ect.)
    B) Course Level       (Ex. 3141, 2770, 3220, ect.)
    C) Credit Amount      (Ex. 3, 2, 1, 0.5, ect.)
    D) Priority           (Check to make course a priority)
    If the text fields are left blank, nothing will occur.
    Once the user hits submit, it will open up an offerings interface to attach to the current course. Or they can see all current classes they have currenlty added, which will open up the load interface.
    
  
    
 4) Click submit and enter in information for offering
    A) Course Number      (Ex. 37452, 71625, ect.)
    B) Click the check boxes for each day of the week the course is offered.
    C) Start Time         (Ex. 0900, 1400, 1530 ect.)
    D) End Time           (Ex. 1000, 1455, 1600 ect.)
    E) Type               (Select if course is full semester or track A/B)
  5) Submit offering, which will then clear the text fields,and repeat step 3 until all offerings for course are entered.
  6) add course and repeat steps 2-4 until all courses are added.
  7) Click See current classes to open the load interface.
  
  The add button returns you back to step 2.
  The save button saves the current classes as a text file called "class list"
  The display button brings up a interface to enter a set amount of max credits that is desired.
  
  8) upon entering the max credits desired, the user will hit continue and it will bring up a window in print interface of the sorted 
  schedules. The program also created a text file called "Finalized class list"
  
  9) the finalized class list contains all the schedules of prioritzed classes, with any possible filler classes that will fit into the schedule, along with a list of the CRNS in a row for easy upload to banweb.
