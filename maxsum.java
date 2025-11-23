import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(maxSumDivThree(new int[]{1,2,3,4,5,5,5}));
    }
    static public int maxSumDivThree(int[] arr) {
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        if (sum % 3 == 0) {
            return sum;
        }

        // sum % 3 == 1 → remove:
        // 1) one number with remainder 1, or
        // 2) two numbers with remainder 2
        else if (sum % 3 == 1) {
            int minRem1 = Integer.MAX_VALUE;          // smallest %3==1
            int firstRem2 = Integer.MAX_VALUE;        // smallest %3==2
            int secondRem2 = Integer.MAX_VALUE;       // second smallest %3==2

            for (int x : arr) {
                int r = x % 3;
                if (r == 1) {
                    if (x < minRem1) minRem1 = x;
                } else if (r == 2) {
                    if (x <= firstRem2) {
                        secondRem2 = firstRem2;
                        firstRem2 = x;
                    } else if (x < secondRem2) {
                        secondRem2 = x;
                    }
                }
            }

            int remove = Integer.MAX_VALUE;
            // option 1: remove one remainder-1
            if (minRem1 != Integer.MAX_VALUE) {
                remove = Math.min(remove, minRem1);
            }
            // option 2: remove two remainder-2
            if (secondRem2 != Integer.MAX_VALUE) {
                remove = Math.min(remove, firstRem2 + secondRem2);
            }

            if (remove == Integer.MAX_VALUE) return 0;  // no valid subset
            return sum - remove;
        }

        // sum % 3 == 2 → remove:
        // 1) one number with remainder 2, or
        // 2) two numbers with remainder 1
        else {
            int minRem2 = Integer.MAX_VALUE;          // smallest %3==2
            int firstRem1 = Integer.MAX_VALUE;        // smallest %3==1
            int secondRem1 = Integer.MAX_VALUE;       // second smallest %3==1

            for (int x : arr) {
                int r = x % 3;
                if (r == 2) {
                    if (x < minRem2) minRem2 = x;
                } else if (r == 1) {
                    if (x <= firstRem1) {
                        secondRem1 = firstRem1;
                        firstRem1 = x;
                    } else if (x < secondRem1) {
                        secondRem1 = x;
                    }
                }
            }

            int remove = Integer.MAX_VALUE;
            // option 1: remove one remainder-2
            if (minRem2 != Integer.MAX_VALUE) {
                remove = Math.min(remove, minRem2);
            }
            // option 2: remove two remainder-1
            if (secondRem1 != Integer.MAX_VALUE) {
                remove = Math.min(remove, firstRem1 + secondRem1);
            }

            if (remove == Integer.MAX_VALUE) return 0;
            return sum - remove;
        }
    }
}

