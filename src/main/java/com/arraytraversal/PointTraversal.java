package com.arraytraversal;

import java.util.ArrayList;

/**
 * to find step need to take to travel all coordinates.
 */
public class PointTraversal {
    /**
     * total number of step needed to travel all coordinates.
     * @param xCoordinate for X coordinates.
     * @param yCoordinate for Y coordinates.
     * @return total steps need to take to travel all coordinates.
     */
    public int coverPoint(final ArrayList<Integer> xCoordinate,
        final ArrayList<Integer> yCoordinate) {
        // to get current x and y coordinates
        int currentXCoordinate = xCoordinate.get(0);
        int currentYCoordinate = yCoordinate.get(0);
        // Step Counter
        int stepCount = 0;
        for (int indexOfXYCoordinates = 1;
             indexOfXYCoordinates < xCoordinate.size();
             indexOfXYCoordinates++) {
            // to get destination coordinate x and y.
            int distanceX = xCoordinate.get(indexOfXYCoordinates);
            int distanceY = yCoordinate.get(indexOfXYCoordinates);
            //to reach destination coordinates
            while (currentXCoordinate != distanceX
                    ||
                    currentYCoordinate != distanceY) {
                // check for x coordinate
                if (currentXCoordinate < distanceX) {
                    currentXCoordinate++;
                }   else if (currentXCoordinate > distanceX) {
                    currentXCoordinate--;
                }
                // check for y coordinate
                if (currentYCoordinate < distanceY) {
                    currentYCoordinate++;
                }   else if (currentYCoordinate > distanceY) {
                    currentYCoordinate--;
                }
                stepCount++;
            }
        }
        return stepCount;
    }
}
