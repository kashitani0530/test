package sample;

public class ClassSample
{
    private String msg;                                  // （１）

    public ClassSample()
    {
        System.out.println("Constructor Was Called.");   // （２）
    }

    public void setMessage(String inMsg)
    {
        msg = inMsg;                                     // （３）
    }

    public void printMessage()
    {
        System.out.println("message:" + msg);            // （４）
    }

    public static void main(String[] args)
    {
    	ClassSample classSample;// （５）

        classSample = new ClassSample();                 // （６）
        classSample.setMessage("Hello Java World!");     // （７）
        classSample.printMessage();                      // （８）

        AnotherClassSample anotherClass = new AnotherClassSample(); // （９）
        anotherClass.printName();                        // （１０）
        anotherClass.setName("bar");                     // （１１）
        anotherClass.printName();                        // （１２）
    }
}