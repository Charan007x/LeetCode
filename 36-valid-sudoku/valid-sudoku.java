class Solution {
    public boolean isValidSudoku(char[][] a) {
        int n = 9;
        char ch = ' ';
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0;i<n;i++) {
            map.clear();
            for (int j = 0; j < n; j++) {
                ch = a[i][j];
                if (ch != '.' && map.containsKey(ch)) return false;
                else if (ch != '.') map.put(ch, 1);
            }
        }

        for (int i = 0; i < n; i++) {
            map.clear();
            for (int j = 0; j < n; j++) {
                ch = a[j][i];
                if (ch != '.' && map.containsKey(ch)) return false;
                else if (ch != '.') map.put(ch, 1);
            }
        }

        map.clear();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ch = a[i][j];
                if (ch != '.' && map.containsKey(ch)) return false;
                else if (ch != '.') map.put(ch, 1);
            }
        }

        map.clear();
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 6; j++) {
                ch = a[i][j];
                if (ch != '.' && map.containsKey(ch)) return false;
                else if (ch != '.') map.put(ch, 1);
            }
        }

        map.clear();
        for (int i = 0; i < 3; i++) {
            for (int j = 6; j < 9; j++) {
                ch = a[i][j];
                if (ch != '.' && map.containsKey(ch)) return false;
                else if (ch != '.') map.put(ch, 1);
            }
        }

        map.clear();
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                ch = a[i][j];
                if (ch != '.' && map.containsKey(ch)) return false;
                else if (ch != '.') map.put(ch, 1);
            }
        }

        map.clear();
        for (int i = 3; i < 6; i++) {
            for (int j = 3; j < 6; j++) {
                ch = a[i][j];
                if (ch != '.' && map.containsKey(ch)) return false;
                else if (ch != '.') map.put(ch, 1);
            }
        }

        map.clear();
        for (int i = 3; i < 6; i++) {
            for (int j = 6; j < 9; j++) {
                ch = a[i][j];
                if (ch != '.' && map.containsKey(ch)) return false;
                else if (ch != '.') map.put(ch, 1);
            }
        }

        map.clear();
        for (int i = 6; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                ch = a[i][j];
                if (ch != '.' && map.containsKey(ch)) return false;
                else if (ch != '.') map.put(ch, 1);
            }
        }

        map.clear();
        for (int i = 6; i < 9; i++) {
            for (int j = 3; j < 6; j++) {
                ch = a[i][j];
                if (ch != '.' && map.containsKey(ch)) return false;
                else if (ch != '.') map.put(ch, 1);
            }
        }

        map.clear();
        for (int i = 6; i < 9; i++) {
            for (int j = 6; j < 9; j++) {
                ch = a[i][j];
                if (ch != '.' && map.containsKey(ch)) return false;
                else if (ch != '.') map.put(ch, 1);
            }
        }

        return true;
    }
}