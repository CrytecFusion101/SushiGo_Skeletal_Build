public class ScoreCounter extends Hand{

    public static int TotalScore(Hand h) {

        int wasiriPairsSA = 0;
        int wasiriPairsSQ = 0;
        int wasiriPairsEG = 0;

        int wasabiPairScore = 0;

        int nigiriScore = 0;

        int sashimiScore = 0;

        int tempuraScore = 0;

        int dumplingScore = 0;

        for (int i = 0; i < h.size(); i++){
            if (h.getCard(i).getType() == 10){
                for (int j = 0; j < h.size(); j++){
                    if (h.getCard(j).getType() == 6 && i<j){
                        wasiriPairsSA++;
                        h.removeCard(j);
                        h.removeCard(i);
                        i=-1;
                        break;
                    }
                    else if(h.getCard(j).getType() == 7 && i<j){
                        wasiriPairsSQ++;
                        h.removeCard(j);
                        h.removeCard(i);
                        i=-1;
                        break;
                    }
                    else if(h.getCard(j).getType() == 8 && i<j){
                        wasiriPairsEG++;
                        h.removeCard(j);
                        h.removeCard(i);
                        i=-1;
                        break;
                    }
                }
            }
        }

        wasabiPairScore = (wasiriPairsSQ * 9) + (wasiriPairsSA * 6) + (wasiriPairsEG * 3);


        nigiriScore = (h.cardCounter(1,7) * 3) + (h.cardCounter(1,6) * 2) + (h.cardCounter(1,8));


        int sashimiSet = Math.floorDiv(h.cardCounter(1,1),3);
        if (sashimiSet > 0){
            sashimiScore = sashimiSet * 10;
        }


        int tempuraSet = Math.floorDiv(h.cardCounter(1,0),2);
        if (tempuraSet > 0){
            tempuraScore = tempuraSet * 5;
        }

        int dumplingCount = h.cardCounter(1,2);
        if (dumplingCount == 1)
            dumplingScore = 1;
        if (dumplingCount == 2)
            dumplingScore = 3;
        if (dumplingCount == 3)
            dumplingScore = 6;
        if (dumplingCount == 4)
            dumplingScore = 10;
        if (dumplingCount >= 5)
            dumplingScore = 15;

        return (wasabiPairScore + nigiriScore + sashimiScore + tempuraScore + dumplingScore);
    }

    public static String makiCompare(Hand a, Hand b){

        int makicountA = a.cardCounter(1,5) + (a.cardCounter(2,4) * 2) + (a.cardCounter(3,3) * 3);
        int makicountB = b.cardCounter(1,5) + (b.cardCounter(2,4) * 2) + (b.cardCounter(3,3) * 3);

        if (makicountA > makicountB){
            return("A");
        }
        if (makicountA < makicountB){
            return("B");
        }
        if (makicountA == makicountB){
            return("E");
        }
        return null;
    }

}
