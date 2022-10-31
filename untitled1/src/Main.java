import java.sql.SQLOutput;
import java.util.*;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //Теория из видоса
//        List<String> list = new ArrayList<>();
//        list.add("privet");
//        list.add("Kak dela");
//        list.add("normalno");
//        list.add("poka");
//
//
//        List<Integer> ad = list.stream()
//                .map(e->e.length())
//                .filter(element->element<7)
//                .collect(Collectors.toList());
//        System.out.println(ad);
//        list.stream().forEach(k-> System.out.print("\n"+k.length()));
//        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());
//        System.out.println(list2);


//        int[] arry = {5, 9, 3, 9, 1};
//        arry=Arrays.stream(arry).map(element
//                -> {
//            if (element % 3 == 0) {
//                element = element/3;
//            }
//            return element;
//        }).toArray();
//        System.out.println(Arrays.toString(arry));

// ArrayList<Integer> gg= new ArrayList<>();
//gg.add(6);
//        gg.add(19);
//        gg.add(26);
//        gg.add(9);
//        gg.add(46);
//        gg.add(8);
//        gg.add(5);
//        gg.add(65);
//        gg.add(90);
//        gg.add(25);
//        System.out.println(gg.get(bb.nextInt()));


//        ArrayList<Integer>gg = new ArrayList<>();
//        int g=bb.nextInt();
//for (int i=0;i<g;i++){
//    gg.add(bb.nextInt());}
//        gg.stream().forEach(n-> System.out.println(n));

//                ArrayList<Integer>gg = new ArrayList<>();
//        int g=bb.nextInt();
//for (int i=0;i<g;i++){
//
//    gg.add(bb.nextInt());}
//        gg.stream().forEach(n-> System.out.println(n+"-"+gg.indexOf(n)));

//                ArrayList<Integer>gg = new ArrayList<>();
//        int g=bb.nextInt();
//for (int i=0;i<g;i++){
//    gg.add(bb.nextInt());

//        List<Integer> list2=gg.stream().filter(n->n>0).collect(Collectors.toList());
//        System.out.println(list2);

//        gg.stream().filter(n->n>0).forEach(n-> System.out.println(n));
///////////////////////////////////////////////////////////////////////////////
//        Scanner bb = new Scanner(System.in);
//        ArrayList<Integer> gg = new ArrayList<>();
//        int g = bb.nextInt();
//        for (int i = 0; i < g; i++) {
//            gg.add(bb.nextInt());
//        }
//gg.stream().filter(n->n%2==0).forEach(n-> System.out.println(n));
//List<Integer>list2=gg.stream().filter(n->n%2==0).collect(Collectors.toList());
//        System.out.println(list2);
//Scanner bb = new Scanner(System.in);
//ArrayList<Integer> gg = new ArrayList<>();
//int g = bb.nextInt();
//for(int i=0;i<g;i++){
//    gg.add(bb.nextInt());
//}
//gg.stream().forEach(n-> System.out.print(n*n+" "));
//////////////////////////////////////////////////////////////
//Scanner bb = new Scanner(System.in);
//ArrayList<Integer> gg = new ArrayList<>();
//int a = bb.nextInt();
//
//for(int i=0;i<a;i++){
//    gg.add(bb.nextInt());
//}
//        IntStream.range(0, a.size())
//                .filter(i -> i % 2 == 0)
//                .mapToObj(i -> a.get(i)).forEach(x-> System.out.println(x));
//////////////////////////////////////////////////////////////////
//Scanner bb = new Scanner(System.in);
//ArrayList<Integer> gg = new ArrayList<>();
//int a = bb.nextInt();
//
//for(int i=0;i<a;i++){
//    gg.add(bb.nextInt());
//}
//        long d = gg.stream().filter(n->n>0).count();
//        System.out.println(d);
///////////////////////////////////////////////////////////////////
//Scanner bb = new Scanner(System.in);
//ArrayList<Integer> gg = new ArrayList<>();
//int a = bb.nextInt();
//
//for(int i=0;i<a;i++){
//    gg.add(bb.nextInt());
//}
//        long d = gg.stream().filter(n->n>0).collect(Collectors.summingInt(n->n));
//        System.out.println(d);
////////////////////////////////////////////////////////////////////
//    Scanner bb = new Scanner(System.in);
//    ArrayList<Integer> gg = new ArrayList<>();
//    int a = bb.nextInt();
//
//    for(int i=0;i<a;i++){
//        gg.add(bb.nextInt());
//    }
//    long d = gg.stream().collect(Collectors.summingInt(n->n));
//    double среднееЗначение = gg.stream().collect(Collectors.averagingInt(n->n));
//
//    System.out.println(d+"-"+среднееЗначение);
        ///////////////////////////////////////
//        Scanner bb = new Scanner(System.in);
//        ArrayList<Integer> gg = new ArrayList<>();
//        int a = bb.nextInt();
//
//        for(int i=0;i<a;i++){
//            gg.add(bb.nextInt());
//        }
//        double d = gg.stream().filter(n->n<0).collect(Collectors.averagingInt(n->n));
//
//        System.out.println(d);
///////////////////////////////////////////////////
//                Scanner bb = new Scanner(System.in);
//        ArrayList<Integer> gg = new ArrayList<>();
//        int a = bb.nextInt();
//
//        for(int i=0;i<a;i++){
//            gg.add(bb.nextInt());
//        }
//        double b = gg.stream().collect(Collectors.averagingInt(n->n));
//        gg.stream().filter(n->n>b).forEach(n->System.out.println(n));
//////////////////////////////////////////////////////////////////////////////
//                Scanner bb = new Scanner(System.in);
//        ArrayList<Integer> gg = new ArrayList<>();
//        int a = bb.nextInt();
//
//        for(int i=0;i<a;i++){
//            gg.add(bb.nextInt());
//        }
//        System.out.println(Collections.min(gg));
//////////////////////////////////////////////////////////////////////////////
//                Scanner bb = new Scanner(System.in);
//        ArrayList<Integer> gg = new ArrayList<>();
//        int a = bb.nextInt();
//
//        for(int i=0;i<a;i++){
//            gg.add(bb.nextInt());
//        }
//         Optional<Integer> to = gg.stream().filter(n->n!=0).reduce((n1, n2)->n1*n2);
//        System.out.println(to);
//////////////////////////////////////////////////////////////////////////////
//                Scanner bb = new Scanner(System.in);
//        ArrayList<Integer> gg = new ArrayList<>();
//        int a = bb.nextInt();
//
//        for(int i=0;i<a;i++){
//            gg.add(bb.nextInt());
//        }
//        int v = bb.nextInt();
//        gg.stream().filter(n->n%v==0).forEach(n->System.out.println(n));
///////////////////////////////////////////////////////////////////////////////
//        Scanner bb = new Scanner(System.in);
//        ArrayList<Integer> gg = new ArrayList<>();
//        int size = bb.nextInt();
//
//        for (int i = 0; i < size; i++) {
//            gg.add(bb.nextInt());
//        }
//
//        int proizv = IntStream.range(0, size)
//                .filter(index -> gg.get(index) != 0 && (index % 2 == 0))
//                .map(index -> gg.get(index))
//                .reduce(1, (a, b) -> a * b);
//        System.out.println(proizv);
        ////////////////////////////////////////////////////////////////////////
//        Scanner bb = new Scanner(System.in);
//        ArrayList<Integer> gg = new ArrayList<>();
//        int size = bb.nextInt();
//
//        for (int i = 0; i < size; i++) {
//            gg.add(bb.nextInt());
//        }
//        int a = gg.stream().min(Integer::compareTo).get();
//        System.out.println(a*a);
        //////////////////////////////////////////////////////////////////////
//                Scanner bb = new Scanner(System.in);
//        ArrayList<Integer> gg = new ArrayList<>();
//        int size = bb.nextInt();
//
//        for (int i = 0; i < size; i++) {
//            gg.add(bb.nextInt());
//        }
//                int a = gg.stream().max(Integer::compareTo).get();
//        System.out.println(a+"-"+gg.indexOf(a));
        //////////////////////////////////////////////////////////////////////
//        Scanner bb = new Scanner(System.in);
//        ArrayList<Integer> gg = new ArrayList<>();
//        int size = bb.nextInt();
//
//        for (int i = 0; i < size; i++) {
//            gg.add(bb.nextInt());
//        }
//        int a = gg.stream().min(Integer::compareTo).get();
//        int b = gg.stream().max(Integer::compareTo).get();
//        long df = gg.stream().filter(n->n!=a&&n!=b).collect(Collectors.summingInt(n->n));
//        double d = gg.stream().filter(n->n!=a&&n!=b).collect(Collectors.averagingInt(n->n));
//
//        System.out.println(d);
//        System.out.println(df);
//////////////////////////////////////////////////////////////////////////////
//        Scanner bb = new Scanner(System.in);
//        ArrayList<Integer> gg = new ArrayList<>();
//        int size = bb.nextInt();
//        for (int i = 0; i < size; i++) {
//            gg.add(bb.nextInt());
//        }
//        int num = bb.nextInt();
//        gg.stream().filter(n->n==num).forEach(n-> System.out.println("YES"));
//        long a =gg.stream().filter(n->n!=num).count();
//        if (a==size){
//        System.out.println("NO");}
//////////////////////////////////////////////////////////////////////////////
//        Scanner bb = new Scanner(System.in);
//        ArrayList<Integer>gg=new ArrayList<>();
//        int size = bb.nextInt();
//        for(int i=0;i<size;i++){
//            gg.add(bb.nextInt());
//        }
//        int m = bb.nextInt();
//        double f = gg.stream().filter(n->n>m).collect(Collectors.averagingInt(n->n));
//        System.out.println(f);
//////////////////////////////////////////////////////////////////////////////
//                Scanner bb = new Scanner(System.in);
//        ArrayList<Integer>gg=new ArrayList<>();
//        int size = bb.nextInt();
//        for(int i=0;i<size;i++){
//            gg.add(bb.nextInt());
//        }
//        Collections.reverse(gg);
//        System.out.println(gg);
////////////////////////////////////////////////////////////////////////////////
//                Scanner bb = new Scanner(System.in);
//        ArrayList<Integer> gg = new ArrayList<>();
//        int size = bb.nextInt();
//
//        for (int i = 0; i < size; i++) {
//            gg.add(bb.nextInt());
//        }
//        int max = gg.stream().max(Integer::compareTo).get();
//        int min = gg.stream().min(Integer::compareTo).get();
//        System.out.print(max+" ");
//        gg.stream().filter(n->n!=max&&n!=min).forEach(n-> System.out.print(n+" "));
//        System.out.print(min);
        ////////////////////////////////////////////////////////////////////////
//                        Scanner bb = new Scanner(System.in);
//        ArrayList<Integer> gg = new ArrayList<>();
//        int size = bb.nextInt();
//
//        for (int i = 0; i < size; i++) {
//            gg.add(bb.nextInt());
//        }
//        List<Integer> list2 =gg.stream().filter(n->n%2==0).collect(Collectors.toList());;
        //List<E> subList(int start, int end): получает набор элементов, которые находятся в списке между индексами start и end
/////////////////////////////////////////////////////////////////////////////////
//                                Scanner bb = new Scanner(System.in);
//        ArrayList<Integer> gg = new ArrayList<>();
//        int size = bb.nextInt();
//
//        for (int i = 0; i < size; i++) {
//            gg.add(bb.nextInt());
//        }
//        int itog=gg.stream()
//                .map(n-> {
//                    if (n > 0) {return n=1;
//                    } else return n=0;}
//                )
//
//
//                .reduce(0,(a,b)->{
//                    if(a!=b){
//                        return b;
//                    } else return 555;
//                });
//        if (itog==0||itog==1){
//            System.out.println("YES");
//        }else System.out.println("NO");
////////////////////////////////////////////////////////////////////////////////////////
        //List<E> subList(int start, int end): получает набор элементов, которые находятся в списке между индексами start и end
        Scanner bb = new Scanner(System.in);
            ArrayList<Integer> gg = new ArrayList<>();
            int size = bb.nextInt();

            for (int i = 0; i < size; i++) {
                gg.add(bb.nextInt());
            }
            int f = gg.indexOf(0);
            int l = gg.lastIndexOf(0);
        List<Integer> fe = gg.subList(f+1,l);
        long sum = fe.stream().collect(Collectors.summingInt(n->n));
        System.out.println(fe);



    }
}