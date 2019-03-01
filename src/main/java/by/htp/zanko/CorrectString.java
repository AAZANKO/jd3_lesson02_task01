package by.htp.zanko;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class CorrectString {

    public boolean getCorrectString(String str) {

        List<Character> massiveChar = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

            if (i == 0) {
                if (str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}') {
                    return false;
                }
            }

            if (str.charAt(i) == '(') {
                massiveChar.add(')');
            } else if (str.charAt(i) == ')') {
                if (massiveChar.get(massiveChar.size() - 1) == ')') {
                    massiveChar.remove(massiveChar.size() - 1);
                } else {
                    return false;
                }
            }
            if (str.charAt(i) == '[') {
                massiveChar.add(']');
            } else if (str.charAt(i) == ']') {
                if (massiveChar.get(massiveChar.size() - 1) == ']') {
                    massiveChar.remove(massiveChar.size() - 1);
                } else {
                    return false;
                }
            }

            if (str.charAt(i) == '{') {
                massiveChar.add('}');
            } else if (str.charAt(i) == '}') {
                if (massiveChar.get(massiveChar.size() - 1) == '}') {
                    massiveChar.remove(massiveChar.size() - 1);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
