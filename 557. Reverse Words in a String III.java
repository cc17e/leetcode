class Solution {
    public String reverseWords(String s) {
        char temp;
        char[] s2=s.toCharArray();
        int first=0,a=0;
        
        for(int location=0;location<s2.length-1;location++){
            if(s2[location]==' '){  
                a=0;
                int end=location-1;
                for(int counter=first;counter<=(end+first)/2;counter++){
                    int n=end-a;
                    temp=s2[counter];
                    s2[counter]=s2[n];
                    s2[n]=temp;
                    a++;
                }
                first=location+1;
            }
        }
        
        a=1;
        for(int counter=first;counter<=(s2.length+first-1)/2;counter++){
            temp=s2[counter];
            s2[counter]=s2[s2.length-a];
            s2[s2.length-a]=temp;
            a++;
        }
        
        String swappedString = new String(s2);
        return swappedString;
    }
}
