class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        if(names.length % 5 == 0) {
            answer = new String[(names.length / 5)];
        } else {
            answer = new String[(names.length / 5) + 1];
        }
        for(int i = 0; i < names.length; i=i+5) {
            answer[i/5] = names[i];
        }
        return answer;
    }
}

// import java.util.ArrayList;
// import java.util.List;

// class Solution {
//     public String[] solution(String[] names) {
//         List<String> list = new ArrayList<>();
//         for (int i = 0; i < names.length; i+=5) {
//           list.add(names[i]);
//         }
//         return list.toArray(new String[0]);
//     }
// }