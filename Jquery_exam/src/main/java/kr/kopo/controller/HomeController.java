package kr.kopo.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.kopo.domain.ProfessorVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Locale locale, Model model) throws ParseException {
		logger.info("Welcome list! The client locale is {}.", locale);
		
		
		//1행--------------------------------------------------------
		String from ="1985-05-29";
		Date to;
		SimpleDateFormat transForm =new SimpleDateFormat("yyyy-MM-dd");
		to=transForm.parse(from);
		
		List<ProfessorVO> list=null;
		list=new ArrayList<ProfessorVO>();
		ProfessorVO vo=new ProfessorVO();
		
		//디비를 불러와서 연결해 자료를 가져오는게 원칙이지만 귀찮은 작업임이로 여기서는 해당과정을 생략하고
		//직접입력한다.
		vo.setPid(1);
		vo.setPname("김상범");
		vo.setDept("검정");
		vo.setPost("교수");
		vo.setPay(5000000);
		vo.setHire(to);
		vo.setMajor("프로그램");
		vo.setCampus("폴리텍2");
		list.add(vo);
		//1행--------------------------------------------------------
		
		
		//2행--------------------------------------------------------
		//새롭게 객체를 만들어줘야 덥어쓰기 안돼니까 행을 만들때마다 새로운 객체를 만들어줘야한다.
		from ="1985-06-28";
		transForm =new SimpleDateFormat("yyyy-MM-dd");
		to=transForm.parse(from);
		vo=new ProfessorVO();
		
		
		vo.setPid(2);
		vo.setPname("인은숙");
		vo.setDept("검정");
		vo.setPost("부교수");
		vo.setPay(4000000);
		vo.setHire(to);
		vo.setMajor("프로그램");
		vo.setCampus("폴리텍6");
		list.add(vo);
		//2행--------------------------------------------------------
		
		
		//3행--------------------------------------------------------
		from ="1985-12-01";
		transForm =new SimpleDateFormat("yyyy-MM-dd");
		to=transForm.parse(from);
		vo=new ProfessorVO();
		
		
		vo.setPid(2);
		vo.setPname("한상숙");
		vo.setDept("검정");
		vo.setPost("학과장");
		vo.setPay(4000000);
		vo.setHire(to);
		vo.setMajor("프로그램");
		vo.setCampus("폴리텍5");
		list.add(vo);
		//3행--------------------------------------------------------
		
		
		//4행--------------------------------------------------------
		from ="1985-12-01";
		transForm =new SimpleDateFormat("yyyy-MM-dd");
		to=transForm.parse(from);
		vo=new ProfessorVO();
		
		
		vo.setPid(2);
		vo.setPname("김주희");
		vo.setDept("검정");
		vo.setPost("지도교수");
		vo.setPay(4000000);
		vo.setHire(to);
		vo.setMajor("프로그램");
		vo.setCampus("폴리텍10");
		list.add(vo);
		//4행--------------------------------------------------------
		
		//5행--------------------------------------------------------
		from ="1985-12-01";
		transForm =new SimpleDateFormat("yyyy-MM-dd");
		to=transForm.parse(from);
		vo=new ProfessorVO();
		
		
		vo.setPid(2);
		vo.setPname("문성진");
		vo.setDept("검정");
		vo.setPost("외래교수");
		vo.setPay(4000000);
		vo.setHire(to);
		vo.setMajor("프로그램");
		vo.setCampus("폴리텍11");
		list.add(vo);
		//5행--------------------------------------------------------
		
		//모델객체에 담아 jsp로 list에 담긴 정보를 넘긴다.
		model.addAttribute("list", list );
		
		return "list";
	}
	
	
	
}
