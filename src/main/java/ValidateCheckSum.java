public class ValidateCheckSum {
    public static void main(String[] args) {

        System.out.println(validateCheckSum("9310040334082"));

    }

    public static boolean validateCheckSum(String idNumber) {
        int sum = 0;
        String field = "";

        for (int i = 0; i < 12; i++) {

            if (i % 2 == 0) {
                System.out.println(idNumber.charAt(i));
                sum += Integer.parseInt(idNumber.charAt(i) + "");
            }
        }
        for (int i = 0; i < idNumber.length(); i++) {

            if (i % 2 != 0) {
                field += idNumber.charAt(i);
            }
        }
        int val = Integer.parseInt(field) * 2;
        String a = String.valueOf(val);
        int b = 0;
        for (int i = 0; i < a.length(); i++) {
            b += Integer.parseInt(a.charAt(i) + "");
        }

        int result = 10 - Integer.parseInt(String.valueOf(b + sum).charAt(1) + "");
        if (result == Integer.parseInt(idNumber.charAt(idNumber.length() - 1) + "")) {
            return true;
        } else {
            return false;
        }


    }
}
