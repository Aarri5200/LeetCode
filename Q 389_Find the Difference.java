class Solution {
    public char findTheDifference(String s, String t) {

        char [] ch1 = s.toCharArray();
        int n1 = ch1.length;

        char [] ch2 = t.toCharArray();
        int n2 = ch2.length;

        char ch = ' ';

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < n2; i++){

            char d = ch2[i];
            map.put(d, map.getOrDefault(d, 0) + 1);

        }

        for(int i = 0; i < n1; i++){

            char d = ch1[i];

            if(map.containsKey(d)){

                int newCount = map.get(d) - 1;

                if(newCount == 0) {

                    map.remove(d);

                }

                else{

                    map.put(d, newCount);

                }
    
            }

        }

        ch = map.keySet().iterator().next();

        return ch;
        
    }

}
