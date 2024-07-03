package com.example.DataInsert.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.mail.MailSendException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.DataInsert.Bean.Contactus;
import com.example.DataInsert.Bean.Registration;
import com.example.DataInsert.Bean.Review;
import com.example.DataInsert.Bean.BookRoom;
import com.example.DataInsert.Bean.Booking;
import com.example.DataInsert.Bean.Cart;
import com.example.DataInsert.DAO.BookRoomRepository;
import com.example.DataInsert.DAO.BookingRepository;
import com.example.DataInsert.DAO.CartRepository;
import com.example.DataInsert.DAO.ContactusRepository;
import com.example.DataInsert.DAO.RegistrationRepository;
import com.example.DataInsert.DAO.reviewRepository;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
@Controller

public class CustomerController {

	
//	@RequestMapping("/index")
//	public String index(){
//		return "index";
//}
	
	@RequestMapping("/about")
	public String about(){
		return "about";
	}
	
	@Autowired
	ContactusRepository CR;
	@RequestMapping("/contact")
	public String contact(){
		return "contact";
	}
	
	@RequestMapping("/ContactusData")
	public String ContactusData(Contactus c){
		c.getEmail();
		System.out.println(c.getEmail());
		CR.save(c);
		ModelAndView MV=new ModelAndView();
		MV.addObject("Contactus", c);
		return "index";
		
	}
	@Autowired
	BookingRepository BR;
	@RequestMapping("/Booking")
	public String Booking(){
		return "Booking";
	}
	
	@Autowired
	JavaMailSender javamailSender;
	@RequestMapping("/BookingData")
	public String Booking(Booking b,HttpSession session) throws MessagingException{
		BR.save(b);
		try {
			  MimeMessage messege=javamailSender.createMimeMessage();
			  MimeMessageHelper helper=new MimeMessageHelper(messege);
			  helper.setFrom("padmarekhaj18@gmail.com");
			  helper.setTo(b.getEmail());
			  helper.setSubject("Your Car Booking Confirmed!");
			  helper.setText("Dear,"+b.getName()+"\r\n"
			  		+ "\r\n"
			  		+ "Exciting news! Your car booking has been successfully confirmed. We're thrilled to have you on board. Get ready for a fantastic journey ahead! If you have any queries, feel free to reach out.\r\n"
			  		+ "\r\n"
			  		+ "Best regards,\r\n"
			  		+ "HOTELIER");
			 
			  System.out.println("email");
			  javamailSender.send(messege);
			  
		  }catch(MailSendException e) {
			  System.out.println(e);
			  e.printStackTrace();
		  }
		 session.setAttribute("msg", "send");
		return "redirect:/index";
	
		
	}
	
//	@RequestMapping("/room")
//	public String room(){
//		return "room";
//	}
//	
//	@RequestMapping("/service")
//	public String service(){
//		return "service";
//	}
	
	@RequestMapping("/team")
	public String team(){
	return "team";
		
	}
	
//	@RequestMapping("/testimonial")
//	public String testimonial(){
//		return "testimonial";
//	}
	
	@GetMapping("/Login")
	public String Login(){
		return "Login";
	}
	
	@Autowired
	RegistrationRepository RR;
	
	@PostMapping("/Login")
	public String ShowLogin(Registration r,HttpSession session){
		
		System.out.println(r.getEmail());
		System.out.println(r.getPassword());
		Iterable<Registration> itr=RR.findAll();
		
		int count=0;
		for(Registration r1:itr) {
			
		if(r.getEmail().equals(r1.getEmail() )&& r.getPassword().equals(r1.getPassword())) {
			
		   Optional<Registration> optional=RR.findById(r1.getFirstName());
		   Registration r2=optional.get();
			System.out.println("login");
			session.setAttribute("register",r2);
			
			return "redirect:/index";
		}
		else {
			count++;
		}
		}
		if(count>0) {
			System.out.println("failed");
			session.setAttribute("failedlogin","Invalid email or password");
			return "Login";
		}
		
		return "Login";
	}
	
	

	
	@GetMapping("/Registration")
	public String RegistrationForm(){
		return "Registration";
	}
	
	@PostMapping("/Registration")
	public String Registration(Registration r,HttpSession session){
		try {
			RR.save(r);
			session.setAttribute("Registermsg","Register Successfully");
					return "Registration";
		}
		catch(DataIntegrityViolationException hii) {
			
			System.out.println("failed");
			session.setAttribute("Registermsgfail","Email id already exist");
			return "Registration";
		}
	}
	
	
	@Autowired
	reviewRepository ReviewRepo;
	
	@RequestMapping("/index")
	public List <Review> getReview(HttpSession session){
		List<Review> Review=new ArrayList<>();
		for(Review Reviews:ReviewRepo.findAll()) {
			
			Review.add(Reviews);
		}
		session.setAttribute("Review", Review);
		return Review;	
	}
	@RequestMapping("/service")
	public List <Review> getservice(HttpServletRequest request){
		List<Review> Review=new ArrayList<>();
		for(Review Reviews:ReviewRepo.findAll()) {
			
			Review.add(Reviews);
		}
		request.setAttribute("Review", Review);
		return Review;	
	}
	
	@RequestMapping("/testimonial")
	public List <Review> gettestimonial(HttpServletRequest request){
		List<Review> Review=new ArrayList<>();
		for(Review Reviews:ReviewRepo.findAll()) {
			
			Review.add(Reviews);
		}
		request.setAttribute("Review", Review);
		return Review;	
	}
	@Autowired
	 BookRoomRepository BookRoomRepo;
	
	@RequestMapping("/room")
	public List <BookRoom> getBookRoom(HttpServletRequest request,HttpSession session){
		
		List<BookRoom> BookRoom=new ArrayList<>();
		
		for(BookRoom BookRooms:BookRoomRepo.findAll()) {
			BookRoom.add(BookRooms);
		}
		
		List<Review> Review=new ArrayList<>();
		for(Review Reviews:ReviewRepo.findAll()) {
			
			Review.add(Reviews);
		}
		request.setAttribute("Review", Review);

		session.setAttribute("BookRoom", BookRoom);
		return BookRoom;	
	   }
	
	

	
	@RequestMapping("/Logout")
	public String Logout(HttpSession session) {
		session.removeAttribute("register");
		return "Login";
	}
	
	@Autowired
	CartRepository cr;
	@RequestMapping("/Cart")
	public String addtocart(Cart ca,HttpSession session) {
		
		
		cr.save(ca);
		List<Cart> cart=new ArrayList<>();
		for(Cart c1:cr.findAll()) {
			if(ca.getUid().equals(c1.getUid())){
				cart.add(c1);
			}
		}	
		session.setAttribute("cart", cart);

		
		return "Cart";
		
	}
	
	@RequestMapping("/delete")
	public String delete(Cart ca,HttpSession session) {
		
		cr.deleteById(ca.getPrice());
		List<Cart> cart =new ArrayList<>();
		for(Cart c:cr.findAll()) {
			cart.add(c);
		}
		session.setAttribute("cart", cart);

		return "Cart";
		
		
	}
	@RequestMapping("/usernot")
	public String usernot(HttpSession session) {
		session.setAttribute("usernot", "Please Login!...");
		return "Login";
	}

}
