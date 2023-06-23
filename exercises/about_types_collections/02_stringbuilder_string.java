package about_types_collections;


class CCMask {
    public static void main(String[] args){
        System.out.println(maskCC("1234-5678-9101-1121"));
    }
    public static String maskCC(String creditcard){
        String x = "XXXX-XXXX-XXXX-";
        //solution: B and C
        StringBuffer sb = new StringBuffer(x);
        sb.append(creditcard,15,19);
        return sb.toString();
    }
}

/* 
You must ensure that the maskcc method returns a string that hides all digits of the 
credit card number except the four last digits (and the hyphens that separate each group 
of four digits).
*/

/* A
StringBuilder sb = new StringBuilder(creditcard);
sb.substring(15,19);
return x+sb;
*/

/* B
return x+creditcard.substring(15, 19);
*/

/* C
StringBuffer sb = new StringBuffer(x);
sb.append(creditcard,15,19);
return sb.toString();
*/

/* D
StringBuffer sb = new StringBuffer(creditcard);
StringBuilder s = sb.insert(0,x);
return s.toString();
*/
