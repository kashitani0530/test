package sample;

public class AnotherClassSample
{
    private String name;                                         // （Ａ）

    // コンストラクタ
    public AnotherClassSample()                                  // （Ｂ）
    {
        System.out.println("AnotherClassSample Constructor!!");  // （Ｃ）
        name = "foo";                                            // （Ｄ）
    }

    // 名称設定
    public void setName(String new_name)
    {
        name = new_name;                                         // （Ｅ）
    }

    // 名称表示
    public void printName()
    {
        System.out.println("My name is " + name + ".");          // （Ｆ）
    }
}