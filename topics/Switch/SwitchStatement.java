package javapedagogy;

/**
  @author(Hasan Mashrique)
  @topic(SwitchStatement)
  @title(DaysInWeek_Switch)
  @goalDescription(Construct a program that prints out the day of the week using switch statement.)
  @source()
 */
public class SwitchStatement {

    public static void main(String args[]) {
        
        /**
          @comment (We define day value for switch statement check.)
         */
        int day = 7;    // Try changing the day value to see how the switch statement works.
        
        /**
          @comment (Start of switch statement which checks the day value to switch to different cases.)
         */
        switch (day) {
            /**
              @comment (If day equals 1, then it begins execution on the next line, in this case the print statement.)
             */
            case 1:
                System.out.println("Monday");
                /**
                 @comment (After the print statement executes,break command causes execution to jump to the end of switch block. If this
                 break was missing, it would execute every case block.)
                 */
                break;

            /**
             @comment (If day equals 2, then it begins execution on the next line, in this case the print statement.)
             */
            case 2:
                System.out.println("Tuesday");
                /**
                 @comment (After the print statement executes,break command causes execution to jump to the end of switch block. If this
                  break was missing, it would execute every case block.)
                 */
                break;

            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            
             /**
              @comment (Since day equals 7, it begins executing the next line and prints out "Sunday".)
             */
            case 7:
                System.out.println("Sunday");
                /**
                  @comment (After executing, break command takes the program to the end of switch statement.)
                 */
                break;
                
             /**
              @comment (In the scenario where no cases matches for day value,the default statement is executed and it prints out "Day not
              Matched".)
             */
            default:
                System.out.println("Day not Matched");
                break;

        }
    }

}
