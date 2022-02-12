package a1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.System.out;

public class NumbersEx {

    static int[] first10Numbers(){
        return IntStream.iterate(1, i->i+1).limit(10).toArray();
    }


  static int[] first10SquareNumbers(){
       //part a
    return  Arrays.stream(first10Numbers()).map(i->i*i).toArray();

 }

 //    int arr[] = first10Numbers();//{1, 2, 3, 4, 5};//new int [first10Numbers().length];
//    //arr = first10Numbers();
//   // IntStream stream = Arrays.stream(arr);
//    Arrays.stream(arr).forEach(str -> System.out.print(str*str + " "));


    static long countSquareNumberBelowOrEqual1000000(){
       // part b
      return  IntStream.iterate(1, i->i+1).limit(1000000).filter(i->isSquareNumber(i)).boxed().count();

    }
//
//    static Map<Integer, Long>countSquareNumbersBelowOrEqual1000000ByLastDigit(){
////         part c
//
//    }

//    static int sevenDigitSquareNumberWithMostDistinctDigits(){
        // part d

 //   }


    static boolean isSquareNumber(int n){
        int i;
        for(i = 1; i*i<n; i++){
    }
        return i*i == n ;
}

//static int SquareNubmer(int n){
//        return n*n;
//}

public static void main(String[] args){
//    out.println("First 10 number: "
//            + Arrays.toString(first10Numbers()));
//
//   System.out.println("First 10 square number: "
//        + Arrays.toString(first10SquareNumbers()));

//    int arr[] = first10Numbers();//{1, 2, 3, 4, 5};//new int [first10Numbers().length];
//    arr = first10Numbers();
//  IntStream stream = Arrays.stream(arr);
//   arr= Arrays.stream(arr).map(i->i*i).toArray();
//
//    out.println(Arrays.toString(arr));
//
//     int [] a = new int [first10Numbers().length];
//     a= first10Numbers();
//       //
//        for(int i =0 ; i < first10Numbers().length; i++){
//            a[i]= SquareNubmer(a[i]);
//        }
//    out.println(Arrays.toString(a));

//    System.out.println((first10Numbers()[1]));
//    n.first10Numbers()[1]=SquareNubmer(first10Numbers()[1]);
//    System.out.println(Arrays.toString(first10Numbers()));

//    System.out.println("count Square Numbers Below Or Equal to 1000000："
//            + countSquareNumberBelowOrEqual1000000());





//    System.out.println("Count square numbers below or equal to 1,000,000 grouped by last digit: "
//            +countSquareNumbersBelowOrEqual1000000ByLastDigit());


//    Map<Integer, String> Sites = new HashMap<Integer, String>();
//    // 添加键值对
//    Sites.put(1, "Google");
//    Sites.put(2, "Runoob");
//    Sites.put(3, "Taobao");
//    Sites.put(4, "Zhihu");
//    System.out.println(Sites);

//   out.println(
//  Arrays.toString( IntStream.iterate(1, i->i+1).limit(1000000).filter(i->isSquareNumber(i)).map(i->i%10).toArray()));

//    out.println(
//                    IntStream.iterate(1, i->i+1)
//                            .limit(1000000)
//                            .filter(i->isSquareNumber(i))
//                            .map(i->i%10).collect(groupingBy())
//    );

    IntFunction<Integer> f = i -> Integer.valueOf(i);

    Stream<Integer> si;
    si = IntStream.iterate(20, i -> i+1).takeWhile(i -> i<40)
            .filter(i -> i%2==0)
            .mapToObj(f);
    si.forEach(System.out::println);	// output is similar, but it is now Integer objects
    System.out.println();



//    System.out.println("Seven-digit square numbers with most distinct digits: "
//            +sevenDigitSquareNumberWithMostDistinctDigits());



    }
}
