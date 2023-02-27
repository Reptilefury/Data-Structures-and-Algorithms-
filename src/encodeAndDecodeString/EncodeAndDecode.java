package encodeAndDecodeString;
import java.util.ArrayList;
import java.util.List;
public class EncodeAndDecode {
    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String s : strs) {
            encodedString.append(s.length()).append("#").append(s);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') j++;
            int length = Integer.valueOf(str.substring(i, j));
            i = j + 1 + length;
            list.add(str.substring(j + 1, i));
        }
        return list;
    }
}

class EncodeDecode2 {
    public String encode(List<String> strs) {
        StringBuilder encodeString = new StringBuilder();
        for (String s : strs) {
            encodeString.append(s.length()).append("#").append(s);
        }
        return encodeString.toString();
    }

    public List<String> decode(String strs) {
        List<String> list = new ArrayList();
        int i = 0;
        while (i < strs.length()) {
            int j = i;
            while (strs.charAt(j) != '#') {
                j++;
            }
            int length = Integer.valueOf(strs.substring(i, j));
            i = j + 1 + length;
            list.add(strs.substring(j + i, i));
        }
        return list;
    }
}


class EncodeDecodeSol {
    public String encode(List<String> strs) {
        StringBuilder stringEncode = new StringBuilder();
        for (String s : strs) {
            stringEncode.append(s.length()).append("#").append(s);
        }
        return stringEncode.toString();
    }

    public List<String> decode(String strs) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < strs.length()) {
            int j = i;
            while (strs.charAt(j) != '#') j++;
            int length = Integer.valueOf(strs.substring(i, j));
            i = j + 1 + length;
            list.add(strs.substring(j + 1, i));
        }
        return list;
    }
}















