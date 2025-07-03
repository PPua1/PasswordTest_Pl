package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw = "123" ;
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: Short password is INVALID. \n");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1 +"\n");
        }

        // --- เขียน Test Case อื่น ๆ ต่อ ---
        // Test Case 2: 
        pw = "pangpuai111111" ;
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed: Long password is WEAK. \n");
        } else {
            System.out.println("Test Case 2 FAILED: Expected INVALID but got " + result2 +"\n");
        }


        // Test Case 3: 
        pw = "PANGPuai12345" ;
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 Passed: 3 case Medium. \n ");
        }else {
            System.out.println("Test Case 3  FAILED: Expected INVALID but got " + result3 +"\n");
        }

        // Test Case 4: 
        pw = "PANGPuai_456" ;
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 Passed: upper lower DIgit special Strong \n");
        } else {
            System.out.println("Test Case 4 FAILED: Expected INVALID but got " + result4 +"\n");
        }

        pw = "pangpuailungjing" ; // all lower
        PasswordStrength result5 = PasswordValidator.validate(pw);
        if (result5 == PasswordStrength.WEAK) {
            System.out.println("Test Case 5 Passed: only Lower \n");
        } else {
            System.out.println("Test Case 5  FAILED: Expected INVALID but got " + result5 +"\n");
        }



        System.out.println("--------------------------------");
    }
}
