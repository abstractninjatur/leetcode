package LinkedList;

public class MoveTheZeros {

    public int[] moveZeros(int[] values){

        int i =0;
        int j = 0;

        while( j< values.length ){

           if(values[j]!=0) {
               values[i] = values[j];
                i++;
           }
           j++;
        }

        while(i< values.length) {
            values[i] = 0;
        }

        return values;
    }
}
