class Solution {
    public int romanToInt(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int a=0,b=0;
            switch(s.charAt(i)){
                case 'I':a=1;
                break;
                case'V':a=5;
                break;
                case 'X':a=10;
                break;
                case 'L':a=50;
                break;
                case 'C':a=100;
                break;
                case 'D':a=500;
                break;
                case 'M':a=1000;
                break;

            }
            if(i+1<s.length()){
                switch(s.charAt(i+1)){
                     case 'I': b = 1; 
                     break;
                    case 'V': b = 5;
                     break;
                    case 'X': b = 10; 
                    break;
                    case 'L': b = 50; 
                    break;
                    case 'C': b = 100;
                     break;
                    case 'D': b = 500; 
                    break;
                    case 'M': b = 1000; 
                    break;
                }
            }
            if(a<b){
                sum=sum-a;
            }
            else{
                sum=sum+a;
            }
            
        
        }
        return sum;
        
    }
}
