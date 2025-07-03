package lib;

public class PasswordValidator {

    /**
     * ตรวจสอบความปลอดภัยของรหัสผ่าน
     * @param จำนวนตัวอักษรต้องมากกว่า 8 , ตัวพิมพ์เล็ก , ตัวพิมพ์ใหญ่ , ตัวเลข , อักขระพิเศษ 
     * @return ระดับความปลอดภัยของรหัสผ่าน : ไม่ถูกต้อง  , อ่อน  , ปานกลาง , แข็งแกร่ง 
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        PasswordStrength result = null;
        int count = 0;
        boolean Upper = false;
        boolean Lower = false;
        boolean Digit = false;
        boolean SpecialChar = false ;


        if (password.length() < 8 || password == null ) {  // รหัสผ่านน้อยกว่า 8 หรือ ช่องว่าง
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

        


    
    return result ; // TODO: การคืนค่านี้ถูกต้องหรือไม่?
}
}


//    } else {
//             result = PasswordStrength.WEAK;

//             boolean Upper =  password.matches("[A-Z]");
//             boolean Lower =  password.matches("[a-z]");
//             boolean Digit =  password.matches("[//d+]");
//             boolean SpecialChar =  password.matches("[$&+,:;=?@#|'<>.-^*()%!]");
            

//             if ( Upper || Lower || Digit || SpecialChar) {
//                 result = PasswordStrength.MEDIUM;
//             } else if ( Upper && Lower && Digit && SpecialChar ){
//                 result = PasswordStrength.STRONG;
//             }
//         }

        //     for (char c : password.toCharArray()) {
        //     if(Character.isUpperCase(c));
        //     Upper = true ;
        //     if (Upper) {count++ ;}

        //     if(Character.isLowerCase(c)) {
        //         Lower = true ;
        //         if (Lower) { count++ ;}
        //     }
        // }

        

        // if (count == 0 ) {
        //     result = PasswordStrength.INVALID;
        // } else if ( count == 1 || count == 2 || count == 3) {
        //     result = PasswordStrength.WEAK;
        // } else if ( count == 4) {
        //     result = PasswordStrength.MEDIUM;
        // } else if ( count == 5) {
        //     result = PasswordStrength.STRONG;
        // }