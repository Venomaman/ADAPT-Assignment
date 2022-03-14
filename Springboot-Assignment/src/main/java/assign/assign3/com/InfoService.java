package assign.assign3.com;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class InfoService {
	
	private List<Info> infos = new ArrayList<>(Arrays.asList(
			new Info("111","AK","ANCHOGRAGE","US"),
			new Info("112","BK","GRAGE","IN"),
			new Info("113","CK","ANCHGE","SL"),
			new Info("114","DK","CHOGRA","AD"))
			);
	
			/*
			 * public List<Info> getAllInfo() { return infos; }
			 */
	public Info getInfo(String id) {
		return infos.stream().filter(t-> t.getId().equals(id)).findFirst().get();

}
}
