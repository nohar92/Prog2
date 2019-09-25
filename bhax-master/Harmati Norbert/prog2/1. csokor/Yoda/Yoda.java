public class Yoda {

    public static void main(String args[])
    {
        try {
            String text = null;
            if (text.equals("nem null"))
            {
                System.out.println("Text");
            }
        } catch (NullPointerException e)
        {
            System.out.println("\nEz történik ha nem követjük a Yoda elvet.\n");
        }

    }
}


