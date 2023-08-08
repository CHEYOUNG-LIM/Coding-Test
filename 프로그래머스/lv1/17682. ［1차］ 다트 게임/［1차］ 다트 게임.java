// public class Solution {
//     public int solution(String dartResult) {
//         int[] scores = new int[3];
//         int currentIndex = 0; // 현재 기회 인덱스
        
//         for (int i = 0; i < dartResult.length(); i++) {
//             char ch = dartResult.charAt(i);
            
//             if (Character.isDigit(ch)) {
//                 int score = ch - '0';
//                 // 10 처리
//                 if (i + 1 < dartResult.length() && Character.isDigit(dartResult.charAt(i + 1))) {
//                     score = 10;
//                     i++;
//                 }
//                 scores[currentIndex] = score;
//             } else if (ch == 'S' || ch == 'D' || ch == 'T') {
//                 if (ch == 'D') {
//                     scores[currentIndex] = (int) Math.pow(scores[currentIndex], 2);
//                 } else if (ch == 'T') {
//                     scores[currentIndex] = (int) Math.pow(scores[currentIndex], 3);
//                 }
//                 currentIndex++;
//             } else if (ch == '*' || ch == '#') {
//                 if (ch == '*') {
//                     scores[currentIndex - 1] *= 2;
//                     if (currentIndex - 2 >= 0) {
//                         scores[currentIndex - 2] *= 2;
//                     }
//                 } else if (ch == '#') {
//                     scores[currentIndex - 1] *= -1;
//                 }
//             }
//         }
        
//         int answer = 0;
//         for (int score : scores) {
//             answer += score;
//         }
        
//         return answer;
//     }
// }

import java.util.ArrayList;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;

        ArrayList<String> list = new ArrayList<String>();

        String nStr = "";
        int cnt = 0;

        for(int i = 0; i < dartResult.length(); i++) {
            if(dartResult.charAt(i) >= 48 && dartResult.charAt(i) <= 57) {
                cnt++;
                nStr += dartResult.charAt(i);
            } else {
                if(cnt > 0) {
                    list.add(nStr);
                    nStr = "";
                    cnt = 0;
                }
                list.add(dartResult.charAt(i)+"");
            }
        }
        int count = 0;

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("S")) {
                answer += (int)Math.pow(Integer.parseInt(list.get(i-1)), 1);
                count++;
            } else if(list.get(i).equals("D")) {
                answer += (int)Math.pow(Integer.parseInt(list.get(i-1)), 2);
                count++;
            } else if(list.get(i).equals("T")) {
                answer += (int)Math.pow(Integer.parseInt(list.get(i-1)), 3);
                count++;
            } else if(list.get(i).equals("#")) {
                if(count == 1) {
                    if(list.get(i-1).equals("S")) {
                        answer -= Integer.parseInt(list.get(i-2));
                        answer += Integer.parseInt(list.get(i-2)) * -1;
                    } else if(list.get(i-1).equals("D")) {
                        answer -= Math.pow(Integer.parseInt(list.get(i-2)), 2);
                        answer += Math.pow(Integer.parseInt(list.get(i-2)), 2) * -1;
                    } else if(list.get(i-1).equals("T")) {
                        answer -= Math.pow(Integer.parseInt(list.get(i-2)), 3);
                        answer += Math.pow(Integer.parseInt(list.get(i-2)), 3) * -1;
                    }
                } else if(count == 2) {
                    if(list.get(i-1).equals("S")) {
                        answer -= Integer.parseInt(list.get(i-2));
                        answer += Integer.parseInt(list.get(i-2)) * -1;
                    } else if(list.get(i-1).equals("D")) {
                        answer -= Math.pow(Integer.parseInt(list.get(i-2)), 2);
                        answer += Math.pow(Integer.parseInt(list.get(i-2)), 2) * -1;
                    } else if(list.get(i-1).equals("T")) {
                        answer -= Math.pow(Integer.parseInt(list.get(i-2)), 3);
                        answer += Math.pow(Integer.parseInt(list.get(i-2)), 3) * -1;
                    }
                } else {
                    if(list.get(i-1).equals("S")) {
                        answer -= Integer.parseInt(list.get(i-2));
                        answer += Integer.parseInt(list.get(i-2)) * -1;
                    } else if(list.get(i-1).equals("D")) {
                        answer -= Math.pow(Integer.parseInt(list.get(i-2)), 2);
                        answer += Math.pow(Integer.parseInt(list.get(i-2)), 2) * -1;
                    } else if(list.get(i-1).equals("T")) {
                        answer -= Math.pow(Integer.parseInt(list.get(i-2)), 3);
                        answer += Math.pow(Integer.parseInt(list.get(i-2)), 3) * -1;
                    }
                }
            } else if(list.get(i).equals("*")) {
                if(count == 1) {
                    if(list.get(i-1).equals("S")) {
                        answer -= Integer.parseInt(list.get(i-2));
                        answer += (Integer.parseInt(list.get(i-2))) * 2;
                    } else if(list.get(i-1).equals("D")) {
                        answer -= Math.pow(Integer.parseInt(list.get(i-2)), 2);
                        answer += (Math.pow(Integer.parseInt(list.get(i-2)), 2)) * 2;
                    } else if(list.get(i-1).equals("T")) {
                        answer -= Math.pow(Integer.parseInt(list.get(i-2)), 3);
                        answer += (Math.pow(Integer.parseInt(list.get(i-2)), 3)) * 2;
                    }
                } else if(count == 2) {
                    if(list.get(i-1).equals("S")) {
                        answer -= Integer.parseInt(list.get(i-2));
                        answer += Integer.parseInt(list.get(i-2)) * 2;
                    } else if(list.get(i-1).equals("D")) {
                        answer -= Math.pow(Integer.parseInt(list.get(i-2)), 2);
                        answer += (Math.pow(Integer.parseInt(list.get(i-2)), 2)) * 2;
                    } else if(list.get(i-1).equals("T")) {
                        answer -= Math.pow(Integer.parseInt(list.get(i-2)), 3);
                        answer += (Math.pow(Integer.parseInt(list.get(i-2)), 3)) * 2;
                    } 

                    if(list.get(i-3).equals("S")) {
                        answer -= Integer.parseInt(list.get(i-4));
                        answer += (Integer.parseInt(list.get(i-4))) * 2;
                    } else if(list.get(i-3).equals("D")) {
                        answer -= Math.pow(Integer.parseInt(list.get(i-4)), 2);
                        answer += (Math.pow(Integer.parseInt(list.get(i-4)), 2)) * 2;
                    } else if(list.get(i-3).equals("T")) {
                        answer -= Math.pow(Integer.parseInt(list.get(i-4)), 3);
                        answer += (Math.pow(Integer.parseInt(list.get(i-4)), 3)) * 2;
                    }

                    if(list.get(i-4).equals("S")) {
                        if(list.get(i-3).equals("#")) {
                            answer -= (Integer.parseInt(list.get(i-5))*-1);
                            answer += (Integer.parseInt(list.get(i-5))*-1) * 2;
                        } else if(list.get(i-3).equals("*")) {
                            answer -= Integer.parseInt(list.get(i-5)) * 2;
                            answer += Integer.parseInt(list.get(i-5)) * 4;
                        }
                    } else if(list.get(i-4).equals("D")) {
                        if(list.get(i-3).equals("#")) {
                            answer -= (Math.pow(Integer.parseInt(list.get(i-5)), 2) * -1);
                            answer += (Math.pow(Integer.parseInt(list.get(i-5)), 2) * -1) * 2;
                        } else if(list.get(i-3).equals("*")) {
                            answer -= Math.pow(Integer.parseInt(list.get(i-5)), 2) * 2;
                            answer += Math.pow(Integer.parseInt(list.get(i-5)), 2) * 4;
                        }
                    } else if(list.get(i-4).equals("T")) {
                        if(list.get(i-3).equals("#")) {
                            answer -= (Math.pow(Integer.parseInt(list.get(i-5)), 3) * -1);
                            answer += (Math.pow(Integer.parseInt(list.get(i-5)), 3) * -1) * 2;
                        } else if(list.get(i-3).equals("*")) {
                            answer -= Math.pow(Integer.parseInt(list.get(i-5)), 3) * 2;
                            answer += Math.pow(Integer.parseInt(list.get(i-5)), 3) * 4;
                        }
                    }

                } else if(count == 3) {
                    if(list.get(i-1).equals("S")) {
                        answer -= Integer.parseInt(list.get(i-2));
                        answer += (Integer.parseInt(list.get(i-2))) * 2;
                    } else if(list.get(i-1).equals("D")) {
                        answer -= Math.pow(Integer.parseInt(list.get(i-2)), 2);
                        answer += (Math.pow(Integer.parseInt(list.get(i-2)), 2)) * 2;
                    } else if(list.get(i-1).equals("T")) {
                        answer -= Math.pow(Integer.parseInt(list.get(i-2)), 3);
                        answer += (Math.pow(Integer.parseInt(list.get(i-2)), 3)) * 2;
                    } 

                    if(list.get(i-3).equals("S")) {
                        answer -= Integer.parseInt(list.get(i-4));
                        answer += (Integer.parseInt(list.get(i-4))) * 2;
                    } else if(list.get(i-3).equals("D")) {
                        answer -= Math.pow(Integer.parseInt(list.get(i-4)), 2);
                        answer += (Math.pow(Integer.parseInt(list.get(i-4)), 2)) * 2;
                    } else if(list.get(i-3).equals("T")) {
                        answer -= Math.pow(Integer.parseInt(list.get(i-4)), 3);
                        answer += (Math.pow(Integer.parseInt(list.get(i-4)), 3)) * 2;
                    }

                    if(list.get(i-4).equals("S")) {
                        if(list.get(i-3).equals("#")) {
                            answer -= (Integer.parseInt(list.get(i-5))*-1);
                            answer += (Integer.parseInt(list.get(i-5))*-1) * 2;
                        } else if(list.get(i-3).equals("*")) {
                            answer -= Integer.parseInt(list.get(i-5)) * 2;
                            answer += Integer.parseInt(list.get(i-5)) * 4;
                        }
                    } else if(list.get(i-4).equals("D")) {
                        if(list.get(i-3).equals("#")) {
                            answer -= (Math.pow(Integer.parseInt(list.get(i-5)), 2) * -1);
                            answer += (Math.pow(Integer.parseInt(list.get(i-5)), 2) * -1) * 2;
                        } else if(list.get(i-3).equals("*")) {
                            answer -= Math.pow(Integer.parseInt(list.get(i-5)), 2) * 2;
                            answer += Math.pow(Integer.parseInt(list.get(i-5)), 2) * 4;
                        }
                    } else if(list.get(i-4).equals("T")) {
                        if(list.get(i-3).equals("#")) {
                            answer -= (Math.pow(Integer.parseInt(list.get(i-5)), 3) * -1);
                            answer += (Math.pow(Integer.parseInt(list.get(i-5)), 3) * -1) * 2;
                        } else if(list.get(i-3).equals("*")) {
                            answer -= Math.pow(Integer.parseInt(list.get(i-5)), 3) * 2;
                            answer += Math.pow(Integer.parseInt(list.get(i-5)), 3) * 4;
                        }
                    }
                }
            }
        }
        return answer;
    }
}