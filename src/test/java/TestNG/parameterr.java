package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterr {

        @Test
        @Parameters("Name")
        public void print(String name)
        {
            System.out.println("Name is "+name);
        }
    }

