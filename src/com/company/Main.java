package com.company;

import java.util.*;

class Solution {

    public static void main(String[] args) {
        //int[] input = {-10000, -5, 2, 2, 2, 1, 20, 2_000_000_000};
        //int[] input = {-1, -100, 0, 1, 2, 2, 1, -10, 3};
        int[] input = {1,2,3};
        int res = new Solution().solution(input);
    }

    //final int arrMaxLength = 100_000;
    final int maxValue = 1_000_000_000;

    public int solution(int[] A) {
//        Arrays.stream(A)
//                .boxed()
//                .collect(Collectors.toList());

        Arrays.sort(A);

        int a = 1;
        int v0 = 0;
        for (int i = 0; i < A.length; i++) {
            int v = A[i];
            if (v < 1 || v > maxValue || v<-maxValue) {
                v0 = v;
                continue;
            }
            if (v > a)
                return a;
            if (v == v0)
                continue;
            a++;
            v0 = v;
        }

        return a;

//        int rBound = 0;
//        Set<Integer> set = new HashSet<>();
//        int length = Math.min(A.length, arrMaxLength);
//        for (int i = 0; i < length; i++) {
//            int v = A[i];
//            if (v < 1 || v > maxValue || v<-maxValue)
//                continue;
//            set.add(v);
//            if (v > rBound)
//                rBound = v;
//        }
//
//        int res = IntStream.range(1, rBound+2)
//                .filter(e -> !set.stream()
//                        .filter(a -> a == e)
//                        .findAny()
//                        .isPresent()
//                ).findFirst()
//                .getAsInt();
    }
}


//https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
//
//    This is a demo task.
//
//                           Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//        Given A = [1, 2, 3], the function should return 4.
//
//        Given A = [−1, −3], the function should return 1.
//
//        Write an efficient algorithm for the following assumptions:
//
//        N is an integer within the range [1..100,000];
//        each element of array A is an integer within the range [−1,000,000..1,000,000].
