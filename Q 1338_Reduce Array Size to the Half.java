class Solution {
    public int minSetSize(int[] arr) {

        int n = arr.length;
        int count = 0;
        

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num,0) +1);
        }

        ArrayList<Integer> x = new ArrayList<>();

        for(int i : map.keySet()){

            x.add(map.get(i));

        }

        Collections.sort(x, Collections.reverseOrder());


       int i = arr.length;
       int j = 0;

       while(i > arr.length/2){

        i-= x.get(j);
        j++;

       }

       return j; 
        
    }
}
