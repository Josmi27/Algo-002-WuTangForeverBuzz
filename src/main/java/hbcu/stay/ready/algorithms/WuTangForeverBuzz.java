package hbcu.stay.ready.algorithms;

public class WuTangForeverBuzz {

    public String wuTangClan(){
        String wuwu = "";
        int input = 16;

        for (int i = 1; i < 16; i++) {
            if(i % 3 == 0) {
                wuwu += "Wu\n";
            }
            else if(i % 5 == 0) {
                wuwu += "Tang\n";
            }
            // Problems checking this condition.
            else if((i % 3 == 0) && (i % 5 == 0)) {
                if(i+1 > input) {
                    wuwu += "WuTang Forever";
                }
                wuwu += "WuTang Forever\n";
            }
            else {
                wuwu += i + "\n";            }
        }
        return wuwu;
    }
}
