//package ExtraPractice;
//
//public class mmm {
//
//
//    public static void stringX(String str) {
//        String str1="";
//
//        for (int t = 1; t <= str.length() - 2; t++) {
//
//            if (str.charAt(t) == 'x') {
//                continue;
//            } else {
//                str1 += "" + str.charAt(t);
//            }
//
//        }
//
//        String result = "" + str.charAt(0) + ""+ str1 + str.charAt(str.length() - 1);
//
//        System.out.println(result);
//    }
//
//
//
//    public static String altPairs(String str) {
//
//
//
//        String index = "";
//
//       for( int s=0, r =1; s<=str.length()-1; s=s+4, r=r+4){
//           index += ""+str.charAt(s) +""+str.charAt(r);
//       }
//
//       return index;
//
//    }
//
//
//
//
//
//
//
//
//    public static void main(String[] args) {
//
//
//
//
//      //  stringX("xdfhbp");
//
//        stringX("xdfxxxxxhbpxxxxx"); //xdfhbpx
//
//
//        System.out.println(altPairs("Chocolatee"));
//
//
//
//
//
//
//
//
//
//    }
//
//}
