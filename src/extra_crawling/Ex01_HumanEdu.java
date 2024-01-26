package extra_crawling;

import javax.swing.text.Document;

import org.jsoup.Jsoup;

public class Ex01_HumanEdu {

	public static void main(String[] args) {
		String url = "https://www.human.or.kr/";
		Document Jsoup.connect(url).get();
	}

}
