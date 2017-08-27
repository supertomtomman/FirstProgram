package Day3.VendingMachine;

import java.util.Scanner;

import static jdk.nashorn.internal.parser.TokenType.DO;

public class Display {

    private VM_Box box;

    public Display(VM_Box box) {
        this.box = box;
    }

    public void startDisplay(){

        System.out.println("Witaj, jest" +box.getNumberOfShelves()+" pulek." +
                "\nProsze podaj nr pulki z produktem:\n");
        Scanner scanner = new Scanner(System.in);
        int userShelfChoice = scanner.nextInt();
        System.out.println("Podales nr pulki: " + userShelfChoice);
        System.out.println("Ta pulka to:"+this.box.showShelfInfo(userShelfChoice));
        System.out.println("Prosze wrzuc monety by kupic");
        System.out.println("Aceptowane monety: 5, 2, 1, 0.5, 0.2, 0.1 PLN");
        System.out.println("Press \"0\" to finish");
        Scanner coinScanner = new Scanner(System.in);
        Money userMoney = new Money(0);
        String userInsertedCoin = coinScanner.nextLine();



        while(!userInsertedCoin.equals("0")){


            switch (userInsertedCoin){
                case "5": userMoney.add(Coin.FIVE_ZLOTY);
                    userInsertedCoin = coinScanner.nextLine();
                break;

                case "2": userMoney.add(Coin.TWO_ZLOTY);
                    userInsertedCoin = coinScanner.nextLine();
                break;

                case "1": userMoney.add(Coin.ONE_ZLOTY);
                    userInsertedCoin = coinScanner.nextLine();
                break;

                case "0.5": userMoney.add(Coin.FIFTY_GROSZY);
                    userInsertedCoin = coinScanner.nextLine();
                break;


                case "0.2": userMoney.add(Coin.TWENTY_GROSZY);
                    userInsertedCoin = coinScanner.nextLine();
                break;

                case "0.1": userMoney.add(Coin.TEN_GROSZY);
                    userInsertedCoin = coinScanner.nextLine();
                break;

                default: break;


            }
       }// end of loop

        System.out.println("----------------");
        System.out.println("Coins entered:");
        userMoney.showCoinsStored();


    }





}
