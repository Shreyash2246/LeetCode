class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tria = new ArrayList<>();

        for(int i=0; i < numRows; i++){

            List<Integer> row = new ArrayList<>();

            for(int j=0; j <= i; j++){

                if(j==0 || j==i){
                    row.add(1);
                }else{
                    int val = tria.get(i-1).get(j-1) + tria.get(i-1).get(j);
                    row.add(val);
                }

            }
            tria.add(row);
        }
        return tria;
    }
}