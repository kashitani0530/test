
public class Person {
	private String name = null;
	private int age = 0;				//フィールド変数
	
	public Person(){}
	public Person(String name,int age){
		this.name = name;
		this.age = age;				//コンストラクタ定義
	}								//(String name.int ageでインスタンス化するための窓口
	
	public String getName(){
		//頭文字は大文字になる
		return this.name;
		//return thisは取得
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setName(String name){
		this.name = name;
		//登録
		//getとset　ゲッターとセッター、アクセッサー
	}
	
	public void setAge(int age){
		this.age = age;
	}

}
