package io.mosscloud.codility;

import java.util.Random;

public class Solution {

    public int solution(int[] A) {
        int lowestPositive = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= lowestPositive){
                lowestPositive = A[i] +1;

            }
        }
        return lowestPositive;
    }

}


