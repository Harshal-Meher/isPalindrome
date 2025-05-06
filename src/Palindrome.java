public class Palindrome {
    public static boolean isPalindome(String str1) {
        char[] data = str1.toCharArray();
        int i = 0;
        int j =data.length - 1;
        while (i < j) {
            if (data[i] != data[j]){
                return false;
            }
            ++i;
            --j;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "12345211";
        String str1= str.replaceAll("[\\p{P}\\p{S}0-9]" ,"");
        //logic
        if (isPalindome(str1)){
            System.out.println(str1 + " Is Palindrome ");
        }else  {
            System.out.println(str1 + " Is Not Palindrome ");
        }

        // StringBuilder
        String rev = new StringBuilder(str1).reverse().toString();
        if(str1.equals(rev)){
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is Not a palindrome");
        }

    }
}
