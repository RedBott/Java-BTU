public class GetValues {
    public  int[] getValues(String input){
        String[] valuesString = input.split("-",10);
        //user input error will be solved before passing argument
        //min max alignment will be solved here
        //p-3-4-s-5-7-w-7-9
        int pMin = Integer.valueOf(valuesString[1]);
        int pMax = Integer.valueOf(valuesString[2]);
        if(pMin>pMax){
            pMin = pMin + pMax;
            pMax = pMin - pMax;
            pMin = pMin - pMax;
        }
        int sMin = Integer.valueOf(valuesString[4]);
        int sMax = Integer.valueOf(valuesString[5]);
        if(sMin>sMax){
            sMin = sMin + sMax;
            sMax = sMin - sMax;
            sMin = sMin - sMax;
        }
        int wMin = Integer.valueOf(valuesString[7]);
        int wMax = Integer.valueOf(valuesString[8]);
        if(wMin>wMax){
            wMin = wMin + wMax;
            wMax = wMin - wMax;
            wMin = wMin - wMax;
        }
        // got values fixed from min to man

        int[] encap = new int[6];
        encap[0] = pMin;encap[1] = pMax;encap[2] = sMin;encap[3] = sMax;encap[4] = wMin;encap[5] = wMax;
        return encap;
        //wrap fixed values into an array and return
    }

}
