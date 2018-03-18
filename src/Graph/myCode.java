/* package whatever; // don't place package name! */
package Graph;
import java.io.*;
import java.util.*;

class myCode
{
    static Map<Integer, Set<Integer>> myGraph;
    myCode(){
        myGraph = new HashMap<>();
    }
    public static void main (String[] args) throws java.lang.Exception {
        //try{
            //File file = new File(args[0]);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input;
            while ((input = br.readLine()) != null){
                input.trim();
                if(input.length() >= 7) {
                    check(input);
                }
            }
            //br.close();
       // }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    static void check(String line){
        String strLine [] = new String[4];
        if(!line.isEmpty() || line!=null)
            strLine=line.trim().toLowerCase().split(" ");

        int x;
        int y;
        switch(strLine[0]){

            case "add": try {
                x= Integer.parseInt(strLine[1]);
                y= Integer.parseInt(strLine[2]);
                add(x,y);
                break;
            }
            catch(InputMismatchException e){

            }
            case "remove": try {
                x= Integer.parseInt(strLine[1]);
                y= Integer.parseInt(strLine[2]);
                remove(x,y);
                break;
            }
            catch(InputMismatchException e){

            }
            case "is": if(strLine[1].equals("linked")){
                try {
                    x= Integer.parseInt(strLine[2]);
                    y= Integer.parseInt(strLine[3]);
                    //isLink(x,y);
                    System.out.println(isLink(x,y));
                }catch(InputMismatchException e){
                }
            }
            default: break;
        }
    }


    static void add(int x, int y){
        if(myGraph==null){
            myGraph = new HashMap<>();
            Set<Integer> nodeX=new HashSet<>();
            nodeX.add(y);
            myGraph.put(x,nodeX);
            Set<Integer> nodeY= new HashSet<>();
            nodeY.add(x);
            myGraph.put(y,nodeY);
        }
        else{
            Set<Integer> nodeX;
            Set<Integer> nodeY;
            if(myGraph.containsKey(x)){
                nodeX=myGraph.get(x);
                nodeX.add(y);
            }
            else{
                nodeX=new HashSet<>();
                nodeX.add(y);
                myGraph.put(x,nodeX);
            }
            if(myGraph.containsKey(y)){
                nodeY=myGraph.get(y);
                nodeY.add(x);
            }
            else{
                nodeY=new HashSet<>();
                nodeY.add(x);
                myGraph.put(y,nodeY);
            }
        }
    }

    static void remove(int x, int y){
        if(myGraph!=null && myGraph.containsKey(x) & myGraph.containsKey(y)){
            Set<Integer> nodeX=myGraph.get(x);
            nodeX.remove(y);
            if(nodeX.isEmpty())
                myGraph.remove(x);
            Set<Integer> nodeY=myGraph.get(y);
            nodeY.remove(x);
            if(nodeX.isEmpty())
                myGraph.remove(y);
        }
        else return;
    }

    static boolean isLink(int x,int y){
        if(myGraph != null && myGraph.containsKey(x) && myGraph.containsKey(y)){
            return BFS(x,y);
        }
        return false;
    }


    static boolean BFS(int x, int y){
        HashSet<Integer> set = new HashSet<>();
        boolean flag=false;
        Queue<Integer> que= new ArrayDeque<>();
        que.add(x);
        while(que.size()!=0){
            int v=que.poll();
            if(!set.contains(v)){
                if(v==y)
                    flag=true;
                que.addAll(myGraph.get(v));
                set.add(v);
            }
        }

        return flag;
    }


}
