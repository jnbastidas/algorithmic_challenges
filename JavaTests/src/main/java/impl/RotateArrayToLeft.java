/**
 A left rotation operation on an array shifts each of the array's elements 1 unit to the left.
 For example, if  left rotations are performed on array [1, 2, 3, 4, 5], then the array would become [3, 4, 5, 1, 2].
 Note that the lowest index item moves to the highest index in a rotation. This is called a circular array.

 Given an array A of N integers and a number, D, perform D left rotations on the array.
 Return the updated array to be printed as a single line of space-separated integers.
 */
package impl;

import java.util.ArrayList;
import java.util.List;

public class RotateArrayToLeft {
    public List<Integer> solution(final List<Integer> a, final int d) {
        final int finalD = d%a.size();

        final List<Integer> rdo = new ArrayList<>(a.size());
        for (int i = 0; i < a.size(); i++) {
            int findPos = i + finalD;
            findPos = findPos >= a.size() ? findPos - a.size() : findPos;
            rdo.add(i, a.get(findPos));
        }

        return rdo;
    }
}
