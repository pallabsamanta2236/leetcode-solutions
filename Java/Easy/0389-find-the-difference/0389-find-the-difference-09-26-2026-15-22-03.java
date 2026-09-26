class Solution {
    public char findTheDifference(String s, String t) {
        // int n = s.length();
        // int m = t.length();
        // char[] arr = new char[n];

        // for(int i =0; i<n;i++){
        //     arr[i] = s.charAt(i);
        // } 

        // boolean[] used = new boolean[n];

        // for (int i = 0; i < m; i++) {
        //     boolean found = false;

        //     for (int j = 0; j < n; j++) {
        //         if (t.charAt(i) == arr[j] && !used[j]) {
        //             used[j] = true;
        //             found = true;
        //             break;
        //         }
        //     }

        //     if (!found) {
        //         return t.charAt(i);
        //     }
        // }
        // return ' ';

        int n = s.length();
        int m = t.length();
        int sum = 0;

        for(int i =0; i< m; i++){
            sum += t.charAt(i);
        }

        for(int j =0; j<n; j++){
            sum -= s.charAt(j);
        }
        return (char) sum;
    }
}