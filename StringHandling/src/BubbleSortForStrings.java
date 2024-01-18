public class BubbleSortForStrings {
    static String s1[] ={"Now", "is", "the", "time", "for", "all", "good", "men", "to", "come", "to", "the", "aid", "of", "their", "country."};
    public static void main(String[] args) {
        int j;
        String temp;
        for(int i=0;i<s1.length;i++){
            for(j = i+1;j<s1.length;j++){
                if(s1[j].compareTo(s1[i]) < 0){
                    temp = s1[i];
                    s1[i]=s1[j];
                    s1[j]=temp;
                }
            }
            System.out.println(s1[i]);
        }
    }
}
