class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int j,cnt=0;
        int n = items.size();
        
        if(ruleKey.equals("type")){
            j=0;
            for(int i=0 ; i<n; i++){
                if(items.get(i).get(j).equals(ruleValue))
                    cnt++;
            }
        }
        if(ruleKey.equals("color")){
            j=1;
            for(int i=0 ; i<n; i++){
                if(items.get(i).get(j).equals(ruleValue))
                    cnt++;
            }
            
        }
        if(ruleKey.equals("name")){
            j=2;
            for(int i=0 ; i<n; i++){
                if(items.get(i).get(j).equals(ruleValue))
                    cnt++;
            }
        }
        
        return cnt;
    }
}