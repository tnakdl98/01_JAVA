package lecture.section2.looping;

public class B_while {

    /*
     * 초기식;
     *
     * while(조건식){
     *   반복시키고 싶은 구문
     *
     *   증감식;
     * }
     *
     * */
    public void sampleWhile() {


        int i = 1; // 초기식

        while (true) {

            System.out.println(i);

            i++;

            if(i == 5) {
                break;
            }
        }

    }
}
