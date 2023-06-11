int strStr(char * haystack, char * needle){
    int i=0;
    while(haystack[i]){
        if(haystack[i]==needle[0]){
            int n=0;
            int m=i;
            while(needle[n]&&haystack[m]){
                if(needle[n]!=haystack[m]){
                    break;
                }
                n++;
                m++;
            }
            if(needle[n]==NULL) return i;
        }
        i++;
    }
    return -1;
}
