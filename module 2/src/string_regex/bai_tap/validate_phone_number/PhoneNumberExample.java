package string_regex.bai_tap.validate_phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    /*
    Số điện thoại hợp lệ cần đạt theo mẫu sau: (xx)-(0xxxxxxxxx)
    x là ký tự số
    Không chứa các ký tự đặc biệt
    Ví dụ số điện thoại hợp lệ: (84)-(0978489648)
    Ví dụ tên lớp không hợp lệ: (a8)-(22222222)
     */

    private static final String PHONENUMBER_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public PhoneNumberExample() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONENUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
