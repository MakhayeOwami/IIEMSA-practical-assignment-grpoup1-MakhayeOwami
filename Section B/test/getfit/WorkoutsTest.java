/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package getfit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class WorkoutsTest {
    
    public WorkoutsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDate method, of class Workouts.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Workouts instance = null;
        String expResult = "";
        String result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuration method, of class Workouts.
     */
    @Test
    public void testGetDuration() {
        System.out.println("getDuration");
        Workouts instance = null;
        int expResult = 0;
        int result = instance.getDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateCaloriesBurned method, of class Workouts.
     */
    @Test
    public void testCalculateCaloriesBurned() {
        System.out.println("calculateCaloriesBurned");
        Workouts instance = null;
        int expResult = 0;
        int result = instance.calculateCaloriesBurned();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWorkoutType method, of class Workouts.
     */
    @Test
    public void testGetWorkoutType() {
        System.out.println("getWorkoutType");
        Workouts instance = null;
        String expResult = "";
        String result = instance.getWorkoutType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Workouts.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Workouts instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class WorkoutsImpl extends Workouts {

        public WorkoutsImpl() {
            super("", 0);
        }

        public int calculateCaloriesBurned() {
            return 0;
        }

        public String getWorkoutType() {
            return "";
        }
    }
    
}
