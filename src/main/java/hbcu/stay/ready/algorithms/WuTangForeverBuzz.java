package hbcu.stay.ready.algorithms;

public class WuTangForeverBuzz {

    public String wuTangClan(){
        String wuwu = "";
        int input = 16;

        for (int i = 1; i < input; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                wuwu += "WuTang Forever";
            }
            else if(i % 3 == 0) {
                wuwu += "Wu\n";
            }
            else if(i % 5 == 0) {
                wuwu += "Tang\n";
            }
            // Problems checking this condition.

            else {
                wuwu += i + "\n";            }
        }
        return wuwu;
    }
}
