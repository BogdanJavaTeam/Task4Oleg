/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.javaTasks.Bogdan;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author elena
 */
public class SearchTest {
    
    public SearchTest() {
    }

    @Test
    public void testMinserie1() {
        System.out.println("Test 1 minserie function");
        // Arrange
        int[][] array = {{1, 0, 1, 0, 0}, 
                         {0, 0, 0, 1, 1}, 
                         {1, 1, 0, 0, 0}, 
                         {0, 1, 0, 0, 0}, 
                         {1, 1, 1, 1, 1}};
        int[] expResult = {1, 1, 0, 0, 0};
        
        // Act
        int[] result = Search.minserie(array, array.length, array[0].length);
        
        // Assert
        assertArrayEquals(expResult, result);
    }
    @Test
    public void testMinserie2() {
        System.out.println("Test 2 minserie function");
        // Arrange
        int[][] array = {{5, 8, 1, 3, 0}, 
                         {8, 9, 7, 1, 7}, 
                         {7, 5, 4, 4, 3}, 
                         {5, 6, 8, 4, 1}, 
                         {0, 6, 3, 9, 0}};
        int[] expResult = {8, 5, 3, 1, 0};
        
        // Act
        int[] result = Search.minserie(array, array.length, array[0].length);
        
        // Assert
        assertArrayEquals(expResult, result);
    }
    @Test
    public void testMinserie3() {
        System.out.println("Test 3 minserie function");
        // Arrange
        int[][] array = {{6,7,5,3,0,8,2,6}, 
                         {4,5,4,1,3,7,3,3}, 
                         {5,6,4,5,1,2,1,8}, 
                         {9,2,2,0,7,5,3,7}};
        int[] expResult = {8,7,6,6,5,3,2,0};
        
        // Act
        int[] result = Search.minserie(array, array.length, array[0].length);
        
        // Assert
        assertArrayEquals(expResult, result);
    }
    
}
