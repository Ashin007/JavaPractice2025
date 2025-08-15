package techwithjathin;

public class LeaderOnArray {
    public static void main(String[] args) {

        int[] array = new int[] {16,17,3,12,5,2};

        getLeaderFromArray(array);

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]<array[j]){
                    break;
                }
                if(j==array.length-1){
                    System.out.println(array[i]);
                }
            }
        }
        System.out.println(array[array.length-1]);
    }

    public static void getLeaderFromArray(int[] array){

        int currentLeader = array[array.length-1];
        System.out.println(currentLeader);
        for(int i=array.length-2;i>0;i--){
            if(currentLeader<array[i]){
                System.out.println(array[i]);
                currentLeader = array[i];
            }
        }
    }
}
