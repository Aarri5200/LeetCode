class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        char [] ch1 = jewels.toCharArray();
        char [] ch2 = stones.toCharArray();
        int out = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < ch2.length; i++){

            char c = ch2[i];

            map.put(c, map.getOrDefault(c , 0) + 1);

        }

        for(int i = 0; i < ch1.length; i++){

            char c = ch1[i];
            
            if(map.containsKey(c)){

                out = out + map.get(c);

            }

        }

        return out;

    }

}
