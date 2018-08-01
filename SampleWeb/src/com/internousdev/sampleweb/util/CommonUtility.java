package com.internousdev.sampleweb.util;

import java.util.ArrayList;
import java.util.List;

public class CommonUtility {

	//仮ユーザーが来たときのランダムな数列を生成している
	public String getRamdomValue(){
		String value="";
		double d;
		for(int i=1; i<=16; i++){
			d=Math.random() * 10;
			value=value+((int)d);
		}
		return value;
	}
	public String[] parseArrayList(String s){
		return s.split(",",0);
	}


	//商品が並ぶ次のページに飛ぶ仕組みを定義している
	public <E> List<List<E>> devidedList(List<E> list, int size){
		if(list == null || list.isEmpty() || size <= 0){
			return null;
		}
		int block = list.size() / size + (list.size() % size > 0 ? 1 : 0 );
		List<List<E>> devidedList = new ArrayList<List<E>>(block);
		for (int i = 0; i < block; i++){
			int start = i * size;
			int end = Math.min(start + start, list.size());
			devidedList.add(new ArrayList<E>(list.subList(start,end)));
		}
		return devidedList;
	}

}
