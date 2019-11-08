
/**
  @author(Hasan Mashrique)
  @topic(NestedSwitchStatement)
  @title(CourseSelect_NestedSwitch)
  @goalDescription(Construct a program that uses nested switch statements to determine courses)
  @source()
 */

public class NestedSwitchStatement {

    public static void main(String[] args) {
        /**
         @comment(First,we define year and Branch value for checking nested
         switch statement.)
         */
        String branch = "CSE"; // Try different values for Branch and year to see how Nested Switch works.
        int year = 2;
        
        /**
          @comment(Start of switch statement which checks the year value and
          switches to different cases if matches.)
         */
        switch (year) {
            /**
             @comment(If year equals 1, then it begins execution on the next
             line, in this case the print statement.)
             */
            case 1:
                System.out.println("elective courses : Advance english, Algebra");
                /**
                 @comment( After the print statement executes,break command causes execution to jump to the end of switch block. If this
                  break was missing, it would execute every case block.)
                 */
                break;
                
            case 2:
                switch (branch) 
                    /**
                   @comment(Since year value equals 2, Nested switch
                    statement starts executing.)
                    */
                {
                    /**
                     @comment(If Branch matches any case, then it begins
                      execution on the next line..)
                     */
                    case "CSE":
                        System.out.println("elective courses : Machine Learning, Big Data");
                        /**
                          @comment( After the print statement executes,break command causes execution to jump to the end of switch block.
                         If this break was missing, it would execute every case block.)
                         */
                        break;

                    case "ECE":
                        System.out.println("elective courses : Antenna Engineering");
                        break;
                    /**
                     @comment(In the scenario where no cases matches for Branch value, the default statement is executed and it
                       prints out "Elective courses : Optimization".)
                     */
                    default:
                        System.out.println("Elective courses : Optimization");
                }
        }
    }
}
