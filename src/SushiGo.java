import java.util.Scanner;

public class SushiGo {

    public static void main(String[] args){
        Deck test;
        Hand user1Hand;
        Hand user2Hand;
        Player player1;
        Player player2;
        Card chopsticks;
        Card wasabi;
        Card saNigiri;
        Card sqNigiri;
        Card egNigiri;
        Card sashimi;
        Card tempura;
        Card dumpling;
        Card makiRoll1;
        Card makiRoll2;
        Card makiRoll3;

        boolean turn = true;
        int wasiriPairsSA = 0;
        int wasiriPairsSQ = 0;
        int wasiriPairsEG = 0;


        test = new Deck();
        user1Hand = new Hand();
        user2Hand = new Hand();
        player1 = new Player("Shlok");
        player2 = new Player("Raj");
        chopsticks = new Card(1,11);
        wasabi = new Card(1,10);
        saNigiri = new Card(1,6);
        sqNigiri = new Card(1,7);
        egNigiri = new Card(1,8);
        sashimi = new Card(1,1);
        tempura = new Card(1,0);
        dumpling = new Card(1,2);
        makiRoll1 = new Card(1,5);
        makiRoll2 = new Card(2,4);
        makiRoll3 = new Card(3,3);

        //System.out.println(test.toString());

        test.shuffle();

        Card[] testdeck;
        testdeck = test.playDeck();

        for(int i = 0; i<19; i++){
            System.out.println(testdeck[i].toString());
        }

        for (int i = 0; i<testdeck.length/2; i++){
            user1Hand.addCard(testdeck[i]);
        }

        for (int i = testdeck.length/2; i<testdeck.length; i++) {
            user2Hand.addCard(testdeck[i]);
        }

        System.out.println();
        System.out.println();

        System.out.println("Hand 1");
        for (int i = 0; i<user1Hand.size(); i++) {
            System.out.println(user1Hand.getCard(i).toString());
        }
        System.out.println();
        System.out.println("Hand 2");
        for (int i = 0; i<user2Hand.size(); i++) {
            System.out.println(user2Hand.getCard(i).toString());
        }

//        while (!user1Hand.roundone() && !user2Hand.roundone()) {
//
//            while ((!user1Hand.roundone() && !user2Hand.roundone() && turn)) {
//
//                if (user1Hand.size() ==  1 || user2Hand.size() == 1) {
//                    player1.pile().addCard(user1Hand.getCard(0));
//                    player2.pile().addCard(user2Hand.getCard(0));
//                    user1Hand.removeCard(0);
//                    user2Hand.removeCard(0);
//                    break;
//                }
//
//                System.out.println();
//                System.out.println();
//
//                System.out.println("Shlok's Turn");
//                System.out.println();
//                System.out.println("Shlok's Hand");
//                System.out.println();
//                for (int i = 0; i < user1Hand.size(); i++) {
//                    System.out.println(user1Hand.getCard(i).toString());
//                }
//
//                System.out.println();
//                System.out.println();
//
//                System.out.println("Shlok's pile");
//                for (int i = 0; i < player1.pile().size(); i++) {
//                    System.out.println(player1.pile().getCard(i).toString());
//                }
//
//                System.out.println();
//
//                if (player1.pile().containsCardType(chopsticks.getType())){
//                    System.out.println("Do you want to use chopsticks? (Y/N)");
//                    char userAction;
//                    Scanner inputA = new Scanner(System.in);
//                    do {
//                        userAction = Character.toUpperCase(inputA.next().charAt(0));
//                        if (userAction != 'Y' && userAction != 'N')
//                            System.out.println("Please respond Y or N:  ");
//                    } while (userAction != 'Y' && userAction != 'N');
//
//                    if (userAction == 'Y'){
//                        player1.pile().removeCardType(chopsticks.getType());
//
//                        System.out.println("Pick 2 cards now");
//
//                        System.out.println("Pick the first Card");
//                        Scanner input = new Scanner(System.in);
//                        int a;
//                        do {
//                            a = input.nextInt();
//                            int limit = user1Hand.size() - 1;
//                            if (!(a >= 0 && a <= user1Hand.size() - 1))
//                                System.out.println("Please enter valid position from 0 to " + limit);
//                        } while (!(a >= 0 && a <= user1Hand.size() -1));
//
//                        System.out.println("Pick the Second Card");
//                        Scanner input1 = new Scanner(System.in);
//                        int b;
//                        do {
//                            b = input1.nextInt();
//                            int limit = user1Hand.size() - 1;
//                            if (!(b >= 0 && b <= user1Hand.size() - 1))
//                                System.out.println("Please enter valid position from 0 to " + limit);
//                        } while (!(b >= 0 && b <= user1Hand.size() -1));
//
//                        player1.pile().addCard(user1Hand.getCard(a));
//                        user1Hand.removeCard(a);
//
//                        player1.pile().addCard(user1Hand.getCard(b-1));
//                        user1Hand.removeCard(b-1);
//
//                        user1Hand.addCard(chopsticks);
//                    }
//                    else {
//                        System.out.println("Pick a card");
//                        int userActionb;
//                        Scanner input1 = new Scanner(System.in);
//                        do {
//                            userActionb = input1.nextInt();
//                            int limit = user1Hand.size() - 1;
//                            if (!(userActionb >= 0 && userActionb <= user1Hand.size() - 1))
//                                System.out.println("Please enter valid position from 0 to " + limit);
//                        } while (!(userActionb >= 0 && userActionb <= user1Hand.size() -1));
//
//                        player1.pile().addCard(user1Hand.getCard(userActionb));
//                        user1Hand.removeCard(userActionb);
//                    }
//                }
//                else {
//                    System.out.println("Pick a card");
//                    int userAction;
//                    Scanner input = new Scanner(System.in);
//                    do {
//                        userAction = input.nextInt();
//                        int limit = user1Hand.size() - 1;
//                        if (!(userAction >= 0 && userAction <= user1Hand.size() - 1))
//                            System.out.println("Please enter valid position from 0 to " + limit);
//                    } while (!(userAction >= 0 && userAction <= user1Hand.size() -1));
//
//                    player1.pile().addCard(user1Hand.getCard(userAction));
//                    user1Hand.removeCard(userAction);
//                }
//
//                System.out.println();
//
//                System.out.println("Shlok's pile");
//                for (int i = 0; i < player1.pile().size(); i++) {
//                    System.out.println(player1.pile().getCard(i).toString());
//                }
//
//                System.out.println();
//                System.out.println();
//
//
//                ////////////
//
//
//                System.out.println("Raj's Turn");
//                System.out.println();
//                System.out.println("Raj's Hand");
//                System.out.println();
//                for (int i = 0; i < user2Hand.size(); i++) {
//                    System.out.println(user2Hand.getCard(i).toString());
//                }
//
//                System.out.println();
//
//                System.out.println("Raj's pile");
//                for (int i = 0; i < player2.pile().size(); i++) {
//                    System.out.println(player2.pile().getCard(i).toString());
//                }
//
//                System.out.println();
//
//                if (player2.pile().containsCardType(chopsticks.getType())){
//                    System.out.println("Do you want to use chopsticks? (Y/N)");
//                    char userAction;
//                    Scanner inputA = new Scanner(System.in);
//                    do {
//                        userAction = Character.toUpperCase(inputA.next().charAt(0));
//                        if (userAction != 'Y' && userAction != 'N')
//                            System.out.println("Please respond Y or N:  ");
//                    } while (userAction != 'Y' && userAction != 'N');
//
//                    if (userAction == 'Y'){
//                        player2.pile().removeCardType(chopsticks.getType());
//
//                        System.out.println("Pick 2 cards now");
//
//                        System.out.println("Pick the first Card");
//                        Scanner input = new Scanner(System.in);
//                        int a;
//                        do {
//                            a = input.nextInt();
//                            int limit = user2Hand.size() - 1;
//                            if (!(a >= 0 && a <= user2Hand.size() - 1))
//                                System.out.println("Please enter valid position from 0 to " + limit);
//                        } while (!(a >= 0 && a <= user2Hand.size() -1));
//
//                        System.out.println("Pick the Second Card");
//                        Scanner input1 = new Scanner(System.in);
//                        int b;
//                        do {
//                            b = input1.nextInt();
//                            int limit = user2Hand.size() - 1;
//                            if (!(b >= 0 && b <= user2Hand.size() - 1))
//                                System.out.println("Please enter valid position from 0 to " + limit);
//                        } while (!(b >= 0 && b <= user2Hand.size() -1));
//
//                        player2.pile().addCard(user2Hand.getCard(a));
//                        user2Hand.removeCard(a);
//
//                        player2.pile().addCard(user2Hand.getCard(b-1));
//                        user2Hand.removeCard(b-1);
//
//                        user2Hand.addCard(chopsticks);
//                    }
//                    else {
//                        System.out.println("Pick a card");
//                        int userActionb;
//                        Scanner input1 = new Scanner(System.in);
//                        do {
//                            userActionb = input1.nextInt();
//                            int limit = user2Hand.size() - 1;
//                            if (!(userActionb >= 0 && userActionb <= user2Hand.size() - 1))
//                                System.out.println("Please enter valid position from 0 to " + limit);
//                        } while (!(userActionb >= 0 && userActionb <= user2Hand.size() -1));
//
//                        player2.pile().addCard(user2Hand.getCard(userActionb));
//                        user2Hand.removeCard(userActionb);
//                    }
//                }
//                else {
//                    System.out.println("Pick a card");
//                    int userAction;
//                    Scanner input = new Scanner(System.in);
//                    do {
//                        userAction = input.nextInt();
//                        int limit = user2Hand.size() - 1;
//                        if (!(userAction >= 0 && userAction <= user2Hand.size() - 1))
//                            System.out.println("Please enter valid position from 0 to " + limit);
//                    } while (!(userAction >= 0 && userAction <= user2Hand.size() -1));
//
//                    player2.pile().addCard(user2Hand.getCard(userAction));
//                    user2Hand.removeCard(userAction);
//                }
//
//                System.out.println();
//
//                System.out.println("Raj's pile");
//                for (int i = 0; i < player2.pile().size(); i++) {
//                    System.out.println(player2.pile().getCard(i).toString());
//                }
//
//                turn = false;
//            }
//
///////////////////////////////
//
//            while ((!user1Hand.roundone() && !user2Hand.roundone() && !turn)) {
//
//                if (user1Hand.size() ==  1 || user2Hand.size() == 1) {
//                    player1.pile().addCard(user2Hand.getCard(0));
//                    player2.pile().addCard(user1Hand.getCard(0));
//                    user1Hand.removeCard(0);
//                    user2Hand.removeCard(0);
//                    break;
//                }
//
//                System.out.println();
//                System.out.println();
//
//                System.out.println("Shlok's Turn");
//                System.out.println();
//                System.out.println("Shlok's Hand");
//                System.out.println();
//                for (int i = 0; i < user2Hand.size(); i++) {
//                    System.out.println(user2Hand.getCard(i).toString());
//                }
//
//                System.out.println();
//
//                System.out.println("Shlok's pile");
//                for (int i = 0; i < player1.pile().size(); i++) {
//                    System.out.println(player1.pile().getCard(i).toString());
//                }
//
//                System.out.println();
//
//                if (player1.pile().containsCardType(chopsticks.getType())){
//                    System.out.println("Do you want to use chopsticks? (Y/N)");
//                    char userAction;
//                    Scanner inputA = new Scanner(System.in);
//                    do {
//                        userAction = Character.toUpperCase(inputA.next().charAt(0));
//                        if (userAction != 'Y' && userAction != 'N')
//                            System.out.println("Please respond Y or N:  ");
//                    } while (userAction != 'Y' && userAction != 'N');
//
//                    if (userAction == 'Y'){
//                        player1.pile().removeCardType(chopsticks.getType());
//
//                        System.out.println("Pick 2 cards now");
//
//                        System.out.println("Pick the first Card");
//                        Scanner input = new Scanner(System.in);
//                        int a;
//                        do {
//                            a = input.nextInt();
//                            int limit = user2Hand.size() - 1;
//                            if (!(a >= 0 && a <= user2Hand.size() - 1))
//                                System.out.println("Please enter valid position from 0 to " + limit);
//                        } while (!(a >= 0 && a <= user2Hand.size() -1));
//
//                        System.out.println("Pick the Second Card");
//                        Scanner input1 = new Scanner(System.in);
//                        int b;
//                        do {
//                            b = input1.nextInt();
//                            int limit = user2Hand.size() - 1;
//                            if (!(b >= 0 && b <= user2Hand.size() - 1))
//                                System.out.println("Please enter valid position from 0 to " + limit);
//                        } while (!(b >= 0 && b <= user2Hand.size() -1));
//
//                        player1.pile().addCard(user2Hand.getCard(a));
//                        user2Hand.removeCard(a);
//
//                        player1.pile().addCard(user2Hand.getCard(b-1));
//                        user2Hand.removeCard(b-1);
//
//                        user2Hand.addCard(chopsticks);
//                    }
//                    else {
//                        System.out.println("Pick a card");
//                        int userActionb;
//                        Scanner input1 = new Scanner(System.in);
//                        do {
//                            userActionb = input1.nextInt();
//                            int limit = user2Hand.size() - 1;
//                            if (!(userActionb >= 0 && userActionb <= user2Hand.size() - 1))
//                                System.out.println("Please enter valid position from 0 to " + limit);
//                        } while (!(userActionb >= 0 && userActionb <= user2Hand.size() -1));
//
//                        player1.pile().addCard(user2Hand.getCard(userActionb));
//                        user2Hand.removeCard(userActionb);
//                    }
//                }
//                else {
//                    System.out.println("Pick a card");
//                    int userAction;
//                    Scanner input = new Scanner(System.in);
//                    do {
//                        userAction = input.nextInt();
//                        int limit = user2Hand.size() - 1;
//                        if (!(userAction >= 0 && userAction <= user2Hand.size() - 1))
//                            System.out.println("Please enter valid position from 0 to " + limit);
//                    } while (!(userAction >= 0 && userAction <= user2Hand.size() -1));
//
//                    player1.pile().addCard(user2Hand.getCard(userAction));
//                    user2Hand.removeCard(userAction);
//                }
//
//                System.out.println();
//
//                System.out.println("Shlok's pile");
//                for (int i = 0; i < player1.pile().size(); i++) {
//                    System.out.println(player1.pile().getCard(i).toString());
//                }
//
//                System.out.println();
//                System.out.println();
//
//
//                ////////////
//
//
//                System.out.println("Raj's Turn");
//                System.out.println();
//                System.out.println("Raj's Hand");
//                System.out.println();
//                for (int i = 0; i < user1Hand.size(); i++) {
//                    System.out.println(user1Hand.getCard(i).toString());
//                }
//
//                System.out.println();
//
//                System.out.println("Raj's pile");
//                for (int i = 0; i < player2.pile().size(); i++) {
//                    System.out.println(player2.pile().getCard(i).toString());
//                }
//
//                System.out.println();
//
//                if (player2.pile().containsCardType(chopsticks.getType())){
//                    System.out.println("Do you want to use chopsticks? (Y/N)");
//                    char userAction;
//                    Scanner inputA = new Scanner(System.in);
//                    do {
//                        userAction = Character.toUpperCase(inputA.next().charAt(0));
//                        if (userAction != 'Y' && userAction != 'N')
//                            System.out.println("Please respond Y or N:  ");
//                    } while (userAction != 'Y' && userAction != 'N');
//
//                    if (userAction == 'Y'){
//                        player2.pile().removeCardType(chopsticks.getType());
//
//                        System.out.println("Pick 2 cards now");
//
//                        System.out.println("Pick the first Card");
//                        Scanner input = new Scanner(System.in);
//                        int a;
//                        do {
//                            a = input.nextInt();
//                            int limit = user1Hand.size() - 1;
//                            if (!(a >= 0 && a <= user1Hand.size() - 1))
//                                System.out.println("Please enter valid position from 0 to " + limit);
//                        } while (!(a >= 0 && a <= user1Hand.size() -1));
//
//                        System.out.println("Pick the Second Card");
//                        Scanner input1 = new Scanner(System.in);
//                        int b;
//                        do {
//                            b = input1.nextInt();
//                            int limit = user1Hand.size() - 1;
//                            if (!(b >= 0 && b <= user1Hand.size() - 1))
//                                System.out.println("Please enter valid position from 0 to " + limit);
//                        } while (!(b >= 0 && b <= user1Hand.size() -1));
//
//                        player2.pile().addCard(user1Hand.getCard(a));
//                        user1Hand.removeCard(a);
//
//                        player2.pile().addCard(user1Hand.getCard(b-1));
//                        user1Hand.removeCard(b-1);
//
//                        user1Hand.addCard(chopsticks);
//                    }
//                    else {
//                        System.out.println("Pick a card");
//                        int userActionb;
//                        Scanner input1 = new Scanner(System.in);
//                        do {
//                            userActionb = input1.nextInt();
//                            int limit = user1Hand.size() - 1;
//                            if (!(userActionb >= 0 && userActionb <= user1Hand.size() - 1))
//                                System.out.println("Please enter valid position from 0 to " + limit);
//                        } while (!(userActionb >= 0 && userActionb <= user1Hand.size() -1));
//
//                        player2.pile().addCard(user1Hand.getCard(userActionb));
//                        user1Hand.removeCard(userActionb);
//                    }
//                }
//                else {
//                    System.out.println("Pick a card");
//                    int userAction;
//                    Scanner input = new Scanner(System.in);
//                    do {
//                        userAction = input.nextInt();
//                        int limit = user1Hand.size() - 1;
//                        if (!(userAction >= 0 && userAction <= user1Hand.size() - 1))
//                            System.out.println("Please enter valid position from 0 to " + limit);
//                    } while (!(userAction >= 0 && userAction <= user1Hand.size() -1));
//
//                    player2.pile().addCard(user1Hand.getCard(userAction));
//                    user1Hand.removeCard(userAction);
//                }
//
//                System.out.println();
//
//                System.out.println("Raj's pile");
//                for (int i = 0; i < player2.pile().size(); i++) {
//                    System.out.println(player2.pile().getCard(i).toString());
//                }
//
//                turn = true;
//            }
//        }
//
//        if (user1Hand.roundone() && user2Hand.roundone()){
//            System.out.println();
//            System.out.println();
//            System.out.println("Round FINISH");
//
//            System.out.println("Shlok's pile");
//            for (int i = 0; i < player1.pile().size(); i++) {
//                System.out.println(player1.pile().getCard(i).toString());
//            }
//
//            System.out.println("Raj's pile");
//            for (int i = 0; i < player2.pile().size(); i++) {
//                System.out.println(player2.pile().getCard(i).toString());
//            }
//        }


        Hand pairtest;
        pairtest = new Hand();

        pairtest.addCard(chopsticks);
        pairtest.addCard(chopsticks);
        pairtest.addCard(wasabi);
        pairtest.addCard(saNigiri);
        pairtest.addCard(chopsticks);
        pairtest.addCard(chopsticks);
        pairtest.addCard(chopsticks);
        pairtest.addCard(wasabi);
        pairtest.addCard(chopsticks);
        pairtest.addCard(chopsticks);
        pairtest.addCard(sqNigiri);
        pairtest.addCard(egNigiri);
        pairtest.addCard(wasabi);


///////////////Wasabi pairs scores

        for (int i = 0; i < pairtest.size(); i++){
            if (pairtest.getCard(i).getType() == 10){
                for (int j = 0; j < pairtest.size(); j++){
                    if (pairtest.getCard(j).getType() == 6 && i<j){
                        wasiriPairsSA++;
                        pairtest.removeCard(j);
                        pairtest.removeCard(i);
                        i=-1;
                        break;
                    }
                    else if(pairtest.getCard(j).getType() == 7 && i<j){
                        wasiriPairsSQ++;
                        pairtest.removeCard(j);
                        pairtest.removeCard(i);
                        i=-1;
                        break;
                    }
                    else if(pairtest.getCard(j).getType() == 8 && i<j){
                        wasiriPairsEG++;
                        pairtest.removeCard(j);
                        pairtest.removeCard(i);
                        i=-1;
                        break;
                    }
                }
            }
        }


        System.out.println("Shlok's pile");
        for (int i = 0; i < pairtest.size(); i++) {
            System.out.println(pairtest.getCard(i).toString());
        }
        System.out.println(wasiriPairsSA * 9);
        System.out.println(wasiriPairsSQ * 6);
        System.out.println(wasiriPairsEG * 3);

//////////////

        ////////Sashimi Score
        int sashimiScore = 0;
        int sashimiCount = pairtest.cardCounter(sashimi);
        int sashimiSet = Math.floorDiv(sashimiCount,3);
        if (sashimiSet > 0){
            sashimiScore = sashimiSet * 10;
        }

        System.out.println(sashimiScore);

        //////////


/////////////Tempura Score
        int tempuraScore = 0;
        int tempuraCount = pairtest.cardCounter(tempura);
        int tempuraSet = Math.floorDiv(tempuraCount,2);
        if (tempuraSet > 0){
            tempuraScore = tempuraSet * 5;
        }

        System.out.println(tempuraScore);

////////////

        /////////Nigiri Score
        int nigiriScore = (pairtest.cardCounter(sqNigiri) * 3) + (pairtest.cardCounter(saNigiri) * 2) + (pairtest.cardCounter(egNigiri));

        System.out.println(nigiriScore);

        /////////////


        //////////Dumpling Score
        int dumplingScore = 0;
        int dumplingCount = pairtest.cardCounter(dumpling);
        if (dumplingCount == 1)
            dumplingScore = 1;
        if (dumplingCount == 2)
            dumplingScore = 3;
        if (dumplingCount == 3)
            dumplingScore = 6;
        if (dumplingCount == 4)
            dumplingScore = 10;
        if (dumplingCount <= 5)
            dumplingScore = 15;

        System.out.println(dumplingScore);

        ///////////

///////////Maki Roll Score

        int makiScore = 0;
        int makicount = pairtest.cardCounter(makiRoll1) + (pairtest.cardCounter(makiRoll2) * 2) + (pairtest.cardCounter(makiRoll3) * 3);
        //make another counter for player 2
//        if (makicount1 < makicount2)
//            player2score += 6;
//        if (makicount1 > makiicount2)
//            player2score +=6;
//        if (makicount1 == makicount2) {
//            player1score += 3;
//            player2score += 2;
//        }

/////////////////

        /////////pudding Score

//        Card[] test2;
//        test2 = test.playDeck();
//        for(int i = 0; i<19; i++){
//            System.out.println(test2[i].toString());
//        }
    }


}
