/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-04-18 03:37:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.MY.Home.Ticket;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import my.manager.movie.MovieBean;
import my.manager.movie.MovieDao;
import my.manager.cinema.CinemaBean;
import my.manager.cinema.CinemaDao;
import java.util.ArrayList;

public final class home_005fticket_005fseat_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/MY/Home/Ticket/../home_bottom.jsp", Long.valueOf(1681720894000L));
    _jspx_dependants.put("/MY/Home/Ticket/../home_top.jsp", Long.valueOf(1681719743000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("my.manager.movie.MovieDao");
    _jspx_imports_classes.add("my.manager.movie.MovieBean");
    _jspx_imports_classes.add("my.manager.cinema.CinemaBean");
    _jspx_imports_classes.add("my.manager.cinema.CinemaDao");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<title>예매 페이지</title>\n");
      out.write("\n");
      out.write("\n");

	request.setCharacterEncoding("UTF-8");
	String tmovie = request.getParameter("tmovie");
	String tcinema = request.getParameter("tcinema");
	String time = request.getParameter("time");
	
	CinemaDao cdao = CinemaDao.getInstance();
	int seat_capa = cdao.getSeatByCname(tcinema); // 선택한 극장의 좌석 수 가져오기
	String[] seat = {
						"A1","A2","A3","A4","A5","A6","A7","A8","A9","A10","A11","A12","A13","A14","A15","A16","A17","A18","A19","A20",
						"B1","B2","B3","B4","B5","B6","B7","B8","B9","B10","B11","B12","B13","B14","B15","B16","B17","B18","B19","B20",
						"C1","C2","C3","C4","C5","C6","C7","C8","C9","C10","C11","C12","C13","C14","C15","C16","C17","C18","C19","C20",
						"D1","D2","D3","D4","D5","D6","D7","D8","D9","D10","D11","D12","D13","D14","D15","D16","D17","D18","D19","D20",
						"E1","E2","E3","E4","E5","E6","E7","E8","E9","E10","E11","E12","E13","E14","E15","E16","E17","E18","E19","E20",
						"F1","F2","F3","F4","F5","F6","F7","F8","F9","F10","F11","F12","F13","F14","F15","F16","F17","F18","F19","F20",
						"G1","G2","G3","G4","G5","G6","G7","G8","G9","G10","G11","G12","G13","G14","G15","G16","G17","G18","G19","G20",
						"H1","H2","H3","H4","H5","H6","H7","H8","H9","H10","H11","H12","H13","H14","H15","H16","H17","H18","H19","H20",
						"I1","I2","I3","I4","I5","I6","I7","I8","I9","I10","I11","I12","I13","I14","I15","I16","I17","I18","I19","I20",
						"J1","J2","J3","J4","J5","J6","J7","J8","J9","J10","J11","J12","J13","J14","J15","J16","J17","J18","J19","J20",
						"K1","K2","K3","K4","K5","K6","K7","K8","K9","K10","K11","K12","K13","K14","K15","K16","K17","K18","K19","K20",
						"L1","L2","L3","L4","L5","L6","L7","L8","L9","L10","L11","L12","L13","L14","L15","L16","L17","L18","L19","L20",
						"M1","M2","M3","M4","M5","M6","M7","M8","M9","M10","M11","M12","M13","M14","M15","M16","M17","M18","M19","M20",
						"N1","N2","N3","N4","N5","N6","N7","N8","N9","N10","N11","N12","N13","N14","N15","N16","N17","N18","N19","N20",
						"O1","O2","O3","O4","O5","O6","O7","O8","O9","O10","O11","O12","O13","O14","O15","O16","O17","O18","O19","O20"
					};
	String[] seat_alpha = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O"};

      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("	.ttable{\n");
      out.write("		text-align: center;\n");
      out.write("		font-family: 'Nanum Pen Script', cursive;\n");
      out.write("		font-size: 20px;\n");
      out.write("	}\n");
      out.write("	#tm1{\n");
      out.write("		color : pink;\n");
      out.write("	}\n");
      out.write("	#tm1:hover, #tm2:hover{\n");
      out.write("		background-color : #353535;\n");
      out.write("		border-bottom : 1px dotted #A6A6A6;\n");
      out.write("	}\n");
      out.write("	#tm2{\n");
      out.write("		color : #F2CB61;\n");
      out.write("	}\n");
      out.write("	#sub{\n");
      out.write("		background-color : #5D5D5D;\n");
      out.write("		font-family: 'Nanum Pen Script', cursive;\n");
      out.write("		font-size: 18px;\n");
      out.write("		color : white;\n");
      out.write("	}\n");
      out.write("	.radio-wrap input[type=\"radio\"]{\n");
      out.write("		display: none;\n");
      out.write("	}\n");
      out.write("	.radio-wrap {\n");
      out.write("        width: 10%;\n");
      out.write("        height: 30px;\n");
      out.write("        border: 1px solid #eaeaea;\n");
      out.write("        border-radius: 5px;\n");
      out.write("    }\n");
      out.write("    .radio-wrap label {\n");
      out.write("        display: block;\n");
      out.write("        margin: 0 auto;\n");
      out.write("        height: -webkit-fill-available;\n");
      out.write("        line-height: 30px;\n");
      out.write("        border-radius: 5px;\n");
      out.write("        text-align: center;\n");
      out.write("        cursor: pointer;\n");
      out.write("	}\n");
      out.write("	.radio-wrap input[type=\"radio\"]:checked + label {\n");
      out.write("        background: #878787;\n");
      out.write("        color: #fff;\n");
      out.write("	}\n");
      out.write("	.checkbox-wrap input[type=\"checkbox\"] + label {\n");
      out.write("		display: inline-block;\n");
      out.write("		width: 15px;\n");
      out.write("		height: 15px;\n");
      out.write("		border: 0.1px solid #bcbcbc;\n");
      out.write("		border-radius : 3px;\n");
      out.write("		cursor: pointer;\n");
      out.write("	}\n");
      out.write("	.checkbox-wrap input[type=\"checkbox\"]:checked + label {\n");
      out.write("		background-color: #9FC93C; \n");
      out.write("	}\n");
      out.write("	.checkbox-wrap input[type=\"checkbox\"] {\n");
      out.write("		display: none;\n");
      out.write("	}\n");
      out.write("	.checkbox-wrap input[type=\"checkbox\"]:disabled + label {\n");
      out.write("		background-color: #353535;\n");
      out.write("		border: #353535;\n");
      out.write("		cursor: auto;\n");
      out.write("	}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("	function seatCheck(){\n");
      out.write("		//seat_pos\n");
      out.write("		str = \"좌석 : \";\n");
      out.write("		flag = false;\n");
      out.write("		count = 0;\n");
      out.write("		for(i=0;i<seatForm.seat_pos.length;i++) {\n");
      out.write("			if(seatForm.seat_pos[i].checked) {\n");
      out.write("				flag = true;\n");
      out.write("				count++;\n");
      out.write("				str += seatForm.seat_pos[i].value + \" \";\n");
      out.write("			}\n");
      out.write("		}\n");
      out.write("		if(flag == false) {\n");
      out.write("			alert('좌석을 선택해야 합니다.');\n");
      out.write("			return false;\n");
      out.write("		}\n");
      out.write("		str += \"\\n\";\n");
      out.write("		\n");
      out.write("		var people = 0;\n");
      out.write("		//adult\n");
      out.write("		str += \"성인 관람자 수 : \";\n");
      out.write("		flag2 = false;\n");
      out.write("		for(i=0;i<seatForm.adult.length;i++) {\n");
      out.write("			if(seatForm.adult[i].checked) {\n");
      out.write("				flag2 = true;\n");
      out.write("				adult = Number(seatForm.adult[i].value);\n");
      out.write("				people += adult;\n");
      out.write("				str += seatForm.adult[i].value + \" 명\\n\";\n");
      out.write("				break;\n");
      out.write("			}\n");
      out.write("		}\n");
      out.write("		if(flag2 == false) {\n");
      out.write("			alert('성인 관람자 수를 선택해야 합니다.');\n");
      out.write("			return false;\n");
      out.write("		}\n");
      out.write("		\n");
      out.write("		//child\n");
      out.write("		str += \"어린이 관람자 수 : \";\n");
      out.write("		flag3 = false;\n");
      out.write("		for(i=0;i<seatForm.child.length;i++) {\n");
      out.write("			if(seatForm.child[i].checked) {\n");
      out.write("				flag3 = true;\n");
      out.write("				child = Number(seatForm.child[i].value);\n");
      out.write("				people += child;\n");
      out.write("				str += seatForm.child[i].value + \" 명\\n\";\n");
      out.write("				break;\n");
      out.write("			}\n");
      out.write("		}\n");
      out.write("		if(flag3 == false) {\n");
      out.write("			alert('어린이 관람자 수를 선택해야 합니다.');\n");
      out.write("			return false;\n");
      out.write("		}\n");
      out.write("		\n");
      out.write("		//선택한 좌석 수와 관람자 수가 일치하는지\n");
      out.write("		if(people != count){\n");
      out.write("			alert('관람자 수에 맞게 좌석을 선택해주세요.');\n");
      out.write("			return false;\n");
      out.write("		}\n");
      out.write("		\n");
      out.write("		\n");
      out.write("		var price = 13000 * adult + 10000 * child;\n");
      out.write("		str += \"티켓 가격 : \" +  price + \"\\n\\n\";\n");
      out.write("		var pay = confirm(str + '예매 정보를 확인해 주시고 카드로 결제하시려면 확인을 눌러 주세요.\\n (현금일 경우, 취소를 눌러주세요.)');\n");
      out.write("		if(pay){\n");
      out.write("			seatForm.pay.value = 'card';\n");
      out.write("		}\n");
      out.write("		else{\n");
      out.write("			seatForm.pay.value = 'cash';\n");
      out.write("		}\n");
      out.write("	}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Lily+Script+One&family=Roboto&family=Shadows+Into+Light&display=swap\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0\" />\n");
      out.write("<link href=\"");
      out.print( request.getContextPath() );
      out.write("/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"");
      out.print( request.getContextPath() );
      out.write("/css/kfonts2.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"");
      out.print( request.getContextPath() );
      out.write("/css/custom2.css\" rel=\"stylesheet\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>\n");
      out.write("<script src=\"");
      out.print( request.getContextPath() );
      out.write("/js/bootstrap.min.js\"></script>\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Nanum+Brush+Script&display=swap\" rel=\"stylesheet\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Gowun+Dodum&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("	body{\n");
      out.write("		background-color: #353535;\n");
      out.write("		color : white;\n");
      out.write("	}\n");
      out.write("	a:hover{\n");
      out.write("		text-decoration: none;\n");
      out.write("	}\n");
      out.write("	.f1{\n");
      out.write("		font-family: 'Shadows Into Light', cursive;	\n");
      out.write("		font-size: 100px;\n");
      out.write("		color: #CC3D3D;\n");
      out.write("	}\n");
      out.write("	.f2{\n");
      out.write("		font-family: 'Nanum Brush Script', cursive;\n");
      out.write("		font-size: 25px;\n");
      out.write("	}\n");
      out.write("	.f3{\n");
      out.write("		font-family: 'Shadows Into Light', cursive;	              \n");
      out.write("		font-size: 30px;\n");
      out.write("		color: #FF7171;\n");
      out.write("	}\n");
      out.write("	#m1{\n");
      out.write("		font-family: 'Nanum Brush Script', cursive;\n");
      out.write("		font-size: 25px;\n");
      out.write("		color : white;\n");
      out.write("		background: #353535;\n");
      out.write("	}\n");
      out.write("	#m1:hover{\n");
      out.write("		background: #353535;\n");
      out.write("		color : #FF7171;\n");
      out.write("	}\n");
      out.write("	#mm1{\n");
      out.write("		width: 50%;\n");
      out.write("		background: #353535;	\n");
      out.write("		text-align: center;\n");
      out.write("		margin: auto;\n");
      out.write("	}\n");
      out.write("	#mm1>li>a{\n");
      out.write("		color : white;\n");
      out.write("		font-family: 'Nanum Brush Script', cursive;\n");
      out.write("		font-size: 25px;\n");
      out.write("	}\n");
      out.write("	#mm1>li>a:hover{\n");
      out.write("		background: #353535;	\n");
      out.write("		color : pink;\n");
      out.write("	}\n");
      out.write("	table{\n");
      out.write("		margin: auto;\n");
      out.write("	}\n");
      out.write("	hr{\n");
      out.write("		border : 0.1px solid #4B4B4B;\n");
      out.write("	}\n");
      out.write("	.f4{\n");
      out.write("		font-family: 'Gowun Dodum', sans-serif;\n");
      out.write("		color : #9F9F9F;\n");
      out.write("		font-size: 13px;\n");
      out.write("	}\n");
      out.write("	.bottom_table{\n");
      out.write("		width : 65%;\n");
      out.write("		height: 150px;\n");
      out.write("		margin: 20px 30px;\n");
      out.write("		text-align: center;\n");
      out.write("	}\n");
      out.write("	#menu{\n");
      out.write("		font-family: 'Nanum Brush Script', cursive;\n");
      out.write("		font-size: 30px;\n");
      out.write("		background-color : #474747;\n");
      out.write("		position: fixed;\n");
      out.write("		top: -150px;\n");
      out.write("		display: block;\n");
      out.write("		width: 100%;\n");
      out.write("		height: 50px;\n");
      out.write("	}\n");
      out.write("	.box-title{\n");
      out.write("		position: relative;\n");
      out.write("		padding : 10px;\n");
      out.write("	}\n");
      out.write("	.box-container{\n");
      out.write("		display: flex;\n");
      out.write("	}\n");
      out.write("	.box{\n");
      out.write("		display: block;\n");
      out.write("		width: 300px;\n");
      out.write("		text-align: center;\n");
      out.write("	}\n");
      out.write("	.box a{\n");
      out.write("		color : white;\n");
      out.write("	}\n");
      out.write("</style>\n");
      out.write("\n");

	String sid = (String)session.getAttribute("sid");

      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("	function not_login(){\n");
      out.write("		alert('로그인 먼저 하세요.');\n");
      out.write("	}\n");
      out.write("	function not_logout(){\n");
      out.write("		alert('로그인한 상태로는 회원가입이 불가능합니다.');\n");
      out.write("	}\n");
      out.write("	function ticket_idCheck(){\n");
      out.write("		alert('로그인 후 이용 가능합니다.');\n");
      out.write("	}\n");
      out.write("	function id_managerCheck(){\n");
      out.write("		alert('관리자는 예매가 불가능합니다.');\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	var prevScrollpos = window.pageYOffset;\n");
      out.write("	var navbar = document.getElementById(\"menu\");\n");
      out.write("	\n");
      out.write("	window.onscroll = function(){\n");
      out.write("		var currentScrollpos = window.pageYOffset;\n");
      out.write("		if(250 > currentScrollpos){\n");
      out.write("			document.getElementById(\"menu\").style.top = \"-150px\";\n");
      out.write("		}\n");
      out.write("		else{\n");
      out.write("			document.getElementById(\"menu\").style.top = \"0px\";\n");
      out.write("		}\n");
      out.write("		prevScrollpos = currentScrollpos;\n");
      out.write("	}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<div id=\"menu\">\n");
      out.write("	<div id=\"nav\">\n");
      out.write("		<div class=\"box-title\">\n");
      out.write("			<div class=\"box-container\">\n");
      out.write("				<div class=\"box\">\n");
      out.write("					<a href=\"");
      out.print( request.getContextPath() );
      out.write("/MY/Home/home_movie_list.jsp\">영화</a>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"box\">\n");
      out.write("					<a href=\"");
      out.print( request.getContextPath() );
      out.write("/MY/Home/home_cinema_list.jsp\">극장</a>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"box\">\n");
      out.write("		        	  <a href=\"#\">예매</a>   \n");
      out.write("				</div>\n");
      out.write("				<div class=\"box\">\n");
      out.write("					<a href=\"");
      out.print( request.getContextPath() );
      out.write("/MY/Home/home_snack_list.jsp\">스낵</a>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<table border=\"0\" width=\"100%\"> \n");
      out.write("	<tr>\n");
      out.write("		<td valign=\"bottom\" width=\"630\">\n");
      out.write("			<a class=\"f1\" href=\"");
      out.print( request.getContextPath() );
      out.write("/MY/Home/home.jsp\">&nbsp;NANANA</a>&nbsp;&nbsp;\n");
      out.write("			<a href=\"");
      out.print( request.getContextPath() );
      out.write("/MY/Home/home.jsp\"><span class=\"f3\">CINEMA</span></a>\n");
      out.write("		</td>		\n");
      out.write("		\n");
      out.write("		<td align=\"center\" width=\"80\">	\n");
      out.write("		");

			if(sid != null){
		
      out.write("\n");
      out.write("				<a href=\"");
      out.print( request.getContextPath() );
      out.write("/MY/Home/logout.jsp\"><img src=\"");
      out.print( request.getContextPath() );
      out.write("/icon/unlock.png\" width=\"30\"></a><br>\n");
      out.write("				<a class=\"f2\" href=\"");
      out.print( request.getContextPath() );
      out.write("/MY/Home/logout.jsp\"><font color=black>로그아웃</font></a>\n");
      out.write("		");

			}
			else{
		
      out.write("\n");
      out.write("				<a href=\"");
      out.print( request.getContextPath() );
      out.write("/MY/Home/loginForm.jsp\"><img src=\"");
      out.print( request.getContextPath() );
      out.write("/icon/lock.png\" width=\"30\"></a><br>\n");
      out.write("				<a class=\"f2\" href=\"");
      out.print( request.getContextPath() );
      out.write("/MY/Home/loginForm.jsp\"><font color=black>로그인</font></a>\n");
      out.write("		");
		
			}
		
      out.write("	\n");
      out.write("		</td>\n");
      out.write("		\n");
      out.write("		<td align=\"center\" width=\"90\">	\n");
      out.write("		");

			if(sid != null){
		
      out.write("\n");
      out.write("				<a onclick=\"not_logout()\" href=\"\"><img src=\"");
      out.print( request.getContextPath() );
      out.write("/icon/join.png\" width=\"30\"></a><br> \n");
      out.write("				<a class=\"f2\" onclick=\"not_logout()\" href=\"\"><font color=black>회원가입</font></a>\n");
      out.write("		");

			}
			else{
		
      out.write("\n");
      out.write("				<a href=\"");
      out.print( request.getContextPath() );
      out.write("/MY/Home/joinForm.jsp\"><img src=\"");
      out.print( request.getContextPath() );
      out.write("/icon/join.png\" width=\"30\"></a><br> \n");
      out.write("				<a class=\"f2\" href=\"");
      out.print( request.getContextPath() );
      out.write("/MY/Home/joinForm.jsp\"><font color=black>회원가입</font></a>\n");
      out.write("		");

			}
		
      out.write("	\n");
      out.write("		</td>\n");
      out.write("		\n");
      out.write("		<td align=\"center\" width=\"90\">	\n");
      out.write("		");

			if(sid == null){
		
      out.write("\n");
      out.write("				<a href=\"\" onclick=\"not_login()\"><img src=\"");
      out.print( request.getContextPath() );
      out.write("/icon/my.png\" width=\"30\" height=\"30\"></a><br>\n");
      out.write("				<a class=\"f2\" href=\"\" onclick=\"not_login()\"><font color=black>마이페이지</font></a>\n");
      out.write("		");
			
			}
			else{
				if(sid.equals("manager")){
			
      out.write("\n");
      out.write("					<a href=\"");
      out.print( request.getContextPath() );
      out.write("/MY/Manager/manager_home.jsp\"><img src=\"");
      out.print( request.getContextPath() );
      out.write("/icon/manager.png\" width=\"30\"></a><br>\n");
      out.write("					<a class=\"f2\" href=\"");
      out.print( request.getContextPath() );
      out.write("/MY/Manager/manager_home.jsp\"><font color=black>관리자</font></a>\n");
      out.write("			");

				}
				else{
			
      out.write("\n");
      out.write("					<a href=\"");
      out.print( request.getContextPath() );
      out.write("/MY/my/mypage.jsp\"><img src=\"");
      out.print( request.getContextPath() );
      out.write("/icon/my.png\" width=\"30\"></a><br>\n");
      out.write("					<a class=\"f2\" href=\"");
      out.print( request.getContextPath() );
      out.write("/MY/my/mypage.jsp\"><font color=black>마이페이지</font></a>\n");
      out.write("			");
		
				}
			}
		
      out.write("	\n");
      out.write("		</td>\n");
      out.write("		\n");
      out.write("		<td align=\"center\" width=\"70\">\n");
      out.write("		");

			if(sid == null){
		
      out.write("\n");
      out.write("				<a href=\"\" onclick=\"not_login()\"><img src=\"");
      out.print( request.getContextPath() );
      out.write("/icon/inquiry.png\" width=\"30\" height=\"30\"></a><br>\n");
      out.write("				<a class=\"f2\" href=\"\" onclick=\"not_login()\"><font color=black>고객 문의</font></a>\n");
      out.write("		");
			
			}
			else{
			
      out.write("\n");
      out.write("				<a href=\"");
      out.print( request.getContextPath() );
      out.write("/MY/Inquiry/inquiry.jsp\"><img src=\"");
      out.print( request.getContextPath() );
      out.write("/icon/inquiry.png\" width=\"30\"></a><br>\n");
      out.write("				<a class=\"f2\" href=\"");
      out.print( request.getContextPath() );
      out.write("/MY/Inquiry/inquiry.jsp\"><font color=black>고객 문의</font></a>\n");
      out.write("			");
		
			}
		
      out.write("	\n");
      out.write("		</td>\n");
      out.write("		\n");
      out.write("		</tr>\n");
      out.write("	\n");
      out.write("				\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("		<td align=\"center\" colspan=\"1\" style=\"color : white\" height=\"20\">\n");
      out.write("    		 <ul class=\"nav nav-pills nav-justified\"> \n");
      out.write("		         <li class=\"dropdown\">\n");
      out.write("		         	  <a href=\"");
      out.print( request.getContextPath() );
      out.write("/MY/Home/home_movie_list.jsp\" id=\"m1\">영화</a>\n");
      out.write("		         </li>\n");
      out.write("		         \n");
      out.write("		         <li class=\"dropdown\">\n");
      out.write("		         	  <a href=\"");
      out.print( request.getContextPath() );
      out.write("/MY/Home/home_cinema_list.jsp\" id=\"m1\">극장</a>\n");
      out.write("		         </li>\n");
      out.write("		         \n");
      out.write("		         <li class=\"dropdown\">\n");
      out.write("		         	 ");

		         	if(sid == null){
		         
      out.write("\n");
      out.write("		         	  <a data-toggle=\"dropdown\" href=\"\" id=\"m1\" onclick=\"ticket_idCheck()\">예매\n");
      out.write("		         	  	 <span class=\"caret\"></span> 	 \n");
      out.write("		         	  </a>\n");
      out.write("		        ");

		         	}
		         	else if(sid.equals("manager")){
		         
      out.write("\n");
      out.write("		         	<a data-toggle=\"dropdown\" href=\"\" id=\"m1\" onclick=\"id_managerCheck()\">예매\n");
      out.write("		         	  	 <span class=\"caret\"></span> 	 \n");
      out.write("		         	</a>\n");
      out.write("		         ");
		
		         	}
		         	else{
		         
      out.write("	 	 	 	  \n");
      out.write("		        	  <a data-toggle=\"dropdown\" href=\"#\" id=\"m1\" style=\"color : #FF7171;\">예매\n");
      out.write("		         	  	 <span class=\"caret\"></span> 	 \n");
      out.write("		         	  </a>\n");
      out.write("		         	   <ul class=\"dropdown-menu\" role=\"menu\" id=\"mm1\"> \n");
      out.write("			               <li><a role=\"menuitem\" href=\"");
      out.print( request.getContextPath() );
      out.write("/MY/Home/Ticket/home_ticket_movie.jsp\">영화별 예매</a></li>\n");
      out.write("			               <li><a role=\"menuitem\" href=\"");
      out.print( request.getContextPath() );
      out.write("/MY/Home/Ticket/home_ticket_cinema.jsp\">극장별 예매</a></li>\n");
      out.write("			                <li class=\"divider\" style=\"border : 0.1px solid #4B4B4B;\"></li>\n");
      out.write("			               <li><a role=\"menuitem\" href=\"");
      out.print( request.getContextPath() );
      out.write("/MY/Home/Ticket/home_ticket_list.jsp\">예매 확인 </a></li>\n");
      out.write("			          </ul>\n");
      out.write("			     ");

		         	}
			     
      out.write("     \n");
      out.write("		         </li>\n");
      out.write("		          <li class=\"dropdown\">\n");
      out.write("		         	  <a class=\"f2\" href=\"");
      out.print( request.getContextPath() );
      out.write("/MY/Home/home_snack_list.jsp\" id=\"m1\">스낵</a>\n");
      out.write("		         </li>\n");
      out.write("		     </ul>\n");
      out.write("		</td>\n");
      out.write("	</tr>\n");
      out.write("	\n");
      out.write("	<tr>\n");
      out.write("		<td colspan=\"5\" height=\"10\">\n");
      out.write("			<hr>\n");
      out.write("		</td>\n");
      out.write("	</tr>\n");
      out.write("	\n");
      out.write("	<tr>\n");
      out.write("<td colspan=\"5\" align=\"center\" width=\"500\">\n");
      out.write("	<br>\n");
      out.write("		<form name=\"seatForm\" method=\"post\" action=\"");
      out.print( request.getContextPath() );
      out.write("/MY/Home/Ticket/home_ticket_reservarion.jsp\" onsubmit=\"return seatCheck()\">\n");
      out.write("		<input type=\"hidden\" name=\"tmovie\" value=\"");
      out.print( tmovie );
      out.write("\">\n");
      out.write("		<input type=\"hidden\" name=\"tcinema\" value=\"");
      out.print( tcinema );
      out.write("\">\n");
      out.write("		<input type=\"hidden\" name=\"time\" value=\"");
      out.print( time );
      out.write("\">\n");
      out.write("		<input type=\"hidden\" name=\"pay\">\n");
      out.write("			<table>\n");
      out.write("				<tr>\n");
      out.write("					<td>	\n");
      out.write("						<table border=\"0\" class=\"ttable\" width=\"500\" align=\"center\">\n");
      out.write("							<tr>\n");
      out.write("								<td>\n");
      out.write("									좌석 선택\n");
      out.write("								</td>\n");
      out.write("							</tr>\n");
      out.write("							<tr>\n");
      out.write("								<td class=\"checkbox-wrap\">\n");
      out.write("									<div style=\"background-color : #5D5D5D;\">screen</div>\n");
      out.write("									<br>\n");
      out.write("								");

									int spare = 20 - seat_capa%20;
									int seat_capa_spare = seat_capa + spare;
									int count = 0;
									for(int i=0;i<seat_capa_spare;i++){
										if(count%20 == 0){
								
      out.write("\n");
      out.write("											");
      out.print( seat_alpha[count/20] );
      out.write("\n");
      out.write("								");

										}
										count++;
										if(i >= seat_capa){
								
      out.write("\n");
      out.write("											<input id=\"checkbox-");
      out.print( i );
      out.write("\" type=\"checkbox\" name=\"seat_pos\" value=\"");
      out.print( seat[i] );
      out.write("\" disabled>\n");
      out.write("											<label for=\"checkbox-");
      out.print( i );
      out.write("\"></label>\n");
      out.write("								");
			
										}
										else{
								
      out.write("	\n");
      out.write("											<input id=\"checkbox-");
      out.print( i );
      out.write("\" type=\"checkbox\" name=\"seat_pos\" value=\"");
      out.print( seat[i] );
      out.write("\">\n");
      out.write("											<label for=\"checkbox-");
      out.print( i );
      out.write("\"></label>\n");
      out.write("								");

										}
										if(count%10 == 0){
								
      out.write("\n");
      out.write("											&nbsp;&nbsp;\n");
      out.write("								");
			
										}
										if(count%20 == 0){
								
      out.write("\n");
      out.write("											<br>\n");
      out.write("								");

										}	
									}
								
      out.write("	\n");
      out.write("								<br>\n");
      out.write("								</td>\n");
      out.write("							</tr>\n");
      out.write("						</table>\n");
      out.write("					</td>\n");
      out.write("					\n");
      out.write("					<td width=\"100\">\n");
      out.write("						\n");
      out.write("					</td>\n");
      out.write("					\n");
      out.write("					<td>	\n");
      out.write("						<table border=\"0\" width=\"150\" class=\"ttable\">\n");
      out.write("							<tr>\n");
      out.write("								<td colspan=\"2\">성인</td>\n");
      out.write("							</tr>\n");
      out.write("							<tr>\n");
      out.write("								");

									for(int i=0;i<6;i++){
								
      out.write("	\n");
      out.write("								<td class=\"radio-wrap\"> \n");
      out.write("	      							<input id=\"radio-");
      out.print( i );
      out.write("\" type=\"radio\" name=\"adult\" value=\"");
      out.print( i );
      out.write("\" />\n");
      out.write("	       							<label for=\"radio-");
      out.print( i );
      out.write('"');
      out.write('>');
      out.print( i );
      out.write("</label>\n");
      out.write("								</td>\n");
      out.write("      							");

									}
      							
      out.write("\n");
      out.write("							</tr>\n");
      out.write("							<tr>\n");
      out.write("								<td colspan=\"2\"><br>어린이</td>\n");
      out.write("							</tr>\n");
      out.write("							<tr>\n");
      out.write("								");

									for(int j=6;j<12;j++){
								
      out.write("	\n");
      out.write("								<td class=\"radio-wrap\"> \n");
      out.write("	      							<input id=\"radio-");
      out.print( j );
      out.write("\" type=\"radio\" name=\"child\" value=\"");
      out.print( j-6 );
      out.write("\" />\n");
      out.write("	       							<label for=\"radio-");
      out.print( j );
      out.write('"');
      out.write('>');
      out.print( j-6 );
      out.write("</label>\n");
      out.write("								</td>\n");
      out.write("      							");

									}
      							
      out.write("\n");
      out.write("							</tr>\n");
      out.write("						</table>\n");
      out.write("					</td>\n");
      out.write("				</tr>		\n");
      out.write("				<tr>\n");
      out.write("					<td colspan=\"3\" align=\"center\">\n");
      out.write("						<input type=\"submit\" value=\"결제하기\" class=\"form-control\" id=\"sub\">\n");
      out.write("					</td>\n");
      out.write("				</tr>\n");
      out.write("			</table>\n");
      out.write("		</form>\n");
      out.write("	<br>\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("    \n");
      out.write("	</tr>\n");
      out.write("	\n");
      out.write("	<tr>\n");
      out.write("		<td colspan=\"5\">\n");
      out.write("			<hr>\n");
      out.write("		</td>\n");
      out.write("	</tr>\n");
      out.write("	<tr bgcolor=\"#272727\">\n");
      out.write("		<td colspan=\"5\">\n");
      out.write("			<table border=\"0\" class=\"bottom_table\">\n");
      out.write("				<tr height=\"50\">\n");
      out.write("					<td class=\"f4\">회사소개</td>\n");
      out.write("					<td class=\"f4\">지속가능경영</td>\n");
      out.write("					<td class=\"f4\">IR</td>\n");
      out.write("					<td class=\"f4\">채용정보</td>\n");
      out.write("					<td class=\"f4\">광고/제휴/훌점문의</td>\n");
      out.write("					<td class=\"f4\">이용약관</td>\n");
      out.write("					<td class=\"f4\">편성기준</td>\n");
      out.write("					<td class=\"f4\">개인정보처리방침</td>\n");
      out.write("					<td class=\"f4\">법적고지</td>\n");
      out.write("					<td class=\"f4\">이메일주소무단수집거부</td>\n");
      out.write("					<td class=\"f4\">사이버감사실</td>\n");
      out.write("				</tr>\n");
      out.write("				\n");
      out.write("				<tr>\n");
      out.write("					<td align=\"left\" class=\"f4\" colspan=\"11\">[02832]서울특별시 영화구 극장로 예매 34길 78, 나나빌딩</td>\n");
      out.write("				</tr>\n");
      out.write("				<tr>	\n");
      out.write("					<td align=\"left\" class=\"f4\" colspan=\"11\">대표이사 : 송나영 사업자등록번호 : 123-45-67891 통신판매신고번호 : 2023-서울영화-1234 사업자정보확인</td>\n");
      out.write("				</tr>	\n");
      out.write("				<tr>	\n");
      out.write("					<td align=\"left\" class=\"f4\" colspan=\"11\">사업자 : SNY 개인정보보호 책임자 : 송나영 대표이메일 : SNY@nanana.com</td>\n");
      out.write("				</tr>	\n");
      out.write("				<tr>\n");
      out.write("					<td align=\"left\" class=\"f4\" colspan=\"11\">©NANANA</td>\n");
      out.write("				</tr>\n");
      out.write("			</table>\n");
      out.write("		</td>\n");
      out.write("	</tr>\n");
      out.write("</table>");
      out.write("\n");
      out.write("\n");
      out.write("								");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}