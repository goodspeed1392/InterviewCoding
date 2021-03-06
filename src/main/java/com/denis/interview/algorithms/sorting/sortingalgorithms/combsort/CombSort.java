package com.denis.interview.algorithms.sorting.sortingalgorithms.combsort;

import com.denis.interview.algorithms.sorting.enums.SortingAlgorithmNames;
import com.denis.interview.algorithms.sorting.sortingalgorithms.sortingalgorithm.SortingAlgorithm;

public class CombSort implements SortingAlgorithm {

    @Override
    public String getName() {
        return SortingAlgorithmNames.COMB_SORT.getValue();
    }

    @Override
    public void sort(int[] array) {

        var changed = true;
        var SHRINK_FACTOR = 1.3;
        var gap = (int) (array.length / SHRINK_FACTOR);

        while (changed || gap > 1) {

            changed = false;

            for (var i = 0; i < array.length - gap; i++) {

                if (array[i] > array[i + gap]) {
                    swap(i, i + gap, array);
                    changed = true;
                }
            }

            gap = (int) (gap / SHRINK_FACTOR);

            if (gap < 1) {
                gap = 1;
            }
        }
    }

    private void swap(int aIndex, int bIndex, int[] array) {
        var temp = array[bIndex];
        array[bIndex] = array[aIndex];
        array[aIndex] = temp;
    }

}
