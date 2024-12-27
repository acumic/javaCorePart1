package task2;

public class Reverse {

    public String stringToReverse;


    public Reverse(String stringToReverse) {
        this.stringToReverse = stringToReverse;
    }

    public void reverse1(){
        String reverse = "";
        char c;
        for(int i = 0; i < stringToReverse.length(); i++){
            c = stringToReverse.charAt(i);
            reverse = c + reverse;
        }

        System.out.println(reverse);
    }

    public void reverse2(){

        StringBuilder reverse = new StringBuilder();
        reverse.append(stringToReverse);
        reverse.reverse();
        System.out.println(reverse);

    }

    public void reverse3(){
        char[] array = stringToReverse.toCharArray();

        for(int i = array.length-1; i >= 0; i--){
            System.out.print(array[i]);
        }
    }
}