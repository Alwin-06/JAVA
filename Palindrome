class string1{
        char[] word;
        int i,j;
        public void palindrome(char[] word)
        {
            this.word=word;
        }
       // boolean ispalindrome=true;
        public boolean ispalindrome()
        {
            for(i=0,j=4;i<j;i++,j--)
            {
                if(word[i]!=word[j])
                {
                    return false;
                }
            }
            return true;
        }
    }
    
class Main
{
    public static void main(String[] args)
    {
        char[] word={'m','a','d','b','m'};
        string1 pal;
        pal=new string1();
        pal.palindrome(word);
      //  boolean ispal=true;
      //  boolean p=pal.ispalindrome();
        if(pal.ispalindrome())
        {
            System.out.println("Madam is a palindrome");
        }
        else
        {
            System.out.println("Madam is not a palindrome");
        }
    }
}
