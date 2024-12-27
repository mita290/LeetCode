class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case 'M':
                    sum += 1000;
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'I':
                    if (i != s.length() - 1) {
                        if (s.charAt(i + 1) == 'X') {
                            i++;
                            sum += 9;
                            break;
                        } else if (s.charAt(i + 1) == 'V') {
                            i++;
                            sum += 4;
                            break;
                        } else {
                            sum += 1;
                            break;
                        }
                    } else {
                        sum += 1;
                        break;
                    }
                case 'X':
                    if (i != s.length() - 1) {
                        if (s.charAt(i + 1) == 'C') {
                            i++;
                            sum += 90;
                            break;
                        } else if (s.charAt(i + 1) == 'L') {
                            i++;
                            sum += 40;
                            break;
                        } else {
                            sum += 10;
                            break;
                        }
                    } else {
                        sum += 10;
                        break;
                    }
                case 'C':
                    if (i != s.length() - 1) {
                        if (s.charAt(i + 1) == 'M') {
                            i++;
                            sum += 900;
                            break;
                        } else if (s.charAt(i + 1) == 'D') {
                            i++;
                            sum += 400;
                            break;
                        } else {
                            sum += 100;
                            break;
                        }
                    } else {
                        sum += 100;
                        break;
                    }
            }
        }
        return sum;
    }
}