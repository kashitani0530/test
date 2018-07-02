public class Capsule {
	
	public static void main(String[] args){
		
		Person taro = new Person("太郎",20);
		System.out.println(taro.getName());
		//publicなのでgetNameは見える
		
		/*System.out.println(taro.name);*/
		//privateでtaro.nameが不可視になる
		
		System.out.println(taro.getAge());
		
		taro.setName("花子");
		System.out.println(taro.getName());
		taro.setAge(18);
		System.out.println(taro.getAge());
	}

}
