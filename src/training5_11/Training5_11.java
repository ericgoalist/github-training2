package training5_11;

import java.util.Calendar;

public class Training5_11 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH) + 1;
		int date = calendar.get(Calendar.DAY_OF_MONTH);
		String message = "今日の日付は" + month + "月" + date + "日です";
		System.out.println(message);
		System.out.println("追加した");

	}
}