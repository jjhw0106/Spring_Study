package hello.core;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class CoreApplicationTests {

	@Test
	void contextLoads() {
		DateTimeFormatter DTF_BASIC = DateTimeFormatter.ofPattern("yyyyMMdd");

		String today = LocalDateTime.now().format(DTF_BASIC);

		String[] holidayList = {"20220407","20220406","20220404"};

		for(String day : holidayList){
			if(today.equals(day)){
			}
		}

		if(LocalDateTime.now().getDayOfWeek().getValue() == 4 || LocalDateTime.now().getDayOfWeek().getValue() == 7){

		}
	}

	Boolean isWeekend(int dayValue){

		if(dayValue == 6 || dayValue==7){
			dayValue--;
		}

		return true;
	}

}
