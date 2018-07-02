
public class Person {
	//public Person(){}
	public String name = null;
	//文字列を入れられるname箱　nullは空っぽ
	public int age = 0;
	//整数入れられるage箱
	public Person(){}//デフォルトコンストラクタ	//ここから　
	public Person (String name, int age){
		this.name = name;
		this.age = age;							//コンストラクタの多重定義（オーバーロード）
	}
	public Person(String name){
		this.name = name;
		this.age = 0;
	}
	public Person(int age){
		this.name = "名前なし";
		this.age = age;
	}
	public Person(int age,String name){
		this.name =name;
		this.age = age;
	}											//ここ
	
	public void talk(){
		System.out.println(this.name + "が話す");
		//this.このクラスのnameつまりnull
	}
	
	public void walk(){
		System.out.println(this.name + "が歩く");
	}
	
	public void toshi(){
		System.out.println(this.name + "は" + this.age +"歳です");
	}
}
