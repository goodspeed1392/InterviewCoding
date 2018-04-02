package com.denis.interview.algorithms.sorting.sortingalgorithms.combsort;


import com.denis.interview.algorithms.sorting.sortingalgorithms.sortingalgorithm.SortingAlgorithm;
import com.denis.interview.algorithms.sorting.enums.AlgorithmNames;

public class CombSortingAlgorithm implements SortingAlgorithm {

    @Override
    public void sort(int[] array) {
        combSort(array);
    }

    @Override
    public String getName() {
        return AlgorithmNames.COMB_SORT.getValue();
    }


    private void combSort(int[] array) {

        boolean changed = true;
        double SHRINK_FACTOR = 1.3;
        int gap = (int) (array.length / SHRINK_FACTOR);

        while (changed || gap > 1) {

            changed = false;

            for (int i = 0; i < array.length - gap; i++) {

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
        int temp = array[bIndex];
        array[bIndex] = array[aIndex];
        array[aIndex] = temp;
    }

}
