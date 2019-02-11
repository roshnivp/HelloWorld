package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class EvaluateDivision {
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        HashMap<String, ArrayList<String>> pairs = new HashMap<>();
        HashMap<String, ArrayList<Double>> valuesPair = new HashMap<>();
        for (int i = 0; i < equations.length; i++) {
            String[] equation = equations[i];
            if (!pairs.containsKey(equation[0])) {
                pairs.put(equation[0], new ArrayList<>());
                valuesPair.put(equation[0], new ArrayList<>());
            }
            if (!pairs.containsKey(equation[1])) {
                pairs.put(equation[1], new ArrayList<>());
                valuesPair.put(equation[1], new ArrayList<>());
            }
            pairs.get(equation[0]).add(equation[1]);
            pairs.get(equation[1]).add(equation[0]);
            valuesPair.get(equation[0]).add(values[i]);
            valuesPair.get(equation[1]).add(1/values[i]);
        }

        double[] result = new double[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String[] query = queries[i];
            result[i] = dfs(query[0], query[1], pairs, valuesPair, new HashSet<>(), 1.0);
            if (result[i] == 0.0) result[i] = -1.0;
        }
        return result;
    }

    private double dfs(String start, String end, HashMap<String, ArrayList<String>> pairs, HashMap<String, ArrayList<Double>> values, HashSet<String> set, double value) {
        if (set.contains(start)) return 0.0; //already visited,return
        if (!pairs.containsKey(start)) return 0.0; //new element,return
        if (start.equals(end)) return value;//reaches the destination
        set.add(start);//mark as visited,no need to consider this again

        ArrayList<String> strList = pairs.get(start);
        ArrayList<Double> valueList = values.get(start);
        double tmp = 0.0;
        for (int i = 0; i < strList.size(); i++) {
            tmp = dfs(strList.get(i), end, pairs, values, set, value*valueList.get(i));
            if (tmp != 0.0) {
                break;
            }
        }
        set.remove(start);
        return tmp;
    }

    public static void main(String[] args){
        EvaluateDivision ed = new EvaluateDivision();
        String[][] equations = new String[][]{{"a","b"},{"b","c"}};
        double[] values = new double[]{2.0, 3.0};
        String[][] queries = new String[][]{{"a", "c"},{"b", "a"},{"a", "e"},{"a", "a"},{"x", "x"},{"c", "b"}};
        System.out.println(Arrays.toString(ed.calcEquation(equations,values,queries)));


    }
}
