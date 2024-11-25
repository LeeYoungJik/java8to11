package me.whiteship.java8to11;

import java.util.ArrayList;
import java.util.Arrays;

public class backjoonTest {




    /*
    * 정수로 이루어진 배열 numbers가 있습니다. 배열 의 각 원소들에 대해 자신보다 뒤에 있는 숫자 중에서 자신보다 크면서 가장 가까이 있는 수를 뒷 큰수라고 합니다.
      정수 배열 numbers가 매개변수로 주어질 때, 모든 원소에 대한 뒷 큰수들을 차례로 담은 배열을 return 하도록 solution 함수를 완성해주세요. 단, 뒷 큰수가 존재하지 않는 원소는 -1을 담습니다.
    * */

    //input : [2, 3, 3, 5]
    //result : [3, 5, 5, -1]
    // 이중 포문으로 해야 할 듯.
    // 바로 뒤의 숫자가 나보다 더 크지 않을 경우, 나보다 더 큰 경우를 찾아 나서야 함.
    public static void main(String[] args){
        int [] input = {2, 3, 3, 5};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        int [] answer = new int[input.length];


        for(int i = 0; i <= input.length; i++){

            for(int j = i+1 ; j <= input.length; j++){


                if(j >= input.length)
//                int aa = input[0];
                //i = 0부터 j=1부터 시작. 끝나는 지점은 lenght만큼으로 같음.
                if(input[i] < input[j]){
                     //input[j]가 더 클 경우 정답 배열에 추가해야 함.
                    System.out.println("answerarryaList put = "+input[j]);
                    arrayList.add(input[j]);
                    answer[i] = input[j];
                    break;

                }
            }
        }

        for(int i = 0; i<= arrayList.toArray().length; i ++){
            Integer inputInteget = arrayList.get(i);
            answer[i] = inputInteget;
//            answer
        }

//        arrayList.stream().forEach(System.out::println);
        System.out.println("end answer 배열 start");
        Arrays.stream(answer).forEach(System.out::println);
    }


    public int solution(int[][] targets) {
        int answer = 0;

        //공격은 임의의 y값이 정해져있고, targets는 x1 ,x2 값이 들어온다.
        //하지만 요격하는 법은 세로로 쭉 써서 요격할 거기 때문에 상관이 없다고 한다.
        //들어오는 x값들은 다 정리해서 한 번에 요격 할 수 있는 카운트를 세라.

        Arrays.sort( targets, (o1, o2) -> {
            return o1[1]-o2[1];
        }) ; //임의로 들어오는 x값들을 정렬한다.

        return answer;
    }





    /*
    * A 나라가 B 나라를 침공하였습니다. B 나라의 대부분의 전략 자원은 아이기스 군사 기지에 집중되어 있기 때문에 A 나라는 B 나라의 아이기스 군사 기지에 융단폭격을 가했습니다.
    A 나라의 공격에 대항하여 아이기스 군사 기지에서는 무수히 쏟아지는 폭격 미사일들을 요격하려고 합니다. 이곳에는 백발백중을 자랑하는 요격 시스템이 있지만 운용 비용이 상당하기 때문에 미사일을 최소로 사용해서 모든 폭격 미사일을 요격하려 합니다.
    A 나라와 B 나라가 싸우고 있는 이 세계는 2 차원 공간으로 이루어져 있습니다. A 나라가 발사한 폭격 미사일은 x 축에 평행한 직선 형태의 모양이며 개구간을 나타내는 정수 쌍 (s, e) 형태로 표현됩니다. B 나라는 특정 x 좌표에서 y 축에 수평이 되도록 미사일을 발사하며, 발사된 미사일은 해당 x 좌표에 걸쳐있는 모든 폭격 미사일을 관통하여 한 번에 요격할 수 있습니다. 단, 개구간 (s, e)로 표현되는 폭격 미사일은 s와 e에서 발사하는 요격 미사일로는 요격할 수 없습니다. 요격 미사일은 실수인 x 좌표에서도 발사할 수 있습니다.
    각 폭격 미사일의 x 좌표 범위 목록 targets이 매개변수로 주어질 때, 모든 폭격 미사일을 요격하기 위해 필요한 요격 미사일 수의 최솟값을 return 하도록 solution 함수를 완성해 주세요.
    *
    * */

    public void complete1(){
            //요격문제 해결법
        {




//        Integer[][] arr = {{1,92},{333,2},{111,2223},{82738,1123}} ;
            int[][] arr = {{1,2},{333,92},{111,2223},{82738,1123}} ;

//        int [][] arr = {4,5],[4,8],[10,14],[11,13],[5,12],[3,7],[1,4]]

            int endPoint = 0;
            int targetCount = 0;

            Arrays.sort(arr, (i1, i2) -> {return i1[1] - i2[1];
            });

        /*Arrays.stream(arr).flatMap(Arrays::stream)
                        .forEach(System.out::println);*/

            Arrays.stream(arr).flatMapToInt(Arrays::stream).forEach(System.out::println);


        /*for (Integer[] tearr: arr){
            System.out.println("### tearr = "+tearr);
            for(Integer a : tearr){
                System.out.println("### secodnFor in a = "+a);
            }

        }*/



/*        for(int i = 0; i < arr.length; i++){

            System.out.println("#### arr for in  i = "+i);

            if(endPoint <= arr[i][0]) {

                endPoint = arr[i][1];
                targetCount++;
                System.out.println("endPoint Change =="+endPoint + " targetCount = "+targetCount);
            }
        }*/

            for(int[] toArr : arr ){

                if(endPoint <= toArr[0]){
                    endPoint = toArr[1];
                    targetCount++;
                    System.out.println("endPoint Change =="+endPoint + " targetCount = "+targetCount);
                }

            }

            System.out.println("process end targetCount = "+targetCount);





        }


    }




}
