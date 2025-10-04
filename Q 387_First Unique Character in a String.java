class Solution {
    public int firstUniqChar(String s) {
        
        char [] ch = s.toCharArray();
        int n = ch.length;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){

            char c = ch[i];

            map.put(c, map.getOrDefault(c , 0) + 1);

        }

        for(int i = 0; i < n; i++){

            if(map.get(ch[i]) == 1){

                return i;

            }

        }

        return -1;

    }

}
