package com.vinziev;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public static void permute(List<Integer> in, List<List<Integer>> out) {
        permuteInternal(in, out, 0);
    }

    private static void permuteInternal(List<Integer> in, List<List<Integer>> out, int idxStart) {
        if (idxStart == in.size() - 1) {
            out.add(in);
            return;
        }
        for (int i = idxStart; i < in.size(); i++) {
            List<Integer> next = swap(in, idxStart, i);
            permuteInternal(next, out, idxStart + 1);
        }
    }

    private static List<Integer> swap(List<Integer> list, int from, int to) {
        List<Integer> newList = new ArrayList<>(list);
        int tmp = newList.get(from);
        newList.set(from, newList.get(to));
        newList.set(to, tmp);
        return newList;
    }
}
