package se.lexicon.mark;
import se.lexicon.mark.Employee.*;
import se.lexicon.mark.SystemDeveloper.*;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Employee management" );

        SystemDeveloper systemDeveloper = new SystemDeveloper("Mark", 25000, "1");
        System.out.println(systemDeveloper.getNameprivate() + "\n" + systemDeveloper.getSalary() );
        System.out.println(systemDeveloper.getId() + "\n" + systemDeveloper.getDateHired());


            }
}
