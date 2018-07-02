
public class Test {

	public static void main(String[] args) {
		
		Person taro =new Person("山田太郎",20);
		Person saburo = new Person("三郎");
		System.out.println(saburo.name);
		System.out.println(saburo.age);
		Person none = new Person(25);
		System.out.println(none.name);
		System.out.println(none.age);
		Person hanako =new Person("鈴木花子",17);
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		//taro変数　Personクラスの機能をtaroにコピー
		//taro.name="山田太郎";
		//taro.age=20;
		//.でtaroが持っていたname箱とage箱を呼び出している
		System.out.println(taro.name);
		System.out.println(taro.age);
		taro.talk();
		//talkメソッドの{}内を呼び出している
		
		Person jiro = new Person();
		jiro.name = "田中次郎";
		System.out.println(jiro.name);
		jiro.talk();
		jiro.walk();
		taro.toshi();
		
		Robot aibo = new Robot();
		Robot pepper = new Robot();
		aibo.name="相棒";
		pepper.name="ペッパー";
		aibo.talk();
		pepper.run();
		
		Person aiboo =new Person();
		aiboo.name = "相棒";
		aiboo.age = 50;
		aiboo.toshi();
		
		hanako.toshi();

	}

}
