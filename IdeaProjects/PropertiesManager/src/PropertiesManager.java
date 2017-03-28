/**
 * Created by abumbu on 3/27/2017.
 * Prints out all sys properties
 */

import java.util.Hashtable;
import java.util.Properties;

public class PropertiesManager {
    public static void main (String[] args) {
        Properties myProperties = new Properties();
        myProperties.setProperty("new_property1", "new_value1");

        System.out.println(myProperties.getProperty("new_property1"));

        if (args.length == 0) {System.exit(0);}
        Properties props = System.getProperties();
            /* New property example*/



            props.setProperty("new_property2", "new_value2");
            switch (args[0]) {
                case "-list_all":
                    props.list(System.out); //Lists all properties
                    break;
                case "-list_prop":
                    /* Lists value */
                    System.out.println(props.getProperty(args[1]));
                    break;
                default:
                    System.out.println("Usage: java PropertiesManager [-list_all]");
                    System.out.println("       java PropertiesManager [-list_prop [property]]");
                    break;
            }
    }
}
