package com.internousdev.ecsite.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	//staticをつけた変数を静的変数という
	private static String driverName="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost/ecsite";

	private static String user="root";
	private static String password = "mysql";

	public Connection getConnection(){
		Connection con = null;
		/*
		try-catch文とは、例外が発生する可能性がある処理に使うもの
		try{
			例外が発生する可能性のある処理
		}catch(例外の型 引数){
			例外が発生した場合の処理(例外が発生しなければ行われない処理)
		}finally{
			例外の有無に関わらず、最後に必ず実行される処理
		}
		printStackTraceメソッドは例外メッセージを出力する
		*/
		try{
			Class.forName(driverName);//JDBCドライバーをロード
			con = (Connection)DriverManager.getConnection(url,user,password);//コネクションを取得する
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}

}
