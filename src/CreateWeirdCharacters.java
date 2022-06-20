public class CreateWeirdCharacters {
    public String solution(String s) {
        String[] arr = s.split("");

        int idx = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(" ")) {
                sb.append(" ");
                idx = 0;
                continue;
            }

            if (idx % 2 == 0) {
                sb.append(arr[i].toUpperCase());
                idx++;
            } else if (idx % 2 != 0) {
                sb.append(arr[i].toLowerCase());
                idx++;
            }
        }

        return sb.toString();
    }
}
