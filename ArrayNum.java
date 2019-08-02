package day08;

/**
 * @ClassName ArrayNum
 * @Description TODO
 * @Auther danni
 * @Date 2019/8/2 10:40]
 * @Version 1.0
 **/

public class ArrayNum {
    public int  number(int[] arr){
        int len=arr.length/2;
        int temp=0;
        int num=0;
        for (int i = 0; i <arr.length ; i++) {
            num=0;
            temp=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(temp==arr[j]){
                    num++;
                }
                if(num>=len){
                   return temp;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
      ArrayNum num=new ArrayNum();
      int[] array={1,2,3,5,2,2,4,3,3};
        System.out.println(num.number(array));
    }
}
