package lib;

public class PasswordValidator {

    /**
     * ตรวจสอบความปลอดภัยของรหัสผ่าน
     * @param จำนวนตัวอักษรต้องมากกว่า 8 , ตัวพิมพ์เล็ก , ตัวพิมพ์ใหญ่ , ตัวเลข , อักขระพิเศษ 
     * @return ระดับความปลอดภัยของรหัสผ่าน : ไม่ถูกต้อง  , อ่อน  , ปานกลาง , แข็งแกร่ง 
     */

    public static PasswordStrength validate(String password) { 
        PasswordStrength result = null;
        int count = 0;
        boolean Upper = false;
        boolean Lower = false;
        boolean Digit = false;
        boolean SpecialChar = false ;


        if (password.length() < 8 || password == null ) {  
            return PasswordStrength.INVALID;
        }
        

            for (char c : password.toCharArray()) {
                if(Character.isUpperCase(c)){
                Upper = true ;
            } else if(Character.isLowerCase(c)) {
                Lower = true ;
            } else if(Character.isDigit(c)) {
                Digit = true ;
            }else {
                SpecialChar = true ;
            }
            }

        if (Upper) { count++; }
        if (Lower) { count++; }
        if (Digit) { count++; }
        if (SpecialChar) { count++; }
    
        
        if (count == 4){
            result = PasswordStrength.STRONG;
        }else if(count == 3){
            result = PasswordStrength.MEDIUM;
        }else {
            result = PasswordStrength.WEAK;
        }

        


    
    return result ;
}
}


