package Day4;

import java.util.ArrayList;
import java.util.List;

//v = ["J vltasl rlhr ", "zdfog odxr ypw", " atasl rlhr p ", "gwkzzyq zntyhv", " lvz wp!!!"]

public class CaesarCipher {

    public static void main(String[] args) {

        String u = "I should have known that you would have a perfect answer for me!!!";
        System.out.println(u);
        char test = 'A';
        int test1 = (int) test;
        //System.out.println("Should be letter A converted to number:" + test1);
        //System.out.println(String.valueOf((char) test1));
        System.out.println(String.valueOf(movingShift(u.toUpperCase(), 1)));
        System.out.println(String.valueOf(demovingShift(movingShift(u.toUpperCase(), 1),1)));



    }


    public static List<String> movingShift(String s, int shift) {
        String resultingText = "";
        for (int i = 0; i < s.length(); i++) {
            resultingText = resultingText + getTokenReplacement(s.charAt(i), shift + i);

        }
        System.out.println("String before the split: " + resultingText);
        return splitForRunners(resultingText);

    }

    private static List<String> splitForRunners(String resultingText) {

        List<String> result = new ArrayList<>();
        int l = resultingText.length();
        int partLength = l / 5;
        System.out.println("------------------: "+partLength);


        result.add(getThePart(resultingText, 0, partLength));
        result.add(getThePart(resultingText,result.get(0).length(), result.get(0).length()+partLength));
        result.add(getThePart(resultingText,result.get(0).length()+result.get(1).length(), result.get(0).length()+result.get(1).length()+partLength));
        result.add(getThePart(resultingText,result.get(0).length()+result.get(1).length()+result.get(2).length(),
                result.get(0).length()+result.get(1).length()+result.get(2).length()+partLength));

        try {
            result.add(getThePart(resultingText,result.get(0).length()+result.get(1).length()+result.get(2).length()+result.get(3).length(),
                    resultingText.length()-1));

        } catch (Exception e) {

        }
        return result;
    }

    private static String getThePart(String resultingText, int i, int i1) {

        int partLengthTillSpace = 0;
        if(i>=resultingText.length()){

            return "";
        }

        if(i1==resultingText.length()-1){
            return resultingText.substring(i, resultingText.length());
        }

        for (int j = i1; j < resultingText.length(); j++) {
            if ((int) (resultingText.charAt(j)) == 32) {
                partLengthTillSpace = j;
                break;
            }

        }


        return resultingText.substring(i, partLengthTillSpace);

    }

    private static String getTokenReplacement(char c, int i) {
        String result = String.valueOf(c);
        int asciiC = (int) c;

        // is upperCase
        if (asciiC >= 65 && asciiC <= 90) {
            int counter = 0;

            if (asciiC + i < 91) {
                result = String.valueOf((char) (asciiC + i));
            } else if (asciiC + i >= 91) {
                counter = Math.abs(90 - asciiC - i);

                while (counter + 64 >= 91) {
                    counter = Math.abs(counter + 64 - 90);
                    if (64 + counter < 91) {
                        result = String.valueOf((char) (64 + counter));
                    }
                }


                result = String.valueOf((char) (counter + 64));

            }
        }

        // lower case
        if (asciiC >= 97 && asciiC <= 122) {
            int counter = 0;

            if (asciiC + i < 123) {
                result = String.valueOf((char) (asciiC + i));
            } else if (asciiC + i >= 123) {
                counter = Math.abs(122 - asciiC - i);

                while (counter + 96 >= 123) {
                    counter = Math.abs(counter + 96 - 122);
                }

                if (96 + counter < 123) {
                    result = String.valueOf((char) (96 + counter));
                }

                result = String.valueOf((char) (counter + 96));

            }
        }
        System.out.println("Input letter :" + String.valueOf(c) + " ascii: " + (int) c +
                " shift :" + i + " output letter: " + result);
        return result;
    }//end of method

    public static String demovingShift(List<String> s, int shift) {
        String encodedMsg="";
        String resultingText="";
        for (String a:s) {
            encodedMsg=encodedMsg+a;
        }
        System.out.println("Encoded MSG : "+encodedMsg);


        for (int i = 0; i < encodedMsg.length(); i++) {
            resultingText = resultingText + getTokenReplacementDecoded(encodedMsg.charAt(i), shift + i);

        }
        System.out.println("Decoded: " + resultingText);
        return resultingText;

    }

    private static String getTokenReplacementDecoded(char c, int i) {

        String result = String.valueOf(c);
        int asciiC = (int) c;

        // is upperCase
        if (asciiC >= 65 && asciiC <= 90) {
            int counter = 0;

            if (asciiC - i > 64) {
                result = String.valueOf((char) (asciiC - i));
            } else if (asciiC - i <= 64) {
                counter = Math.abs( asciiC - i-65);

                while ( 91 -counter <= 64) {
                    counter = Math.abs(91 -counter-65);
                    if (91 - counter > 64) {
                        result = String.valueOf((char) (91 - counter));
                    }
                }


                result = String.valueOf((char) (91-counter));

            }
        }

        // lower case
        if (asciiC >= 97 && asciiC <= 122) {
            int counter = 0;

            if (asciiC - i >96) {
                result = String.valueOf((char) (asciiC - i));
            } else if (asciiC - i <= 96) {
                counter = Math.abs( asciiC - i-97);

                while ( 123 -counter <= 96) {
                    counter = Math.abs(123-counter-97);
                    if (123 - counter > 96) {
                        result = String.valueOf((char) (123 - counter));
                    }
                }


                result = String.valueOf((char) (123-counter));

            }
        }



        System.out.println("Input letter :" + String.valueOf(c) + " ascii: " + (int) c +
                " shift left:" + i + " output letter: " + result);
        return result;

    }

}
