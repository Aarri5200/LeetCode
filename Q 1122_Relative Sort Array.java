class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int n1 = arr1.length;
        int n2 = arr2.length;

        Arrays.sort(arr1);

        int [] x = new int[n1];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n1; i++){

            int num = arr1[i];

            map.put(num, map.getOrDefault(num, 0) + 1);

        }

        int k = 0;

        for(int i = 0; i < n2; i++){

            int num = arr2[i];

            if(map.containsKey(num)){

                for(int j = 0; j < map.get(num); j++){

                    x[k++] = num;

                }

                map.remove(num);

            }

        }

        for(int i = 0; i < n1; i++){

            int num = arr1[i];

            if(map.containsKey(num)){

                x[k++] = num;

                map.put(num, map.get(num) - 1);

                if(map.get(num) == 0){

                    map.remove(num);
                    
                }

            }

        }

        return x;
        
    }
}
