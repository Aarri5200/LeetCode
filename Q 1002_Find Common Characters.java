class Solution {
    public List<String> commonChars(String[] words) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : words[0].toCharArray()){

            map.put(c, map.getOrDefault(c, 0) + 1);

        }

        for(int i = 1; i < words.length; i++){

            String str = words[i];

            HashMap<Character, Integer> temp = new HashMap<>();

            for(int j = 0; j < str.length(); j++){

                char ci = str.charAt(j);

                if(map.containsKey(ci)){

                    temp.put(ci, Math.min(map.get(ci), temp.getOrDefault(ci, 0) + 1));

                }

            }

            map = temp;

        }

        List<String> x = new ArrayList<>();

        for(char c : map.keySet()){

            int count = map.get(c);

            for(int i = 0; i < count; i++){

                x.add(String.valueOf(c));

            }

        }

        return x;
        
    }

}
