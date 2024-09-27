public class Classwork
{
  public static void main(String[] args)
  {
    System.out.println(firstLastN("dictionary", 3));

  }
  public static String firstLastN(String word, int n)

  {

    String output = new String();

    String firstN = word.substring(0, n);

    int indexOfToLast = word.length() - n;
    String lastN = word.substring(indexOfToLast);

    output = firstN + lastN;
    return output;

  }

  // write solutions to problems below

}
