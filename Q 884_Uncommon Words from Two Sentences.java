class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String, Integer> map = new HashMap<>();

        for(String str : s1.split(" ")){

            map.put(str, map.getOrDefault(str, 0) + 1);

        }

        for(String str : s2.split(" ")){

            map.put(str, map.getOrDefault(str, 0) + 1);

        }

        List<String> x = new ArrayList<>();

        for(String s : map.keySet()){

            if(map.get(s) == 1){

                x.add(s);

            }

        }

        String [] arr = x.toArray(new String[0]);

        return arr;
        
    }

}
