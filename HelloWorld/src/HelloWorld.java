import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("入力してください");
		String t=br.readLine(); //redLineの意味:読み込み待ち
		//br.呼び出す　redLineはBufferedReaderのメソッド(機能)
		System.out.println(t + "が入力されました");
		
	}

}

