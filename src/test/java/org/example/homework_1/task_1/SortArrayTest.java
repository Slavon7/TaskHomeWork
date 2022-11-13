package org.example.homework_1.task_1;

import org.example.homework_1.task_1.SortArray;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayTest {

    @org.junit.jupiter.api.Test
    public void sortArray() throws Exception {

        int N = 3;
        int[] resultArray = {0, 2, 4, -6};
        int actual = SortArray.sortArray(resultArray);

        assertEquals(resultArray[N-1],actual);

    }
}