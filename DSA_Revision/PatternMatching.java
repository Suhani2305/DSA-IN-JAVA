// package DSA_Revision;

public class PatternMatching {
    // Naive Pattern Matching Algorithm
    public static void naivePatternMatching(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        for(int i =0;i<=n-m;i++){
            for(int j=0; j<m;j++){
                if(text.charAt(i+j)!=pattern.charAt(j)){
                    break;
                }
                if(j==m-1){
                    System.out.println("Pattern found at index: " + i);
                }
            }
        }
    }


    // KMP Algorithm
    public static void computeLPSArray(String pattern , int[] lps){
        int len =0;
        lps[0]=0;
        int i=1;
        while(i<pattern.length()){
            if(pattern.charAt(i)==pattern.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0){
                    len = lps[len-1];
                }else{
                    lps[i]=0;
                    i++;
                }
                }
            }
        }
    
        public static void KMPSearch(String pattern, String text){
            int m = pattern.length();
            int n = text.length();
            int [] lps = new int[m];
            computeLPSArray(pattern, lps);
            int i=0,j=0;
            while(i<n){
                if(pattern.charAt(j)==text.charAt(i)){
                    i++;
                    j++;
                
                }
                if(j==m){
                    System.out.println("Pattern found at index: " + (i-j));
                    j = lps[j-1];
                }else if(i<n && pattern.charAt(j)!=text.charAt(i)){
                    if(j!=0){
                        j = lps[j-1];
                    }else{
                        i++;
                    }
                }
            }
        }
    

        // rabin karp algorithm
        public final static int d = 256; // number of characters in the input alphabet
        public final static int q = 101; // a prime number

        static void RabinKarp(String pattern, String text){
            int m = pattern.length();
            int n = text.length();
            int i, j;
            int p=0;  // hash value for pattern
            int t=0;   //hash value for text
            int h=1;

            // h = pow(d, M-1) % q
            for(i=0;i<m-1;i++){
                h = (h*d)%q;
            }
            
            // Pattern and first window hash
            for(i=0;i<m;i++){
                p = (d*p + pattern.charAt(i))%q;
                t = (d*t + text.charAt(i))%q;
            }

            //slide window over text
            for(i =0;i<=n-m;i++){
                if(p==t){
                    for(j=0;j<m;j++){
                        if(text.charAt(i+j)!=pattern.charAt(j)){
                            break;
                        }
                    }
                    if(j==m){
                        System.out.println("Pattern found at index: " + i);
                    }
                }
                // Calculate hash value for next window of text: Remove leading digit, add trailing digit
                if(n-m>i){
                    t = (d*(t - text.charAt(i)*h) + text.charAt(i+m))%q;
                    if(t<0) t += q;
                }
            }
        }
    public static void main(String[] args) {
        String text = "ababcabcabababd";
        String pattern = "abbd";
        naivePatternMatching(text, pattern);
        KMPSearch(pattern, text);
        RabinKarp(pattern, text);

    }
}
