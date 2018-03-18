package Graph;

/**
 * Created by vyompv on 8/28/2016.
 */

import java.io.*;
import java.util.*;

/**
 * Created by ashwiniambre on 5/24/16.
 */
public class GraphApp {
    static Map<Integer, Set<Integer>> myGraph;
    GraphApp(){
        myGraph = new HashMap<>();
    }

    public static void main(String args[]) throws FileNotFoundException{
        try{
            //File file = new File(args[0]);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while ((line = br.readLine()) != null){
                line.trim();
                if(line.length() >= 7) {
                    process(line);
                }
            }
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void process(String line){
        String strLine[] = new String[4];
        if(!line.isEmpty() || line != null){
            strLine= line.trim().toLowerCase().split(" ");
        }


        switch (strLine[0]) {
            case "add":
                //call add function
                try {
                    int x = Integer.parseInt(strLine[1]);
                    int y = Integer.parseInt(strLine[2]);
                    add(x, y);
                } catch (InputMismatchException e) {
                }
                break;

            case "remove":
                try{
                    int x = Integer.parseInt(strLine[1]);
                    int y = Integer.parseInt(strLine[2]);
                    remove(x,y);
                }
                catch (InputMismatchException e){
                }
                break;

            case "is":
                if(strLine[1].equals("linked")){
                    try{
                        int x = Integer.parseInt(strLine[2]);
                        int y = Integer.parseInt(strLine[3]);
                        System.out.println(isLink(x,y));
                    }
                    catch (InputMismatchException e){
                    }
                }
                break;

            default:
                //do nothing // go to next line;
                break;
        }
    }

    static void add(int x, int y){
        if(myGraph == null){
            myGraph = new HashMap<>();
            Set<Integer> nodeX = new HashSet<>();
            nodeX.add(y);
            myGraph.put(x,nodeX);
            Set<Integer> nodeY = new HashSet<>();
            nodeY.add(x);
            myGraph.put(y,nodeY);
        }
        else{
            Set<Integer> nodeX;
            Set<Integer> nodeY;
            if(myGraph.containsKey(x)){
                nodeX = myGraph.get(x);
                nodeX.add(y);
            }
            else{
                nodeX = new HashSet<>();
                nodeX.add(y);
                myGraph.put(x,nodeX);
            }
            if(myGraph.containsKey(y)){
                nodeY = myGraph.get(y);
                nodeY.add(x);
            }
            else{
                nodeY = new HashSet<>();
                nodeY.add(x);
                myGraph.put(y,nodeY);
            }
        }
    }

    static void remove(int x, int y){
        if(myGraph != null && myGraph.containsKey(x) && myGraph.containsKey(y)){
            Set<Integer> nodeX = myGraph.get(x);
            nodeX.remove(y);
            if(nodeX.isEmpty()){
                myGraph.remove(x);
            }
            Set<Integer> nodeY = myGraph.get(y);
            nodeY.remove(x);
            if(nodeY.isEmpty()){
                myGraph.remove(y);
            }
        }
        else{
            return;
        }
    }

    static boolean isLink(int x, int y){
        if(myGraph != null && myGraph.containsKey(x) && myGraph.containsKey(y)){
            return BFS(x,y);
        }
        return false;
    }

    static boolean BFS(int x, int y){
        HashSet<Integer> set = new HashSet<>();
        boolean flag = false;
        Queue<Integer> que = new ArrayDeque<>();
        que.add(x);
        while ( que.size()!=0) {
            int v = que.poll();
            if (!set.contains(v)) {
                if (v == y) {
                    flag = true;
                }
                que.addAll(myGraph.get(v));
                set.add(v);
            }
        }
        return flag;
    }
//        static void print(){
//            for (Map.Entry<Integer, Set<Integer>> entry : graph.entrySet()) {
//                System.out.println(entry.getKey()+" : "+entry.getValue());
//            }
    // }
}
